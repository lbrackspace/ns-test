/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.audit;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class auditmessages_response extends base_response
{
	public auditmessages[] auditmessages;
}
/**
* Configuration for audit message resource.
*/

public class auditmessages extends base_resource
{
	private String[] loglevel;
	private Long numofmesgs;

	//------- Read only Parameter ---------;

	private String value;
	private Long __count;

	/**
	* <pre>
	* The log level filter.<br> Possible values = ALL, EMERGENCY, ALERT, CRITICAL, ERROR, WARNING, NOTICE, INFORMATIONAL, DEBUG, NONE
	* </pre>
	*/
	public void set_loglevel(String[] loglevel) throws Exception{
		this.loglevel = loglevel;
	}

	/**
	* <pre>
	* The log level filter.<br> Possible values = ALL, EMERGENCY, ALERT, CRITICAL, ERROR, WARNING, NOTICE, INFORMATIONAL, DEBUG, NONE
	* </pre>
	*/
	public String[] get_loglevel() throws Exception {
		return this.loglevel;
	}

	/**
	* <pre>
	* The number of log messages to be printed.<br> Default value: 20<br> Minimum value =  1<br> Maximum value =  256
	* </pre>
	*/
	public void set_numofmesgs(long numofmesgs) throws Exception {
		this.numofmesgs = new Long(numofmesgs);
	}

	/**
	* <pre>
	* The number of log messages to be printed.<br> Default value: 20<br> Minimum value =  1<br> Maximum value =  256
	* </pre>
	*/
	public void set_numofmesgs(Long numofmesgs) throws Exception{
		this.numofmesgs = numofmesgs;
	}

	/**
	* <pre>
	* The number of log messages to be printed.<br> Default value: 20<br> Minimum value =  1<br> Maximum value =  256
	* </pre>
	*/
	public Long get_numofmesgs() throws Exception {
		return this.numofmesgs;
	}

	/**
	* <pre>
	* The Audit message.
	* </pre>
	*/
	public String get_value() throws Exception {
		return this.value;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		auditmessages_response result = (auditmessages_response) service.get_payload_formatter().string_to_resource(auditmessages_response.class, response);
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
		return result.auditmessages;
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
	* Use this API to fetch all the auditmessages resources that are configured on netscaler.
	*/
	public static auditmessages[] get(nitro_service service) throws Exception{
		auditmessages obj = new auditmessages();
		auditmessages[] response = (auditmessages[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the auditmessages resources that are configured on netscaler.
	*/
	public static auditmessages[] get(nitro_service service, options option) throws Exception{
		auditmessages obj = new auditmessages();
		auditmessages[] response = (auditmessages[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch all the auditmessages resources that are configured on netscaler.
	* This uses auditmessages_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static auditmessages[] get(nitro_service service, auditmessages_args args) throws Exception{
		auditmessages obj = new auditmessages();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		auditmessages[] response = (auditmessages[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of auditmessages resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static auditmessages[] get_filtered(nitro_service service, String filter) throws Exception{
		auditmessages obj = new auditmessages();
		options option = new options();
		option.set_filter(filter);
		auditmessages[] response = (auditmessages[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of auditmessages resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static auditmessages[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		auditmessages obj = new auditmessages();
		options option = new options();
		option.set_filter(filter);
		auditmessages[] response = (auditmessages[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the auditmessages resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		auditmessages obj = new auditmessages();
		options option = new options();
		option.set_count(true);
		auditmessages[] response = (auditmessages[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of auditmessages resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		auditmessages obj = new auditmessages();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		auditmessages[] response = (auditmessages[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of auditmessages resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		auditmessages obj = new auditmessages();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		auditmessages[] response = (auditmessages[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class loglevelEnum {
		public static final String ALL = "ALL";
		public static final String EMERGENCY = "EMERGENCY";
		public static final String ALERT = "ALERT";
		public static final String CRITICAL = "CRITICAL";
		public static final String ERROR = "ERROR";
		public static final String WARNING = "WARNING";
		public static final String NOTICE = "NOTICE";
		public static final String INFORMATIONAL = "INFORMATIONAL";
		public static final String DEBUG = "DEBUG";
		public static final String NONE = "NONE";
	}
}
