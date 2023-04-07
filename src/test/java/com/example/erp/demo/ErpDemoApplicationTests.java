package com.example.erp.demo;

import com.example.erp.demo.request.ItemSku;
import com.example.erp.demo.service.ErpService;
import com.jushuitan.api.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@SpringBootTest
class ErpDemoApplicationTests {

    @Autowired
    private ErpService erpService;

    @Test
    void contextLoads() {
        List<ItemSku> itemSkus = new ArrayList<>();
        ItemSku itemSku = new ItemSku();
        itemSku.setSku_id("JY001");
        itemSku.setI_id("JY002");
        itemSku.setPurchase_price(new BigDecimal("10.00"));
        itemSkus.add(itemSku);

        ApiResponse apiResponse = erpService.itemSkuUpload(itemSkus);
        log.info("apiResponse: {}", apiResponse);
    }

}
