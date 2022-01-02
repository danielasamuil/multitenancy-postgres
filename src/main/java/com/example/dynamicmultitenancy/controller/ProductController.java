package com.example.dynamicmultitenancy.controller;

import com.example.dynamicmultitenancy.security.AuthController;
import com.example.dynamicmultitenancy.security.RequestAuthorization;
import com.example.dynamicmultitenancy.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
@RequestMapping("/api/product")
public class ProductController implements Serializable {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthController.class);

    @Autowired
    ProductService productService;

    @RequestAuthorization
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity<Object> getAllProduct() {
        LOGGER.info("getAllProduct() method call...");
        return new ResponseEntity<>(productService.getAllProduct(),HttpStatus.OK);
    }

}
