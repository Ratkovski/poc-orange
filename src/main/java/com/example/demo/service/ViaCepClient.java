package com.example.demo.service;

import com.example.demo.dto.ViaCepDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="viacep", url="https://viacep.com.br/ws/")
public interface ViaCepClient {

    @RequestMapping(method = RequestMethod.GET, value = "{cep}/json", produces = "appication/json")
    ViaCepDto getViacep(@PathVariable("cep")final String cep);


}
