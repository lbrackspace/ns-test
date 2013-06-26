/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.aaa;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class aaapreauthenticationparameter_response extends base_response
{
	public aaapreauthenticationparameter aaapreauthenticationparameter;
}
/**
* Configuration for pre authentication parameter resource.
*/

public class aaapreauthenticationparameter extends base_resource
{
	private String preauthenticationaction;
	private String rule;
	private String killprocess;
	private String deletefiles;

	//------- Read only Parameter ---------;

	private String[] builtin;

	/**
	* <pre>
	* Deny or allow login after end point analysis results.<br> Possible values = ALLOW, DENY
	* </pre>
	*/
	public void set_preauthenticationaction(String preauthenticationaction) throws Exception{
		this.preauthenticationaction = preauthenticationaction;
	}

	/**
	* <pre>
	* Deny or allow login after end point analysis results.<br> Possible values = ALLOW, DENY
	* </pre>
	*/
	public String get_preauthenticationaction() throws Exception {
		return this.preauthenticationaction;
	}

	/**
	* <pre>
	* The name of the rule, or expression, to be evaluated by the EPA tool.
	* </pre>
	*/
	public void set_rule(String rule) throws Exception{
		this.rule = rule;
	}

	/**
	* <pre>
	* The name of the rule, or expression, to be evaluated by the EPA tool.
	* </pre>
	*/
	public String get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* Processes to be killed by the EPA tool.
	* </pre>
	*/
	public void set_killprocess(String killprocess) throws Exception{
		this.killprocess = killprocess;
	}

	/**
	* <pre>
	* Processes to be killed by the EPA tool.
	* </pre>
	*/
	public String get_killprocess() throws Exception {
		return this.killprocess;
	}

	/**
	* <pre>
	* Files to be deleted by the EPA tool.
	* </pre>
	*/
	public void set_deletefiles(String deletefiles) throws Exception{
		this.deletefiles = deletefiles;
	}

	/**
	* <pre>
	* Files to be deleted by the EPA tool.
	* </pre>
	*/
	public String get_deletefiles() throws Exception {
		return this.deletefiles;
	}

	/**
	* <pre>
	* Indicates that a variable is a built-in (SYSTEM INTERNAL) type.<br> Possible values = MODIFIABLE, DELETABLE, IMMUTABLE
	* </pre>
	*/
	public String[] get_builtin() throws Exception {
		return this.builtin;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		aaapreauthenticationparameter[] resources = new aaapreauthenticationparameter[1];
		aaapreauthenticationparameter_response result = (aaapreauthenticationparameter_response) service.get_payload_formatter().string_to_resource(aaapreauthenticationparameter_response.class, response);
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
		resources[0] = result.aaapreauthenticationparameter;
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
	* Use this API to update aaapreauthenticationparameter.
	*/
	public static base_response update(nitro_service client, aaapreauthenticationparameter resource) throws Exception {
		aaapreauthenticationparameter updateresource = new aaapreauthenticationparameter();
		updateresource.preauthenticationaction = resource.preauthenticationaction;
		updateresource.rule = resource.rule;
		updateresource.killprocess = resource.killprocess;
		updateresource.deletefiles = resource.deletefiles;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of aaapreauthenticationparameter resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, aaapreauthenticationparameter resource, String[] args) throws Exception{
		aaapreauthenticationparameter unsetresource = new aaapreauthenticationparameter();
		unsetresource.rule = resource.rule;
		unsetresource.preauthenticationaction = resource.preauthenticationaction;
		unsetresource.killprocess = resource.killprocess;
		unsetresource.deletefiles = resource.deletefiles;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the aaapreauthenticationparameter resources that are configured on netscaler.
	*/
	public static aaapreauthenticationparameter get(nitro_service service) throws Exception{
		aaapreauthenticationparameter obj = new aaapreauthenticationparameter();
		aaapreauthenticationparameter[] response = (aaapreauthenticationparameter[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the aaapreauthenticationparameter resources that are configured on netscaler.
	*/
	public static aaapreauthenticationparameter get(nitro_service service,  options option) throws Exception{
		aaapreauthenticationparameter obj = new aaapreauthenticationparameter();
		aaapreauthenticationparameter[] response = (aaapreauthenticationparameter[])obj.get_resources(service,option);
		return response[0];
	}

	public static class builtinEnum {
		public static final String MODIFIABLE = "MODIFIABLE";
		public static final String DELETABLE = "DELETABLE";
		public static final String IMMUTABLE = "IMMUTABLE";
	}
	public static class preauthenticationactionEnum {
		public static final String ALLOW = "ALLOW";
		public static final String DENY = "DENY";
	}
}
