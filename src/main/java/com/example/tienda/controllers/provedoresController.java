package com.example.tienda.controllers;

import com.example.tienda.models.provedoresModel;
import com.example.tienda.services.provedoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(path="api/provedores")
public class provedoresController {
    @Autowired
    private provedoresService provedoresService;

    //create or update
    @PostMapping
    public void saveOrUpdate(@RequestBody provedoresModel provedoresModel){
        provedoresService.saveOrUpdate(provedoresModel);
    }

    // read
    @GetMapping
    public List<provedoresModel> getAllProvedores(){
        return provedoresService.getprovedores();
    }

    //read by id
    @GetMapping("/{provedorId}")
    public Optional<provedoresModel> getProvedoresById(@PathVariable("provedorId") Long provedorId){
        return provedoresService.getprovedor(provedorId);
    }

    // delete
    @DeleteMapping("/{provedorId}")
    public void deleteprovedor(@PathVariable("provedorId") Long provedorId){
        provedoresService.deleteProvedor(provedorId);
    }
}
