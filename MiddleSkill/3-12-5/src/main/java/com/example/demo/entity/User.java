package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * ユーザー情報 Entity
 */
@Data
public class User implements Serializable {
  /**
   * ID
   */
  private Long id;
  /**
   * 名前
   */
  private String name;
  /**
   * 年齢
   */
  private String age;
  /**
   * 性別
   */
  private int gender_id;
  /**
   *
   * 血液型
   */
  private int blood_type_id;
  /**
   * 役職 名
   */
  private String user_position;




  /**
   * 更新日時
   */
  //@Column(name = "update_date")
  //private Date updateDate;
  /**
   * 登録日時
   */
  //@Column(name = "createDate")
  //private Date createDate;
  /**
   * 削除日時
   */
  //@Column(name = "delete_date")
  //private Date deleteDate;
}