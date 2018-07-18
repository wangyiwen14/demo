package com.offcn.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offcn.dao.StuDao;
import com.offcn.po.NewStudent;
import com.offcn.service.StuService;
@Service
public class StuServiceImp implements StuService {
@Autowired
StuDao stuDao;
	@Override
	public List<NewStudent> getAllStu() {
		return stuDao.getAllStu();
	}

}
