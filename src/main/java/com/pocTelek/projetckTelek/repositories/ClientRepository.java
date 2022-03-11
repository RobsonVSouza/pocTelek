package com.pocTelek.projetckTelek.repositories;

import com.pocTelek.projetckTelek.model.ClientModel;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository <ClientModel, UUID> {


}
