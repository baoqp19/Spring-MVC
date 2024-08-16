package vn.hoidanit.laptopshop.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.hoidanit.laptopshop.service.UserService;

@RestController
public class UserController {

    final private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }


    @RequestMapping("/")
    public String gethomo(){
        return this.userService.HandleHello();
    }
}
