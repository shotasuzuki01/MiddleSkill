package dto;

import java.io.Serializable;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserRequest implements Serializable{
	/**
	 * 名前
	 */
	@NotEmpty(message="名前を入力してください")
	@Size(max=100,message="名前は100桁以内で入力してください")
	private String name;

	@NotEmpty(message="年齢を入力してください")
	private String age;



}
