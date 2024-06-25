package com.lab.thelab.controller;

import com.lab.thelab.entity.Plan;
import com.lab.thelab.mapper.PlanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PlanController {
    @Autowired
    private PlanMapper planMapper;
    @RequestMapping("/plans")
    public String queryPlanList(Model model){
        List<Plan> planList =planMapper.queryPlanList();
        model.addAttribute("plans",planList);
        return "xgc/check_plan";
    }
    //管理员列表展示
    @RequestMapping("/admin_plan_list")
    public String adminPlanList(Model model){
        List<Plan> adminplanList =planMapper.queryPlanList();
        model.addAttribute("plans",adminplanList);
        return "admin/plan_list";
    }
    //业主查看列表
    @RequestMapping("/student_plan_list")
    public String studentPlanList(Model model){
        List<Plan> studentplanList =planMapper.queryPlanList();
        model.addAttribute("student_plan_list",studentplanList);
        return "student/student_plan_list";
    }
    //添加
//1.跳转到添加页面
    @GetMapping("/toaddPlan")
    public String addPlanPage(){
        return "admin/addPlan";
    }
    //2.提交表单
    @PostMapping("/addPlan")
    public String addPlan(Plan plan){
        planMapper.addPlan(plan);
        //重定向到列表页面通过接口/admin_plan_list
        return "redirect:/admin_plan_list";
    }
    //修改
    //1.去修改页面
    @GetMapping("/plan/{pid}")
    public String toupdatePlanPage(@PathVariable("pid")String pid,Model model){
        Plan plan = planMapper.queryPlanById(pid);
        model.addAttribute("plan",plan);
        return "xgc/updatePlan";
    }
    //2.修改页面数据
    @PostMapping("/updateplan")
    public String updatePlan(Plan plan){
        planMapper.updatePlan(plan);
        return "redirect:/plans";
    }
    //删除
    @GetMapping("/delplan/{pid}")
    public String deletePlan(@PathVariable("pid")String pid){
        planMapper.deletePlan(pid);
        return "redirect:/plans";
    }
}