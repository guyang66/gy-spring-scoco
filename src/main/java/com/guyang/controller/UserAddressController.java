package com.guyang.controller;
import com.guyang.entity.UserAddress;
import com.guyang.service.UserAddressService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import redis.clients.jedis.Jedis;

@Controller
@Slf4j
@RequestMapping("/userAddress")
public class UserAddressController {
    @Autowired
    private UserAddressService userAddressService;

    @RequestMapping(value = "queryById",method = RequestMethod.GET)
    @ResponseBody
    public UserAddress query(Long id){
//        return new UserAddress();

        UserAddress userAddress = userAddressService.selectById( 1001L);

//        log.info("打印下log的info");
//        log.error("zheshicuowi");

//        Jedis jedis = new Jedis("localhost");
//        System.out.println("redis服务："+jedis.ping());
//        userAddress.setAddress(jedis.get("guyang"));
        return  userAddress;
    }

    @RequestMapping("/userDetail")
    public String userDetail(Model model){
        UserAddress userAddress = userAddressService.selectById( 1001L);
        model.addAttribute("code",200);
        model.addAttribute("msg","对比的不行");
        model.addAttribute("data", userAddress);
        return  "userDetail";
    }


    @RequestMapping("/goodsDetail")
    public String goodsDetail(Model model){
        UserAddress userAddress = userAddressService.selectById( 1001L);
        model.addAttribute("code",100);
        model.addAttribute("msg","接送成攻！");
        model.addAttribute("data", userAddress);
        return  "goods/goodsDetail";
    }


    @RequestMapping("/demo")
    public String demo(Model model){
        return  "demo/index";
    }





}
