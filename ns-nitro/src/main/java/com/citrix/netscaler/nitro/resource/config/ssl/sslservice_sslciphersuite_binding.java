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

package com.citrix.netscaler.nitro.resource.config.ssl;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class sslservice_sslciphersuite_binding_response extends base_response
{
	public sslservice_sslciphersuite_binding[] sslservice_sslciphersuite_binding;
}
/**
	* Binding class showing the sslciphersuite that can be bound to sslservice.
	*/

public class sslservice_sslciphersuite_binding extends base_resource
{
	private String ciphername;
	private String description;
	private String servicename;
	private Long __count;

	/**
	* <pre>
	* The cipher group/alias/individual cipher configuration.
	* </pre>
	*/
	public void set_ciphername(String ciphername) throws Exception{
		this.ciphername = ciphername;
	}

	/**
	* <pre>
	* The cipher group/alias/individual cipher configuration.
	* </pre>
	*/
	public String get_ciphername() throws Exception {
		return this.ciphername;
	}

	/**
	* <pre>
	* Name of the SSL service for which to set advanced configuration.<br> Minimum length =  1
	* </pre>
	*/
	public void set_servicename(String servicename) throws Exception{
		this.servicename = servicename;
	}

	/**
	* <pre>
	* Name of the SSL service for which to set advanced configuration.<br> Minimum length =  1
	* </pre>
	*/
	public String get_servicename() throws Exception {
		return this.servicename;
	}

	/**
	* <pre>
	* The cipher suite description.
	* </pre>
	*/
	public void set_description(String description) throws Exception{
		this.description = description;
	}

	/**
	* <pre>
	* The cipher suite description.
	* </pre>
	*/
	public String get_description() throws Exception {
		return this.description;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		sslservice_sslciphersuite_binding_response result = (sslservice_sslciphersuite_binding_response) service.get_payload_formatter().string_to_resource(sslservice_sslciphersuite_binding_response.class, response);
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
		return result.sslservice_sslciphersuite_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.servicename;
	}

	public static base_response add(nitro_service client, sslservice_sslciphersuite_binding resource) throws Exception {
		sslservice_sslciphersuite_binding updateresource = new sslservice_sslciphersuite_binding();
		updateresource.servicename = resource.servicename;
		updateresource.ciphername = resource.ciphername;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, sslservice_sslciphersuite_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslservice_sslciphersuite_binding updateresources[] = new sslservice_sslciphersuite_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new sslservice_sslciphersuite_binding();
				updateresources[i].servicename = resources[i].servicename;
				updateresources[i].ciphername = resources[i].ciphername;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, sslservice_sslciphersuite_binding resource) throws Exception {
		sslservice_sslciphersuite_binding deleteresource = new sslservice_sslciphersuite_binding();
		deleteresource.servicename = resource.servicename;
		deleteresource.ciphername = resource.ciphername;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, sslservice_sslciphersuite_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslservice_sslciphersuite_binding deleteresources[] = new sslservice_sslciphersuite_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new sslservice_sslciphersuite_binding();
				deleteresources[i].servicename = resources[i].servicename;
				deleteresources[i].ciphername = resources[i].ciphername;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch sslservice_sslciphersuite_binding resources of given name .
	*/
	public static sslservice_sslciphersuite_binding[] get(nitro_service service, String servicename) throws Exception{
		sslservice_sslciphersuite_binding obj = new sslservice_sslciphersuite_binding();
		obj.set_servicename(servicename);
		sslservice_sslciphersuite_binding response[] = (sslservice_sslciphersuite_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sslservice_sslciphersuite_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static sslservice_sslciphersuite_binding[] get_filtered(nitro_service service, String servicename, String filter) throws Exception{
		sslservice_sslciphersuite_binding obj = new sslservice_sslciphersuite_binding();
		obj.set_servicename(servicename);
		options option = new options();
		option.set_filter(filter);
		sslservice_sslciphersuite_binding[] response = (sslservice_sslciphersuite_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sslservice_sslciphersuite_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static sslservice_sslciphersuite_binding[] get_filtered(nitro_service service, String servicename, filtervalue[] filter) throws Exception{
		sslservice_sslciphersuite_binding obj = new sslservice_sslciphersuite_binding();
		obj.set_servicename(servicename);
		options option = new options();
		option.set_filter(filter);
		sslservice_sslciphersuite_binding[] response = (sslservice_sslciphersuite_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count sslservice_sslciphersuite_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String servicename) throws Exception{
		sslservice_sslciphersuite_binding obj = new sslservice_sslciphersuite_binding();
		obj.set_servicename(servicename);
		options option = new options();
		option.set_count(true);
		sslservice_sslciphersuite_binding response[] = (sslservice_sslciphersuite_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of sslservice_sslciphersuite_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String servicename, String filter) throws Exception{
		sslservice_sslciphersuite_binding obj = new sslservice_sslciphersuite_binding();
		obj.set_servicename(servicename);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslservice_sslciphersuite_binding[] response = (sslservice_sslciphersuite_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of sslservice_sslciphersuite_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String servicename, filtervalue[] filter) throws Exception{
		sslservice_sslciphersuite_binding obj = new sslservice_sslciphersuite_binding();
		obj.set_servicename(servicename);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslservice_sslciphersuite_binding[] response = (sslservice_sslciphersuite_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class labeltypeEnum {
		public static final String vserver = "vserver";
		public static final String service = "service";
		public static final String policylabel = "policylabel";
	}
	public static class crlcheckEnum {
		public static final String Mandatory = "Mandatory";
		public static final String Optional = "Optional";
	}
	public static class ocspcheckEnum {
		public static final String Mandatory = "Mandatory";
		public static final String Optional = "Optional";
	}

}