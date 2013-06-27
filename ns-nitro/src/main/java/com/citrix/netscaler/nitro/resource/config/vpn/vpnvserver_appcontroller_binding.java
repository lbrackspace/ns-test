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

package com.citrix.netscaler.nitro.resource.config.vpn;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class vpnvserver_appcontroller_binding_response extends base_response
{
	public vpnvserver_appcontroller_binding[] vpnvserver_appcontroller_binding;
}
/**
	* Binding class showing the appcontroller that can be bound to vpnvserver.
	*/

public class vpnvserver_appcontroller_binding extends base_resource
{
	private String appcontroller;
	private Long acttype;
	private String name;
	private Long __count;

	/**
	* <pre>
	* Configured AppController server in Cloud Gateway deployment.
	* </pre>
	*/
	public void set_appcontroller(String appcontroller) throws Exception{
		this.appcontroller = appcontroller;
	}

	/**
	* <pre>
	* Configured AppController server in Cloud Gateway deployment.
	* </pre>
	*/
	public String get_appcontroller() throws Exception {
		return this.appcontroller;
	}

	/**
	* <pre>
	* Name of the virtual server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the virtual server.<br> Minimum length =  1
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
	public Long get_acttype() throws Exception {
		return this.acttype;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		vpnvserver_appcontroller_binding_response result = (vpnvserver_appcontroller_binding_response) service.get_payload_formatter().string_to_resource(vpnvserver_appcontroller_binding_response.class, response);
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
		return result.vpnvserver_appcontroller_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	public static base_response add(nitro_service client, vpnvserver_appcontroller_binding resource) throws Exception {
		vpnvserver_appcontroller_binding updateresource = new vpnvserver_appcontroller_binding();
		updateresource.name = resource.name;
		updateresource.appcontroller = resource.appcontroller;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, vpnvserver_appcontroller_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnvserver_appcontroller_binding updateresources[] = new vpnvserver_appcontroller_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new vpnvserver_appcontroller_binding();
				updateresources[i].name = resources[i].name;
				updateresources[i].appcontroller = resources[i].appcontroller;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, vpnvserver_appcontroller_binding resource) throws Exception {
		vpnvserver_appcontroller_binding deleteresource = new vpnvserver_appcontroller_binding();
		deleteresource.name = resource.name;
		deleteresource.appcontroller = resource.appcontroller;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, vpnvserver_appcontroller_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnvserver_appcontroller_binding deleteresources[] = new vpnvserver_appcontroller_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new vpnvserver_appcontroller_binding();
				deleteresources[i].name = resources[i].name;
				deleteresources[i].appcontroller = resources[i].appcontroller;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch vpnvserver_appcontroller_binding resources of given name .
	*/
	public static vpnvserver_appcontroller_binding[] get(nitro_service service, String name) throws Exception{
		vpnvserver_appcontroller_binding obj = new vpnvserver_appcontroller_binding();
		obj.set_name(name);
		vpnvserver_appcontroller_binding response[] = (vpnvserver_appcontroller_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vpnvserver_appcontroller_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static vpnvserver_appcontroller_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		vpnvserver_appcontroller_binding obj = new vpnvserver_appcontroller_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		vpnvserver_appcontroller_binding[] response = (vpnvserver_appcontroller_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vpnvserver_appcontroller_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static vpnvserver_appcontroller_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		vpnvserver_appcontroller_binding obj = new vpnvserver_appcontroller_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		vpnvserver_appcontroller_binding[] response = (vpnvserver_appcontroller_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count vpnvserver_appcontroller_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		vpnvserver_appcontroller_binding obj = new vpnvserver_appcontroller_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		vpnvserver_appcontroller_binding response[] = (vpnvserver_appcontroller_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vpnvserver_appcontroller_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		vpnvserver_appcontroller_binding obj = new vpnvserver_appcontroller_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpnvserver_appcontroller_binding[] response = (vpnvserver_appcontroller_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vpnvserver_appcontroller_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		vpnvserver_appcontroller_binding obj = new vpnvserver_appcontroller_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpnvserver_appcontroller_binding[] response = (vpnvserver_appcontroller_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class bindpointEnum {
		public static final String REQUEST = "REQUEST";
		public static final String RESPONSE = "RESPONSE";
		public static final String ICA_REQUEST = "ICA_REQUEST";
		public static final String OTHERTCP_REQUEST = "OTHERTCP_REQUEST";
	}

}