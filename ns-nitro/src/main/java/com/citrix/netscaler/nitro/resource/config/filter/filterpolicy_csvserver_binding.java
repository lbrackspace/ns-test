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

class filterpolicy_csvserver_binding_response extends base_response
{
	public filterpolicy_csvserver_binding[] filterpolicy_csvserver_binding;
}
/**
	* Binding class showing the csvserver that can be bound to filterpolicy.
	*/

public class filterpolicy_csvserver_binding extends base_resource
{
	private String boundto;
	private Long priority;
	private Long activepolicy;
	private String name;
	private Long __count;

	/**
	* <pre>
	* Name of the filter policy to be displayed. If a name is not provided, information about all the filter policies is shown.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the filter policy to be displayed. If a name is not provided, information about all the filter policies is shown.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

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
		filterpolicy_csvserver_binding_response result = (filterpolicy_csvserver_binding_response) service.get_payload_formatter().string_to_resource(filterpolicy_csvserver_binding_response.class, response);
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
		return result.filterpolicy_csvserver_binding;
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
	* Use this API to fetch filterpolicy_csvserver_binding resources of given name .
	*/
	public static filterpolicy_csvserver_binding[] get(nitro_service service, String name) throws Exception{
		filterpolicy_csvserver_binding obj = new filterpolicy_csvserver_binding();
		obj.set_name(name);
		filterpolicy_csvserver_binding response[] = (filterpolicy_csvserver_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of filterpolicy_csvserver_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static filterpolicy_csvserver_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		filterpolicy_csvserver_binding obj = new filterpolicy_csvserver_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		filterpolicy_csvserver_binding[] response = (filterpolicy_csvserver_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of filterpolicy_csvserver_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static filterpolicy_csvserver_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		filterpolicy_csvserver_binding obj = new filterpolicy_csvserver_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		filterpolicy_csvserver_binding[] response = (filterpolicy_csvserver_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count filterpolicy_csvserver_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		filterpolicy_csvserver_binding obj = new filterpolicy_csvserver_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		filterpolicy_csvserver_binding response[] = (filterpolicy_csvserver_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of filterpolicy_csvserver_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		filterpolicy_csvserver_binding obj = new filterpolicy_csvserver_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		filterpolicy_csvserver_binding[] response = (filterpolicy_csvserver_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of filterpolicy_csvserver_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		filterpolicy_csvserver_binding obj = new filterpolicy_csvserver_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		filterpolicy_csvserver_binding[] response = (filterpolicy_csvserver_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}