package com.assessment.sampleapp.service;

import com.assessment.sampleapp.repository.ProductRepository;
import com.assessment.sampleapp.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Optional<Product> findById(long id) {
        return productRepository.findById(id);
    }

    @Transactional
    public Product createOrUpdate(Product product) {
        return productRepository.save(product);
    }

    @Transactional
    public void deleteById(long id) {
        productRepository.deleteById(id);
    }
}
