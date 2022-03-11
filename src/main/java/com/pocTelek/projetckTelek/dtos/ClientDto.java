package com.pocTelek.projetckTelek.dtos;

import java.util.UUID;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientDto {

    private UUID id;

    @NotBlank
    private String name;

    @NotBlank
    private String email;


}
