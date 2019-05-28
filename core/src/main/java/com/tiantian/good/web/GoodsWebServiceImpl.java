package com.tiantian.good.web;

import com.tiantian.good.dto.Goods;
import com.tiantian.good.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebService;
import java.util.List;

/**
 * Mr.Fei
 * 2019-05-28 16:04:05
 */

@WebService(endpointInterface = "com.tiantian.good.web.GoodsWebService", serviceName = "goodsWebService")
public class GoodsWebServiceImpl implements GoodsWebService {

    @Autowired
    GoodsMapper goodsMapper;

    @Override
    public CallProductVo getCallBack(Goods vo) {
        List<Goods> list = goodsMapper.select(vo);
        CallProductVo cv=new CallProductVo();
        cv.setMessage(list.get(0).getImg());
        return cv;
    }
}
