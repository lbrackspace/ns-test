/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.authentication;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class authenticationnegotiatepolicy_authenticationvserver_binding_response extends base_response
{
	public authenticationnegotiatepolicy_authenticationvserver_binding[] authenticationnegotiatepolicy_authenticationvserver_binding;
}
/**
	* Binding class showing the authenticationvserver that can be bound to authenticationnegotiatepolicy.
	*/

public class authenticationnegotiatepolicy_authenticationvserver_binding extends base_resource
{
	private String boundto;
	private Long priority;
	private Long activepolicy;
	private String name;
	private Long __count;

	/**
	* <pre>
	* The entity name to which policy is bound.
	* </pre>
	*/
	public void set_boundto(String boundto) throws Exception{
		this.boundto = boundto;
	}

	/**
	* <pre>
	* The entity name to which policy is bound.
	* </pre>
	*/
	public String get_boundto() throws Exception {
		return this.boundto;
	}

	/**
	* <pre>
	* The name of the Negotiate policy. If no name is given, all the configured Negotiate policies will be displayed.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the Negotiate policy. If no name is given, all the configured Negotiate policies will be displayed.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public Long get_activepolicy() throws Exception {
		return this.activepolicy;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		authenticationnegotiatepolicy_authenticationvserver_binding_response result = (authenticationnegotiatepolicy_authenticationvserver_binding_response) service.get_payload_formatter().string_to_resource(authenticationnegotiatepolicy_authenticationvserver_binding_response.class, response);
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
		return result.authenticationnegotiatepolicy_authenticationvserver_binding;
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
	* Use this API to fetch authenticationnegotiatepolicy_authenticationvserver_binding resources of given name .
	*/
	public static authenticationnegotiatepolicy_authenticationvserver_binding[] get(nitro_service service, String name) throws Exception{
		authenticationnegotiatepolicy_authenticationvserver_binding obj = new authenticationnegotiatepolicy_authenticationvserver_binding();
		obj.set_name(name);
		authenticationnegotiatepolicy_authenticationvserver_binding response[] = (authenticationnegotiatepolicy_authenticationvserver_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of authenticationnegotiatepolicy_authenticationvserver_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static authenticationnegotiatepolicy_authenticationvserver_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		authenticationnegotiatepolicy_authenticationvserver_binding obj = new authenticationnegotiatepolicy_authenticationvserver_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		authenticationnegotiatepolicy_authenticationvserver_binding[] response = (authenticationnegotiatepolicy_authenticationvserver_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of authenticationnegotiatepolicy_authenticationvserver_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static authenticationnegotiatepolicy_authenticationvserver_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		authenticationnegotiatepolicy_authenticationvserver_binding obj = new authenticationnegotiatepolicy_authenticationvserver_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		authenticationnegotiatepolicy_authenticationvserver_binding[] response = (authenticationnegotiatepolicy_authenticationvserver_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count authenticationnegotiatepolicy_authenticationvserver_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		authenticationnegotiatepolicy_authenticationvserver_binding obj = new authenticationnegotiatepolicy_authenticationvserver_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		authenticationnegotiatepolicy_authenticationvserver_binding response[] = (authenticationnegotiatepolicy_authenticationvserver_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of authenticationnegotiatepolicy_authenticationvserver_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		authenticationnegotiatepolicy_authenticationvserver_binding obj = new authenticationnegotiatepolicy_authenticationvserver_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authenticationnegotiatepolicy_authenticationvserver_binding[] response = (authenticationnegotiatepolicy_authenticationvserver_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of authenticationnegotiatepolicy_authenticationvserver_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		authenticationnegotiatepolicy_authenticationvserver_binding obj = new authenticationnegotiatepolicy_authenticationvserver_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authenticationnegotiatepolicy_authenticationvserver_binding[] response = (authenticationnegotiatepolicy_authenticationvserver_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}