/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.basic;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class locationparameter_response extends base_response
{
	public locationparameter locationparameter;
}
/**
* Configuration for location parameter resource.
*/

public class locationparameter extends base_resource
{
	private String context;
	private String q1label;
	private String q2label;
	private String q3label;
	private String q4label;
	private String q5label;
	private String q6label;

	//------- Read only Parameter ---------;

	private String Locationfile;
	private String format;
	private Long custom;
	private Long Static;
	private Long lines;
	private Long errors;
	private Long warnings;
	private Long entries;
	private Long flags;
	private Long status;

	/**
	* <pre>
	* The context in which a static proximity decision has to be made.<br> Possible values = geographic, custom
	* </pre>
	*/
	public void set_context(String context) throws Exception{
		this.context = context;
	}

	/**
	* <pre>
	* The context in which a static proximity decision has to be made.<br> Possible values = geographic, custom
	* </pre>
	*/
	public String get_context() throws Exception {
		return this.context;
	}

	/**
	* <pre>
	* The label for the 1st qualifier. These qualifier labels specify the locations mapped with the IP addresses used to make static proximity decisions.<br> Minimum length =  1
	* </pre>
	*/
	public void set_q1label(String q1label) throws Exception{
		this.q1label = q1label;
	}

	/**
	* <pre>
	* The label for the 1st qualifier. These qualifier labels specify the locations mapped with the IP addresses used to make static proximity decisions.<br> Minimum length =  1
	* </pre>
	*/
	public String get_q1label() throws Exception {
		return this.q1label;
	}

	/**
	* <pre>
	* The label for the 2nd qualifier. These qualifier labels characterize the locations mapped with the IP addresses used to make static proximity decisions.<br> Minimum length =  1
	* </pre>
	*/
	public void set_q2label(String q2label) throws Exception{
		this.q2label = q2label;
	}

	/**
	* <pre>
	* The label for the 2nd qualifier. These qualifier labels characterize the locations mapped with the IP addresses used to make static proximity decisions.<br> Minimum length =  1
	* </pre>
	*/
	public String get_q2label() throws Exception {
		return this.q2label;
	}

	/**
	* <pre>
	* The label for the 3rd qualifier. These qualifier labels characterize the locations mapped with the IP addresses used to make static proximity decisions.<br> Minimum length =  1
	* </pre>
	*/
	public void set_q3label(String q3label) throws Exception{
		this.q3label = q3label;
	}

	/**
	* <pre>
	* The label for the 3rd qualifier. These qualifier labels characterize the locations mapped with the IP addresses used to make static proximity decisions.<br> Minimum length =  1
	* </pre>
	*/
	public String get_q3label() throws Exception {
		return this.q3label;
	}

	/**
	* <pre>
	* The label for the 4th qualifier. These qualifier labels characterize the locations mapped with the IP addresses used to make static proximity decisions.<br> Minimum length =  1
	* </pre>
	*/
	public void set_q4label(String q4label) throws Exception{
		this.q4label = q4label;
	}

	/**
	* <pre>
	* The label for the 4th qualifier. These qualifier labels characterize the locations mapped with the IP addresses used to make static proximity decisions.<br> Minimum length =  1
	* </pre>
	*/
	public String get_q4label() throws Exception {
		return this.q4label;
	}

	/**
	* <pre>
	* The label for the 5th qualifier. These qualifier labels characterize the locations mapped with the IP addresses used to make static proximity decisions.<br> Minimum length =  1
	* </pre>
	*/
	public void set_q5label(String q5label) throws Exception{
		this.q5label = q5label;
	}

	/**
	* <pre>
	* The label for the 5th qualifier. These qualifier labels characterize the locations mapped with the IP addresses used to make static proximity decisions.<br> Minimum length =  1
	* </pre>
	*/
	public String get_q5label() throws Exception {
		return this.q5label;
	}

	/**
	* <pre>
	* The label for the 6th qualifier. These qualifier labels characterize the locations mapped with the IP addresses used to make static proximity decisions.<br> Minimum length =  1
	* </pre>
	*/
	public void set_q6label(String q6label) throws Exception{
		this.q6label = q6label;
	}

	/**
	* <pre>
	* The label for the 6th qualifier. These qualifier labels characterize the locations mapped with the IP addresses used to make static proximity decisions.<br> Minimum length =  1
	* </pre>
	*/
	public String get_q6label() throws Exception {
		return this.q6label;
	}

