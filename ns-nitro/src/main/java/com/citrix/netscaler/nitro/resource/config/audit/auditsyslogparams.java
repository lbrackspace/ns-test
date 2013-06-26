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

class auditsyslogparams_response extends base_response
{
	public auditsyslogparams auditsyslogparams;
}
/**
* Configuration for system log parameters resource.
*/

public class auditsyslogparams extends base_resource
{
	private String serverip;
	private Integer serverport;
	private String dateformat;
	private String[] loglevel;
	private String logfacility;
	private String tcp;
	private String acl;
	private String timezone;
	private String userdefinedauditlog;
	private String appflowexport;

	//------- Read only Parameter ---------;

	private String name;
	private String[] builtin;

	/**
	* <pre>
	* The IP address of the syslog server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_serverip(String serverip) throws Exception{
		this.serverip = serverip;
	}

	/**
	* <pre>
	* The IP address of the syslog server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_serverip() throws Exception {
		return this.serverip;
	}

	/**
	* <pre>
	* The port on which the syslog server is running.<br> Minimum value =  1
	* </pre>
	*/
	public void set_serverport(int serverport) throws Exception {
		this.serverport = new Integer(serverport);
	}

	/**
	* <pre>
	* The port on which the syslog server is running.<br> Minimum value =  1
	* </pre>
	*/
	public void set_serverport(Integer serverport) throws Exception{
		this.serverport = serverport;
	}

	/**
	* <pre>
	* The port on which the syslog server is running.<br> Minimum value =  1
	* </pre>
	*/
	public Integer get_serverport() throws Exception {
		return this.serverport;
	}

	/**
	* <pre>
	* The date format.<br> Possible values = MMDDYYYY, DDMMYYYY
	* </pre>
	*/
	public void set_dateformat(String dateformat) throws Exception{
		this.dateformat = dateformat;
	}

	/**
	* <pre>
	* The date format.<br> Possible values = MMDDYYYY, DDMMYYYY
	* </pre>
	*/
	public String get_dateformat() throws Exception {
		return this.dateformat;
	}

	/**
	* <pre>
	* The audit log level for which messages should be logged.<br> Possible values = ALL, EMERGENCY, ALERT, CRITICAL, ERROR, WARNING, NOTICE, INFORMATIONAL, DEBUG, NONE
	* </pre>
	*/
	public void set_loglevel(String[] loglevel) throws Exception{
		this.loglevel = loglevel;
	}

	/**
	* <pre>
	* The audit log level for which messages should be logged.<br> Possible values = ALL, EMERGENCY, ALERT, CRITICAL, ERROR, WARNING, NOTICE, INFORMATIONAL, DEBUG, NONE
	* </pre>
	*/
	public String[] get_loglevel() throws Exception {
		return this.loglevel;
	}

	/**
	* <pre>
	* The log facility (RFC 3164).<br> Possible values = LOCAL0, LOCAL1, LOCAL2, LOCAL3, LOCAL4, LOCAL5, LOCAL6, LOCAL7
	* </pre>
	*/
	public void set_logfacility(String logfacility) throws Exception{
		this.logfacility = logfacility;
	}

	/**
	* <pre>
	* The log facility (RFC 3164).<br> Possible values = LOCAL0, LOCAL1, LOCAL2, LOCAL3, LOCAL4, LOCAL5, LOCAL6, LOCAL7
	* </pre>
	*/
	public String get_logfacility() throws Exception {
		return this.logfacility;
	}

	/**
	* <pre>
	* Log the tcp messages.<br> Possible values = NONE, ALL
	* </pre>
	*/
	public void set_tcp(String tcp) throws Exception{
		this.tcp = tcp;
	}

	/**
	* <pre>
	* Log the tcp messages.<br> Possible values = NONE, ALL
	* </pre>
	*/
	public String get_tcp() throws Exception {
		return this.tcp;
	}

	/**
	* <pre>
	* Log the acl messages.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_acl(String acl) throws Exception{
		this.acl = acl;
	}

	/**
	* <pre>
	* Log the acl messages.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_acl() throws Exception {
		return this.acl;
	}

	/**
	* <pre>
	* Specifies the timezone in which the timestmps in the log messages will be generated.<br> Possible values = GMT_TIME, LOCAL_TIME
	* </pre>
	*/
	public void set_timezone(String timezone) throws Exception{
		this.timezone = timezone;
	}

