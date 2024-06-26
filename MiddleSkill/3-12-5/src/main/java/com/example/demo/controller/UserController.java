package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dto.UserAddRequest;
import com.example.demo.dto.UserUpdateRequest;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

/**
 * ユーザー情報 Controller
 */
@Controller
public class UserController {

  /**
   * ユーザー情報 Service
   */
  @Autowired
  private UserService userService;

  /**
   * ユーザー情報一覧画面を表示
   * @param model Model
   * @return ユーザー情報一覧画面
   */
  @GetMapping(value = "/user/list")
  public String displayList(Model model) {
    List<User> userlist = userService.findAll();
    model.addAttribute("userlist", userlist);
    return "user/list";
  }

  /**
   * ユーザー新規登録画面を表示
   * @param model Model
   * @return 新規登録画面
   */
  @GetMapping(value = "/user/add")
  public String displayAdd(Model model) {
	  Map<Integer, String>departmentMap=userService.getDepartmentMap();
	  model.addAttribute("departmentMap",departmentMap);
	  model.addAttribute("userRequest",new UserAddRequest());
    return "user/add";
  }
  /**
   * ユーザー新規登録
   * @param userRequest　リクエストデータ
   */
  @RequestMapping(value="/user/create",method=RequestMethod.POST)
  public String create(@Validated @ModelAttribute UserAddRequest userRequest,BindingResult result,Model model) {
	  if(result.hasErrors()) {
		  //入力エラー
		  List<String>errorList=new ArrayList<String>();
		  for(ObjectError error:result.getAllErrors()) {
			  errorList.add(error.getDefaultMessage());
		  }
		  model.addAttribute("validationError",errorList);
		  return"user/add";
	  }
	  //ユーザー情報の登録
	  userService.save(userRequest);
	  return "redirect:/user/list";
  }

  /**
   * ユーザー編集画面を表示
   * @param id 表示するユーザーID
   * @param model Model
   * @return ユーザー編集画面
   */
  @GetMapping("/user/{id}/edit")
  public String displayEdit(@PathVariable Long id,Model model) {
	  User user=userService.findById(id);
	  UserUpdateRequest userUpdateRequest= new UserUpdateRequest();
	  userUpdateRequest.setId(user.getId());
	  userUpdateRequest.setName(user.getName());
	  userUpdateRequest.setAge(user.getAge());
	  model.addAttribute("userUpdateRequest",userUpdateRequest);
	  return "user/edit";

  }
  /**
   * ユーザー更新
   */
  @RequestMapping(value="/user/update",method=RequestMethod.POST)
  public String update(@Validated @ModelAttribute UserUpdateRequest userUpdateRequest,BindingResult result,Model model) {
	  if(result.hasErrors()) {
		  List<String>errorList=new ArrayList<String>();
		  for(ObjectError error:result.getAllErrors()) {
			  errorList.add(error.getDefaultMessage());
		  }
		  model.addAttribute("validationError",errorList);
		  return "user/edit";
		  }
	  userService.update(userUpdateRequest);
	  return String.format("redirect:/user/%d",userUpdateRequest.getId());
	  }
  /**
   * ユーザー情報の削除
   */
  @GetMapping("/user/{id}/delete")
  public String delete(@PathVariable Long id, Model model) {
	  userService.delete(id);
	  return"redirect:/user/list";
  }

}