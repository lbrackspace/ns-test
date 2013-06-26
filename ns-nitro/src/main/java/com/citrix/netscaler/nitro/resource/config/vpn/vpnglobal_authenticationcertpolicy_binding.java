/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.vpn;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class vpnglobal_authenticationcertpolicy_binding_response extends base_response
{
	public vpnglobal_authenticationcertpolicy_binding[] vpnglobal_authenticationcertpolicy_binding;
}
/**
	* Binding class showing the authenticationcertpolicy that can be bound to vpnglobal.
	*/

public class vpnglobal_authenticationcertpolicy_binding extends base_resource
{
	private String policyname;
	private Long priority;
	private Boolean secondary;
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
	* The name of the policy.
	* </pre>
	*/
	public void set_policyname(String policyname) throws Exception{
		this.policyname = policyname;
	}

	/**
	* <pre>
	* The name of the policy.
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
	}

	/**
	* <pre>
	* Bind the Authentication policy to the secondary chain. This provides for multifactor authentication in which a user must not only authenticate to a primary authentication server but also a server in the secondary chain.  User groups are aggregated across both authentication systems and while user may use different passwords in each system their username must be exactly the same.
	* </pre>
	*/
	public void set_secondary(boolean secondary) throws Exception {
		this.secondary = new Boolean(secondary);
	}

	/**
	* <pre>
	* Bind the Authentication policy to the secondary chain. This provides for multifactor authentication in which a user must not only authenticate to a primary authentication server but also a server in the secondary chain.  User groups are aggregated across both authentication systems and while user may use different passwords in each system their username must be exactly the same.
	* </pre>
	*/
	public void set_secondary(Boolean secondary) throws Exception{
		this.secondary = secondary;
	}

	/**
	* <pre>
	* Bind the Authentication policy to the secondary chain. This provides for multifactor authentication in which a user must not only authenticate to a primary authentication server but also a server in the secondary chain.  User groups are aggregated across both authentication systems and while user may use different passwords in each system their username must be exactly the same.
	* </pre>
	*/
	public Boolean get_secondary() throws Exception {
		return this.secondary;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		vpnglobal_authenticationcertpolicy_binding_response result = (vpnglobal_authenticationcertpolicy_binding_response) service.get_payload_formatter().string_to_resource(vpnglobal_authenticationcertpolicy_binding_response.class, response);
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
		return result.vpnglobal_authenticationcertpolicy_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return null;
	}

	public static base_response add(nitro_service client, vpnglobal_authenticationcertpolicy_binding resource) throws Exception {
		vpnglobal_authenticationcertpolicy_binding updateresource = new vpnglobal_authenticationcertpolicy_binding();
		updateresource.policyname = resource.policyname;
		updateresource.priority = resource.priority;
		updateresource.secondary = resource.secondary;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, vpnglobal_authenticationcertpolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnglobal_authenticationcertpolicy_binding updateresources[] = new vpnglobal_authenticationcertpolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new vpnglobal_authenticationcertpolicy_binding();
				updateresources[i].policyname = resources[i].policyname;
				updateresources[i].priority = resources[i].priority;
				updateresources[i].secondary = resources[i].secondary;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, vpnglobal_authenticationcertpolicy_binding resource) throws Exception {
		vpnglobal_authenticationcertpolicy_binding deleteresource = new vpnglobal_authenticationcertpolicy_binding();
		deleteresource.policyname = resource.policyname;
		deleteresource.secondary = resource.secondary;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, vpnglobal_authenticationcertpolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnglobal_authenticationcertpolicy_binding deleteresources[] = new vpnglobal_authenticationcertpolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new vpnglobal_authenticationcertpolicy_binding();
				deleteresources[i].policyname = resources[i].policyname;
				deleteresources[i].secondary = resources[i].secondary;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch a vpnglobal_authenticationcertpolicy_binding resources.
	*/
	public static vpnglobal_authenticationcertpolicy_binding[] get(nitro_service service) throws Exception{
		vpnglobal_authenticationcertpolicy_binding obj = new vpnglobal_authenticationcertpolicy_binding();
		vpnglobal_authenticationcertpolicy_binding response[] = (vpnglobal_authenticationcertpolicy_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vpnglobal_authenticationcertpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static vpnglobal_authenticationcertpolicy_binding[] get_filtered(nitro_service service, String filter) throws Exception{
		vpnglobal_authenticationcertpolicy_binding obj = new vpnglobal_authenticationcertpolicy_binding();
		options option = new options();
		option.set_filter(filter);
		vpnglobal_authenticationcertpolicy_binding[] response = (vpnglobal_authenticationcertpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vpnglobal_authenticationcertpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static vpnglobal_authenticationcertpolicy_binding[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		vpnglobal_authenticationcertpolicy_binding obj = new vpnglobal_authenticationcertpolicy_binding();
		options option = new options();
		option.set_filter(filter);
		vpnglobal_authenticationcertpolicy_binding[] response = (vpnglobal_authenticationcertpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count vpnglobal_authenticationcertpolicy_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		vpnglobal_authenticationcertpolicy_binding obj = new vpnglobal_authenticationcertpolicy_binding();
		options option = new options();
		option.set_count(true);
		vpnglobal_authenticationcertpolicy_binding response[] = (vpnglobal_authenticationcertpolicy_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vpnglobal_authenticationcertpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		vpnglobal_authenticationcertpolicy_binding obj = new vpnglobal_authenticationcertpolicy_binding();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpnglobal_authenticationcertpolicy_binding[] response = (vpnglobal_authenticationcertpolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vpnglobal_authenticationcertpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		vpnglobal_authenticationcertpolicy_binding obj = new vpnglobal_authenticationcertpolicy_binding();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpnglobal_authenticationcertpolicy_binding[] response = (vpnglobal_authenticationcertpolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}