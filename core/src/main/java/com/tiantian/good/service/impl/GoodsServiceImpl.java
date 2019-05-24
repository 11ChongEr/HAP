package com.tiantian.good.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import com.tiantian.good.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tiantian.good.dto.Goods;
import com.tiantian.good.service.IGoodsService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class GoodsServiceImpl extends BaseServiceImpl<Goods> implements IGoodsService{

    @Autowired
    GoodsMapper goodsMapper;

    @Override
    public List<Goods> selectByLike(Goods dto, int page, int pageSize) {
        PageHelper.startPage(page,pageSize);
        return goodsMapper.selectByLike(dto);
    }
}