/*
* Copyright (c) 2008-2015 Citrix Systems, Inc.
*
*   Licensed under the Apache License, Version 2.0 (the "License");
*   you may not use this file except in compliance with the License.
*   You may obtain a copy of the License at
*
*       http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software
*   distributed under the License is distributed on an "AS IS" BASIS,
*   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*   See the License for the specific language governing permissions and
*   limitations under the License.
*/

package com.citrix.netscaler.nitro.resource.config.filter;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class filterglobal_filterpolicy_binding_response extends base_response
{
	public filterglobal_filterpolicy_binding[] filterglobal_filterpolicy_binding;
}
/**
	* Binding class showing the filterpolicy that can be bound to filterglobal.
	*/

public class filterglobal_filterpolicy_binding extends base_resource
{
	private String policyname;
	private Long priority;
	private String state;
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
	* State of the binding.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* State of the binding.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* The name of the filter policy.
	* </pre>
	*/
	public void set_policyname(String policyname) throws Exception{
		this.policyname = policyname;
	}

	/**
	* <pre>
	* The name of the filter policy.
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		filterglobal_filterpolicy_binding_response result = (filterglobal_filterpolicy_binding_response) service.get_payload_formatter().string_to_resource(filterglobal_filterpolicy_binding_response.class, response);
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
		return result.filterglobal_filterpolicy_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return null;
	}

	public static base_response add(nitro_service client, filterglobal_filterpolicy_binding resource) throws Exception {
		filterglobal_filterpolicy_binding updateresource = new filterglobal_filterpolicy_binding();
		updateresource.policyname = resource.policyname;
		updateresource.priority = resource.priority;
		updateresource.state = resource.state;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, filterglobal_filterpolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			filterglobal_filterpolicy_binding updateresources[] = new filterglobal_filterpolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new filterglobal_filterpolicy_binding();
				updateresources[i].policyname = resources[i].policyname;
				updateresources[i].priority = resources[i].priority;
				updateresources[i].state = resources[i].state;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, filterglobal_filterpolicy_binding resource) throws Exception {
		filterglobal_filterpolicy_binding deleteresource = new filterglobal_filterpolicy_binding();
		deleteresource.policyname = resource.policyname;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, filterglobal_filterpolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			filterglobal_filterpolicy_binding deleteresources[] = new filterglobal_filterpolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new filterglobal_filterpolicy_binding();
				deleteresources[i].policyname = resources[i].policyname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch a filterglobal_filterpolicy_binding resources.
	*/
	public static filterglobal_filterpolicy_binding[] get(nitro_service service) throws Exception{
		filterglobal_filterpolicy_binding obj = new filterglobal_filterpolicy_binding();
		filterglobal_filterpolicy_binding response[] = (filterglobal_filterpolicy_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of filterglobal_filterpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static filterglobal_filterpolicy_binding[] get_filtered(nitro_service service, String filter) throws Exception{
		filterglobal_filterpolicy_binding obj = new filterglobal_filterpolicy_binding();
		options option = new options();
		option.set_filter(filter);
		filterglobal_filterpolicy_binding[] response = (filterglobal_filterpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of filterglobal_filterpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static filterglobal_filterpolicy_binding[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		filterglobal_filterpolicy_binding obj = new filterglobal_filterpolicy_binding();
		options option = new options();
		option.set_filter(filter);
		filterglobal_filterpolicy_binding[] response = (filterglobal_filterpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count filterglobal_filterpolicy_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		filterglobal_filterpolicy_binding obj = new filterglobal_filterpolicy_binding();
		options option = new options();
		option.set_count(true);
		filterglobal_filterpolicy_binding response[] = (filterglobal_filterpolicy_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of filterglobal_filterpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		filterglobal_filterpolicy_binding obj = new filterglobal_filterpolicy_binding();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		filterglobal_filterpolicy_binding[] response = (filterglobal_filterpolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of filterglobal_filterpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		filterglobal_filterpolicy_binding obj = new filterglobal_filterpolicy_binding();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		filterglobal_filterpolicy_binding[] response = (filterglobal_filterpolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}

}