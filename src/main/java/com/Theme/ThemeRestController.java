package com.Theme;


import com.user.User;
import com.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 */
@RestController
class ThemeRestController {
    @Autowired
    private UserService userService ;

    @PostMapping(value = "/changeTheme", produces = "text/plain")
    public String changeTheme(HttpSession session, HttpServletRequest request){
        Long userid = (Long) session.getAttribute("userid");
        String colors = request.getParameter("colors");
        System.out.println("Incoming save request from userId : "+userid);
        System.out.println("New colors : "+colors);

        User user = userService.findOne(userid);
        if (user == null || user.getUsername() == null || user.getUsername().equals("")) return "No such user.";
        userService.updateColor(colors, user.getId());
        System.out.println("Changer color.");
        return "Ok";
    }
}