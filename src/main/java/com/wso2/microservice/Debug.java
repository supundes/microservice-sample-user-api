package com.wso2.microservice;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller

@EnableAutoConfiguration
@RequestMapping("api/debug")
public class Debug {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    String list() {
        return "{ method : \"debug list user called successfully. Test admin credentials are admin:Pa$$w0rd\"}";
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    String add() {
        return "{ method : \"debug add user called successfully. Test admin credentials are admin:Pa$$w0rd\"}";
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ResponseBody
    String update() {
        return "{ method : \"debug update user called successfully. Test admin credentials are admin:Pa$$w0rd\"}";
    }

    @RequestMapping(method = RequestMethod.DELETE)
    @ResponseBody
    String delete() {
        return "{ method : \"debug delete user called successfully. Test admin credentials are admin:Pa$$w0rd\"}";
    }

}
