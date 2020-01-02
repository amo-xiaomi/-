package com.neuedu.shop.pojo;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8224733558664505797L;
	private Integer id;
	private String name;
	private String descr;
	public Product(String name, String descr, Double normalprice, String imgPath, Category category) {
		super();
		this.name = name;
		this.descr = descr;
		this.normalprice = normalprice;
		this.imgPath = imgPath;
		this.category = category;
	}



	private Double normalprice;
	private Double memberprice;
	private String imgPath;
	private Timestamp pdate; //商品上架日期

			
			
	private Category category;
	private int categoryid;
			
}




