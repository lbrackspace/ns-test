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

package com.citrix.netscaler.nitro.resource.config.rewrite;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class rewriteparam_response extends base_response
{
	public rewriteparam rewriteparam;
}
/**
* Configuration for rewrite parameter resource.
*/

public class rewriteparam extends base_resource
{
	private String undefaction;

	/**
	* <pre>
	* Action to perform if the result of policy evaluation is undefined (UNDEF). An UNDEF event indicates an internal error condition.
Available settings function as follows:
* NOOP - Send the request to the protected server instead of responding to it.
* RESET - Reset the request and notify the users browser, so that the user can resend the request.
* DROP - Drop the request without sending a response to the user.<br> Default value: "NOREWRITE"
	* </pre>
	*/
	public void set_undefaction(String undefaction) throws Exception{
		this.undefaction = undefaction;
	}

	/**
	* <pre>
	* Action to perform if the result of policy evaluation is undefined (UNDEF). An UNDEF event indicates an internal error condition.
Available settings function as follows:
* NOOP - Send the request to the protected server instead of responding to it.
* RESET - Reset the request and notify the users browser, so that the user can resend the request.
* DROP - Drop the request without sending a response to the user.<br> Default value: "NOREWRITE"
	* </pre>
	*/
	public String get_undefaction() throws Exception {
		return this.undefaction;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		rewriteparam[] resources = new rewriteparam[1];
		rewriteparam_response result = (rewriteparam_response) service.get_payload_formatter().string_to_resource(rewriteparam_response.class, response);
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
		resources[0] = result.rewriteparam;
		return resources;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return null;
	}

	/**
	* Use this API to update rewriteparam.
	*/
	public static base_response update(nitro_service client, rewriteparam resource) throws Exception {
		rewriteparam updateresource = new rewriteparam();
		updateresource.undefaction = resource.undefaction;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of rewriteparam resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, rewriteparam resource, String[] args) throws Exception{
		rewriteparam unsetresource = new rewriteparam();
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the rewriteparam resources that are configured on netscaler.
	*/
	public static rewriteparam get(nitro_service service) throws Exception{
		rewriteparam obj = new rewriteparam();
		rewriteparam[] response = (rewriteparam[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the rewriteparam resources that are configured on netscaler.
	*/
	public static rewriteparam get(nitro_service service,  options option) throws Exception{
		rewriteparam obj = new rewriteparam();
		rewriteparam[] response = (rewriteparam[])obj.get_resources(service,option);
		return response[0];
	}

}
