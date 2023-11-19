package entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * ユーザー情報　
 *
 */

@Entity
@Data
@Table(name="user")
public class User implements Serializable{
	/**
	 * ID
	 */
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	/**
	 * 名前
	 */
	@Column(name="name")
	private String name;

	@Column(name="Age")
	private String age;

	@Column(name="update_date")
	private Date updateDate;

	@Column(name="create_date")
	private Date createDate;
}
