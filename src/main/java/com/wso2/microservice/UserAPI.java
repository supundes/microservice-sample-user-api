package com.wso2.microservice;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
@RequestMapping("api/user")
public class UserAPI {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    String list() {
        return "{ method : \"list user called successfully\"}";
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    String add() {
        return "{ method : \"add user called successfully\"}";
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ResponseBody
    String update() {
        return "{ method : \"update user called successfully\"}";
    }

    @RequestMapping(method = RequestMethod.DELETE)
    @ResponseBody
    String delete() {
        return "{ method : \"delete user called successfully\"}";
    }

}