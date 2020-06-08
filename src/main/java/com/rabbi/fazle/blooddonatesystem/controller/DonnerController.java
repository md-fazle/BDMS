package com.rabbi.fazle.blooddonatesystem.controller;

import com.rabbi.fazle.blooddonatesystem.model.Donner;
import com.rabbi.fazle.blooddonatesystem.services.DonnerService;
import com.rabbi.fazle.blooddonatesystem.services.MapValidationError;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/donner")
@RequiredArgsConstructor
@CrossOrigin
public class DonnerController {
    public final DonnerService donnerService;
    public final MapValidationError mapValidationError;
    @PostMapping("")
    public ResponseEntity<?>createDonner(@RequestBody Donner donner , BindingResult result){
        ResponseEntity<?> errorMap=mapValidationError.MapvalidationService(result);
        if(errorMap!=null) return errorMap;
        Donner donner1=donnerService.updateDonner(donner);
        return new ResponseEntity<Donner>(donner, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getDonnerById(@PathVariable long id){
        Donner donner = donnerService.donnerFindById(id);
        return new ResponseEntity<Donner>(donner, HttpStatus.OK);
    }
    @GetMapping("/all")
    public Iterable<Donner>getAllDonners(){
        return donnerService.findAllDonners();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?>deleteDonnerById(@PathVariable long id){
        donnerService.deleteDonnerById(id);
        return new ResponseEntity<String>("Donner with ID'"+id+"'is deleted",HttpStatus.OK);
    }

}
