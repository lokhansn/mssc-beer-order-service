package com.sgl.sfg.beer.order.service.services;

import com.sgl.sfg.brewery.model.CustomerPagedList;
import org.springframework.data.domain.Pageable;

public interface CustomerService {

    CustomerPagedList listCustomers(Pageable pageable);

}