/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.lb;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class lbgroup_response extends base_response
{
	public lbgroup[] lbgroup;
}
/**
* Configuration for LB group resource.
*/

public class lbgroup extends base_resource
{
	private String name;
	private String persistencetype;
	private String persistencebackup;
	private Long backuppersistencetimeout;
	private String persistmask;
	private Long v6persistmasklen;
	private String cookiedomain;
	private Long timeout;
	private String rule;
	private String newname;
	private Long __count;

	/**
	* <pre>
	* The name of the group.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the group.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The persistence type for the group.
Select
	SOURCEIP - This option is used to maintain persistency based on the client IP.
	COOKIEINSERT- This option is used to maintain persistency based on the cookie in the client request.This cookie is inserted by the system in the first response to the client.
	NONE - To disable the persistency.<br> Possible values = SOURCEIP, COOKIEINSERT, RULE, NONE
	* </pre>
	*/
	public void set_persistencetype(String persistencetype) throws Exception{
		this.persistencetype = persistencetype;
	}

	/**
	* <pre>
	* The persistence type for the group.
Select
	SOURCEIP - This option is used to maintain persistency based on the client IP.
	COOKIEINSERT- This option is used to maintain persistency based on the cookie in the client request.This cookie is inserted by the system in the first response to the client.
	NONE - To disable the persistency.<br> Possible values = SOURCEIP, COOKIEINSERT, RULE, NONE
	* </pre>
	*/
	public String get_persistencetype() throws Exception {
		return this.persistencetype;
	}

	/**
	* <pre>
	* The backup persistence type for the group.<br> Possible values = SOURCEIP, NONE
	* </pre>
	*/
	public void set_persistencebackup(String persistencebackup) throws Exception{
		this.persistencebackup = persistencebackup;
	}

	/**
	* <pre>
	* The backup persistence type for the group.<br> Possible values = SOURCEIP, NONE
	* </pre>
	*/
	public String get_persistencebackup() throws Exception {
		return this.persistencebackup;
	}

	/**
	* <pre>
	* The maximum time backup persistence is in effect for a specific client.<br> Default value: 2<br> Minimum value =  2<br> Maximum value =  1440
	* </pre>
	*/
	public void set_backuppersistencetimeout(long backuppersistencetimeout) throws Exception {
		this.backuppersistencetimeout = new Long(backuppersistencetimeout);
	}

	/**
	* <pre>
	* The maximum time backup persistence is in effect for a specific client.<br> Default value: 2<br> Minimum value =  2<br> Maximum value =  1440
	* </pre>
	*/
	public void set_backuppersistencetimeout(Long backuppersistencetimeout) throws Exception{
		this.backuppersistencetimeout = backuppersistencetimeout;
	}

	/**
	* <pre>
	* The maximum time backup persistence is in effect for a specific client.<br> Default value: 2<br> Minimum value =  2<br> Maximum value =  1440
	* </pre>
	*/
	public Long get_backuppersistencetimeout() throws Exception {
		return this.backuppersistencetimeout;
	}

	/**
	* <pre>
	* The netmask to be applied when the persistency type is SOURCEIP.<br> Minimum length =  1
	* </pre>
	*/
	public void set_persistmask(String persistmask) throws Exception{
		this.persistmask = persistmask;
	}

	/**
	* <pre>
	* The netmask to be applied when the persistency type is SOURCEIP.<br> Minimum length =  1
	* </pre>
	*/
	public String get_persistmask() throws Exception {
		return this.persistmask;
	}

	/**
	* <pre>
	* The persistence mask. Use this parameter if you are using IPv6 based persistence type on an lb group.<br> Default value: 128<br> Minimum value =  1<br> Maximum value =  128
	* </pre>
	*/
	public void set_v6persistmasklen(long v6persistmasklen) throws Exception {
		this.v6persistmasklen = new Long(v6persistmasklen);
	}

	/**
	* <pre>
	* The persistence mask. Use this parameter if you are using IPv6 based persistence type on an lb group.<br> Default value: 128<br> Minimum value =  1<br> Maximum value =  128
	* </pre>
	*/
	public void set_v6persistmasklen(Long v6persistmasklen) throws Exception{
		this.v6persistmasklen = v6persistmasklen;
	}

