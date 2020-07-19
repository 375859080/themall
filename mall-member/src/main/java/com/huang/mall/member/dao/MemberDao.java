package com.huang.mall.member.dao;

import com.huang.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author huangjinchao
 * @email 375859080@qq.com
 * @date 2020-07-19 22:24:10
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
