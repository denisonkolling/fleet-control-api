package com.fleetcontrol.service.impl;

import com.fleetcontrol.model.Product;
import com.fleetcontrol.repository.ProductRepository;
import com.fleetcontrol.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceimpl implements ProductService {


    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
