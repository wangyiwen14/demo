package com.offcn.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.offcn.po.NewStudent;
import com.offcn.po.ScoreResult;
import com.offcn.service.StuService;

@Controller
public class StuController {
@Autowired
StuService stuService;
	/**
	 * 返回全部的学生信息:支撑柱状图、折线图
	 */
    @RequestMapping("/getallstu")
    @ResponseBody
	public List<NewStudent> getallStu(){
		List<NewStudent> list = stuService.getAllStu();
		System.out.println(list.size());
		return list;
	}
	
	/**
	 * 返回加工后的学生信息，支撑 饼状图
	 */
    @RequestMapping("/getallstupie")
    @ResponseBody
    public List<ScoreResult> getallStuPie(){
    	List<ScoreResult> listr=new ArrayList<ScoreResult>();
    	List<NewStudent> list = stuService.getAllStu();
    	for (NewStudent stu : list) {
			ScoreResult sr = new ScoreResult();
			sr.setName(stu.getName());
			sr.setValue(stu.getScore());
			listr.add(sr);
		}
    	
    	return listr;
    	
    }
}
