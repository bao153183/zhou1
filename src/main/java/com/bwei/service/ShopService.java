package com.bwei.service;


import com.bwei.mapper.ShopMapper;
import com.bwei.pojo.Shop;
import com.bwei.pojo.ShopType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopService {

    @Autowired
    private ShopMapper shopMapper;



    public List<Shop> findAllShop(Shop shop) {
    return shopMapper.findAllShop(shop);
    }
    //删除
    public void del(String ids) {
        String substring = ids.substring(1);
        String[] split = substring.split(",");
        for (int i=0;i<split.length;i++){
            shopMapper.delShop(split[i]);
        }
    }

    public List<ShopType> getDind() {
        return shopMapper.getFind();
    }

    public void add(Shop shop) {
        shopMapper.add(shop);
    }


}