	/**
	* <pre>
	* Specifies the timezone in which the timestmps in the log messages will be generated.<br> Possible values = GMT_TIME, LOCAL_TIME
	* </pre>
	*/
	public String get_timezone() throws Exception {
		return this.timezone;
	}

	/**
	* <pre>
	* Specifies whether the user configurable log messages should be done or not.<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_userdefinedauditlog(String userdefinedauditlog) throws Exception{
		this.userdefinedauditlog = userdefinedauditlog;
	}

	/**
	* <pre>
	* Specifies whether the user configurable log messages should be done or not.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_userdefinedauditlog() throws Exception {
		return this.userdefinedauditlog;
	}

	/**
	* <pre>
	* Control export of log messages to AppFlow collectors.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_appflowexport(String appflowexport) throws Exception{
		this.appflowexport = appflowexport;
	}

	/**
	* <pre>
	* Control export of log messages to AppFlow collectors.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_appflowexport() throws Exception {
		return this.appflowexport;
	}

	/**
	* <pre>
	* Name.
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
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
		auditsyslogparams[] resources = new auditsyslogparams[1];
		auditsyslogparams_response result = (auditsyslogparams_response) service.get_payload_formatter().string_to_resource(auditsyslogparams_response.class, response);
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
		resources[0] = result.auditsyslogparams;
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
	* Use this API to update auditsyslogparams.
	*/
	public static base_response update(nitro_service client, auditsyslogparams resource) throws Exception {
		auditsyslogparams updateresource = new auditsyslogparams();
		updateresource.serverip = resource.serverip;
		updateresource.serverport = resource.serverport;
		updateresource.dateformat = resource.dateformat;
		updateresource.loglevel = resource.loglevel;
		updateresource.logfacility = resource.logfacility;
		updateresource.tcp = resource.tcp;
		updateresource.acl = resource.acl;
		updateresource.timezone = resource.timezone;
		updateresource.userdefinedauditlog = resource.userdefinedauditlog;
		updateresource.appflowexport = resource.appflowexport;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of auditsyslogparams resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, auditsyslogparams resource, String[] args) throws Exception{
		auditsyslogparams unsetresource = new auditsyslogparams();
		unsetresource.serverip = resource.serverip;
		unsetresource.serverport = resource.serverport;
		unsetresource.loglevel = resource.loglevel;
		unsetresource.dateformat = resource.dateformat;
		unsetresource.logfacility = resource.logfacility;
		unsetresource.tcp = resource.tcp;
		unsetresource.acl = resource.acl;
		unsetresource.timezone = resource.timezone;
		unsetresource.userdefinedauditlog = resource.userdefinedauditlog;
		unsetresource.appflowexport = resource.appflowexport;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the auditsyslogparams resources that are configured on netscaler.
	*/
	public static auditsyslogparams get(nitro_service service) throws Exception{
		auditsyslogparams obj = new auditsyslogparams();
		auditsyslogparams[] response = (auditsyslogparams[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the auditsyslogparams resources that are configured on netscaler.
	*/
	public static auditsyslogparams get(nitro_service service,  options option) throws Exception{
		auditsyslogparams obj = new auditsyslogparams();
		auditsyslogparams[] response = (auditsyslogparams[])obj.get_resources(service,option);
		return response[0];
	}

	public static class userdefinedauditlogEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class builtinEnum {
		public static final String MODIFIABLE = "MODIFIABLE";
		public static final String DELETABLE = "DELETABLE";
		public static final String IMMUTABLE = "IMMUTABLE";
	}
	public static class timezoneEnum {
		public static final String GMT_TIME = "GMT_TIME";
		public static final String LOCAL_TIME = "LOCAL_TIME";
	}
	public static class dateformatEnum {
		public static final String MMDDYYYY = "MMDDYYYY";
		public static final String DDMMYYYY = "DDMMYYYY";
	}
	public static class aclEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class logfacilityEnum {
		public static final String LOCAL0 = "LOCAL0";
		public static final String LOCAL1 = "LOCAL1";
		public static final String LOCAL2 = "LOCAL2";
		public static final String LOCAL3 = "LOCAL3";
		public static final String LOCAL4 = "LOCAL4";
		public static final String LOCAL5 = "LOCAL5";
		public static final String LOCAL6 = "LOCAL6";
		public static final String LOCAL7 = "LOCAL7";
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
	public static class tcpEnum {
		public static final String NONE = "NONE";
		public static final String ALL = "ALL";
	}
	public static class appflowexportEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
