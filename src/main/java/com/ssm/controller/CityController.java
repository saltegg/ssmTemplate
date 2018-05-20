package com.ssm.controller;

import com.ssm.entity.City;
import com.ssm.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping("/city")
    public @ResponseBody City findAllCity(){
        return cityService.findCityById();
    }
}
