package service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dto.UserRequest;
import repository.UserRepository;

/**
	 * ユーザー情報
	 */
	@Service
	@Transactional(rollbackFor=Exception.class)
	public class UserService{
		/**
		 * ユーザー情報 Repository
		 */
		@Autowired
		private UserRepository userRepository;
		/**
		 * ユーザー情報全検索
		 * @return　検索結果
		 */
		public List<User>searchAll(){
			return UserRepository.findAll();
		}
		/**
		 * ユーザー情報　新規登録
		 * @param userユーザー情報
		 */
		public void create(UserRequest userRequest) {
			Date now=new Date();
			User user=new User();
			user.setName(userRequest.getName());
			user.setAge(userRequest.getAge());
			user.setCreateDate(now);
			user.setUpdateDate(now);
			userRepository.save(user);

		}

	}
