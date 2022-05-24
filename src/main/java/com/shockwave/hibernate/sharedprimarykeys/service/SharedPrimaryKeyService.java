package com.shockwave.hibernate.sharedprimarykeys.service;

import com.shockwave.hibernate.sharedprimarykeys.entity.Body;
import com.shockwave.hibernate.sharedprimarykeys.entity.Heart;
import com.shockwave.hibernate.sharedprimarykeys.repository.BodyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SharedPrimaryKeyService {

    @Autowired
    private BodyRepository bodyRepository;

    @Transactional
    public void create() {
        Body body = new Body();
        body.setId(10);
        Heart heart = new Heart();
        heart.setId(10);
        body.setHeart(heart);
        bodyRepository.save(body);
        System.out.println(bodyRepository.findById(10).toString());
    }
}
