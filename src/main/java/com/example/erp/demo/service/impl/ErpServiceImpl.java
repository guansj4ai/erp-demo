package com.example.erp.demo.service.impl;

import cn.hutool.core.map.MapUtil;
import cn.hutool.json.JSONUtil;
import com.example.erp.demo.config.ErpProperties;
import com.example.erp.demo.request.ItemSku;
import com.example.erp.demo.service.ErpService;
import com.jushuitan.api.ApiClient;
import com.jushuitan.api.ApiRequest;
import com.jushuitan.api.ApiResponse;
import com.jushuitan.api.exception.ApiException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author guan.sj
 * @date 2023/4/1
 * @since 1.0
 */
@Slf4j
@Service
public class ErpServiceImpl implements ErpService {
    @Autowired
    private ApiClient client;
    @Autowired
    private ErpProperties erpProperties;

    @Override
    public ApiResponse itemSkuUpload(List<ItemSku> itemSkus) {
        // new map
        Map<String, Object> map = MapUtil.newHashMap();
        map.put("items", itemSkus);
        String biz = JSONUtil.toJsonStr(map);
        return execute(erpProperties.getUrl() + "/open/jushuitan/itemsku/upload", biz);
    }

    @Override
    public ApiResponse execute(String url, String biz) {
        // 构建请求对象
        ApiRequest request = new ApiRequest.Builder(url, erpProperties.getAppKey(), erpProperties.getAppSecret())
                .biz(biz).build();
        // 执行接口调用
        try {
            ApiResponse response = client.execute(request, erpProperties.getAccessToken());
            log.info("response: {}", response);
            return response;
        } catch (ApiException e) {
            switch (e.getCodeEnum()) {
                case SYS_ERROR:
                    // TODO retry
                    break;
                case PARAM_ERROR:
                    // TODO check param
                    break;
                case SIGN_ERROR:
                    // TODO @see com.jushuitan.api.util.ApiUtil
                    break;
                case CONNECT_ERROR:
                    // TODO check network
                    break;
                case TIME_OUT_ERROR:
                    // TODO check logic or reset readTimeout
                    break;
                case EXECUTE_ERROR:
                    // TODO @see com.jushuitan.api.DefaultApiClient#executeRemote
                    break;
                default:
                    // log
                    break;
            }
        } catch (Exception e) {
            // exception handle
        }
        return null;
    }
}
