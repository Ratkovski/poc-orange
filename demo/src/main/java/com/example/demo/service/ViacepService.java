package com.example.demo.service;

import com.example.demo.domain.Viacep;
import com.example.demo.dto.ViaCepDto;
import com.example.demo.mapper.ViacepMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ViacepService {

    private final ViaCepClient viaCepClient;


    public void consulta(String cep){
        final ViaCepDto viaCepDto = viaCepClient.getViacep(cep);
        final Viacep viacep = ViacepMapper.INSTANCE.mapFrom(viaCepDto);
        return;
    }


}
