package com.aaa.mapper;

import com.aaa.entity.Branchexpend;
import com.aaa.entity.Express;
import com.aaa.entity.Expressdetails;
import com.aaa.util.MyMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GongsizhangdanMapper extends MyMapper<Express> {

    int zongmoney();


}
