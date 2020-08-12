package com.huang.mall.product.feign;

import com.huang.common.to.es.SkuEsModel;
import com.huang.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @AUTHOR: raymond
 * @DATETIME: 2020/5/13  23:06
 * DESCRIPTION:
 **/
@FeignClient("mall-search")
public interface SearchFeignService {

    @PostMapping("/search/save/product")
    R productStatusUp(@RequestBody List<SkuEsModel> skuEsModels);
}
