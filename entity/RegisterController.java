package com.lab.thelab.controller;



import com.lab.thelab.entity.Register;
import com.lab.thelab.mapper.RegisterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class RegisterController {
    @Autowired
    private RegisterMapper registerMapper;
    //添加
    //1.跳转到添加业主界面
    @GetMapping("/register")
    public String addStudenPage(){
        return "student/student_add";
    }
    //2.添加到表中
    @PostMapping("/addstudent")
    public String addstudent(Register myuser){
        registerMapper.addRegister(myuser);
        return "login";
    }


    @RequestMapping("/adminregister")
    public String queryRegisterList(Model model){
        List<Register> registerList =registerMapper.queryRegisterList();
        model.addAttribute("register_list",registerList);
        return "admin/register_list";
}


    //修改
    //1.去修改页面
    @GetMapping("/updateregister/{stuno}")
    public String toupdateRegisterPage(@PathVariable("userid")String userid, Model model){
        //根据id查询数据
        Register register = registerMapper.queryRegisterByStuno(userid);
        model.addAttribute("register",register);
        return "xgc/updateRegister";
    }
    //2.修改页面数据
    @PostMapping("/updateregister")
    public String updateRegister(Register myuser){
        registerMapper.updateRegister(myuser);
        return "admin/register_list";
    }
    //删除
    @GetMapping("/deleteregister/{stuno}")
    public String deleteRegister(@PathVariable("userid")String userid){
        registerMapper.deleteRegister(userid);
        return "redirect:/adminregister";
    }
}

