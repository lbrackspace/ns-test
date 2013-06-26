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

class authenticationnegotiatepolicy_response extends base_response
{
	public authenticationnegotiatepolicy[] authenticationnegotiatepolicy;
}
/**
* Configuration for Negotiate Policy resource.
*/

public class authenticationnegotiatepolicy extends base_resource
{
	private String name;
	private String rule;
	private String reqaction;
	private Long __count;

	/**
	* <pre>
	* The name for the new Negotiate policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name for the new Negotiate policy.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The name of the rule or expression the policy will use.<br> Minimum length =  1
	* </pre>
	*/
	public void set_rule(String rule) throws Exception{
		this.rule = rule;
	}

	/**
	* <pre>
	* The name of the rule or expression the policy will use.<br> Minimum length =  1
	* </pre>
	*/
	public String get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* The Negotiate action the policy will use.<br> Minimum length =  1
	* </pre>
	*/
	public void set_reqaction(String reqaction) throws Exception{
		this.reqaction = reqaction;
	}

	/**
	* <pre>
	* The Negotiate action the policy will use.<br> Minimum length =  1
	* </pre>
	*/
	public String get_reqaction() throws Exception {
		return this.reqaction;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		authenticationnegotiatepolicy_response result = (authenticationnegotiatepolicy_response) service.get_payload_formatter().string_to_resource(authenticationnegotiatepolicy_response.class, response);
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
		return result.authenticationnegotiatepolicy;
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
	* Use this API to add authenticationnegotiatepolicy.
	*/
	public static base_response add(nitro_service client, authenticationnegotiatepolicy resource) throws Exception {
		authenticationnegotiatepolicy addresource = new authenticationnegotiatepolicy();
		addresource.name = resource.name;
		addresource.rule = resource.rule;
		addresource.reqaction = resource.reqaction;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add authenticationnegotiatepolicy resources.
	*/
	public static base_responses add(nitro_service client, authenticationnegotiatepolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationnegotiatepolicy addresources[] = new authenticationnegotiatepolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new authenticationnegotiatepolicy();
				addresources[i].name = resources[i].name;
				addresources[i].rule = resources[i].rule;
				addresources[i].reqaction = resources[i].reqaction;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete authenticationnegotiatepolicy of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		authenticationnegotiatepolicy deleteresource = new authenticationnegotiatepolicy();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete authenticationnegotiatepolicy.
	*/
	public static base_response delete(nitro_service client, authenticationnegotiatepolicy resource) throws Exception {
		authenticationnegotiatepolicy deleteresource = new authenticationnegotiatepolicy();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete authenticationnegotiatepolicy resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			authenticationnegotiatepolicy deleteresources[] = new authenticationnegotiatepolicy[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new authenticationnegotiatepolicy();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete authenticationnegotiatepolicy resources.
	*/
	public static base_responses delete(nitro_service client, authenticationnegotiatepolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationnegotiatepolicy deleteresources[] = new authenticationnegotiatepolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new authenticationnegotiatepolicy();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update authenticationnegotiatepolicy.
	*/
	public static base_response update(nitro_service client, authenticationnegotiatepolicy resource) throws Exception {
		authenticationnegotiatepolicy updateresource = new authenticationnegotiatepolicy();
		updateresource.name = resource.name;
		updateresource.rule = resource.rule;
		updateresource.reqaction = resource.reqaction;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update authenticationnegotiatepolicy resources.
	*/
	public static base_responses update(nitro_service client, authenticationnegotiatepolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationnegotiatepolicy updateresources[] = new authenticationnegotiatepolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new authenticationnegotiatepolicy();
				updateresources[i].name = resources[i].name;
				updateresources[i].rule = resources[i].rule;
				updateresources[i].reqaction = resources[i].reqaction;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of authenticationnegotiatepolicy resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		authenticationnegotiatepolicy unsetresource = new authenticationnegotiatepolicy();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of authenticationnegotiatepolicy resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, authenticationnegotiatepolicy resource, String[] args) throws Exception{
		authenticationnegotiatepolicy unsetresource = new authenticationnegotiatepolicy();
		unsetresource.name = resource.name;
		unsetresource.rule = resource.rule;
		unsetresource.reqaction = resource.reqaction;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of authenticationnegotiatepolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			authenticationnegotiatepolicy unsetresources[] = new authenticationnegotiatepolicy[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new authenticationnegotiatepolicy();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of authenticationnegotiatepolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, authenticationnegotiatepolicy resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationnegotiatepolicy unsetresources[] = new authenticationnegotiatepolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new authenticationnegotiatepolicy();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].rule = resources[i].rule;
				unsetresources[i].reqaction = resources[i].reqaction;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the authenticationnegotiatepolicy resources that are configured on netscaler.
	*/
	public static authenticationnegotiatepolicy[] get(nitro_service service) throws Exception{
		authenticationnegotiatepolicy obj = new authenticationnegotiatepolicy();
		authenticationnegotiatepolicy[] response = (authenticationnegotiatepolicy[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the authenticationnegotiatepolicy resources that are configured on netscaler.
	*/
	public static authenticationnegotiatepolicy[] get(nitro_service service, options option) throws Exception{
		authenticationnegotiatepolicy obj = new authenticationnegotiatepolicy();
		authenticationnegotiatepolicy[] response = (authenticationnegotiatepolicy[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch authenticationnegotiatepolicy resource of given name .
	*/
	public static authenticationnegotiatepolicy get(nitro_service service, String name) throws Exception{
		authenticationnegotiatepolicy obj = new authenticationnegotiatepolicy();
		obj.set_name(name);
		authenticationnegotiatepolicy response = (authenticationnegotiatepolicy) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch authenticationnegotiatepolicy resources of given names .
	*/
	public static authenticationnegotiatepolicy[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			authenticationnegotiatepolicy response[] = new authenticationnegotiatepolicy[name.length];
			authenticationnegotiatepolicy obj[] = new authenticationnegotiatepolicy[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new authenticationnegotiatepolicy();
				obj[i].set_name(name[i]);
				response[i] = (authenticationnegotiatepolicy) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of authenticationnegotiatepolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static authenticationnegotiatepolicy[] get_filtered(nitro_service service, String filter) throws Exception{
		authenticationnegotiatepolicy obj = new authenticationnegotiatepolicy();
		options option = new options();
		option.set_filter(filter);
		authenticationnegotiatepolicy[] response = (authenticationnegotiatepolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of authenticationnegotiatepolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static authenticationnegotiatepolicy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		authenticationnegotiatepolicy obj = new authenticationnegotiatepolicy();
		options option = new options();
		option.set_filter(filter);
		authenticationnegotiatepolicy[] response = (authenticationnegotiatepolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the authenticationnegotiatepolicy resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		authenticationnegotiatepolicy obj = new authenticationnegotiatepolicy();
		options option = new options();
		option.set_count(true);
		authenticationnegotiatepolicy[] response = (authenticationnegotiatepolicy[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of authenticationnegotiatepolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		authenticationnegotiatepolicy obj = new authenticationnegotiatepolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authenticationnegotiatepolicy[] response = (authenticationnegotiatepolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of authenticationnegotiatepolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		authenticationnegotiatepolicy obj = new authenticationnegotiatepolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authenticationnegotiatepolicy[] response = (authenticationnegotiatepolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}