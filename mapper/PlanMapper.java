package com.lab.thelab.mapper;

import com.lab.thelab.entity.Plan;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper   //mybatis的mapper类
@Repository
public interface PlanMapper {

    //查询Plan列表
    List<Plan> queryPlanList();

    //查询单个plan
    Plan queryPlanById(String pid);

    //添加
    public void addPlan(Plan plan);

    //修改
    public void  updatePlan(Plan plan);

    //删除
    public void  deletePlan(String pid);
}
