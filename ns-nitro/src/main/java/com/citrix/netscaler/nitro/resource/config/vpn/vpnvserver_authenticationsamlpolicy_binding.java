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

class vpnvserver_authenticationsamlpolicy_binding_response extends base_response
{
	public vpnvserver_authenticationsamlpolicy_binding[] vpnvserver_authenticationsamlpolicy_binding;
}
/**
	* Binding class showing the authenticationsamlpolicy that can be bound to vpnvserver.
	*/

public class vpnvserver_authenticationsamlpolicy_binding extends base_resource
{
	private String policy;
	private Long priority;
	private Long acttype;
	private Boolean secondary;
	private String name;
	private Long __count;

	/**
	* <pre>
	* The priority, if any, of the vpn vserver policy.
	* </pre>
	*/
	public void set_priority(long priority) throws Exception {
		this.priority = new Long(priority);
	}

	/**
	* <pre>
	* The priority, if any, of the vpn vserver policy.
	* </pre>
	*/
	public void set_priority(Long priority) throws Exception{
		this.priority = priority;
	}

	/**
	* <pre>
	* The priority, if any, of the vpn vserver policy.
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* The name of the policy, if any, bound to the vpn vserver.
	* </pre>
	*/
	public void set_policy(String policy) throws Exception{
		this.policy = policy;
	}

	/**
	* <pre>
	* The name of the policy, if any, bound to the vpn vserver.
	* </pre>
	*/
	public String get_policy() throws Exception {
		return this.policy;
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
	* Bind the authentication policy as the secondary policy to use in a two-factor configuration. A user must then authenticate not only via a primary authentication method but also via a secondary authentication method. User groups are aggregated across both. The user name must be exactly the same for both authentication methods, but they can require different passwords.
	* </pre>
	*/
	public void set_secondary(boolean secondary) throws Exception {
		this.secondary = new Boolean(secondary);
	}

	/**
	* <pre>
	* Bind the authentication policy as the secondary policy to use in a two-factor configuration. A user must then authenticate not only via a primary authentication method but also via a secondary authentication method. User groups are aggregated across both. The user name must be exactly the same for both authentication methods, but they can require different passwords.
	* </pre>
	*/
	public void set_secondary(Boolean secondary) throws Exception{
		this.secondary = secondary;
	}

	/**
	* <pre>
	* Bind the authentication policy as the secondary policy to use in a two-factor configuration. A user must then authenticate not only via a primary authentication method but also via a secondary authentication method. User groups are aggregated across both. The user name must be exactly the same for both authentication methods, but they can require different passwords.
	* </pre>
	*/
	public Boolean get_secondary() throws Exception {
		return this.secondary;
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
		vpnvserver_authenticationsamlpolicy_binding_response result = (vpnvserver_authenticationsamlpolicy_binding_response) service.get_payload_formatter().string_to_resource(vpnvserver_authenticationsamlpolicy_binding_response.class, response);
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
		return result.vpnvserver_authenticationsamlpolicy_binding;
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
	* Use this API to fetch vpnvserver_authenticationsamlpolicy_binding resources of given name .
	*/
	public static vpnvserver_authenticationsamlpolicy_binding[] get(nitro_service service, String name) throws Exception{
		vpnvserver_authenticationsamlpolicy_binding obj = new vpnvserver_authenticationsamlpolicy_binding();
		obj.set_name(name);
		vpnvserver_authenticationsamlpolicy_binding response[] = (vpnvserver_authenticationsamlpolicy_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vpnvserver_authenticationsamlpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static vpnvserver_authenticationsamlpolicy_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		vpnvserver_authenticationsamlpolicy_binding obj = new vpnvserver_authenticationsamlpolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		vpnvserver_authenticationsamlpolicy_binding[] response = (vpnvserver_authenticationsamlpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vpnvserver_authenticationsamlpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static vpnvserver_authenticationsamlpolicy_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		vpnvserver_authenticationsamlpolicy_binding obj = new vpnvserver_authenticationsamlpolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		vpnvserver_authenticationsamlpolicy_binding[] response = (vpnvserver_authenticationsamlpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count vpnvserver_authenticationsamlpolicy_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		vpnvserver_authenticationsamlpolicy_binding obj = new vpnvserver_authenticationsamlpolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		vpnvserver_authenticationsamlpolicy_binding response[] = (vpnvserver_authenticationsamlpolicy_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vpnvserver_authenticationsamlpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		vpnvserver_authenticationsamlpolicy_binding obj = new vpnvserver_authenticationsamlpolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpnvserver_authenticationsamlpolicy_binding[] response = (vpnvserver_authenticationsamlpolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vpnvserver_authenticationsamlpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		vpnvserver_authenticationsamlpolicy_binding obj = new vpnvserver_authenticationsamlpolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpnvserver_authenticationsamlpolicy_binding[] response = (vpnvserver_authenticationsamlpolicy_binding[]) obj.getfiltered(service, option);
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