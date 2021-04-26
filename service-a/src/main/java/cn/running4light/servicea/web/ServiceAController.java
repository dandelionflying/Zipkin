package cn.running4light.servicea.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@RequestMapping("service-a")
public class ServiceAController {

    @ResponseBody
    @GetMapping("func1")
    public String func1(){
        return "a-func1";
    }
}
