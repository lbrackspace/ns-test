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

package com.citrix.netscaler.nitro.resource.config.co;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class coglobal_copolicy_binding_response extends base_response
{
	public coglobal_copolicy_binding[] coglobal_copolicy_binding;
}
/**
	* Binding class showing the copolicy that can be bound to coglobal.
	*/

public class coglobal_copolicy_binding extends base_resource
{
	private String policyname;
	private Long priority;
	private String gotopriorityexpression;
	private String type;
	private Long __count;

	/**
	* <pre>
	* The priority assigned to the policy binding.
	* </pre>
	*/
	public void set_priority(long priority) throws Exception {
		this.priority = new Long(priority);
	}

	/**
	* <pre>
	* The priority assigned to the policy binding.
	* </pre>
	*/
	public void set_priority(Long priority) throws Exception{
		this.priority = priority;
	}

	/**
	* <pre>
	* The priority assigned to the policy binding.
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* Expression specifying the priority of the next policy which will get evaluated if the current policy rule evaluates to TRUE.
	* </pre>
	*/
	public void set_gotopriorityexpression(String gotopriorityexpression) throws Exception{
		this.gotopriorityexpression = gotopriorityexpression;
	}

	/**
	* <pre>
	* Expression specifying the priority of the next policy which will get evaluated if the current policy rule evaluates to TRUE.
	* </pre>
	*/
	public String get_gotopriorityexpression() throws Exception {
		return this.gotopriorityexpression;
	}

	/**
	* <pre>
	* The name of the globally bound content optimization policy.
	* </pre>
	*/
	public void set_policyname(String policyname) throws Exception{
		this.policyname = policyname;
	}

	/**
	* <pre>
	* The name of the globally bound content optimization policy.
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
	}

	/**
	* <pre>
	* Bindpoint to which the policy is bound.<br> Possible values = REQ_OVERRIDE, REQ_DEFAULT, RES_OVERRIDE, RES_DEFAULT, NONE
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* Bindpoint to which the policy is bound.<br> Possible values = REQ_OVERRIDE, REQ_DEFAULT, RES_OVERRIDE, RES_DEFAULT, NONE
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		coglobal_copolicy_binding_response result = (coglobal_copolicy_binding_response) service.get_payload_formatter().string_to_resource(coglobal_copolicy_binding_response.class, response);
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
		return result.coglobal_copolicy_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return null;
	}

	public static base_response add(nitro_service client, coglobal_copolicy_binding resource) throws Exception {
		coglobal_copolicy_binding updateresource = new coglobal_copolicy_binding();
		updateresource.policyname = resource.policyname;
		updateresource.priority = resource.priority;
		updateresource.type = resource.type;
		updateresource.gotopriorityexpression = resource.gotopriorityexpression;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, coglobal_copolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			coglobal_copolicy_binding updateresources[] = new coglobal_copolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new coglobal_copolicy_binding();
				updateresources[i].policyname = resources[i].policyname;
				updateresources[i].priority = resources[i].priority;
				updateresources[i].type = resources[i].type;
				updateresources[i].gotopriorityexpression = resources[i].gotopriorityexpression;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, coglobal_copolicy_binding resource) throws Exception {
		coglobal_copolicy_binding deleteresource = new coglobal_copolicy_binding();
		deleteresource.policyname = resource.policyname;
		deleteresource.type = resource.type;
		deleteresource.priority = resource.priority;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, coglobal_copolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			coglobal_copolicy_binding deleteresources[] = new coglobal_copolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new coglobal_copolicy_binding();
				deleteresources[i].policyname = resources[i].policyname;
				deleteresources[i].type = resources[i].type;
				deleteresources[i].priority = resources[i].priority;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch a coglobal_copolicy_binding resources.
	*/
	public static coglobal_copolicy_binding[] get(nitro_service service) throws Exception{
		coglobal_copolicy_binding obj = new coglobal_copolicy_binding();
		coglobal_copolicy_binding response[] = (coglobal_copolicy_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of coglobal_copolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static coglobal_copolicy_binding[] get_filtered(nitro_service service, String filter) throws Exception{
		coglobal_copolicy_binding obj = new coglobal_copolicy_binding();
		options option = new options();
		option.set_filter(filter);
		coglobal_copolicy_binding[] response = (coglobal_copolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of coglobal_copolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static coglobal_copolicy_binding[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		coglobal_copolicy_binding obj = new coglobal_copolicy_binding();
		options option = new options();
		option.set_filter(filter);
		coglobal_copolicy_binding[] response = (coglobal_copolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count coglobal_copolicy_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		coglobal_copolicy_binding obj = new coglobal_copolicy_binding();
		options option = new options();
		option.set_count(true);
		coglobal_copolicy_binding response[] = (coglobal_copolicy_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of coglobal_copolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		coglobal_copolicy_binding obj = new coglobal_copolicy_binding();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		coglobal_copolicy_binding[] response = (coglobal_copolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of coglobal_copolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		coglobal_copolicy_binding obj = new coglobal_copolicy_binding();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		coglobal_copolicy_binding[] response = (coglobal_copolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class typeEnum {
		public static final String REQ_OVERRIDE = "REQ_OVERRIDE";
		public static final String REQ_DEFAULT = "REQ_DEFAULT";
		public static final String RES_OVERRIDE = "RES_OVERRIDE";
		public static final String RES_DEFAULT = "RES_DEFAULT";
		public static final String NONE = "NONE";
	}

}