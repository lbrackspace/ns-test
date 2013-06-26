/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.cs;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class cspolicylabel_response extends base_response
{
	public cspolicylabel[] cspolicylabel;
}
/**
* Configuration for CS policy label resource.
*/

public class cspolicylabel extends base_resource
{
	private String labelname;
	private String cspolicylabeltype;

	//------- Read only Parameter ---------;

	private Long numpol;
	private Long hits;
	private String policyname;
	private Long priority;
	private String targetvserver;
	private String gotopriorityexpression;
	private String labeltype;
	private String invoke_labelname;
	private Long __count;

	/**
	* <pre>
	* Name of the content switching policy label.
	* </pre>
	*/
	public void set_labelname(String labelname) throws Exception{
		this.labelname = labelname;
	}

	/**
	* <pre>
	* Name of the content switching policy label.
	* </pre>
	*/
	public String get_labelname() throws Exception {
		return this.labelname;
	}

	/**
	* <pre>
	* The type of the policy label.<br> Possible values = HTTP, TCP, RTSP, SSL, SSL_TCP, UDP, DNS, SIP_UDP, ANY, RADIUS, RDP, MYSQL, MSSQL, DIAMETER, SSL_DIAMETER
	* </pre>
	*/
	public void set_cspolicylabeltype(String cspolicylabeltype) throws Exception{
		this.cspolicylabeltype = cspolicylabeltype;
	}

	/**
	* <pre>
	* The type of the policy label.<br> Possible values = HTTP, TCP, RTSP, SSL, SSL_TCP, UDP, DNS, SIP_UDP, ANY, RADIUS, RDP, MYSQL, MSSQL, DIAMETER, SSL_DIAMETER
	* </pre>
	*/
	public String get_cspolicylabeltype() throws Exception {
		return this.cspolicylabeltype;
	}

	/**
	* <pre>
	* number of polices bound to label.
	* </pre>
	*/
	public Long get_numpol() throws Exception {
		return this.numpol;
	}

	/**
	* <pre>
	* Number of times policy label was invoked.
	* </pre>
	*/
	public Long get_hits() throws Exception {
		return this.hits;
	}

	/**
	* <pre>
	* Name of the content switching policy.
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
	}

	/**
	* <pre>
	* Specifies the priority of the policy.
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* The virtual server name (created with the add lb vserver command) to which content will be switched.
	* </pre>
	*/
	public String get_targetvserver() throws Exception {
		return this.targetvserver;
	}

	/**
	* <pre>
	* Expression specifying the priority of the next policy which will get evaluated if the current policy rule evaluates to TRUE.
	* </pre>
	*/
	public String get_gotopriorityexpression() throws Exception {
		return this.gotopriorityexpression;
	}

	/**
	* <pre>
	* Type of policy label invocation.<br> Possible values = policylabel
	* </pre>
	*/
	public String get_labeltype() throws Exception {
		return this.labeltype;
	}

	/**
	* <pre>
	* Name of the label to invoke if the current policy rule evaluates to TRUE.
	* </pre>
	*/
	public String get_invoke_labelname() throws Exception {
		return this.invoke_labelname;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		cspolicylabel_response result = (cspolicylabel_response) service.get_payload_formatter().string_to_resource(cspolicylabel_response.class, response);
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
		return result.cspolicylabel;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.labelname;
	}

