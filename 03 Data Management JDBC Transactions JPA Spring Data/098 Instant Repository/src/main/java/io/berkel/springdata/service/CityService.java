package com.vinodv.springdata.service;

import com.vinodv.springdata.model.City;

public interface CityService {

    Iterable<City> findAll1();

    Iterable<City> findAll2();

}
