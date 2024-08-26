package com.buubleboy.product;

import com.bubbleboy.product.ProductApplication;
import com.bubbleboy.product.entity.BrandEntity;
import com.bubbleboy.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = ProductApplication.class)
class ProductApplicationTests {


    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("zhangsan");

        boolean save = brandService.save(brandEntity);
        System.out.println(save);


    }

}
