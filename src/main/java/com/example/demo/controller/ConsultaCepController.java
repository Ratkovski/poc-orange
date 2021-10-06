package com.example.demo.controller;

import com.example.demo.domain.Viacep;
import com.example.demo.dto.CepDto;
import com.example.demo.service.ViacepService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cep")
@RequiredArgsConstructor
public class ConsultaCepController {

    private final ViacepService viacepService;

    @PostMapping
    public ResponseEntity<Void> consuta(@RequestBody CepDto cepDto){
        try{
            viacepService.consultaEPublicar(cepDto.getCep());
            return ResponseEntity.ok().build();
        }catch (RuntimeException runtimeException){
            runtimeException.printStackTrace();
            return ResponseEntity.badRequest().build();
        }

    }
}
