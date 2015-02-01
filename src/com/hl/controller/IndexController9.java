package com.hl.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("IndexController9")
public class IndexController9 {

    @RequestMapping ( "/index1.htm" )
    public void index(HttpServletRequest request,
    		HttpServletResponse response) throws Exception{      		
    	System.out.println("huang liao.000000000000..");
       //return model;
    }

    
} 