	/**
	* <pre>
	* The persistence mask. Use this parameter if you are using IPv6 based persistence type on an lb group.<br> Default value: 128<br> Minimum value =  1<br> Maximum value =  128
	* </pre>
	*/
	public Long get_v6persistmasklen() throws Exception {
		return this.v6persistmasklen;
	}

	/**
	* <pre>
	* The domain attribute of the HTTP cookie.<br> Minimum length =  1
	* </pre>
	*/
	public void set_cookiedomain(String cookiedomain) throws Exception{
		this.cookiedomain = cookiedomain;
	}

	/**
	* <pre>
	* The domain attribute of the HTTP cookie.<br> Minimum length =  1
	* </pre>
	*/
	public String get_cookiedomain() throws Exception {
		return this.cookiedomain;
	}

	/**
	* <pre>
	* The maximum time that persistence is in effect for a specific client.<br> Default value: 2<br> Minimum value =  0<br> Maximum value =  1440
	* </pre>
	*/
	public void set_timeout(long timeout) throws Exception {
		this.timeout = new Long(timeout);
	}

	/**
	* <pre>
	* The maximum time that persistence is in effect for a specific client.<br> Default value: 2<br> Minimum value =  0<br> Maximum value =  1440
	* </pre>
	*/
	public void set_timeout(Long timeout) throws Exception{
		this.timeout = timeout;
	}

	/**
	* <pre>
	* The maximum time that persistence is in effect for a specific client.<br> Default value: 2<br> Minimum value =  0<br> Maximum value =  1440
	* </pre>
	*/
	public Long get_timeout() throws Exception {
		return this.timeout;
	}

	/**
	* <pre>
	* The RULE persistence type. The string can be either a existing rule name (configured using ###add rule### command) or else it could it be an inline expression with a maximum of 1500 characters.<br> Default value: "None"
	* </pre>
	*/
	public void set_rule(String rule) throws Exception{
		this.rule = rule;
	}

