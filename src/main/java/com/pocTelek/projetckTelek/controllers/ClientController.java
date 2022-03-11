package com.pocTelek.projetckTelek.controllers;


import com.pocTelek.projetckTelek.dtos.ClientDto;
import com.pocTelek.projetckTelek.model.ClientModel;
import com.pocTelek.projetckTelek.service.ClientService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
public class ClientController {

    final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping
    public ResponseEntity<Object> saveClient(@RequestBody @Valid ClientDto clientDto){
        var clientModel = new ClientModel();
        BeanUtils.copyProperties(clientDto,clientModel);
        return ResponseEntity.status(HttpStatus.OK).body(clientService.save(clientModel));
    }

    @GetMapping
    public ResponseEntity<List<ClientModel>> getAllClient(){
        return ResponseEntity.status(HttpStatus.OK).body(clientService.findAll());
    }
}
