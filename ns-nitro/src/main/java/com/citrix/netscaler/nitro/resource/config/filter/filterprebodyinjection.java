/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.filter;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class filterprebodyinjection_response extends base_response
{
	public filterprebodyinjection filterprebodyinjection;
}
/**
* Configuration for HTML Injection prebody resource.
*/

public class filterprebodyinjection extends base_resource
{
	private String prebody;

	//------- Read only Parameter ---------;

	private String systemiid;

	/**
	* <pre>
	* The file name for prebody.<br> Minimum length =  1
	* </pre>
	*/
	public void set_prebody(String prebody) throws Exception{
		this.prebody = prebody;
	}

	/**
	* <pre>
	* The file name for prebody.<br> Minimum length =  1
	* </pre>
	*/
	public String get_prebody() throws Exception {
		return this.prebody;
	}

	/**
	* <pre>
	* The system IID of the current NetScaler system.
	* </pre>
	*/
	public String get_systemiid() throws Exception {
		return this.systemiid;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		filterprebodyinjection[] resources = new filterprebodyinjection[1];
		filterprebodyinjection_response result = (filterprebodyinjection_response) service.get_payload_formatter().string_to_resource(filterprebodyinjection_response.class, response);
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
		resources[0] = result.filterprebodyinjection;
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
	* Use this API to update filterprebodyinjection.
	*/
	public static base_response update(nitro_service client, filterprebodyinjection resource) throws Exception {
		filterprebodyinjection updateresource = new filterprebodyinjection();
		updateresource.prebody = resource.prebody;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of filterprebodyinjection resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, filterprebodyinjection resource, String[] args) throws Exception{
		filterprebodyinjection unsetresource = new filterprebodyinjection();
		unsetresource.prebody = resource.prebody;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the filterprebodyinjection resources that are configured on netscaler.
	*/
	public static filterprebodyinjection get(nitro_service service) throws Exception{
		filterprebodyinjection obj = new filterprebodyinjection();
		filterprebodyinjection[] response = (filterprebodyinjection[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the filterprebodyinjection resources that are configured on netscaler.
	*/
	public static filterprebodyinjection get(nitro_service service,  options option) throws Exception{
		filterprebodyinjection obj = new filterprebodyinjection();
		filterprebodyinjection[] response = (filterprebodyinjection[])obj.get_resources(service,option);
		return response[0];
	}

}