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

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class aaaparameter_response extends base_response
{
	public aaaparameter aaaparameter;
}
/**
* Configuration for AAA parameter resource.
*/

public class aaaparameter extends base_resource
{
	private String enablestaticpagecaching;
	private String enableenhancedauthfeedback;
	private String defaultauthtype;
	private Long maxaaausers;
	private Long maxloginattempts;
	private Long failedlogintimeout;
	private String aaadnatip;

	/**
	* <pre>
	* The default state of VPN Static Page caching. If nothing is specified, the default value is set to ON.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_enablestaticpagecaching(String enablestaticpagecaching) throws Exception{
		this.enablestaticpagecaching = enablestaticpagecaching;
	}

	/**
	* <pre>
	* The default state of VPN Static Page caching. If nothing is specified, the default value is set to ON.<br> Default value: YES<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_enablestaticpagecaching() throws Exception {
		return this.enablestaticpagecaching;
	}

	/**
	* <pre>
	* Enhanced auth feedback provides more information to the end user about the reason for an authentication failure.  The default value is set to ON.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_enableenhancedauthfeedback(String enableenhancedauthfeedback) throws Exception{
		this.enableenhancedauthfeedback = enableenhancedauthfeedback;
	}

	/**
	* <pre>
	* Enhanced auth feedback provides more information to the end user about the reason for an authentication failure.  The default value is set to ON.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_enableenhancedauthfeedback() throws Exception {
		return this.enableenhancedauthfeedback;
	}

	/**
	* <pre>
	* The default authentication server type.<br> Default value: LOCAL<br> Possible values = LOCAL, LDAP, RADIUS, TACACS, CERT
	* </pre>
	*/
	public void set_defaultauthtype(String defaultauthtype) throws Exception{
		this.defaultauthtype = defaultauthtype;
	}

	/**
	* <pre>
	* The default authentication server type.<br> Default value: LOCAL<br> Possible values = LOCAL, LDAP, RADIUS, TACACS, CERT
	* </pre>
	*/
	public String get_defaultauthtype() throws Exception {
		return this.defaultauthtype;
	}

	/**
	* <pre>
	* Maximum number of concurrent users allowed to log on to VPN simultaneously.<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public void set_maxaaausers(long maxaaausers) throws Exception {
		this.maxaaausers = new Long(maxaaausers);
	}

	/**
	* <pre>
	* Maximum number of concurrent users allowed to log on to VPN simultaneously.<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public void set_maxaaausers(Long maxaaausers) throws Exception{
		this.maxaaausers = maxaaausers;
	}

	/**
	* <pre>
	* Maximum number of concurrent users allowed to log on to VPN simultaneously.<br> Minimum value =  1<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_maxaaausers() throws Exception {
		return this.maxaaausers;
	}

	/**
	* <pre>
	* Maximum Number of login Attempts.<br> Minimum value =  1
	* </pre>
	*/
	public void set_maxloginattempts(long maxloginattempts) throws Exception {
		this.maxloginattempts = new Long(maxloginattempts);
	}

	/**
	* <pre>
	* Maximum Number of login Attempts.<br> Minimum value =  1
	* </pre>
	*/
	public void set_maxloginattempts(Long maxloginattempts) throws Exception{
		this.maxloginattempts = maxloginattempts;
	}

	/**
	* <pre>
	* Maximum Number of login Attempts.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_maxloginattempts() throws Exception {
		return this.maxloginattempts;
	}

	/**
	* <pre>
	* Failed Login timeout.<br> Minimum value =  1
	* </pre>
	*/
	public void set_failedlogintimeout(long failedlogintimeout) throws Exception {
		this.failedlogintimeout = new Long(failedlogintimeout);
	}

	/**
	* <pre>
	* Failed Login timeout.<br> Minimum value =  1
	* </pre>
	*/
	public void set_failedlogintimeout(Long failedlogintimeout) throws Exception{
		this.failedlogintimeout = failedlogintimeout;
	}

	/**
	* <pre>
	* Failed Login timeout.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_failedlogintimeout() throws Exception {
		return this.failedlogintimeout;
	}

	/**
	* <pre>
	* Source IP address to use for traffic that is sent to the authentication server.
	* </pre>
	*/
	public void set_aaadnatip(String aaadnatip) throws Exception{
		this.aaadnatip = aaadnatip;
	}

	/**
	* <pre>
	* Source IP address to use for traffic that is sent to the authentication server.
	* </pre>
	*/
	public String get_aaadnatip() throws Exception {
		return this.aaadnatip;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		aaaparameter[] resources = new aaaparameter[1];
		aaaparameter_response result = (aaaparameter_response) service.get_payload_formatter().string_to_resource(aaaparameter_response.class, response);
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
		resources[0] = result.aaaparameter;
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
	* Use this API to update aaaparameter.
	*/
	public static base_response update(nitro_service client, aaaparameter resource) throws Exception {
		aaaparameter updateresource = new aaaparameter();
		updateresource.enablestaticpagecaching = resource.enablestaticpagecaching;
		updateresource.enableenhancedauthfeedback = resource.enableenhancedauthfeedback;
		updateresource.defaultauthtype = resource.defaultauthtype;
		updateresource.maxaaausers = resource.maxaaausers;
		updateresource.maxloginattempts = resource.maxloginattempts;
		updateresource.failedlogintimeout = resource.failedlogintimeout;
		updateresource.aaadnatip = resource.aaadnatip;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of aaaparameter resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, aaaparameter resource, String[] args) throws Exception{
		aaaparameter unsetresource = new aaaparameter();
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the aaaparameter resources that are configured on netscaler.
	*/
	public static aaaparameter get(nitro_service service) throws Exception{
		aaaparameter obj = new aaaparameter();
		aaaparameter[] response = (aaaparameter[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the aaaparameter resources that are configured on netscaler.
	*/
	public static aaaparameter get(nitro_service service,  options option) throws Exception{
		aaaparameter obj = new aaaparameter();
		aaaparameter[] response = (aaaparameter[])obj.get_resources(service,option);
		return response[0];
	}

	public static class defaultauthtypeEnum {
		public static final String LOCAL = "LOCAL";
		public static final String LDAP = "LDAP";
		public static final String RADIUS = "RADIUS";
		public static final String TACACS = "TACACS";
		public static final String CERT = "CERT";
	}
	public static class enableenhancedauthfeedbackEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class enablestaticpagecachingEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
}
