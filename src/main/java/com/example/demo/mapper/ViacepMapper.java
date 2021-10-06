package com.example.demo.mapper;

import com.example.demo.domain.Viacep;
import com.example.demo.dto.ViaCepDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ViacepMapper {
    ViacepMapper INSTANCE = Mappers.getMapper(ViacepMapper.class);

    Viacep mapFrom(final ViaCepDto viaCepDto);




}
