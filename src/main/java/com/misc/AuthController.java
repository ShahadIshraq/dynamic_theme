package com.misc;

import com.user.User;
import com.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.support.SessionAttributeStore;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 */
@Controller
class AuthController {

    @Autowired
    private UserService userService ;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(Model model){
        model.addAttribute("found",true);
        return new ModelAndView("auth/login");
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginPost(HttpServletRequest request, RedirectAttributes ra){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String remember = request.getParameter("remember");

        System.out.println("Username : "+username);
        System.out.println("Password : "+password);
        System.out.println("Remember : "+remember);

        User user = userService.find(username);
        if (user == null || !user.getPassword().equals(password)){
            return "auth/login";
        }
        else {
            ra.addFlashAttribute("user",user);
            ra.addFlashAttribute("remember",remember);
            return "redirect:/dlt";
        }
    }


    @RequestMapping(value = "/logout", method = RequestMethod.POST, produces = "text/plain")
    public String logoutPost(WebRequest request, SessionAttributeStore store, SessionStatus status){
        status.setComplete();
        store.cleanupAttribute(request, "user");
        return "Ok";
    }
}