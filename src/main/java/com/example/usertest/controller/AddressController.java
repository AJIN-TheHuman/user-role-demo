package com.example.usertest.controller;

import com.example.usertest.dto.AddressDto;
import com.example.usertest.mapper.AddressMapper;
import com.example.usertest.mapper.UserMapper;
import com.example.usertest.reponse.AddressRes;
import com.example.usertest.request.AddressReq;
import com.example.usertest.service.AddressService;
import com.example.usertest.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("address")
public class AddressController {

    private AddressService addressService;
    private AddressMapper addressMapper;
    private UserService userService;
    private UserMapper userMapper;

    public AddressController(AddressService addressService, AddressMapper addressMapper, UserService userService, UserMapper userMapper) {
        this.addressService = addressService;
        this.addressMapper = addressMapper;
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @PostMapping("/create")
    public AddressRes createAddress(@RequestBody AddressReq addressReq){

        AddressDto addressDto = addressMapper.toAddressDto(addressReq);
        AddressDto savedAddress = addressService.createAddress(addressDto);
        AddressRes addressRes = addressMapper.toAddressRes(savedAddress);
        return addressRes;
    }

    @GetMapping("/{id}")
    public AddressRes getAddress(@PathVariable("id") int id){
        AddressDto addressDto = addressService.getAddressById(id);
        AddressRes addressRes1 = addressMapper.toAddressRes(addressDto);
        return  addressRes1;
    }

    @PutMapping("/{id}")
    public AddressRes updateAddress(@PathVariable("id") int id,@RequestBody AddressReq addressReq){
        AddressDto addressDto = addressMapper.toAddressDto(addressReq);
        AddressDto savedAddress = addressService.updateAddress(id,addressDto);
        AddressRes addressRes = addressMapper.toAddressRes(savedAddress);
        return addressRes;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteRole(@PathVariable("id") int id){
        addressService.deleteUser(id);
        return new ResponseEntity<>("success", HttpStatus.OK);
    }


}
