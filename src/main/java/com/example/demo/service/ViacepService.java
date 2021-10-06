package com.example.demo.service;

import com.example.demo.domain.Viacep;
import com.example.demo.dto.ViaCepDto;
import com.example.demo.mapper.ViacepMapper;
import com.example.demo.messaging.PublicadorViacep;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ViacepService {

    private final ViaCepClient viaCepClient;
    private final PublicadorViacep publicadorViacep;


    public void consultaEPublicar(String cep){
        final ViaCepDto viaCepDto = viaCepClient.getViacep(cep);
        final Viacep viacep = ViacepMapper.INSTANCE.mapFrom(viaCepDto);
        publicadorViacep.publicar(viacep);
    }


}
