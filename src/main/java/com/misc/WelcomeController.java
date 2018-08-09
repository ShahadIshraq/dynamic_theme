package com.misc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.json.simple.JSONObject;


@Controller
public class WelcomeController {

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@RequestMapping("/")
	public ModelAndView index(){
		return new ModelAndView("index");
	}

	@RequestMapping("/test")
	public ModelAndView test(){
		return new ModelAndView("test");
	}

//	method for testing the dynamic color loading.
	@RequestMapping("/dlt")
	public ModelAndView dynamicLoadingTest() {
		System.out.println("Got into dynamicLoadingTest()");
		return new ModelAndView("dynamic_loading_test");
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