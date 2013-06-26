/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.system;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class systemparameter_response extends base_response
{
	public systemparameter systemparameter;
}
/**
* Configuration for system parameter resource.
*/

public class systemparameter extends base_resource
{
	private String rbaonresponse;
	private String promptstring;
	private Long natpcbforceflushlimit;
	private String natpcbrstontimeout;
	private Long timeout;

	/**
	* <pre>
	* specify whether RBA on response is enabled/disabled .<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_rbaonresponse(String rbaonresponse) throws Exception{
		this.rbaonresponse = rbaonresponse;
	}

	/**
	* <pre>
	* specify whether RBA on response is enabled/disabled .<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_rbaonresponse() throws Exception {
		return this.rbaonresponse;
	}

	/**
	* <pre>
	* The global system CLI prompt.<br> Minimum length =  1
	* </pre>
	*/
	public void set_promptstring(String promptstring) throws Exception{
		this.promptstring = promptstring;
	}

	/**
	* <pre>
	* The global system CLI prompt.<br> Minimum length =  1
	* </pre>
	*/
	public String get_promptstring() throws Exception {
		return this.promptstring;
	}

	/**
	* <pre>
	* force flush if number of NATPCBs above this.<br> Default value: 2147483647<br> Minimum value =  1000
	* </pre>
	*/
	public void set_natpcbforceflushlimit(long natpcbforceflushlimit) throws Exception {
		this.natpcbforceflushlimit = new Long(natpcbforceflushlimit);
	}

	/**
	* <pre>
	* force flush if number of NATPCBs above this.<br> Default value: 2147483647<br> Minimum value =  1000
	* </pre>
	*/
	public void set_natpcbforceflushlimit(Long natpcbforceflushlimit) throws Exception{
		this.natpcbforceflushlimit = natpcbforceflushlimit;
	}

	/**
	* <pre>
	* force flush if number of NATPCBs above this.<br> Default value: 2147483647<br> Minimum value =  1000
	* </pre>
	*/
	public Long get_natpcbforceflushlimit() throws Exception {
		return this.natpcbforceflushlimit;
	}

	/**
	* <pre>
	* Send RST to client and server connections when the natpcbs timeout. This avoids the buildup of idle TCP connections on the both the sides.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_natpcbrstontimeout(String natpcbrstontimeout) throws Exception{
		this.natpcbrstontimeout = natpcbrstontimeout;
	}

	/**
	* <pre>
	* Send RST to client and server connections when the natpcbs timeout. This avoids the buildup of idle TCP connections on the both the sides.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_natpcbrstontimeout() throws Exception {
		return this.natpcbrstontimeout;
	}

	/**
	* <pre>
	* CLI session inactivity timeout, in seconds. Timeout cannot have values in between 1 and 9.<br> Minimum value =  0<br> Maximum value =  100000000
	* </pre>
	*/
	public void set_timeout(long timeout) throws Exception {
		this.timeout = new Long(timeout);
	}

	/**
	* <pre>
	* CLI session inactivity timeout, in seconds. Timeout cannot have values in between 1 and 9.<br> Minimum value =  0<br> Maximum value =  100000000
	* </pre>
	*/
	public void set_timeout(Long timeout) throws Exception{
		this.timeout = timeout;
	}

	/**
	* <pre>
	* CLI session inactivity timeout, in seconds. Timeout cannot have values in between 1 and 9.<br> Minimum value =  0<br> Maximum value =  100000000
	* </pre>
	*/
	public Long get_timeout() throws Exception {
		return this.timeout;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		systemparameter[] resources = new systemparameter[1];
		systemparameter_response result = (systemparameter_response) service.get_payload_formatter().string_to_resource(systemparameter_response.class, response);
		if(result.errorcode != 0) {
			if (result.errorcode == 444) {
				service.clear_session();
			}
			if(result.severity != null)
			{
				if (result.severity.equals("ERROR"))
					throw new nitro_exception(result.message,result.errorcode);
			}
			else
			{
				throw new nitro_exception(result.message,result.errorcode);
			}
		}
		resources[0] = result.systemparameter;
		return resources;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return null;
	}

	/**
	* Use this API to update systemparameter.
	*/
	public static base_response update(nitro_service client, systemparameter resource) throws Exception {
		systemparameter updateresource = new systemparameter();
		updateresource.rbaonresponse = resource.rbaonresponse;
		updateresource.promptstring = resource.promptstring;
		updateresource.natpcbforceflushlimit = resource.natpcbforceflushlimit;
		updateresource.natpcbrstontimeout = resource.natpcbrstontimeout;
		updateresource.timeout = resource.timeout;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of systemparameter resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, systemparameter resource, String[] args) throws Exception{
		systemparameter unsetresource = new systemparameter();
		unsetresource.rbaonresponse = resource.rbaonresponse;
		unsetresource.promptstring = resource.promptstring;
		unsetresource.natpcbforceflushlimit = resource.natpcbforceflushlimit;
		unsetresource.natpcbrstontimeout = resource.natpcbrstontimeout;
		unsetresource.timeout = resource.timeout;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the systemparameter resources that are configured on netscaler.
	*/
	public static systemparameter get(nitro_service service) throws Exception{
		systemparameter obj = new systemparameter();
		systemparameter[] response = (systemparameter[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the systemparameter resources that are configured on netscaler.
	*/
	public static systemparameter get(nitro_service service,  options option) throws Exception{
		systemparameter obj = new systemparameter();
		systemparameter[] response = (systemparameter[])obj.get_resources(service,option);
		return response[0];
	}

	public static class rbaonresponseEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class natpcbrstontimeoutEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}