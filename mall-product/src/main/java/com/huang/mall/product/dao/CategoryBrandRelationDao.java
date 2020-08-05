package com.huang.mall.product.dao;

import com.huang.mall.product.entity.CategoryBrandRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * 品牌分类关联
 * 
 * @author huangjinchao
 * @email 375859080@qq.com
 * @date 2020-07-19 17:29:19
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {
    // @Update("UPDATE `pms_category_brand_relation` SET catelog_name=#{name} WHERE catelog_id=#{catId}")
    void updateCategory(@Param("catId") Long catId, @Param("name") String name);
}
