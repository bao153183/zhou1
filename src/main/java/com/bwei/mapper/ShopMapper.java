package com.bwei.mapper;


import com.bwei.pojo.Shop;
import com.bwei.pojo.ShopType;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ShopMapper {


    List<Shop> findAllShop(@Param("shop") Shop shop);

    @Delete("delete from shop where id=#{s}")
    void delShop(String s);

    @Select("select * from shoptype")
    List<ShopType> getFind();

    @Insert("INSERT INTO `shop` ( `name`, `introl`, `money`, `starttime`,`imges`, `stater`, `tid`) VALUES ( #{name},#{introl}, #{money}, now(),#{imges},'1', #{tid})")
    void add(Shop shop);
}
