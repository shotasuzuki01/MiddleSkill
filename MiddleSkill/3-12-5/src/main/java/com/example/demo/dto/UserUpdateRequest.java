package com.example.demo.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class UserUpdateRequest extends UserAddRequest implements Serializable{
	/**
	 * ユーザーID
	 */
	@NotNull
	private Long id;
}
