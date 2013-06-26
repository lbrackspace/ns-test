/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.system;

import com.citrix.netscaler.nitro.resource.config.system.systemgroup_systemuser_binding;
import com.citrix.netscaler.nitro.resource.config.system.systemgroup_systemcmdpolicy_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class systemgroup_binding_response extends base_response
{
	public systemgroup_binding[] systemgroup_binding;
}
/**
	* Binding class showing the resources that can be bound to systemgroup_binding. 
	*/

public class systemgroup_binding extends base_resource
{
	private String groupname;
	private systemgroup_systemuser_binding	systemgroup_systemuser_binding[] = null;
	private systemgroup_systemcmdpolicy_binding	systemgroup_systemcmdpolicy_binding[] = null;

	/**
	* <pre>
	* The name of the system group.<br> Minimum length =  1
	* </pre>
	*/
	public void set_groupname(String groupname) throws Exception{
		this.groupname = groupname;
	}

	/**
	* <pre>
	* The name of the system group.<br> Minimum length =  1
	* </pre>
	*/
	public String get_groupname() throws Exception {
		return this.groupname;
	}

	/**
	* <pre>
	* systemcmdpolicy that can be bound to systemgroup.
	* </pre>
	*/
	public systemgroup_systemcmdpolicy_binding[] get_systemgroup_systemcmdpolicy_bindings() throws Exception {
		return this.systemgroup_systemcmdpolicy_binding;
	}

	/**
	* <pre>
	* systemuser that can be bound to systemgroup.
	* </pre>
	*/
	public systemgroup_systemuser_binding[] get_systemgroup_systemuser_bindings() throws Exception {
		return this.systemgroup_systemuser_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		systemgroup_binding_response result = (systemgroup_binding_response) service.get_payload_formatter().string_to_resource(systemgroup_binding_response.class, response);
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
		return result.systemgroup_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.groupname;
	}

	/**
	* Use this API to fetch systemgroup_binding resource of given name .
	*/
	public static systemgroup_binding get(nitro_service service, String groupname) throws Exception{
		systemgroup_binding obj = new systemgroup_binding();
		obj.set_groupname(groupname);
		systemgroup_binding response = (systemgroup_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch systemgroup_binding resources of given names .
	*/
	public static systemgroup_binding[] get(nitro_service service, String groupname[]) throws Exception{
		if (groupname !=null && groupname.length>0) {
			systemgroup_binding response[] = new systemgroup_binding[groupname.length];
			systemgroup_binding obj[] = new systemgroup_binding[groupname.length];
			for (int i=0;i<groupname.length;i++) {
				obj[i] = new systemgroup_binding();
				obj[i].set_groupname(groupname[i]);
				response[i] = (systemgroup_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}