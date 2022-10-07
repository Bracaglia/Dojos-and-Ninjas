package com.sam.dojosninjas.repositories;

import com.sam.dojosninjas.models.Ninja;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NinjaRepository extends CrudRepository<Ninja, Long> {
    List<Ninja> findAll();
}
