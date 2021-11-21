package com.uvass.provatassiop2web.controller;

import com.uvass.provatassiop2web.model.entity.Product;
import com.uvass.provatassiop2web.model.repository.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProductController {
    private ProductRepository productRepository;

    public ProductController(JdbcTemplate jdbcTemplate) {
        productRepository = new ProductRepository(jdbcTemplate);
    }

    @CrossOrigin("*")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/")
    public List<Product> search() throws Exception {
        return productRepository.search();
    }
}