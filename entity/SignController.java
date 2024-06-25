package com.lab.thelab.controller;

import com.lab.thelab.entity.Sign;
import com.lab.thelab.mapper.SignMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class SignController {
    @Autowired
    private SignMapper signMapper;

    //查看申请信息
    @RequestMapping("/signs")
    public String querySignList(Model model){
        List<Sign> signList = signMapper.querySignList();
        model.addAttribute("signs",signList);
        return "admin/sign_list";
    }
    //查看面试结果
    @RequestMapping("/FaceResult")
    public String FaceResult(Model model){
        List<Sign> faceresult = signMapper.querySignList();
        model.addAttribute("faceresults",faceresult);
        return "student/student_face_result";
    }

    //添加申请信息
    //1.跳转到添加页面
    @GetMapping("/toaddSign")
    public String addSignPage(){
        return "student/student_add_sign";
    }
    //2.添加到报名表中
    @PostMapping("/addSign")
    public String addSign(Sign sign){
        signMapper.addSign(sign);
        //重定向到列表页面通过接口/student_plan_list
        return "redirect:/student_plan_list";
    }

    //删除申请信息=无法进入审核环节
    @GetMapping("/deletesign/{sid}")
    public String deleteSign(@PathVariable("sid")int sid){
        signMapper.deleteSign(sid);
        return "redirect:/signs";
    }
}
