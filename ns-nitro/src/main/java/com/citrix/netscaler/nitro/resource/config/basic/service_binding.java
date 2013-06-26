/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.basic;

import com.citrix.netscaler.nitro.resource.config.basic.service_scpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.basic.service_lbmonitor_binding;
import com.citrix.netscaler.nitro.resource.config.basic.service_dospolicy_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class service_binding_response extends base_response
{
	public service_binding[] service_binding;
}
/**
	* Binding class showing the resources that can be bound to service_binding. 
	*/

public class service_binding extends base_resource
{
	private String name;
	private service_scpolicy_binding	service_scpolicy_binding[] = null;
	private service_lbmonitor_binding	service_lbmonitor_binding[] = null;
	private service_dospolicy_binding	service_dospolicy_binding[] = null;

	/**
	* <pre>
	* The name of the service.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the service.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* scpolicy that can be bound to service.
	* </pre>
	*/
	public service_scpolicy_binding[] get_service_scpolicy_bindings() throws Exception {
		return this.service_scpolicy_binding;
	}

	/**
	* <pre>
	* lbmonitor that can be bound to service.
	* </pre>
	*/
	public service_lbmonitor_binding[] get_service_lbmonitor_bindings() throws Exception {
		return this.service_lbmonitor_binding;
	}

	/**
	* <pre>
	* dospolicy that can be bound to service.
	* </pre>
	*/
	public service_dospolicy_binding[] get_service_dospolicy_bindings() throws Exception {
		return this.service_dospolicy_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		service_binding_response result = (service_binding_response) service.get_payload_formatter().string_to_resource(service_binding_response.class, response);
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
		return result.service_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	/**
	* Use this API to fetch service_binding resource of given name .
	*/
	public static service_binding get(nitro_service service, String name) throws Exception{
		service_binding obj = new service_binding();
		obj.set_name(name);
		service_binding response = (service_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch service_binding resources of given names .
	*/
	public static service_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			service_binding response[] = new service_binding[name.length];
			service_binding obj[] = new service_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new service_binding();
				obj[i].set_name(name[i]);
				response[i] = (service_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}