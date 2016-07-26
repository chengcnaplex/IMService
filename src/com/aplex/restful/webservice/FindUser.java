package com.aplex.restful.webservice;



import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.aplex.restful.app.HuanxinWebSerivice;
import com.fasterxml.jackson.databind.node.ObjectNode;


@Path("/finduser")
public class FindUser {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getUser() {
		System.out.println(111);
        ObjectNode getIMUsersByUserNameNode = HuanxinWebSerivice.getIMUsers();
        if (null != getIMUsersByUserNameNode) {
        	return getIMUsersByUserNameNode.toString();
        }else{
        	return "{\"statusCode\":400}";
        }
	}
}
