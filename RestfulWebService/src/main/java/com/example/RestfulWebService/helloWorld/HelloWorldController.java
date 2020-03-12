package com.example.RestfulWebService.helloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController //->telling spring to handle the http request(rest request) and it has a response body in it which dispatcher servelt used to give reply ti the user
public class HelloWorldController {

    @Autowired
    public MessageSource messageSource;

    //Dispatcher servlet knows /hello-world is mapped to helloworld() method
    //one it recievees the request it determines which is the right controller(method) to execute the request and returns the result into json and diplay it to user
    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "hello World..";
    }

    //Creating a bean and return it back :
    @GetMapping(path = "/hello-world-bean")
    public HelloBean hello() {
        return new HelloBean("hello world from bean..");

    }


    //Using path parameter
    @GetMapping(path = "/hello-world/path-variable/{name}")
    public Object helloWorldPathVariable(@PathVariable String name) {
        return new HelloBean(String.format("Hello  %s", name));
    }
    //.....................................................................

//    @GetMapping(path = "/hello-world-internationalised")
//    public String helloWorldInter() {
//        return "good morning";
//    }

    //Ques1---------------------------------
    @GetMapping(path = "/hello-world-internationalised")
    public String helloWorldInter(@RequestHeader(name = "Accept-Language", required = false) Locale locale) {
        return messageSource.getMessage("good.morning.message", null, locale);
    }



    //Ques2.........................................................
    @GetMapping(path = "/hello-world-internationalised/{name}")
    public String helloWorldInter(@PathVariable String name, @RequestHeader(name = "Accept-Language", required = false) Locale locale) {
        return messageSource.getMessage("good.morning.message", null, locale)/*+String.format(" %s ",name)*/+name;
    }
    //...............

        //@GetMapping(path = "/hello-world-internationalised")
        //public String helloWorldInter(){
        //  return messageSource.getMessage("good.morning.message",null, LocaleContextHolder.getLocale());
}

