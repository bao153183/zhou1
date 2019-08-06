package com.bwei.controller;

import com.bwei.pojo.Shop;
import com.bwei.pojo.ShopType;
import com.bwei.service.ShopService;
import com.bwei.utils.UploadAndDown;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
public class ShopController {

    @Autowired
    private ShopService shopService;

    //列表
    @RequestMapping("list")
    public String findAllShop(Shop shop,Map<String,Object>map, @RequestParam(value = "page",defaultValue = "1")int page){

        PageHelper.startPage(page,4);
        List<Shop> list = shopService.findAllShop(shop);
        PageInfo<Shop> of = PageInfo.of(list);
        map.put("list",of.getList());
        map.put("of",of);
        map.put("shop",shop);
        return "list";
    }
    //删除del
    @RequestMapping("del")
    @ResponseBody
    public String delShop(String ids){
            shopService.del(ids);
        return "删除成功";
    }
    //添加跳转toadd

    @RequestMapping("toadd")
    public String toadd(Map<String,Object>map){
        List<ShopType> list = shopService.getDind();
        map.put("list",list);
        return "add";
    }
    //添加
    @RequestMapping("add")
    public String add(Shop shop,MultipartFile fileName){
        String upload = UploadAndDown.upload(fileName);
        if (upload!=null){
            shop.setImges(upload);
        }
        shopService.add(shop);

        return "redirect:list";
    }

}
