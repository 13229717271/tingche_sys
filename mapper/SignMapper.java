package com.lab.thelab.mapper;

import com.lab.thelab.entity.Sign;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SignMapper {

    //查询报名信息列表
    List<Sign> querySignList();
    //填写报名信息
    public void addSign(Sign sign);
    //删除报名信息
    public void deleteSign(int sid);

}
