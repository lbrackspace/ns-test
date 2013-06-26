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

class reboot_response extends base_response
{
	public reboot reboot;
}

public class reboot extends base_resource
{
	private Boolean warm;

	/**
	* <pre>
	* When specified on nCore systems, the command restarts the NetScaler without requiring a system reboot.  On Classic systems, this flag is ignored.
	* </pre>
	*/
	public void set_warm(boolean warm) throws Exception {
		this.warm = new Boolean(warm);
	}

	/**
	* <pre>
	* When specified on nCore systems, the command restarts the NetScaler without requiring a system reboot.  On Classic systems, this flag is ignored.
	* </pre>
	*/
	public void set_warm(Boolean warm) throws Exception{
		this.warm = warm;
	}

	/**
	* <pre>
	* When specified on nCore systems, the command restarts the NetScaler without requiring a system reboot.  On Classic systems, this flag is ignored.
	* </pre>
	*/
	public Boolean get_warm() throws Exception {
		return this.warm;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		reboot[] resources = new reboot[1];
		reboot_response result = (reboot_response) service.get_payload_formatter().string_to_resource(reboot_response.class, response);
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
		resources[0] = result.reboot;
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
	* Use this API to Reboot reboot.
	*/
	public static base_response Reboot(nitro_service client, reboot resource) throws Exception {
		reboot Rebootresource = new reboot();
		Rebootresource.warm = resource.warm;
		return Rebootresource.perform_operation(client);
	}

}