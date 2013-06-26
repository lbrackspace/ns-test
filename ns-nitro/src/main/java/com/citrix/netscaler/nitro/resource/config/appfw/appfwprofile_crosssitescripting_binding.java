/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.appfw;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class appfwprofile_crosssitescripting_binding_response extends base_response
{
	public appfwprofile_crosssitescripting_binding[] appfwprofile_crosssitescripting_binding;
}
/**
	* Binding class showing the crosssitescripting that can be bound to appfwprofile.
	*/

public class appfwprofile_crosssitescripting_binding extends base_resource
{
	private String crosssitescripting;
	private String isregex_xss;
	private String formactionurl_xss;
	private String as_scan_location_xss;
	private String state;
	private String comment;
	private String name;
	private Long __count;

	/**
	* <pre>
	* The web form field name.
	* </pre>
	*/
	public void set_crosssitescripting(String crosssitescripting) throws Exception{
		this.crosssitescripting = crosssitescripting;
	}

	/**
	* <pre>
	* The web form field name.
	* </pre>
	*/
	public String get_crosssitescripting() throws Exception {
		return this.crosssitescripting;
	}

	/**
	* <pre>
	* Application Firewall profile name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Application Firewall profile name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Is the web form field name a regular expression?.<br> Possible values = REGEX, NOTREGEX
	* </pre>
	*/
	public void set_isregex_xss(String isregex_xss) throws Exception{
		this.isregex_xss = isregex_xss;
	}

	/**
	* <pre>
	* Is the web form field name a regular expression?.<br> Possible values = REGEX, NOTREGEX
	* </pre>
	*/
	public String get_isregex_xss() throws Exception {
		return this.isregex_xss;
	}

	/**
	* <pre>
	* Enabled.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* Enabled.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* Comments associated with this profile.
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Comments associated with this profile.
	* </pre>
	*/
	public String get_comment() throws Exception {
		return this.comment;
	}

	/**
	* <pre>
	* The web form action URL.
	* </pre>
	*/
	public void set_formactionurl_xss(String formactionurl_xss) throws Exception{
		this.formactionurl_xss = formactionurl_xss;
	}

	/**
	* <pre>
	* The web form action URL.
	* </pre>
	*/
	public String get_formactionurl_xss() throws Exception {
		return this.formactionurl_xss;
	}

	/**
	* <pre>
	* Location of cross-site scripting exception - form field, header or cookie.<br> Possible values = FORMFIELD, HEADER, COOKIE
	* </pre>
	*/
	public void set_as_scan_location_xss(String as_scan_location_xss) throws Exception{
		this.as_scan_location_xss = as_scan_location_xss;
	}

