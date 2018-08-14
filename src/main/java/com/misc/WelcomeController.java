package com.misc;

import com.Theme.Util;
import com.user.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.json.simple.JSONObject;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@Controller
public class WelcomeController {

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@RequestMapping("/")
	public ModelAndView index(){ return new ModelAndView("index");}

	@RequestMapping("/test")
	public ModelAndView test(){
		return new ModelAndView("test");
	}

//	method for testing the dynamic color loading.
	@RequestMapping("/dlt")
	public ModelAndView dynamicLoadingTest(
			@ModelAttribute("user") User user,
			Model model,
			HttpServletResponse response,
			HttpSession session) {


		/**
		 * headerColor;
		 protected String columnHeaderColor;
		 protected String boardBackgroundColor;
		 protected String pageBackgroundColor;
		 protected String footerColor;

		 */

		if(user.getUsername() != null){
			//setting the login credentials in session
			session.setAttribute("userid",user.getId());
			//Adding the colors to the cookie
			Cookie cookie = new Cookie("colors", user.getColors());
			cookie.setMaxAge(60* Util.cookieMaxAgeMinute);
			response.addCookie(cookie);

		}
		// String headerColor, String columnHeaderColor, String boardBackgroundColor, String pageBackgroundColor, String footerColor)
		model.addAttribute("colors", user.getColors());
		return new ModelAndView("dynamic_loading");
	}

//	Testing jQuery
	@RequestMapping(value = "/dlt/givedata", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public String giveDynamicData() {
		JSONObject result = new JSONObject();
		result.put("name", "Dade");
		result.put("age", 24);
		result.put("married", false);
		System.out.println(result.toJSONString());
		return result.toJSONString();
	}



//	@RequestMapping("/")
//	public String welcome(Map<String, Object> model) {
//		model.put("message", this.message);
//		return "welcome";
//	}

}