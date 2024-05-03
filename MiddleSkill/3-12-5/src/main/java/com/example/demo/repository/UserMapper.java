package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.UserAddRequest;
import com.example.demo.dto.UserUpdateRequest;
import com.example.demo.entity.Department;
import com.example.demo.entity.User;

@Mapper
public interface UserMapper {
	/**
	 *
	 * ユーザー情報全検索
	 */
	List<User>findAll();
	/**
	 * ユーザー情報主キー検索
	 *
	 */
	User findById(Long id);
	/**
	 *ユーザー情報検索
	 *
	 */
	//List<User>search(UserSearchRequest user);
	/**
	 * ユーザー情報　登録
	 * @return
	 */
	void save(UserAddRequest userRequest);
	/**
	 * ユーザー情報論理削除
	 *
	 */
	void delete(Long id);
	/**
	 * ユーザー情報更新
	 *
	 */
	void update(UserUpdateRequest userUpdateRequest);
	/*
	 * 役職情報を取得
	 *
	 */
	List<Department> findAllDepartment();
}
