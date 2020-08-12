package com.huang.mall.search.controller;

import com.huang.common.exception.BizCodeEnume;
import com.huang.common.to.es.SkuEsModel;
import com.huang.common.utils.R;
import com.huang.mall.search.service.ProductSaveService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

/**
 * @AUTHOR: raymond
 * @DATETIME: 2020/5/13  22:41
 * DESCRIPTION:
 **/
@Slf4j
@RequestMapping("/search/save")
@RestController
public class ESSaveController {

    @Resource
    private ProductSaveService productSaveService;
    //上架商品
    @PostMapping("/product")
    public R productStatusUp(@RequestBody List<SkuEsModel> skuEsModels) {

        boolean result =false;

        try {
            result = productSaveService.productStatusUp(skuEsModels);
        } catch (IOException e) {
            log.error("ESSaveController 商品上架错误", e);
            return R.error(BizCodeEnume.PRODUCT_UP_EXCEPTION.getCode(), BizCodeEnume.PRODUCT_UP_EXCEPTION.getMsg());
        }

        if (!result) {
            return R.ok();
        } else {
            return R.error(BizCodeEnume.PRODUCT_UP_EXCEPTION.getCode(), BizCodeEnume.PRODUCT_UP_EXCEPTION.getMsg());
        }
    }
}
