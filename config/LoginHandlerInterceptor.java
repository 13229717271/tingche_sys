package com.lab.thelab.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //登录成功之后有用户的session
        Object login = request.getSession().getAttribute("login");
        if (login == null){
            request.setAttribute("msg","没有权限！");
            request.getRequestDispatcher("/login.html").forward(request,response);
            return false;
        }else {
            return true;
        }
    }
}
