package com.offcn.service;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.offcn.po.Phone;
@WebService
public interface PhoneService {
	@GET
	@Path("/find/{number}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	Phone search(@PathParam("number")String number);
}
