package service;

import org.springframework.stereotype.Component;
import pojo.User;

import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;


@WebService
@Path("/user")
public interface IUserService {
	@GET
	@Produces({MediaType.APPLICATION_XML,"application/json;charset=utf-8"})
	@Path("/query/{id}")
	User selectByPrimaryKey(@PathParam("id") Integer UID);

	@GET
	@Produces({MediaType.APPLICATION_XML,"application/json;charset=utf-8"})
	@Path("/query2/{id}")
	List<User> selectAll(@PathParam("id") Integer UID);
}
