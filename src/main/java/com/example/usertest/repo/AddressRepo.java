package com.example.usertest.repo;

import com.example.usertest.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address,Integer> {


}
