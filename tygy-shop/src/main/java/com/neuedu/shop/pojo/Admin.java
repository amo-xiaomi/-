package com.neuedu.shop.pojo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Admin implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6222636405311809370L;
	/**
	 * 
	 */
	
	private Integer id;
	private String name;
	private String password;

}
