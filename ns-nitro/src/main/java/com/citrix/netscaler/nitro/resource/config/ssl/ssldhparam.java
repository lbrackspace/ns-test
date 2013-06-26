/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.ssl;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class ssldhparam_response extends base_response
{
	public ssldhparam ssldhparam;
}
/**
* Configuration for dh Parameter resource.
*/

public class ssldhparam extends base_resource
{
	private String dhfile;
	private Long bits;
	private String gen;

	/**
	* <pre>
	* The name of the output file where the generated DH parameter is stored.<br> Maximum length =  63
	* </pre>
	*/
	public void set_dhfile(String dhfile) throws Exception{
		this.dhfile = dhfile;
	}

	/**
	* <pre>
	* The name of the output file where the generated DH parameter is stored.<br> Maximum length =  63
	* </pre>
	*/
	public String get_dhfile() throws Exception {
		return this.dhfile;
	}

	/**
	* <pre>
	* The bit value for the DH parameters.Maximum bit value allowed is 2048.<br> Minimum value =  512<br> Maximum value =  2048
	* </pre>
	*/
	public void set_bits(long bits) throws Exception {
		this.bits = new Long(bits);
	}

	/**
	* <pre>
	* The bit value for the DH parameters.Maximum bit value allowed is 2048.<br> Minimum value =  512<br> Maximum value =  2048
	* </pre>
	*/
	public void set_bits(Long bits) throws Exception{
		this.bits = bits;
	}

	/**
	* <pre>
	* The bit value for the DH parameters.Maximum bit value allowed is 2048.<br> Minimum value =  512<br> Maximum value =  2048
	* </pre>
	*/
	public Long get_bits() throws Exception {
		return this.bits;
	}

	/**
	* <pre>
	* The DH generator value (g) to be used.<br> Default value: 2<br> Possible values = 2, 5
	* </pre>
	*/
	public void set_gen(String gen) throws Exception{
		this.gen = gen;
	}

	/**
	* <pre>
	* The DH generator value (g) to be used.<br> Default value: 2<br> Possible values = 2, 5
	* </pre>
	*/
	public String get_gen() throws Exception {
		return this.gen;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		ssldhparam[] resources = new ssldhparam[1];
		ssldhparam_response result = (ssldhparam_response) service.get_payload_formatter().string_to_resource(ssldhparam_response.class, response);
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
		resources[0] = result.ssldhparam;
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
	* Use this API to create ssldhparam.
	*/
	public static base_response create(nitro_service client, ssldhparam resource) throws Exception {
		ssldhparam createresource = new ssldhparam();
		createresource.dhfile = resource.dhfile;
		createresource.bits = resource.bits;
		createresource.gen = resource.gen;
		return createresource.perform_operation(client,"create");
	}

	public static class genEnum {
		public static final String _2 = "2";
		public static final String _5 = "5";
	}
}
