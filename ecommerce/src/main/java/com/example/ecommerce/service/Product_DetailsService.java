package com.example.ecommerce.service;

import com.example.ecommerce.domain.Product_Details;
import com.example.ecommerce.repository.Product_DetailsRepository;
import com.example.ecommerce.service.dto.Product_DetailsDTO;
import com.example.ecommerce.service.mapper.Product_DetailsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Product_DetailsService {
    @Autowired
    private Product_DetailsRepository product_detailsRepository;
    private Product_DetailsMapper product_detailsMapper=new Product_DetailsMapper();

    public Product_DetailsDTO findByIdProduct(Long id){

        return product_detailsMapper.toDto(product_detailsRepository.findByIdProduct(id));
    }

    public List<Product_Details> findAll(){
        return product_detailsRepository.findAll();
    }
}
