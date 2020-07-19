package com.huang.mall.order.dao;

import com.huang.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author huangjinchao
 * @email 375859080@qq.com
 * @date 2020-07-19 22:44:48
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
