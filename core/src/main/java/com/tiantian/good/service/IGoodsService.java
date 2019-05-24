package com.tiantian.good.service;

import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;
import com.tiantian.good.dto.Goods;

import java.util.List;

public interface IGoodsService extends IBaseService<Goods>, ProxySelf<IGoodsService>{

    List<Goods> selectByLike(Goods dto,int page,int pageSize);
}