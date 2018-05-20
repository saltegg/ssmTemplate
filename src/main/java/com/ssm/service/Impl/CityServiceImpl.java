package com.ssm.service.Impl;

import com.ssm.dao.CityMapper;
import com.ssm.entity.City;
import com.ssm.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private  CityMapper cityMapper;

    @Override
    public City findCityById() {
        String str = null;
        City city = cityMapper.findCityById();
        return city;
    }
}
