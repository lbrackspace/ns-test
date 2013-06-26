/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.network;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class ipset_nsip6_binding_response extends base_response
{
	public ipset_nsip6_binding[] ipset_nsip6_binding;
}
/**
	* Binding class showing the nsip6 that can be bound to ipset.
	*/

public class ipset_nsip6_binding extends base_resource
{
	private String ipaddress;
	private String name;
	private Long __count;

	/**
	* <pre>
	* The name of the IP set.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the IP set.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* One or more IP addresses bound to the IP set.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ipaddress(String ipaddress) throws Exception{
		this.ipaddress = ipaddress;
	}

	/**
	* <pre>
	* One or more IP addresses bound to the IP set.<br> Minimum length =  1
	* </pre>
	*/
	public String get_ipaddress() throws Exception {
		return this.ipaddress;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		ipset_nsip6_binding_response result = (ipset_nsip6_binding_response) service.get_payload_formatter().string_to_resource(ipset_nsip6_binding_response.class, response);
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
		return result.ipset_nsip6_binding;
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
	* Use this API to fetch ipset_nsip6_binding resources of given name .
	*/
	public static ipset_nsip6_binding[] get(nitro_service service, String name) throws Exception{
		ipset_nsip6_binding obj = new ipset_nsip6_binding();
		obj.set_name(name);
		ipset_nsip6_binding response[] = (ipset_nsip6_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of ipset_nsip6_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static ipset_nsip6_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		ipset_nsip6_binding obj = new ipset_nsip6_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		ipset_nsip6_binding[] response = (ipset_nsip6_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of ipset_nsip6_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static ipset_nsip6_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		ipset_nsip6_binding obj = new ipset_nsip6_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		ipset_nsip6_binding[] response = (ipset_nsip6_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count ipset_nsip6_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		ipset_nsip6_binding obj = new ipset_nsip6_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		ipset_nsip6_binding response[] = (ipset_nsip6_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of ipset_nsip6_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		ipset_nsip6_binding obj = new ipset_nsip6_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ipset_nsip6_binding[] response = (ipset_nsip6_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of ipset_nsip6_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		ipset_nsip6_binding obj = new ipset_nsip6_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ipset_nsip6_binding[] response = (ipset_nsip6_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}