package com.tiantian.tt.mapper;

import com.hand.hap.mybatis.common.Mapper;
import com.tiantian.tt.dto.Goodorder;

import java.util.List;

public interface GoodorderMapper extends Mapper<Goodorder>{

    List<Goodorder> selectByLike(Goodorder dto);
}