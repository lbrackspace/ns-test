/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.aaa;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class aaauser_vpnurl_binding_response extends base_response
{
	public aaauser_vpnurl_binding[] aaauser_vpnurl_binding;
}
/**
	* Binding class showing the vpnurl that can be bound to aaauser.
	*/

public class aaauser_vpnurl_binding extends base_resource
{
	private String policy;
	private Long priority;
	private Long acttype;
	private String intranetapplication;
	private String urlname;
	private String username;
	private Long __count;

	/**
	* <pre>
	* The priority of the policy.
	* </pre>
	*/
	public void set_priority(long priority) throws Exception {
		this.priority = new Long(priority);
	}

	/**
	* <pre>
	* The priority of the policy.
	* </pre>
	*/
	public void set_priority(Long priority) throws Exception{
		this.priority = priority;
	}

	/**
	* <pre>
	* The priority of the policy.
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* The intranet url.
	* </pre>
	*/
	public void set_urlname(String urlname) throws Exception{
		this.urlname = urlname;
	}

	/**
	* <pre>
	* The intranet url.
	* </pre>
	*/
	public String get_urlname() throws Exception {
		return this.urlname;
	}

	/**
	* <pre>
	* The policy Name.
	* </pre>
	*/
	public void set_policy(String policy) throws Exception{
		this.policy = policy;
	}

	/**
	* <pre>
	* The policy Name.
	* </pre>
	*/
	public String get_policy() throws Exception {
		return this.policy;
	}

	/**
	* <pre>
	* The user name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_username(String username) throws Exception{
		this.username = username;
	}

	/**
	* <pre>
	* The user name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_username() throws Exception {
		return this.username;
	}

	/**
	* <pre>
	* The intranet vpn application.
	* </pre>
	*/
	public void set_intranetapplication(String intranetapplication) throws Exception{
		this.intranetapplication = intranetapplication;
	}

	/**
	* <pre>
	* The intranet vpn application.
	* </pre>
	*/
	public String get_intranetapplication() throws Exception {
		return this.intranetapplication;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public Long get_acttype() throws Exception {
		return this.acttype;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		aaauser_vpnurl_binding_response result = (aaauser_vpnurl_binding_response) service.get_payload_formatter().string_to_resource(aaauser_vpnurl_binding_response.class, response);
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
		return result.aaauser_vpnurl_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.username;
	}

	public static base_response add(nitro_service client, aaauser_vpnurl_binding resource) throws Exception {
		aaauser_vpnurl_binding updateresource = new aaauser_vpnurl_binding();
		updateresource.username = resource.username;
		updateresource.policy = resource.policy;
		updateresource.priority = resource.priority;
		updateresource.intranetapplication = resource.intranetapplication;
		updateresource.urlname = resource.urlname;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, aaauser_vpnurl_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			aaauser_vpnurl_binding updateresources[] = new aaauser_vpnurl_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new aaauser_vpnurl_binding();
				updateresources[i].username = resources[i].username;
				updateresources[i].policy = resources[i].policy;
				updateresources[i].priority = resources[i].priority;
				updateresources[i].intranetapplication = resources[i].intranetapplication;
				updateresources[i].urlname = resources[i].urlname;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, aaauser_vpnurl_binding resource) throws Exception {
		aaauser_vpnurl_binding deleteresource = new aaauser_vpnurl_binding();
		deleteresource.username = resource.username;
		deleteresource.policy = resource.policy;
		deleteresource.intranetapplication = resource.intranetapplication;
		deleteresource.urlname = resource.urlname;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, aaauser_vpnurl_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			aaauser_vpnurl_binding deleteresources[] = new aaauser_vpnurl_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new aaauser_vpnurl_binding();
				deleteresources[i].username = resources[i].username;
				deleteresources[i].policy = resources[i].policy;
				deleteresources[i].intranetapplication = resources[i].intranetapplication;
				deleteresources[i].urlname = resources[i].urlname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch aaauser_vpnurl_binding resources of given name .
	*/
	public static aaauser_vpnurl_binding[] get(nitro_service service, String username) throws Exception{
		aaauser_vpnurl_binding obj = new aaauser_vpnurl_binding();
		obj.set_username(username);
		aaauser_vpnurl_binding response[] = (aaauser_vpnurl_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of aaauser_vpnurl_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static aaauser_vpnurl_binding[] get_filtered(nitro_service service, String username, String filter) throws Exception{
		aaauser_vpnurl_binding obj = new aaauser_vpnurl_binding();
		obj.set_username(username);
		options option = new options();
		option.set_filter(filter);
		aaauser_vpnurl_binding[] response = (aaauser_vpnurl_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of aaauser_vpnurl_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static aaauser_vpnurl_binding[] get_filtered(nitro_service service, String username, filtervalue[] filter) throws Exception{
		aaauser_vpnurl_binding obj = new aaauser_vpnurl_binding();
		obj.set_username(username);
		options option = new options();
		option.set_filter(filter);
		aaauser_vpnurl_binding[] response = (aaauser_vpnurl_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count aaauser_vpnurl_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String username) throws Exception{
		aaauser_vpnurl_binding obj = new aaauser_vpnurl_binding();
		obj.set_username(username);
		options option = new options();
		option.set_count(true);
		aaauser_vpnurl_binding response[] = (aaauser_vpnurl_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of aaauser_vpnurl_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String username, String filter) throws Exception{
		aaauser_vpnurl_binding obj = new aaauser_vpnurl_binding();
		obj.set_username(username);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		aaauser_vpnurl_binding[] response = (aaauser_vpnurl_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of aaauser_vpnurl_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String username, filtervalue[] filter) throws Exception{
		aaauser_vpnurl_binding obj = new aaauser_vpnurl_binding();
		obj.set_username(username);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		aaauser_vpnurl_binding[] response = (aaauser_vpnurl_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}