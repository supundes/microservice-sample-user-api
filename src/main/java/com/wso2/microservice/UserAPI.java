package com.wso2.microservice;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller

@EnableAutoConfiguration
@RequestMapping("api/user")
public class UserAPI {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    String list(@RequestHeader(required = false, value = JWTUtil.JWT_HEADER) String jwt, @RequestParam(required = false, value = "data") String data) {
        System.out.println("DATA = " + data);
        return "{ method : \"list user called successfully\", jwt: \"" + jwt + "\", data: \"" + data + "\"}";
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    String add(@RequestHeader(required = false, value = JWTUtil.JWT_HEADER) String jwt, @RequestParam(required = false, value = "data") String data) {
        return "{ method : \"add user called successfully\", jwt: \"" + jwt + "\", data: \"" + data + "\"}";
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ResponseBody
    String update(@RequestHeader(required = false, value = JWTUtil.JWT_HEADER) String jwt, @RequestParam(required = false, value = "data") String data) {
        return "{ method : \"update user called successfully\", jwt: \"" + jwt + "\", data: \"" + data + "\"}";
    }

    @RequestMapping(method = RequestMethod.DELETE)
    @ResponseBody
    String delete(@RequestHeader(required = false, value = JWTUtil.JWT_HEADER) String jwt, @RequestParam(required = false, value = "data") String data) {
        return "{ method : \"delete user called successfully\", jwt: \"" + jwt + "\", data: \"" + data + "\"}";
    }

}
