package com.example.usertest.service;

import com.example.usertest.dto.AddressDto;
import com.example.usertest.entity.Address;
import com.example.usertest.mapper.AddressMapper;
import com.example.usertest.repo.AddressRepo;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService{


    AddressRepo addressRepo;
    AddressMapper addressMapper;

    public AddressServiceImpl(AddressRepo addressRepo, AddressMapper addressMapper) {
        this.addressRepo = addressRepo;
        this.addressMapper = addressMapper;
    }

    @Override
    public AddressDto createAddress(AddressDto addressDto) {
        Address address = addressMapper.toAddressEntity(addressDto);
        Address savedAddress = addressRepo.save(address);
        AddressDto addDto = addressMapper.toAddressDto(savedAddress);
        return addDto;
    }

    @Override
    public AddressDto getAddressById(int id) {
        Address address = addressRepo.getById(id);
        AddressDto addressDto = addressMapper.toAddressDto(address);

        return addressDto;
    }


    @Override
    public AddressDto updateAddress(int id, AddressDto addressDto) {
        Address address = addressRepo.getById(id);
        address.setZipCode(addressDto.getZipCode());
        address.setStreetName(addressDto.getStreetName());
        address.setPhoneNumber(addressDto.getPhoneNumber());
        address.setEmail(addressDto.getEmail());
        AddressDto savedAddress = addressMapper.toAddressDto(address);
        return savedAddress;
    }

    @Override
    public void deleteUser(int id) {
        addressRepo.deleteById(id);
    }


}
