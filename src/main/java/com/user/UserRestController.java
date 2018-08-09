package com.user;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 *
 */
@RestController
@RequestMapping("/user")
public class UserRestController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/update", method = RequestMethod.POST,produces = "application/json")
    public String update(@RequestBody Body body){
        System.out.println("id : "+body.getId());
        System.out.println("Header Color : "+body.getHeader());
        JSONObject result = new JSONObject();
        result.put("id", body.getId()+" [ok]");
        result.put("headerColor", body.getHeader()+ " [ok]");
        return result.toJSONString();
    }
}

class Body{
    public Body(){}
    public Body(Long id, String header) {
        this.id = id;
        this.header = header;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    private Long id;
    private String header;
}