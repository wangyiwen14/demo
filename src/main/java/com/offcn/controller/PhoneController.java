package com.offcn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.offcn.po.Phone;
import com.offcn.service.PhoneService;

@Controller
public class PhoneController {

	@Autowired
	PhoneService phoneService;
	@RequestMapping("/phonesearch")
	public String search(String number,Model model){
		String msg="";
		Phone phone = phoneService.search(number);
		
		if(phone!=null){
			msg=number+":"+phone.getArea()+":"+phone.getType();
		}else{
			msg="号码在号段库暂时不存在";
		}
		
		model.addAttribute("msg", msg);
		
		return "mobile";
	}
}
