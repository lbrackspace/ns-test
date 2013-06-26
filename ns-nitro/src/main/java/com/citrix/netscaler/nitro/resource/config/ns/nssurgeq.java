/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.ns;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class nssurgeq_response extends base_response
{
	public nssurgeq nssurgeq;
}
/**
* Configuration for surge queue resource.
*/

public class nssurgeq extends base_resource
{
	private String name;
	private String servername;
	private Integer port;

	/**
	* <pre>
	* The name of the entity.Entity can be a Vserver, Service or a Servicegroup.
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the entity.Entity can be a Vserver, Service or a Servicegroup.
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Name of the Server bound to the entity(Servicegroup).
	* </pre>
	*/
	public void set_servername(String servername) throws Exception{
		this.servername = servername;
	}

	/**
	* <pre>
	* Name of the Server bound to the entity(Servicegroup).
	* </pre>
	*/
	public String get_servername() throws Exception {
		return this.servername;
	}

	/**
	* <pre>
	* port on which server is bound to the entity(Servicegroup).<br> Range 1 - 65535
	* </pre>
	*/
	public void set_port(int port) throws Exception {
		this.port = new Integer(port);
	}

	/**
	* <pre>
	* port on which server is bound to the entity(Servicegroup).<br> Range 1 - 65535
	* </pre>
	*/
	public void set_port(Integer port) throws Exception{
		this.port = port;
	}

	/**
	* <pre>
	* port on which server is bound to the entity(Servicegroup).<br> Range 1 - 65535
	* </pre>
	*/
	public Integer get_port() throws Exception {
		return this.port;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		nssurgeq[] resources = new nssurgeq[1];
		nssurgeq_response result = (nssurgeq_response) service.get_payload_formatter().string_to_resource(nssurgeq_response.class, response);
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
		resources[0] = result.nssurgeq;
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
	* Use this API to flush nssurgeq.
	*/
	public static base_response flush(nitro_service client, nssurgeq resource) throws Exception {
		nssurgeq flushresource = new nssurgeq();
		flushresource.name = resource.name;
		flushresource.servername = resource.servername;
		flushresource.port = resource.port;
		return flushresource.perform_operation(client,"flush");
	}

}
