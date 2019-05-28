package com.tiantian.good.web;

import com.tiantian.good.dto.Goods;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Mr.Fei
 * 2019-05-28 16:03:21
 */
@WebService
public interface GoodsWebService {
    /**
     *接收供应商数据
     * @param vo
     * @return
     */
    CallProductVo getCallBack(@WebParam(name="result") Goods vo);
}
