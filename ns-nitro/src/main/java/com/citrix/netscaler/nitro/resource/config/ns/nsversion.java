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

class nsversion_response extends base_response
{
	public nsversion nsversion;
}
/**
* Configuration for version resource.
*/

public class nsversion extends base_resource
{

	//------- Read only Parameter ---------;

	private String version;
	private Long mode;

	/**
	* <pre>
	* Version.
	* </pre>
	*/
	public String get_version() throws Exception {
		return this.version;
	}

	/**
	* <pre>
	* Kernel mode (KMPE/VMPE).
	* </pre>
	*/
	public Long get_mode() throws Exception {
		return this.mode;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		nsversion[] resources = new nsversion[1];
		nsversion_response result = (nsversion_response) service.get_payload_formatter().string_to_resource(nsversion_response.class, response);
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
		resources[0] = result.nsversion;
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
	* Use this API to fetch all the nsversion resources that are configured on netscaler.
	*/
	public static nsversion get(nitro_service service) throws Exception{
		nsversion obj = new nsversion();
		nsversion[] response = (nsversion[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the nsversion resources that are configured on netscaler.
	*/
	public static nsversion get(nitro_service service,  options option) throws Exception{
		nsversion obj = new nsversion();
		nsversion[] response = (nsversion[])obj.get_resources(service,option);
		return response[0];
	}

}
