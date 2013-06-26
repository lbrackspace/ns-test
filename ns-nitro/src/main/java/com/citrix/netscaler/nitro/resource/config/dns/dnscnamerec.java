/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.dns;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class dnscnamerec_response extends base_response
{
	public dnscnamerec[] dnscnamerec;
}
/**
* Configuration for CNAME record resource.
*/

public class dnscnamerec extends base_resource
{
	private String aliasname;
	private String canonicalname;
	private Long ttl;
	private String type;

	//------- Read only Parameter ---------;

	private String vservername;
	private String authtype;
	private Long __count;

	/**
	* <pre>
	* Alias name for the specified domain.<br> Minimum length =  1
	* </pre>
	*/
	public void set_aliasname(String aliasname) throws Exception{
		this.aliasname = aliasname;
	}

	/**
	* <pre>
	* Alias name for the specified domain.<br> Minimum length =  1
	* </pre>
	*/
	public String get_aliasname() throws Exception {
		return this.aliasname;
	}

	/**
	* <pre>
	* The domain for which cnamerec is created.<br> Minimum length =  1
	* </pre>
	*/
	public void set_canonicalname(String canonicalname) throws Exception{
		this.canonicalname = canonicalname;
	}

	/**
	* <pre>
	* The domain for which cnamerec is created.<br> Minimum length =  1
	* </pre>
	*/
	public String get_canonicalname() throws Exception {
		return this.canonicalname;
	}

	/**
	* <pre>
	* Time to live, in seconds.<br> Default value: 3600<br> Minimum value =  0<br> Maximum value =  2147483647
	* </pre>
	*/
	public void set_ttl(long ttl) throws Exception {
		this.ttl = new Long(ttl);
	}

	/**
	* <pre>
	* Time to live, in seconds.<br> Default value: 3600<br> Minimum value =  0<br> Maximum value =  2147483647
	* </pre>
	*/
	public void set_ttl(Long ttl) throws Exception{
		this.ttl = ttl;
	}

	/**
	* <pre>
	* Time to live, in seconds.<br> Default value: 3600<br> Minimum value =  0<br> Maximum value =  2147483647
	* </pre>
	*/
	public Long get_ttl() throws Exception {
		return this.ttl;
	}

	/**
	* <pre>
	* The cname record type. The type can take 3 values:
ADNS -  If this is specified, all of the authoritative cname records will be displayed.
PROXY - If this is specified, all of the proxy cname records will be displayed.
ALL  -  If this is specified, all of the cname records will be displayed.<br> Default value: NSDNS_AUTH_HOST<br> Possible values = ALL, ADNS, PROXY
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* The cname record type. The type can take 3 values:
ADNS -  If this is specified, all of the authoritative cname records will be displayed.
PROXY - If this is specified, all of the proxy cname records will be displayed.
ALL  -  If this is specified, all of the cname records will be displayed.<br> Default value: NSDNS_AUTH_HOST<br> Possible values = ALL, ADNS, PROXY
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* GSLB Vitual server name to which this domain is bound.
	* </pre>
	*/
	public String get_vservername() throws Exception {
		return this.vservername;
	}

	/**
	* <pre>
	* Record type.<br> Possible values = ALL, ADNS, PROXY
	* </pre>
	*/
	public String get_authtype() throws Exception {
		return this.authtype;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		dnscnamerec_response result = (dnscnamerec_response) service.get_payload_formatter().string_to_resource(dnscnamerec_response.class, response);
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
		return result.dnscnamerec;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.aliasname;
	}

