package com.example.demo.controller;

import com.example.demo.dto.CepDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cep")
@RequiredArgsConstructor
public class ConsultaCepController {

    @PostMapping
    public ResponseEntity<Void> consuta(@RequestBody CepDto cepDto){
        return ResponseEntity.ok().build();

    }
}
