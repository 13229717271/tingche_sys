package com.lab.thelab.controller;
import com.lab.thelab.entity.Myuser;
import com.lab.thelab.entity.Register;
import com.lab.thelab.mapper.MyuserMapper;
import com.lab.thelab.mapper.RegisterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private MyuserMapper myuserMapper;
    @Autowired
    private RegisterMapper registerMapper;

    @RequestMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password
            , Model model, HttpSession session) {
        String u1 = username;
        String u2 = password;
        String r1 = username;
        String r2 = password;
        Myuser user = myuserMapper.findUser(u1,u2);
        Register register = registerMapper.findStudent(r1,r2);
        if (user.getRole() == 1 ) {//用户
            session.setAttribute("username", username);
            return "student";
        }else if (user.getRole() == 2){//管理员
            session.setAttribute("username", username);
            return "index";
        }else if (user.getRole() == 3){
            session.setAttribute("username", username);
            return "assistant";
        }else
            return "redirect:/xgc_index_main.html";

    }



}
