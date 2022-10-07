package com.sam.dojosninjas.services;

import com.sam.dojosninjas.models.Ninja;
import com.sam.dojosninjas.repositories.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
//import java.util.Optional;

@Service
public class NinjaService {
    private final NinjaRepository ninjaRepository;
    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }
    public List<Ninja> allNinjas() {
        return ninjaRepository.findAll();
    }

    public void createNinja(Ninja ninja) {
        ninjaRepository.save(ninja);
    }

//    public Ninja findNinja(Long id) {
//        Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
//        if (optionalNinja.isPresent()) {
//            return optionalNinja.get();
//        } else {
//            return null;
//        }
//    }
}
