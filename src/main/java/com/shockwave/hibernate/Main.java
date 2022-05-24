package com.shockwave.hibernate;

import com.shockwave.hibernate.sharedprimarykeys.service.SharedPrimaryKeyService;
import com.shockwave.hibernate.bidirectional.mapping.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Main {

    @Autowired
    private Service service;

    @Autowired
    private SharedPrimaryKeyService sharedPrimaryKeyService;
    @PostConstruct
    public void testInsert(){
        service.create();
        service.createCustomer();
        sharedPrimaryKeyService.create();
    }


}