	/**
	* Use this API to add cspolicylabel.
	*/
	public static base_response add(nitro_service client, cspolicylabel resource) throws Exception {
		cspolicylabel addresource = new cspolicylabel();
		addresource.labelname = resource.labelname;
		addresource.cspolicylabeltype = resource.cspolicylabeltype;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add cspolicylabel resources.
	*/
	public static base_responses add(nitro_service client, cspolicylabel resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cspolicylabel addresources[] = new cspolicylabel[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new cspolicylabel();
				addresources[i].labelname = resources[i].labelname;
				addresources[i].cspolicylabeltype = resources[i].cspolicylabeltype;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete cspolicylabel of given name.
	*/
	public static base_response delete(nitro_service client, String labelname) throws Exception {
		cspolicylabel deleteresource = new cspolicylabel();
		deleteresource.labelname = labelname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete cspolicylabel.
	*/
	public static base_response delete(nitro_service client, cspolicylabel resource) throws Exception {
		cspolicylabel deleteresource = new cspolicylabel();
		deleteresource.labelname = resource.labelname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete cspolicylabel resources of given names.
	*/
	public static base_responses delete(nitro_service client, String labelname[]) throws Exception {
		base_responses result = null;
		if (labelname != null && labelname.length > 0) {
			cspolicylabel deleteresources[] = new cspolicylabel[labelname.length];
			for (int i=0;i<labelname.length;i++){
				deleteresources[i] = new cspolicylabel();
				deleteresources[i].labelname = labelname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete cspolicylabel resources.
	*/
	public static base_responses delete(nitro_service client, cspolicylabel resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cspolicylabel deleteresources[] = new cspolicylabel[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new cspolicylabel();
				deleteresources[i].labelname = resources[i].labelname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the cspolicylabel resources that are configured on netscaler.
	*/
	public static cspolicylabel[] get(nitro_service service) throws Exception{
		cspolicylabel obj = new cspolicylabel();
		cspolicylabel[] response = (cspolicylabel[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the cspolicylabel resources that are configured on netscaler.
	*/
	public static cspolicylabel[] get(nitro_service service, options option) throws Exception{
		cspolicylabel obj = new cspolicylabel();
		cspolicylabel[] response = (cspolicylabel[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch cspolicylabel resource of given name .
	*/
	public static cspolicylabel get(nitro_service service, String labelname) throws Exception{
		cspolicylabel obj = new cspolicylabel();
		obj.set_labelname(labelname);
		cspolicylabel response = (cspolicylabel) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch cspolicylabel resources of given names .
	*/
	public static cspolicylabel[] get(nitro_service service, String labelname[]) throws Exception{
		if (labelname !=null && labelname.length>0) {
			cspolicylabel response[] = new cspolicylabel[labelname.length];
			cspolicylabel obj[] = new cspolicylabel[labelname.length];
			for (int i=0;i<labelname.length;i++) {
				obj[i] = new cspolicylabel();
				obj[i].set_labelname(labelname[i]);
				response[i] = (cspolicylabel) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of cspolicylabel resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static cspolicylabel[] get_filtered(nitro_service service, String filter) throws Exception{
		cspolicylabel obj = new cspolicylabel();
		options option = new options();
		option.set_filter(filter);
		cspolicylabel[] response = (cspolicylabel[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of cspolicylabel resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static cspolicylabel[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		cspolicylabel obj = new cspolicylabel();
		options option = new options();
		option.set_filter(filter);
		cspolicylabel[] response = (cspolicylabel[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the cspolicylabel resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		cspolicylabel obj = new cspolicylabel();
		options option = new options();
		option.set_count(true);
		cspolicylabel[] response = (cspolicylabel[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of cspolicylabel resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		cspolicylabel obj = new cspolicylabel();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		cspolicylabel[] response = (cspolicylabel[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of cspolicylabel resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		cspolicylabel obj = new cspolicylabel();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		cspolicylabel[] response = (cspolicylabel[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class cspolicylabeltypeEnum {
		public static final String HTTP = "HTTP";
		public static final String TCP = "TCP";
		public static final String RTSP = "RTSP";
		public static final String SSL = "SSL";
		public static final String SSL_TCP = "SSL_TCP";
		public static final String UDP = "UDP";
		public static final String DNS = "DNS";
		public static final String SIP_UDP = "SIP_UDP";
		public static final String ANY = "ANY";
		public static final String RADIUS = "RADIUS";
		public static final String RDP = "RDP";
		public static final String MYSQL = "MYSQL";
		public static final String MSSQL = "MSSQL";
		public static final String DIAMETER = "DIAMETER";
		public static final String SSL_DIAMETER = "SSL_DIAMETER";
	}
	public static class labeltypeEnum {
		public static final String policylabel = "policylabel";
	}
}