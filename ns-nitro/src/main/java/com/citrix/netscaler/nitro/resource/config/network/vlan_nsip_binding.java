/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.network;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class vlan_nsip_binding_response extends base_response
{
	public vlan_nsip_binding[] vlan_nsip_binding;
}
/**
	* Binding class showing the nsip that can be bound to vlan.
	*/

public class vlan_nsip_binding extends base_resource
{
	private String ipaddress;
	private String netmask;
	private Long id;
	private Long __count;

	/**
	* <pre>
	* Specifies the virtual LAN ID.<br> Minimum value =  1<br> Maximum value =  4094
	* </pre>
	*/
	public void set_id(long id) throws Exception {
		this.id = new Long(id);
	}

	/**
	* <pre>
	* Specifies the virtual LAN ID.<br> Minimum value =  1<br> Maximum value =  4094
	* </pre>
	*/
	public void set_id(Long id) throws Exception{
		this.id = id;
	}

	/**
	* <pre>
	* Specifies the virtual LAN ID.<br> Minimum value =  1<br> Maximum value =  4094
	* </pre>
	*/
	public Long get_id() throws Exception {
		return this.id;
	}

	/**
	* <pre>
	* The subnet mask for the network address defined for this VLAN.
	* </pre>
	*/
	public void set_netmask(String netmask) throws Exception{
		this.netmask = netmask;
	}

	/**
	* <pre>
	* The subnet mask for the network address defined for this VLAN.
	* </pre>
	*/
	public String get_netmask() throws Exception {
		return this.netmask;
	}

	/**
	* <pre>
	* The IP address assigned to the VLAN.
	* </pre>
	*/
	public void set_ipaddress(String ipaddress) throws Exception{
		this.ipaddress = ipaddress;
	}

	/**
	* <pre>
	* The IP address assigned to the VLAN.
	* </pre>
	*/
	public String get_ipaddress() throws Exception {
		return this.ipaddress;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		vlan_nsip_binding_response result = (vlan_nsip_binding_response) service.get_payload_formatter().string_to_resource(vlan_nsip_binding_response.class, response);
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
		return result.vlan_nsip_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		if(this.id != null) {
			return this.id.toString();
		}
		return null;
	}

	public static base_response add(nitro_service client, vlan_nsip_binding resource) throws Exception {
		vlan_nsip_binding updateresource = new vlan_nsip_binding();
		updateresource.id = resource.id;
		updateresource.ipaddress = resource.ipaddress;
		updateresource.netmask = resource.netmask;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, vlan_nsip_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vlan_nsip_binding updateresources[] = new vlan_nsip_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new vlan_nsip_binding();
				updateresources[i].id = resources[i].id;
				updateresources[i].ipaddress = resources[i].ipaddress;
				updateresources[i].netmask = resources[i].netmask;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, vlan_nsip_binding resource) throws Exception {
		vlan_nsip_binding deleteresource = new vlan_nsip_binding();
		deleteresource.id = resource.id;
		deleteresource.ipaddress = resource.ipaddress;
		deleteresource.netmask = resource.netmask;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, vlan_nsip_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vlan_nsip_binding deleteresources[] = new vlan_nsip_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new vlan_nsip_binding();
				deleteresources[i].id = resources[i].id;
				deleteresources[i].ipaddress = resources[i].ipaddress;
				deleteresources[i].netmask = resources[i].netmask;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch vlan_nsip_binding resources of given name .
	*/
	public static vlan_nsip_binding[] get(nitro_service service, Long id) throws Exception{
		vlan_nsip_binding obj = new vlan_nsip_binding();
		obj.set_id(id);
		vlan_nsip_binding response[] = (vlan_nsip_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vlan_nsip_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static vlan_nsip_binding[] get_filtered(nitro_service service, Long id, String filter) throws Exception{
		vlan_nsip_binding obj = new vlan_nsip_binding();
		obj.set_id(id);
		options option = new options();
		option.set_filter(filter);
		vlan_nsip_binding[] response = (vlan_nsip_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vlan_nsip_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static vlan_nsip_binding[] get_filtered(nitro_service service, Long id, filtervalue[] filter) throws Exception{
		vlan_nsip_binding obj = new vlan_nsip_binding();
		obj.set_id(id);
		options option = new options();
		option.set_filter(filter);
		vlan_nsip_binding[] response = (vlan_nsip_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count vlan_nsip_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, Long id) throws Exception{
		vlan_nsip_binding obj = new vlan_nsip_binding();
		obj.set_id(id);
		options option = new options();
		option.set_count(true);
		vlan_nsip_binding response[] = (vlan_nsip_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vlan_nsip_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, Long id, String filter) throws Exception{
		vlan_nsip_binding obj = new vlan_nsip_binding();
		obj.set_id(id);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vlan_nsip_binding[] response = (vlan_nsip_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vlan_nsip_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, Long id, filtervalue[] filter) throws Exception{
		vlan_nsip_binding obj = new vlan_nsip_binding();
		obj.set_id(id);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vlan_nsip_binding[] response = (vlan_nsip_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}