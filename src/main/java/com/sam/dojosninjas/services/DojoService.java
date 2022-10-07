package com.sam.dojosninjas.services;


import com.sam.dojosninjas.models.Dojo;
import com.sam.dojosninjas.repositories.DojoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DojoService {
    @Autowired
    DojoRepository dojoRepository;

    public List<Dojo> allDojos() {
        return dojoRepository.findAll();
    }

    public void createDojo(Dojo dojo) {
        dojoRepository.save(dojo);
    }
    public Dojo findDojo(Long id) {
        Optional<Dojo> optionalDojo = dojoRepository.findById(id);
        if (optionalDojo.isPresent()) {
            return optionalDojo.get();
        } else {
            return null;
        }
    }
}
