package com.example.erp.demo.service;

import com.example.erp.demo.request.ItemSku;
import com.jushuitan.api.ApiResponse;

import java.util.List;

/**
 * @author guan.sj
 * @date 2023/4/1
 * @since 1.0
 */
public interface ErpService {
    ApiResponse itemSkuUpload(List<ItemSku> itemSkus);

    ApiResponse execute(String url, String biz);
}
