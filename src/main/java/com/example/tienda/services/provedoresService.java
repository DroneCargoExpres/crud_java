package com.example.tienda.services;

import com.example.tienda.models.provedoresModel;
import com.example.tienda.repositories.IUprovedores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class provedoresService {
    @Autowired
    IUprovedores IUprovedores;

    // create or update
    public void saveOrUpdate(provedoresModel provedoresModel){
        IUprovedores.save(provedoresModel);
    }

    // read
    public List<provedoresModel> getprovedores(){
        return IUprovedores.findAll();
    }

    // read by id
    public Optional<provedoresModel> getprovedor(Long id){
        return IUprovedores.findById(id);
    }

    // delete by id
    public void deleteProvedor(Long id){
        IUprovedores.deleteById(id);
    }
}
