package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ViaCepDto {

    @JsonProperty
    private String cep;
    @JsonProperty
    private String logradouro;
    @JsonProperty
    private String complemento;
    @JsonProperty
    private String bairro;
    @JsonProperty
    private String cidade;
    @JsonProperty
    private String estado;
    @JsonProperty
    private String ibge;
    @JsonProperty
    private String gia;
    @JsonProperty
    private String ddd;
    @JsonProperty
    private String siafi;
}
