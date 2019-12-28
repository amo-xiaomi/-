package com.neuedu.shop.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID =-6618700848286655362l;
	private Integer id;
	private String name;
	private String password;
	private String phone;
	private String addr;
	private Timestamp rdate;
}
