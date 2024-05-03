package com.example.demo.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.UserAddRequest;
import com.example.demo.dto.UserUpdateRequest;
import com.example.demo.entity.Department;
import com.example.demo.entity.User;

import com.example.demo.repository.UserMapper;

/**
 * ユーザー情報 Service
 */
@Service
@Transactional(rollbackFor=Exception.class)
public class UserService {

  /**
   * ユーザー情報 Mapper
   */
	@Autowired
	private UserMapper userMapper;

  /**
   * ユーザー情報 全検索
   * @return 検索結果
   */
  public List<User> findAll() {
    return userMapper.findAll();
  }
  /**
   * ユーザー情報主キー検索
   */
  public User findById(Long id) {
	  return userMapper.findById(id);
  }
  /**
   * ユーザー情報登録
   */
  public void save(UserAddRequest userAddRequest) {
	  userMapper.save(userAddRequest);
  }
  /**
   * ユーザー情報更新
   */
  public void update(UserUpdateRequest userUpdateRequest) {
	  userMapper.update(userUpdateRequest);
  }
  /**
   * ユーザー情報論理削除
   */
  public void delete(Long id) {
	  userMapper.delete(id);
  }
  /**
   * 役職プルダウン格納
   *
   */
  public Map<Integer,String>getDepartmentMap(){
		List<Department>Department=userMapper.findAllDepartment();

		Map<Integer,String>DepartmentMap= new LinkedHashMap<>();

		for(Department row : Department) {
			Integer departmentId= row.getDepartmentId();
			String departmentName= row.getDepartmentName();
			DepartmentMap.put(departmentId, departmentName);
		}
		return DepartmentMap;
	}
}




