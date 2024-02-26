package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.UserRequest;
import com.example.demo.dto.UserUpdateRequest;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

/**
 * ユーザー情報 Service
 */
@Service
@Transactional(rollbackFor=Exception.class)
public class UserService {

  /**
   * ユーザー情報 Repository
   */
  @Autowired
  private UserRepository userRepository;

  /**
   * ユーザー情報 全検索
   * @return 検索結果
   */
  public List<User> searchAll() {
    return userRepository.findAll();
  }
  /**
   * ユーザー情報　新規登録
   */
  public void create(UserRequest userRequest) {
	  User user=new User();
	  user.setName(userRequest.getName());
	  user.setAge(userRequest.getAge());
	  user.setGender_id(userRequest.getGender_id());
	  user.setBlood_type_id(userRequest.getBlood_type_id());
	 // user.setCreateDate(userRequest.getCreateDate());
  }
  /**
   * ユーザー情報　主キー検索
   */
  public User findById(Long id) {
	  return userRepository.findById(id).get();
  }
  /**
   * ユーザー情報更新
   */
  public void update(UserUpdateRequest userUpdateRequest) {
	  User user=findById(userUpdateRequest.getId());
	  user.setName(userUpdateRequest.getName());
	  user.setAge(userUpdateRequest.getAge());
	  user.setGender_id(userUpdateRequest.getGender_id());
	  user.setBlood_type_id(userUpdateRequest.getBlood_type_id());
	  userRepository.save(user);
  }
  /**
   * ユーザー情報削除
   */
  public void delete(Long id) {
	  User user=findById(id);
	  userRepository.delete(user);
  }
}