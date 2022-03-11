package com.pocTelek.projetckTelek.service;

import com.pocTelek.projetckTelek.model.ClientModel;
import com.pocTelek.projetckTelek.repositories.ClientRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    final ClientRepository clientRepository;


    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Transactional
    public ClientModel save(ClientModel clientModel) {
        return clientRepository.save(clientModel);
    }

    public List<ClientModel> findAll(){
        return clientRepository.findAll();
    }
}