	/**
	* <pre>
	* Currently loaded location database file.
	* </pre>
	*/
	public String get_Locationfile() throws Exception {
		return this.Locationfile;
	}

	/**
	* <pre>
	* .<br> Possible values = netscaler, ip-country, ip-country-isp, ip-country-region-city, ip-country-region-city-isp, geoip-country, geoip-region, geoip-city, geoip-country-org, geoip-country-isp, geoip-city-isp-org
	* </pre>
	*/
	public String get_format() throws Exception {
		return this.format;
	}

	/**
	* <pre>
	* Number of configured custom locations.
	* </pre>
	*/
	public Long get_custom() throws Exception {
		return this.custom;
	}

	/**
	* <pre>
	* Number of configured locations in the database file (static locations).
	* </pre>
	*/
	public Long get_Static() throws Exception {
		return this.Static;
	}

	/**
	* <pre>
	* Number of lines in the databse files.
	* </pre>
	*/
	public Long get_lines() throws Exception {
		return this.lines;
	}

	/**
	* <pre>
	* Number of errros encountered while reading the database file.
	* </pre>
	*/
	public Long get_errors() throws Exception {
		return this.errors;
	}

	/**
	* <pre>
	* Number of warnings encountered while reading the database file.
	* </pre>
	*/
	public Long get_warnings() throws Exception {
		return this.warnings;
	}

	/**
	* <pre>
	* Number of successfully added entries.
	* </pre>
	*/
	public Long get_entries() throws Exception {
		return this.entries;
	}

	/**
	* <pre>
	* Information needed for display. This argument passes information from the kernel to the user space.
	* </pre>
	*/
	public Long get_flags() throws Exception {
		return this.flags;
	}

	/**
	* <pre>
	* This argument displays when the status (success or failure) of database loading.
	* </pre>
	*/
	public Long get_status() throws Exception {
		return this.status;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		locationparameter[] resources = new locationparameter[1];
		locationparameter_response result = (locationparameter_response) service.get_payload_formatter().string_to_resource(locationparameter_response.class, response);
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
		resources[0] = result.locationparameter;
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
	* Use this API to update locationparameter.
	*/
	public static base_response update(nitro_service client, locationparameter resource) throws Exception {
		locationparameter updateresource = new locationparameter();
		updateresource.context = resource.context;
		updateresource.q1label = resource.q1label;
		updateresource.q2label = resource.q2label;
		updateresource.q3label = resource.q3label;
		updateresource.q4label = resource.q4label;
		updateresource.q5label = resource.q5label;
		updateresource.q6label = resource.q6label;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of locationparameter resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, locationparameter resource, String[] args) throws Exception{
		locationparameter unsetresource = new locationparameter();
		unsetresource.context = resource.context;
		unsetresource.q1label = resource.q1label;
		unsetresource.q2label = resource.q2label;
		unsetresource.q3label = resource.q3label;
		unsetresource.q4label = resource.q4label;
		unsetresource.q5label = resource.q5label;
		unsetresource.q6label = resource.q6label;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the locationparameter resources that are configured on netscaler.
	*/
	public static locationparameter get(nitro_service service) throws Exception{
		locationparameter obj = new locationparameter();
		locationparameter[] response = (locationparameter[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the locationparameter resources that are configured on netscaler.
	*/
	public static locationparameter get(nitro_service service,  options option) throws Exception{
		locationparameter obj = new locationparameter();
		locationparameter[] response = (locationparameter[])obj.get_resources(service,option);
		return response[0];
	}

	public static class formatEnum {
		public static final String netscaler = "netscaler";
		public static final String ip_country = "ip-country";
		public static final String ip_country_isp = "ip-country-isp";
		public static final String ip_country_region_city = "ip-country-region-city";
		public static final String ip_country_region_city_isp = "ip-country-region-city-isp";
		public static final String geoip_country = "geoip-country";
		public static final String geoip_region = "geoip-region";
		public static final String geoip_city = "geoip-city";
		public static final String geoip_country_org = "geoip-country-org";
		public static final String geoip_country_isp = "geoip-country-isp";
		public static final String geoip_city_isp_org = "geoip-city-isp-org";
	}
	public static class contextEnum {
		public static final String geographic = "geographic";
		public static final String custom = "custom";
	}
}
