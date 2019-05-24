package com.tiantian.good.mapper;

import com.hand.hap.mybatis.common.Mapper;
import com.tiantian.good.dto.Goods;

import java.util.List;

public interface GoodsMapper extends Mapper<Goods>{

    List<Goods> selectByLike(Goods dto);

}