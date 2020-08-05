package com.huang.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huang.common.utils.PageUtils;
import com.huang.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author huangjinchao
 * @email 375859080@qq.com
 * @date 2020-07-19 17:29:19
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void updateDetail(BrandEntity brand);
}

