/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.vpn;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class vpnvserver_vpnnexthopserver_binding_response extends base_response
{
	public vpnvserver_vpnnexthopserver_binding[] vpnvserver_vpnnexthopserver_binding;
}
/**
	* Binding class showing the vpnnexthopserver that can be bound to vpnvserver.
	*/

public class vpnvserver_vpnnexthopserver_binding extends base_resource
{
	private String nexthopserver;
	private Long acttype;
	private String name;
	private Long __count;

	/**
	* <pre>
	* The vserver to which this command shall bind parameters.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The vserver to which this command shall bind parameters.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The name of the next hop server bound to vpn vserver.
	* </pre>
	*/
	public void set_nexthopserver(String nexthopserver) throws Exception{
		this.nexthopserver = nexthopserver;
	}

	/**
	* <pre>
	* The name of the next hop server bound to vpn vserver.
	* </pre>
	*/
	public String get_nexthopserver() throws Exception {
		return this.nexthopserver;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public Long get_acttype() throws Exception {
		return this.acttype;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		vpnvserver_vpnnexthopserver_binding_response result = (vpnvserver_vpnnexthopserver_binding_response) service.get_payload_formatter().string_to_resource(vpnvserver_vpnnexthopserver_binding_response.class, response);
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
		return result.vpnvserver_vpnnexthopserver_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	public static base_response add(nitro_service client, vpnvserver_vpnnexthopserver_binding resource) throws Exception {
		vpnvserver_vpnnexthopserver_binding updateresource = new vpnvserver_vpnnexthopserver_binding();
		updateresource.name = resource.name;
		updateresource.nexthopserver = resource.nexthopserver;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, vpnvserver_vpnnexthopserver_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnvserver_vpnnexthopserver_binding updateresources[] = new vpnvserver_vpnnexthopserver_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new vpnvserver_vpnnexthopserver_binding();
				updateresources[i].name = resources[i].name;
				updateresources[i].nexthopserver = resources[i].nexthopserver;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, vpnvserver_vpnnexthopserver_binding resource) throws Exception {
		vpnvserver_vpnnexthopserver_binding deleteresource = new vpnvserver_vpnnexthopserver_binding();
		deleteresource.name = resource.name;
		deleteresource.nexthopserver = resource.nexthopserver;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, vpnvserver_vpnnexthopserver_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnvserver_vpnnexthopserver_binding deleteresources[] = new vpnvserver_vpnnexthopserver_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new vpnvserver_vpnnexthopserver_binding();
				deleteresources[i].name = resources[i].name;
				deleteresources[i].nexthopserver = resources[i].nexthopserver;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch vpnvserver_vpnnexthopserver_binding resources of given name .
	*/
	public static vpnvserver_vpnnexthopserver_binding[] get(nitro_service service, String name) throws Exception{
		vpnvserver_vpnnexthopserver_binding obj = new vpnvserver_vpnnexthopserver_binding();
		obj.set_name(name);
		vpnvserver_vpnnexthopserver_binding response[] = (vpnvserver_vpnnexthopserver_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vpnvserver_vpnnexthopserver_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static vpnvserver_vpnnexthopserver_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		vpnvserver_vpnnexthopserver_binding obj = new vpnvserver_vpnnexthopserver_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		vpnvserver_vpnnexthopserver_binding[] response = (vpnvserver_vpnnexthopserver_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vpnvserver_vpnnexthopserver_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static vpnvserver_vpnnexthopserver_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		vpnvserver_vpnnexthopserver_binding obj = new vpnvserver_vpnnexthopserver_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		vpnvserver_vpnnexthopserver_binding[] response = (vpnvserver_vpnnexthopserver_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count vpnvserver_vpnnexthopserver_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		vpnvserver_vpnnexthopserver_binding obj = new vpnvserver_vpnnexthopserver_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		vpnvserver_vpnnexthopserver_binding response[] = (vpnvserver_vpnnexthopserver_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vpnvserver_vpnnexthopserver_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		vpnvserver_vpnnexthopserver_binding obj = new vpnvserver_vpnnexthopserver_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpnvserver_vpnnexthopserver_binding[] response = (vpnvserver_vpnnexthopserver_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vpnvserver_vpnnexthopserver_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		vpnvserver_vpnnexthopserver_binding obj = new vpnvserver_vpnnexthopserver_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpnvserver_vpnnexthopserver_binding[] response = (vpnvserver_vpnnexthopserver_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class bindpointEnum {
		public static final String REQUEST = "REQUEST";
		public static final String RESPONSE = "RESPONSE";
	}

}