package com.huang.mall.search.service;

import com.huang.common.to.es.SkuEsModel;

import java.io.IOException;
import java.util.List;

/**
 * @AUTHOR: raymond
 * @DATETIME: 2020/5/13  22:43
 * DESCRIPTION:
 **/
public interface ProductSaveService {
    boolean productStatusUp(List<SkuEsModel> esSkuModels) throws IOException;
}