	/**
	* <pre>
	* Location of cross-site scripting exception - form field, header or cookie.<br> Possible values = FORMFIELD, HEADER, COOKIE
	* </pre>
	*/
	public String get_as_scan_location_xss() throws Exception {
		return this.as_scan_location_xss;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		appfwprofile_crosssitescripting_binding_response result = (appfwprofile_crosssitescripting_binding_response) service.get_payload_formatter().string_to_resource(appfwprofile_crosssitescripting_binding_response.class, response);
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
		return result.appfwprofile_crosssitescripting_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	public static base_response add(nitro_service client, appfwprofile_crosssitescripting_binding resource) throws Exception {
		appfwprofile_crosssitescripting_binding updateresource = new appfwprofile_crosssitescripting_binding();
		updateresource.name = resource.name;
		updateresource.crosssitescripting = resource.crosssitescripting;
		updateresource.formactionurl_xss = resource.formactionurl_xss;
		updateresource.isregex_xss = resource.isregex_xss;
		updateresource.as_scan_location_xss = resource.as_scan_location_xss;
		updateresource.comment = resource.comment;
		updateresource.state = resource.state;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, appfwprofile_crosssitescripting_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwprofile_crosssitescripting_binding updateresources[] = new appfwprofile_crosssitescripting_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new appfwprofile_crosssitescripting_binding();
				updateresources[i].name = resources[i].name;
				updateresources[i].crosssitescripting = resources[i].crosssitescripting;
				updateresources[i].formactionurl_xss = resources[i].formactionurl_xss;
				updateresources[i].isregex_xss = resources[i].isregex_xss;
				updateresources[i].as_scan_location_xss = resources[i].as_scan_location_xss;
				updateresources[i].comment = resources[i].comment;
				updateresources[i].state = resources[i].state;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, appfwprofile_crosssitescripting_binding resource) throws Exception {
		appfwprofile_crosssitescripting_binding deleteresource = new appfwprofile_crosssitescripting_binding();
		deleteresource.name = resource.name;
		deleteresource.crosssitescripting = resource.crosssitescripting;
		deleteresource.formactionurl_xss = resource.formactionurl_xss;
		deleteresource.as_scan_location_xss = resource.as_scan_location_xss;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, appfwprofile_crosssitescripting_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appfwprofile_crosssitescripting_binding deleteresources[] = new appfwprofile_crosssitescripting_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new appfwprofile_crosssitescripting_binding();
				deleteresources[i].name = resources[i].name;
				deleteresources[i].crosssitescripting = resources[i].crosssitescripting;
				deleteresources[i].formactionurl_xss = resources[i].formactionurl_xss;
				deleteresources[i].as_scan_location_xss = resources[i].as_scan_location_xss;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch appfwprofile_crosssitescripting_binding resources of given name .
	*/
	public static appfwprofile_crosssitescripting_binding[] get(nitro_service service, String name) throws Exception{
		appfwprofile_crosssitescripting_binding obj = new appfwprofile_crosssitescripting_binding();
		obj.set_name(name);
		appfwprofile_crosssitescripting_binding response[] = (appfwprofile_crosssitescripting_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of appfwprofile_crosssitescripting_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static appfwprofile_crosssitescripting_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		appfwprofile_crosssitescripting_binding obj = new appfwprofile_crosssitescripting_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		appfwprofile_crosssitescripting_binding[] response = (appfwprofile_crosssitescripting_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of appfwprofile_crosssitescripting_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static appfwprofile_crosssitescripting_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		appfwprofile_crosssitescripting_binding obj = new appfwprofile_crosssitescripting_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		appfwprofile_crosssitescripting_binding[] response = (appfwprofile_crosssitescripting_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count appfwprofile_crosssitescripting_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		appfwprofile_crosssitescripting_binding obj = new appfwprofile_crosssitescripting_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		appfwprofile_crosssitescripting_binding response[] = (appfwprofile_crosssitescripting_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of appfwprofile_crosssitescripting_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		appfwprofile_crosssitescripting_binding obj = new appfwprofile_crosssitescripting_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appfwprofile_crosssitescripting_binding[] response = (appfwprofile_crosssitescripting_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of appfwprofile_crosssitescripting_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		appfwprofile_crosssitescripting_binding obj = new appfwprofile_crosssitescripting_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appfwprofile_crosssitescripting_binding[] response = (appfwprofile_crosssitescripting_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class as_scan_location_xmlsqlEnum {
		public static final String ELEMENT = "ELEMENT";
		public static final String ATTRIBUTE = "ATTRIBUTE";
	}
	public static class xmlmaxelementdepthcheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlmaxattachmentsizecheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlsoaparraycheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class xmlmaxelementnamelengthcheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class isregex_ffEnum {
		public static final String REGEX = "REGEX";
		public static final String NOTREGEX = "NOTREGEX";
	}
	public static class xmlmaxelementscheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlendpointcheckEnum {
		public static final String ABSOLUTE = "ABSOLUTE";
		public static final String RELATIVE = "RELATIVE";
	}
	public static class xmlmaxnamespacescheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlmaxfilesizecheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlmaxattributenamelengthcheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlblockdtdEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlblockpiEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class isregex_sqlEnum {
		public static final String REGEX = "REGEX";
		public static final String NOTREGEX = "NOTREGEX";
	}
	public static class xmlvalidateresponseEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlmaxelementchildrencheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class isregexEnum {
		public static final String REGEX = "REGEX";
		public static final String NOTREGEX = "NOTREGEX";
	}
	public static class xmlmaxentityexpansionscheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlmaxnamespaceurilengthcheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class as_scan_location_xssEnum {
		public static final String FORMFIELD = "FORMFIELD";
		public static final String HEADER = "HEADER";
		public static final String COOKIE = "COOKIE";
	}
	public static class xmlmaxentityexpansiondepthcheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class as_scan_location_xmlxssEnum {
		public static final String ELEMENT = "ELEMENT";
		public static final String ATTRIBUTE = "ATTRIBUTE";
	}
	public static class xmlmaxattributevaluelengthcheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class as_scan_location_sqlEnum {
		public static final String FORMFIELD = "FORMFIELD";
		public static final String HEADER = "HEADER";
		public static final String COOKIE = "COOKIE";
	}
	public static class isregex_ffcEnum {
		public static final String REGEX = "REGEX";
		public static final String NOTREGEX = "NOTREGEX";
	}
	public static class xmlattachmentcontenttypecheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class isregex_xmlsqlEnum {
		public static final String REGEX = "REGEX";
		public static final String NOTREGEX = "NOTREGEX";
	}
	public static class xmlvalidatesoapenvelopeEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlmaxchardatalengthcheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlminfilesizecheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class isregex_xssEnum {
		public static final String REGEX = "REGEX";
		public static final String NOTREGEX = "NOTREGEX";
	}
	public static class isregex_xmlxssEnum {
		public static final String REGEX = "REGEX";
		public static final String NOTREGEX = "NOTREGEX";
	}
	public static class xmladditionalsoapheadersEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class xmlmaxattributescheckEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class actionEnum {
		public static final String none = "none";
		public static final String block = "block";
		public static final String log = "log";
		public static final String remove = "remove";
		public static final String stats = "stats";
		public static final String xout = "xout";
	}
	public static class xmlblockexternalentitiesEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}

}