	/**
	* Use this API to add dnscnamerec.
	*/
	public static base_response add(nitro_service client, dnscnamerec resource) throws Exception {
		dnscnamerec addresource = new dnscnamerec();
		addresource.aliasname = resource.aliasname;
		addresource.canonicalname = resource.canonicalname;
		addresource.ttl = resource.ttl;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add dnscnamerec resources.
	*/
	public static base_responses add(nitro_service client, dnscnamerec resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnscnamerec addresources[] = new dnscnamerec[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new dnscnamerec();
				addresources[i].aliasname = resources[i].aliasname;
				addresources[i].canonicalname = resources[i].canonicalname;
				addresources[i].ttl = resources[i].ttl;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete dnscnamerec of given name.
	*/
	public static base_response delete(nitro_service client, String aliasname) throws Exception {
		dnscnamerec deleteresource = new dnscnamerec();
		deleteresource.aliasname = aliasname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dnscnamerec.
	*/
	public static base_response delete(nitro_service client, dnscnamerec resource) throws Exception {
		dnscnamerec deleteresource = new dnscnamerec();
		deleteresource.aliasname = resource.aliasname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dnscnamerec resources of given names.
	*/
	public static base_responses delete(nitro_service client, String aliasname[]) throws Exception {
		base_responses result = null;
		if (aliasname != null && aliasname.length > 0) {
			dnscnamerec deleteresources[] = new dnscnamerec[aliasname.length];
			for (int i=0;i<aliasname.length;i++){
				deleteresources[i] = new dnscnamerec();
				deleteresources[i].aliasname = aliasname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete dnscnamerec resources.
	*/
	public static base_responses delete(nitro_service client, dnscnamerec resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnscnamerec deleteresources[] = new dnscnamerec[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new dnscnamerec();
				deleteresources[i].aliasname = resources[i].aliasname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the dnscnamerec resources that are configured on netscaler.
	*/
	public static dnscnamerec[] get(nitro_service service) throws Exception{
		dnscnamerec obj = new dnscnamerec();
		dnscnamerec[] response = (dnscnamerec[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the dnscnamerec resources that are configured on netscaler.
	*/
	public static dnscnamerec[] get(nitro_service service, options option) throws Exception{
		dnscnamerec obj = new dnscnamerec();
		dnscnamerec[] response = (dnscnamerec[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch all the dnscnamerec resources that are configured on netscaler.
	* This uses dnscnamerec_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static dnscnamerec[] get(nitro_service service, dnscnamerec_args args) throws Exception{
		dnscnamerec obj = new dnscnamerec();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		dnscnamerec[] response = (dnscnamerec[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch dnscnamerec resource of given name .
	*/
	public static dnscnamerec get(nitro_service service, String aliasname) throws Exception{
		dnscnamerec obj = new dnscnamerec();
		obj.set_aliasname(aliasname);
		dnscnamerec response = (dnscnamerec) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch dnscnamerec resources of given names .
	*/
	public static dnscnamerec[] get(nitro_service service, String aliasname[]) throws Exception{
		if (aliasname !=null && aliasname.length>0) {
			dnscnamerec response[] = new dnscnamerec[aliasname.length];
			dnscnamerec obj[] = new dnscnamerec[aliasname.length];
			for (int i=0;i<aliasname.length;i++) {
				obj[i] = new dnscnamerec();
				obj[i].set_aliasname(aliasname[i]);
				response[i] = (dnscnamerec) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of dnscnamerec resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static dnscnamerec[] get_filtered(nitro_service service, String filter) throws Exception{
		dnscnamerec obj = new dnscnamerec();
		options option = new options();
		option.set_filter(filter);
		dnscnamerec[] response = (dnscnamerec[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of dnscnamerec resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static dnscnamerec[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dnscnamerec obj = new dnscnamerec();
		options option = new options();
		option.set_filter(filter);
		dnscnamerec[] response = (dnscnamerec[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the dnscnamerec resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		dnscnamerec obj = new dnscnamerec();
		options option = new options();
		option.set_count(true);
		dnscnamerec[] response = (dnscnamerec[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of dnscnamerec resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		dnscnamerec obj = new dnscnamerec();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnscnamerec[] response = (dnscnamerec[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of dnscnamerec resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dnscnamerec obj = new dnscnamerec();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnscnamerec[] response = (dnscnamerec[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class authtypeEnum {
		public static final String ALL = "ALL";
		public static final String ADNS = "ADNS";
		public static final String PROXY = "PROXY";
	}
	public static class typeEnum {
		public static final String ALL = "ALL";
		public static final String ADNS = "ADNS";
		public static final String PROXY = "PROXY";
	}
}