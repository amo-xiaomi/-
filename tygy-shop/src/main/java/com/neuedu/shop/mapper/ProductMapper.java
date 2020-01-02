package com.neuedu.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.neuedu.shop.pojo.Product;
@Repository
public interface ProductMapper {
	List<Product> findAll();
	
	void delete(Integer id);
	
	@Update("update t_product set product_name=#{name},product_description=#{descr},product_normalprice=#{np},product_memberprice=#{mp},product_categoryid=#{cid} where id=#{id}")
	void reset(@Param("id")int id,@Param("name")String name,@Param("descr")String descr,@Param("np")Double nprice,@Param("mp")Double mp,@Param("cid")int cid);
	
	Product findById(int id);
	
}
