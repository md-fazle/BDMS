package com.rabbi.fazle.blooddonatesystem.services;

import com.rabbi.fazle.blooddonatesystem.exception.DonnerIdException;
import com.rabbi.fazle.blooddonatesystem.model.Donner;
import com.rabbi.fazle.blooddonatesystem.repository.DonnerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DonnerService {
 private final DonnerRepository donnerRepo;
  // creat
    public Donner updateDonner(Donner donner){
        return donnerRepo.save(donner);
    }
    //Find
    public Donner donnerFindById(long id){
        Donner donner= donnerRepo.findById(id).orElse(null);
        if(donner==null){
            throw new DonnerIdException("Donor Id"+id+"does not exist.");
        }
        return donner;
    }
    //find all
    public Iterable<Donner>findAllDonners(){
        return donnerRepo.findAll();
    }
    //Delete
    public void deleteDonnerById(long id){
        Donner donner= donnerRepo.findById(id).orElse(null);
        if(donner==null){
            throw new DonnerIdException("The Donor with ID"+id+"is no exist");
        }
        donnerRepo.delete(donner);
    }

}
