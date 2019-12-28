package com.neuedu.shop.pojo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6455339704532936846L;

	private Integer id;
	private String name;
	private String descr;
	private Integer pid;
	private boolean leaf;
	private Integer grade;
	
}
