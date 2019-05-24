package com.tiantian.tt.service;

import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;
import com.tiantian.tt.dto.Goodorder;

import java.util.List;

public interface IGoodorderService extends IBaseService<Goodorder>, ProxySelf<IGoodorderService>{

    List<Goodorder> selectByLike(Goodorder dto,int page,int pageSize);
}