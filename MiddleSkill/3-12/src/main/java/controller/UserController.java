package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dto.UserRequest;
import service.UserService;

public class UserController {
	@Autowired
	private UserService userService;

	/**
	 * ユーザー新規登録画面を表示
	 * @param model Model
	 */
	@GetMapping(value="/user/add")
	public String desplayAdd(Model model) {
		model.addAttribute("userRequest",new UserRequest());
		return "user/add";
	}
	/**
	 * ユーザー新規登録
	 * @param userRequest
	 * @param model Model
	 * @return MyPage
	 *
	 */
	@RequestMapping(value="/user/create",method=RequestMethod.POST)
	public String create(@Validated @ModelAttribute UserRequest userRequest,BindingResult result,Model model) {
		//入力チェックエラー
		if(result.hasErrors()) {
			List<String>errorList=new ArrayList<String>();
			for(ObjectError error:result.getAllErrors()) {
				errorList.add(error.getDefaultMessage());
			}
			model.addAttribute("valiidationError",errorList);
			return "user/add";
		}
		//ユーザー情報の登録
		userService.create(userRequest);
		return "redirect:/user/list";
	}
}















