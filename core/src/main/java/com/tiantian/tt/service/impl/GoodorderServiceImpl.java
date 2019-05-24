package com.tiantian.tt.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import com.tiantian.tt.mapper.GoodorderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tiantian.tt.dto.Goodorder;
import com.tiantian.tt.service.IGoodorderService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class GoodorderServiceImpl extends BaseServiceImpl<Goodorder> implements IGoodorderService{

    @Autowired
    GoodorderMapper goodorderMapper;
    @Override
    public List<Goodorder> selectByLike(Goodorder dto,int page,int pageSize) {
        PageHelper.startPage(page,pageSize);
        return goodorderMapper.selectByLike(dto);
    }
}