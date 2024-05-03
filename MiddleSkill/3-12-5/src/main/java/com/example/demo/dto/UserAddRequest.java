package com.example.demo.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class UserAddRequest implements Serializable {

	/**
	 * 名前
	 */
	@NotEmpty(message = "名前を入力してください")
	@Size(max = 100, message = "名前は100桁以内で入力してください")
	private String name;

	/**
	 * 年齢
	 */
	@NotEmpty(message = "年齢を入力してください")
	@Size(max = 999, message = "年齢は３桁以内で入力してください")
	private String age;

	/**
	 * 性別
	 */
	private int Gender_id;

	/**
	 * 登録日
	 */

	//private Date createDate;

	/**
	 * 血液型
	 */
	private int blood_type_id;
	/**
	 * 役職
	 */
	private String user_position;

}
