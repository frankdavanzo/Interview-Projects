package com.navteq.lbsp.ctg.trapster.services.User_service.resources;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.mail.internet.AddressException;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.navteq.lbsp.ctg.trapster.modules.commons.domain.TrapsterType;
import com.navteq.lbsp.ctg.trapster.modules.udb.TrapsterUdbException;
import com.navteq.lbsp.ctg.trapster.modules.udb.domain.UdbDao;
import com.navteq.lbsp.ctg.trapster.services.User_service.exception.ResourceNotFoundException;


/**
 * This is an example resource CRUD resource for demonstration purposes.
 * 
 * @author sprozo,amoussa
 * 
 */

@Singleton
@Named("userResource")
@Path("/2.0/user")
public class UserResource {
	
	private final static Log logger = LogFactory.getLog(UserResource.class);
	private final static long MINIMUM_EPOCHTIME = 28800000L; // used for setting
	
		
	//TODO  using example.module-udb as DAO layer, wire in access
	private UdbDao udbDao;
	


	/**
	 * returns TrapsterType for existing user specified in query parameter
	 * as userid all that happens here is getting path/query parms into local
	 * vars, and then call a common get method getByUserId
	 * 
	 * @param userid
	 *            : key to udb table
	 * @param AuthParms
	 *            : common to all transactions, same as old PHP code
	 * @param uriInfo
	 *            : injected by the JaxsRS-Framework
	 * 
	 * @return TrapsterType response
	 * 
	 * @throws ResourceNotFoundException
	 *             , TrapsterUserRequestException
	 */
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response getUserUsingOnlyQueryParms(
			@QueryParam("displayname") @DefaultValue("0") final String displayname,
			@Context UriInfo uriInfo)
			throws ResourceNotFoundException {
		
		return null;
	}




	/**
	 * creates a new user posted via XML/JSON and returns the resource location
	 * if succeeded
	 * 
	 * @param incomingRequest
	 *            POST request body
	 * @param Auth
	 *            Parms: common to all transactions, same as old PHP code
	 * @param uriInfo
	 *            : injected by the JaxsRS-Framework
	 * 
	 * @return HTTP response with response body
	 * 
	 * @throws TrapsterUserRequestException
	 * @throws TrapsterUdbException
	 * @throws TrapsterSMTPException 
	 */
	@POST
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response update(
			@Context UriInfo uriInfo,
			@Context HttpServletRequest httpServletReq,
			// incoming request
			TrapsterType incomingRequest)
			throws ResourceNotFoundException,
			TrapsterUdbException, AddressException {
		

		return null;
	}

		
	/**
	 * delete an existing user
	 * 
	 * @param userid
	 *            : key to udb table
	 * @param Auth
	 *            Parms: common to all transactions, same as old PHP code
	 * @param uriInfo
	 *            : injected by the JaxsRS-Framework
	 * 
	 * @return HTTP response
	 * 
	 * @throws ResourceNotFoundException
	 */
	@DELETE
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON,
			MediaType.TEXT_HTML })
	@Path("/{userid}")
	public Response delete(
			// path params
			@PathParam("userid") final int userid_pp,
			// context
			@Context UriInfo uriInfo
			) throws ResourceNotFoundException {
		
		return null;

	}

	


	
}