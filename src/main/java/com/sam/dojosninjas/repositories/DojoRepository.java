package com.sam.dojosninjas.repositories;

import com.sam.dojosninjas.models.Dojo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DojoRepository extends CrudRepository<Dojo, Long> {
    List<Dojo> findAll();
}
