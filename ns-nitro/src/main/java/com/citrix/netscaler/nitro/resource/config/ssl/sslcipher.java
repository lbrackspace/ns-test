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

class sslcipher_response extends base_response
{
	public sslcipher[] sslcipher;
}
/**
* Configuration for cipher resource.
*/

public class sslcipher extends base_resource
{
	private String ciphergroupname;
	private String ciphgrpalias;
	private String ciphername;
	private Long __count;

	/**
	* <pre>
	* The name of the user-defined cipher group.
	If the cipher group does not exist on the system, a new group is created with the specified name. The ciphers are added to this group.
	If a group identified by cipherGroupName already exists on the system, the ciphers are added to it.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ciphergroupname(String ciphergroupname) throws Exception{
		this.ciphergroupname = ciphergroupname;
	}

	/**
	* <pre>
	* The name of the user-defined cipher group.
	If the cipher group does not exist on the system, a new group is created with the specified name. The ciphers are added to this group.
	If a group identified by cipherGroupName already exists on the system, the ciphers are added to it.<br> Minimum length =  1
	* </pre>
	*/
	public String get_ciphergroupname() throws Exception {
		return this.ciphergroupname;
	}

	/**
	* <pre>
	* The individual cipher name(s), a user-defined cipher group, or a system predefined cipher alias that will be added to the  predefined cipher alias that will be added to the group cipherGroupName.
If a cipher alias or a cipher group is specified, all the individual ciphers in the cipher alias or group will be added to the user-defined cipher group.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ciphgrpalias(String ciphgrpalias) throws Exception{
		this.ciphgrpalias = ciphgrpalias;
	}

	/**
	* <pre>
	* The individual cipher name(s), a user-defined cipher group, or a system predefined cipher alias that will be added to the  predefined cipher alias that will be added to the group cipherGroupName.
If a cipher alias or a cipher group is specified, all the individual ciphers in the cipher alias or group will be added to the user-defined cipher group.<br> Minimum length =  1
	* </pre>
	*/
	public String get_ciphgrpalias() throws Exception {
		return this.ciphgrpalias;
	}

	/**
	* <pre>
	* The cipher(s) to be removed from the cipher group.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ciphername(String ciphername) throws Exception{
		this.ciphername = ciphername;
	}

	/**
	* <pre>
	* The cipher(s) to be removed from the cipher group.<br> Minimum length =  1
	* </pre>
	*/
	public String get_ciphername() throws Exception {
		return this.ciphername;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		sslcipher_response result = (sslcipher_response) service.get_payload_formatter().string_to_resource(sslcipher_response.class, response);
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
		return result.sslcipher;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.ciphergroupname;
	}

	/**
	* Use this API to add sslcipher.
	*/
	public static base_response add(nitro_service client, sslcipher resource) throws Exception {
		sslcipher addresource = new sslcipher();
		addresource.ciphergroupname = resource.ciphergroupname;
		addresource.ciphgrpalias = resource.ciphgrpalias;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add sslcipher resources.
	*/
	public static base_responses add(nitro_service client, sslcipher resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslcipher addresources[] = new sslcipher[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new sslcipher();
				addresources[i].ciphergroupname = resources[i].ciphergroupname;
				addresources[i].ciphgrpalias = resources[i].ciphgrpalias;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete sslcipher of given name.
	*/
	public static base_response delete(nitro_service client, String ciphergroupname) throws Exception {
		sslcipher deleteresource = new sslcipher();
		deleteresource.ciphergroupname = ciphergroupname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete sslcipher.
	*/
	public static base_response delete(nitro_service client, sslcipher resource) throws Exception {
		sslcipher deleteresource = new sslcipher();
		deleteresource.ciphergroupname = resource.ciphergroupname;
		deleteresource.ciphername = resource.ciphername;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete sslcipher resources of given names.
	*/
	public static base_responses delete(nitro_service client, String ciphergroupname[]) throws Exception {
		base_responses result = null;
		if (ciphergroupname != null && ciphergroupname.length > 0) {
			sslcipher deleteresources[] = new sslcipher[ciphergroupname.length];
			for (int i=0;i<ciphergroupname.length;i++){
				deleteresources[i] = new sslcipher();
				deleteresources[i].ciphergroupname = ciphergroupname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete sslcipher resources.
	*/
	public static base_responses delete(nitro_service client, sslcipher resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslcipher deleteresources[] = new sslcipher[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new sslcipher();
				deleteresources[i].ciphergroupname = resources[i].ciphergroupname;
				deleteresources[i].ciphername = resources[i].ciphername;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the sslcipher resources that are configured on netscaler.
	*/
	public static sslcipher[] get(nitro_service service) throws Exception{
		sslcipher obj = new sslcipher();
		sslcipher[] response = (sslcipher[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the sslcipher resources that are configured on netscaler.
	*/
	public static sslcipher[] get(nitro_service service, options option) throws Exception{
		sslcipher obj = new sslcipher();
		sslcipher[] response = (sslcipher[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch sslcipher resource of given name .
	*/
	public static sslcipher get(nitro_service service, String ciphergroupname) throws Exception{
		sslcipher obj = new sslcipher();
		obj.set_ciphergroupname(ciphergroupname);
		sslcipher response = (sslcipher) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch sslcipher resources of given names .
	*/
	public static sslcipher[] get(nitro_service service, String ciphergroupname[]) throws Exception{
		if (ciphergroupname !=null && ciphergroupname.length>0) {
			sslcipher response[] = new sslcipher[ciphergroupname.length];
			sslcipher obj[] = new sslcipher[ciphergroupname.length];
			for (int i=0;i<ciphergroupname.length;i++) {
				obj[i] = new sslcipher();
				obj[i].set_ciphergroupname(ciphergroupname[i]);
				response[i] = (sslcipher) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of sslcipher resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static sslcipher[] get_filtered(nitro_service service, String filter) throws Exception{
		sslcipher obj = new sslcipher();
		options option = new options();
		option.set_filter(filter);
		sslcipher[] response = (sslcipher[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sslcipher resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static sslcipher[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		sslcipher obj = new sslcipher();
		options option = new options();
		option.set_filter(filter);
		sslcipher[] response = (sslcipher[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the sslcipher resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		sslcipher obj = new sslcipher();
		options option = new options();
		option.set_count(true);
		sslcipher[] response = (sslcipher[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of sslcipher resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		sslcipher obj = new sslcipher();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslcipher[] response = (sslcipher[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of sslcipher resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		sslcipher obj = new sslcipher();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslcipher[] response = (sslcipher[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
