package com.rabbi.fazle.blooddonatesystem.repository;

import com.rabbi.fazle.blooddonatesystem.model.Donner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonnerRepository extends CrudRepository<Donner,Long> {
}
