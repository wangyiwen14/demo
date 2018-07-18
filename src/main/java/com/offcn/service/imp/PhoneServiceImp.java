package com.offcn.service.imp;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offcn.dao.PhoneDao;
import com.offcn.po.Phone;
import com.offcn.service.PhoneService;
@WebService
@Service
public class PhoneServiceImp implements PhoneService {

	@Autowired
	PhoneDao phoneDao;
	@Override
	@WebMethod
	public Phone search(String number) {
		if(number.length()>=7){
			number=number.substring(0, 7);
			System.out.println("number:"+number);
		}
		return phoneDao.search(number);
	}

}
