package com.misc;

import com.user.User;
import com.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 *
 */
@Controller
class AuthController {

    @Autowired
    private UserService userService ;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(){
        return new ModelAndView("user/login");
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public String loginPost(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println("Username : "+username);
        System.out.println("Password : "+password);

        User user = userService.find(username);
        if (user == null){
            return "No such record";
        }
        else {return user.toString();}
    }
}