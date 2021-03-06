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

package com.citrix.netscaler.nitro.resource.config.dns;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class dnsview_dnspolicy_binding_response extends base_response
{
	public dnsview_dnspolicy_binding[] dnsview_dnspolicy_binding;
}
/**
	* Binding class showing the dnspolicy that can be bound to dnsview.
	*/

public class dnsview_dnspolicy_binding extends base_resource
{
	private String dnspolicyname;
	private String viewname;
	private Long __count;

	/**
	* <pre>
	* Name of the view to display.<br> Minimum length =  1
	* </pre>
	*/
	public void set_viewname(String viewname) throws Exception{
		this.viewname = viewname;
	}

	/**
	* <pre>
	* Name of the view to display.<br> Minimum length =  1
	* </pre>
	*/
	public String get_viewname() throws Exception {
		return this.viewname;
	}

	/**
	* <pre>
	* dnspolicy name of this view.
	* </pre>
	*/
	public void set_dnspolicyname(String dnspolicyname) throws Exception{
		this.dnspolicyname = dnspolicyname;
	}

	/**
	* <pre>
	* dnspolicy name of this view.
	* </pre>
	*/
	public String get_dnspolicyname() throws Exception {
		return this.dnspolicyname;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		dnsview_dnspolicy_binding_response result = (dnsview_dnspolicy_binding_response) service.get_payload_formatter().string_to_resource(dnsview_dnspolicy_binding_response.class, response);
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
		return result.dnsview_dnspolicy_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.viewname;
	}

	/**
	* Use this API to fetch dnsview_dnspolicy_binding resources of given name .
	*/
	public static dnsview_dnspolicy_binding[] get(nitro_service service, String viewname) throws Exception{
		dnsview_dnspolicy_binding obj = new dnsview_dnspolicy_binding();
		obj.set_viewname(viewname);
		dnsview_dnspolicy_binding response[] = (dnsview_dnspolicy_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of dnsview_dnspolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static dnsview_dnspolicy_binding[] get_filtered(nitro_service service, String viewname, String filter) throws Exception{
		dnsview_dnspolicy_binding obj = new dnsview_dnspolicy_binding();
		obj.set_viewname(viewname);
		options option = new options();
		option.set_filter(filter);
		dnsview_dnspolicy_binding[] response = (dnsview_dnspolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of dnsview_dnspolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static dnsview_dnspolicy_binding[] get_filtered(nitro_service service, String viewname, filtervalue[] filter) throws Exception{
		dnsview_dnspolicy_binding obj = new dnsview_dnspolicy_binding();
		obj.set_viewname(viewname);
		options option = new options();
		option.set_filter(filter);
		dnsview_dnspolicy_binding[] response = (dnsview_dnspolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count dnsview_dnspolicy_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String viewname) throws Exception{
		dnsview_dnspolicy_binding obj = new dnsview_dnspolicy_binding();
		obj.set_viewname(viewname);
		options option = new options();
		option.set_count(true);
		dnsview_dnspolicy_binding response[] = (dnsview_dnspolicy_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of dnsview_dnspolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String viewname, String filter) throws Exception{
		dnsview_dnspolicy_binding obj = new dnsview_dnspolicy_binding();
		obj.set_viewname(viewname);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnsview_dnspolicy_binding[] response = (dnsview_dnspolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of dnsview_dnspolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String viewname, filtervalue[] filter) throws Exception{
		dnsview_dnspolicy_binding obj = new dnsview_dnspolicy_binding();
		obj.set_viewname(viewname);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnsview_dnspolicy_binding[] response = (dnsview_dnspolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}