/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.audit;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class auditnslogpolicy_response extends base_response
{
	public auditnslogpolicy[] auditnslogpolicy;
}
/**
* Configuration for ns log policy resource.
*/

public class auditnslogpolicy extends base_resource
{
	private String name;
	private String rule;
	private String action;

	//------- Read only Parameter ---------;

	private String[] builtin;
	private Long __count;

	/**
	* <pre>
	* The name of nslog policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of nslog policy.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The name of the rule or expression that the policy will use. Currently supports only the rule "ns_true".<br> Minimum length =  1
	* </pre>
	*/
	public void set_rule(String rule) throws Exception{
		this.rule = rule;
	}

	/**
	* <pre>
	* The name of the rule or expression that the policy will use. Currently supports only the rule "ns_true".<br> Minimum length =  1
	* </pre>
	*/
	public String get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* The name of the nslog action to be bound to the nslog policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_action(String action) throws Exception{
		this.action = action;
	}

	/**
	* <pre>
	* The name of the nslog action to be bound to the nslog policy.<br> Minimum length =  1
	* </pre>
	*/
	public String get_action() throws Exception {
		return this.action;
	}

	/**
	* <pre>
	* Indicates that a variable is a built-in (SYSTEM INTERNAL) type.<br> Possible values = MODIFIABLE, DELETABLE, IMMUTABLE
	* </pre>
	*/
	public String[] get_builtin() throws Exception {
		return this.builtin;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		auditnslogpolicy_response result = (auditnslogpolicy_response) service.get_payload_formatter().string_to_resource(auditnslogpolicy_response.class, response);
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
		return result.auditnslogpolicy;
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
	* Use this API to add auditnslogpolicy.
	*/
	public static base_response add(nitro_service client, auditnslogpolicy resource) throws Exception {
		auditnslogpolicy addresource = new auditnslogpolicy();
		addresource.name = resource.name;
		addresource.rule = resource.rule;
		addresource.action = resource.action;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add auditnslogpolicy resources.
	*/
	public static base_responses add(nitro_service client, auditnslogpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			auditnslogpolicy addresources[] = new auditnslogpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new auditnslogpolicy();
				addresources[i].name = resources[i].name;
				addresources[i].rule = resources[i].rule;
				addresources[i].action = resources[i].action;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete auditnslogpolicy of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		auditnslogpolicy deleteresource = new auditnslogpolicy();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete auditnslogpolicy.
	*/
	public static base_response delete(nitro_service client, auditnslogpolicy resource) throws Exception {
		auditnslogpolicy deleteresource = new auditnslogpolicy();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete auditnslogpolicy resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			auditnslogpolicy deleteresources[] = new auditnslogpolicy[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new auditnslogpolicy();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete auditnslogpolicy resources.
	*/
	public static base_responses delete(nitro_service client, auditnslogpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			auditnslogpolicy deleteresources[] = new auditnslogpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new auditnslogpolicy();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update auditnslogpolicy.
	*/
	public static base_response update(nitro_service client, auditnslogpolicy resource) throws Exception {
		auditnslogpolicy updateresource = new auditnslogpolicy();
		updateresource.name = resource.name;
		updateresource.rule = resource.rule;
		updateresource.action = resource.action;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update auditnslogpolicy resources.
	*/
	public static base_responses update(nitro_service client, auditnslogpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			auditnslogpolicy updateresources[] = new auditnslogpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new auditnslogpolicy();
				updateresources[i].name = resources[i].name;
				updateresources[i].rule = resources[i].rule;
				updateresources[i].action = resources[i].action;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the auditnslogpolicy resources that are configured on netscaler.
	*/
	public static auditnslogpolicy[] get(nitro_service service) throws Exception{
		auditnslogpolicy obj = new auditnslogpolicy();
		auditnslogpolicy[] response = (auditnslogpolicy[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the auditnslogpolicy resources that are configured on netscaler.
	*/
	public static auditnslogpolicy[] get(nitro_service service, options option) throws Exception{
		auditnslogpolicy obj = new auditnslogpolicy();
		auditnslogpolicy[] response = (auditnslogpolicy[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch auditnslogpolicy resource of given name .
	*/
	public static auditnslogpolicy get(nitro_service service, String name) throws Exception{
		auditnslogpolicy obj = new auditnslogpolicy();
		obj.set_name(name);
		auditnslogpolicy response = (auditnslogpolicy) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch auditnslogpolicy resources of given names .
	*/
	public static auditnslogpolicy[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			auditnslogpolicy response[] = new auditnslogpolicy[name.length];
			auditnslogpolicy obj[] = new auditnslogpolicy[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new auditnslogpolicy();
				obj[i].set_name(name[i]);
				response[i] = (auditnslogpolicy) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of auditnslogpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static auditnslogpolicy[] get_filtered(nitro_service service, String filter) throws Exception{
		auditnslogpolicy obj = new auditnslogpolicy();
		options option = new options();
		option.set_filter(filter);
		auditnslogpolicy[] response = (auditnslogpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of auditnslogpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static auditnslogpolicy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		auditnslogpolicy obj = new auditnslogpolicy();
		options option = new options();
		option.set_filter(filter);
		auditnslogpolicy[] response = (auditnslogpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the auditnslogpolicy resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		auditnslogpolicy obj = new auditnslogpolicy();
		options option = new options();
		option.set_count(true);
		auditnslogpolicy[] response = (auditnslogpolicy[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of auditnslogpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		auditnslogpolicy obj = new auditnslogpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		auditnslogpolicy[] response = (auditnslogpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of auditnslogpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		auditnslogpolicy obj = new auditnslogpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		auditnslogpolicy[] response = (auditnslogpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class builtinEnum {
		public static final String MODIFIABLE = "MODIFIABLE";
		public static final String DELETABLE = "DELETABLE";
		public static final String IMMUTABLE = "IMMUTABLE";
	}
}