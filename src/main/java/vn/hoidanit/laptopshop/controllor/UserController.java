package vn.hoidanit.laptopshop.controllor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.Module;

import vn.hoidanit.laptopshop.service.UserService;



@Controller
public class UserController {
    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @RequestMapping("/")
    public String gethomo(Model model) {
        String test = this.userService.HandleHello();
        model.addAttribute("bao", test);
        return "helle";
    }
}