	/**
	* <pre>
	* The RULE persistence type. The string can be either a existing rule name (configured using ###add rule### command) or else it could it be an inline expression with a maximum of 1500 characters.<br> Default value: "None"
	* </pre>
	*/
	public String get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* The new name of the virtual server group.<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* The new name of the virtual server group.<br> Minimum length =  1
	* </pre>
	*/
	public String get_newname() throws Exception {
		return this.newname;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		lbgroup_response result = (lbgroup_response) service.get_payload_formatter().string_to_resource(lbgroup_response.class, response);
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
		return result.lbgroup;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	/**
	* Use this API to update lbgroup.
	*/
	public static base_response update(nitro_service client, lbgroup resource) throws Exception {
		lbgroup updateresource = new lbgroup();
		updateresource.name = resource.name;
		updateresource.persistencetype = resource.persistencetype;
		updateresource.persistencebackup = resource.persistencebackup;
		updateresource.backuppersistencetimeout = resource.backuppersistencetimeout;
		updateresource.persistmask = resource.persistmask;
		updateresource.v6persistmasklen = resource.v6persistmasklen;
		updateresource.cookiedomain = resource.cookiedomain;
		updateresource.timeout = resource.timeout;
		updateresource.rule = resource.rule;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update lbgroup resources.
	*/
	public static base_responses update(nitro_service client, lbgroup resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lbgroup updateresources[] = new lbgroup[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new lbgroup();
				updateresources[i].name = resources[i].name;
				updateresources[i].persistencetype = resources[i].persistencetype;
				updateresources[i].persistencebackup = resources[i].persistencebackup;
				updateresources[i].backuppersistencetimeout = resources[i].backuppersistencetimeout;
				updateresources[i].persistmask = resources[i].persistmask;
				updateresources[i].v6persistmasklen = resources[i].v6persistmasklen;
				updateresources[i].cookiedomain = resources[i].cookiedomain;
				updateresources[i].timeout = resources[i].timeout;
				updateresources[i].rule = resources[i].rule;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of lbgroup resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		lbgroup unsetresource = new lbgroup();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of lbgroup resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, lbgroup resource, String[] args) throws Exception{
		lbgroup unsetresource = new lbgroup();
		unsetresource.name = resource.name;
		unsetresource.persistencetype = resource.persistencetype;
		unsetresource.persistencebackup = resource.persistencebackup;
		unsetresource.backuppersistencetimeout = resource.backuppersistencetimeout;
		unsetresource.persistmask = resource.persistmask;
		unsetresource.v6persistmasklen = resource.v6persistmasklen;
		unsetresource.cookiedomain = resource.cookiedomain;
		unsetresource.timeout = resource.timeout;
		unsetresource.rule = resource.rule;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of lbgroup resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			lbgroup unsetresources[] = new lbgroup[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new lbgroup();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of lbgroup resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, lbgroup resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lbgroup unsetresources[] = new lbgroup[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new lbgroup();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].persistencetype = resources[i].persistencetype;
				unsetresources[i].persistencebackup = resources[i].persistencebackup;
				unsetresources[i].backuppersistencetimeout = resources[i].backuppersistencetimeout;
				unsetresources[i].persistmask = resources[i].persistmask;
				unsetresources[i].v6persistmasklen = resources[i].v6persistmasklen;
				unsetresources[i].cookiedomain = resources[i].cookiedomain;
				unsetresources[i].timeout = resources[i].timeout;
				unsetresources[i].rule = resources[i].rule;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to rename a lbgroup resource.
	*/
	public static base_response rename(nitro_service client, lbgroup resource, String new_name) throws Exception {
		lbgroup renameresource = new lbgroup();
		renameresource.name = resource.name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to rename a lbgroup resource.
	*/
	public static base_response rename(nitro_service client, String name, String new_name) throws Exception {
		lbgroup renameresource = new lbgroup();
		renameresource.name = name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to fetch all the lbgroup resources that are configured on netscaler.
	*/
	public static lbgroup[] get(nitro_service service) throws Exception{
		lbgroup obj = new lbgroup();
		lbgroup[] response = (lbgroup[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the lbgroup resources that are configured on netscaler.
	*/
	public static lbgroup[] get(nitro_service service, options option) throws Exception{
		lbgroup obj = new lbgroup();
		lbgroup[] response = (lbgroup[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch lbgroup resource of given name .
	*/
	public static lbgroup get(nitro_service service, String name) throws Exception{
		lbgroup obj = new lbgroup();
		obj.set_name(name);
		lbgroup response = (lbgroup) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch lbgroup resources of given names .
	*/
	public static lbgroup[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			lbgroup response[] = new lbgroup[name.length];
			lbgroup obj[] = new lbgroup[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new lbgroup();
				obj[i].set_name(name[i]);
				response[i] = (lbgroup) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of lbgroup resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static lbgroup[] get_filtered(nitro_service service, String filter) throws Exception{
		lbgroup obj = new lbgroup();
		options option = new options();
		option.set_filter(filter);
		lbgroup[] response = (lbgroup[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of lbgroup resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static lbgroup[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		lbgroup obj = new lbgroup();
		options option = new options();
		option.set_filter(filter);
		lbgroup[] response = (lbgroup[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the lbgroup resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		lbgroup obj = new lbgroup();
		options option = new options();
		option.set_count(true);
		lbgroup[] response = (lbgroup[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of lbgroup resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		lbgroup obj = new lbgroup();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		lbgroup[] response = (lbgroup[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of lbgroup resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		lbgroup obj = new lbgroup();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		lbgroup[] response = (lbgroup[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class persistencebackupEnum {
		public static final String SOURCEIP = "SOURCEIP";
		public static final String NONE = "NONE";
	}
	public static class persistencetypeEnum {
		public static final String SOURCEIP = "SOURCEIP";
		public static final String COOKIEINSERT = "COOKIEINSERT";
		public static final String RULE = "RULE";
		public static final String NONE = "NONE";
	}
}
