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

package com.citrix.netscaler.nitro.resource.config.aaa;

import com.citrix.netscaler.nitro.resource.config.aaa.aaapreauthenticationpolicy_vpnvserver_binding;
import com.citrix.netscaler.nitro.resource.config.aaa.aaapreauthenticationpolicy_aaaglobal_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class aaapreauthenticationpolicy_binding_response extends base_response
{
	public aaapreauthenticationpolicy_binding[] aaapreauthenticationpolicy_binding;
}
/**
	* Binding class showing the resources that can be bound to aaapreauthenticationpolicy_binding. 
	*/

public class aaapreauthenticationpolicy_binding extends base_resource
{
	private String name;
	private aaapreauthenticationpolicy_vpnvserver_binding	aaapreauthenticationpolicy_vpnvserver_binding[] = null;
	private aaapreauthenticationpolicy_aaaglobal_binding	aaapreauthenticationpolicy_aaaglobal_binding[] = null;

	/**
	* <pre>
	* Name of the preauthentication policy whose properties you want to view.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the preauthentication policy whose properties you want to view.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* vpnvserver that can be bound to aaapreauthenticationpolicy.
	* </pre>
	*/
	public aaapreauthenticationpolicy_vpnvserver_binding[] get_aaapreauthenticationpolicy_vpnvserver_bindings() throws Exception {
		return this.aaapreauthenticationpolicy_vpnvserver_binding;
	}

	/**
	* <pre>
	* aaaglobal that can be bound to aaapreauthenticationpolicy.
	* </pre>
	*/
	public aaapreauthenticationpolicy_aaaglobal_binding[] get_aaapreauthenticationpolicy_aaaglobal_bindings() throws Exception {
		return this.aaapreauthenticationpolicy_aaaglobal_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		aaapreauthenticationpolicy_binding_response result = (aaapreauthenticationpolicy_binding_response) service.get_payload_formatter().string_to_resource(aaapreauthenticationpolicy_binding_response.class, response);
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
		return result.aaapreauthenticationpolicy_binding;
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
	* Use this API to fetch aaapreauthenticationpolicy_binding resource of given name .
	*/
	public static aaapreauthenticationpolicy_binding get(nitro_service service, String name) throws Exception{
		aaapreauthenticationpolicy_binding obj = new aaapreauthenticationpolicy_binding();
		obj.set_name(name);
		aaapreauthenticationpolicy_binding response = (aaapreauthenticationpolicy_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch aaapreauthenticationpolicy_binding resources of given names .
	*/
	public static aaapreauthenticationpolicy_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			aaapreauthenticationpolicy_binding response[] = new aaapreauthenticationpolicy_binding[name.length];
			aaapreauthenticationpolicy_binding obj[] = new aaapreauthenticationpolicy_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new aaapreauthenticationpolicy_binding();
				obj[i].set_name(name[i]);
				response[i] = (aaapreauthenticationpolicy_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}