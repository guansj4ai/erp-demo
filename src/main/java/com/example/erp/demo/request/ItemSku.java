package com.example.erp.demo.request;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * @author guan.sj
 * @date 2023/4/1
 * @since 1.0
 */
@Data
public class ItemSku {
    /**
     * 商品编码
     */
    private String sku_id;
    /**
     * 款式编码，可更新
     */
    private String i_id;
    /**
     * 品牌，可更新
     */
    private String brand;
    /**
     * 虚拟分类，可更新
     */
    private String vc_name;
    /**
     * 商品分类，必须是[商品类目管理]中的叶子节点，可更新
     */
    private String c_name;
    /**
     * 基本售价，可更新
     */
    private BigDecimal s_price;
    /**
     * 商品属性，可选值["成品","半成品","原材料","包材"]，可更新
     */
    private String item_type;
    /**
     * 长，可更新
     */
    private BigDecimal l;
    /**
     * 宽，可更新
     */
    private BigDecimal w;
    /**
     * 高，可更新
     */
    private BigDecimal h;
    /**
     * 图片地址（款图片），可更新
     */
    private String pic;
    /**
     * 大图地址，可更新
     */
    private String pic_big;
    /**
     * 商品图片（sku图片），可更新
     */
    private String sku_pic;
    /**
     * 名称，可更新
     */
    private String name = "测试商品";
    /**
     * 备注，可更新
     */
    private String remark;
    /**
     * 颜色及规格，可更新
     */
    private String properties_value;
    /**
     * 简称，可更新
     */
    private String short_name;
    /**
     * 重量，可更新
     */
    private BigDecimal weight;
    /**
     * 是否启用，默认值1,可选值:-1=禁用,0=备用,1=启用，可更新
     */
    private Integer enabled;
    /**
     * 供应商名称，可更新
     */
    private String supplier_name;
    /**
     * 国标码，可更新
     */
    private String sku_code;
    /**
     * 供应商商品编码，可更新
     */
    private String supplier_sku_id;
    /**
     * 供应商款式编码，可更新
     */
    private String supplier_i_id;
    /**
     * 其它价格1，可更新
     */
    private BigDecimal other_price_1;
    /**
     * 其它价格2，可更新
     */
    private BigDecimal other_price_2;
    /**
     * 其它价格3，可更新
     */
    private BigDecimal other_price_3;
    /**
     * 其它价格4，可更新
     */
    private BigDecimal other_price_4;
    /**
     * 其它价格5，可更新
     */
    private BigDecimal other_price_5;
    /**
     * 其它属性1，可更新
     */
    private String other_1;
    /**
     * 其它属性2，可更新
     */
    private String other_2;
    /**
     * 其它属性3，可更新
     */
    private String other_3;
    /**
     * 其它属性4，可更新
     */
    private String other_4;
    /**
     * 其它属性5，可更新
     */
    private String other_5;
    /**
     * 禁止同步，true=禁止，false=允许，可更新
     */
    private boolean stock_disabled;
    /**
     * 成本价，可更新
     */
    private BigDecimal c_price;
    /**
     * 市场|吊牌价，可更新
     */
    private BigDecimal market_price;
    /**
     * 单位
     */
    private String unit;
    /**
     * 增加标签
     */
    private List<String> labels;
    /**
     * 是否启用生产批次
     */
    private boolean batch_enabled;
    /**
     * 是否启用序列号
     */
    private boolean is_series_BigDecimal;
    /**
     * 辅助码；系统中相关业务项需配置
     */
    private String other_code;
    /**
     * 保质期天数；必须大于0
     */
    private Integer shelf_life;
    /**
     * 临期天数
     */
    private Integer hand_day;
    /**
     * 保质期禁收天数
     */
    private Integer rejectLifecycle;
    /**
     * 保质期禁售天数
     */
    private Integer lockupLifecycle;
    /**
     * 保质期临期预警天数
     */
    private Integer adventLifecycle;
    /**
     * 按款显示时商品列表里的属性-传值时商品类目需存在；字段名称及字段值都可自定义，可更新
     */
    private Map<String, String> CategoryPropertys;
    /**
     * 移除标签
     */
    private List<String> deletedlabels;
    /**
     * 生产许可证
     */
    private String production_licence;
    /**
     * 采购价
     */
    private BigDecimal purchase_price;
}
