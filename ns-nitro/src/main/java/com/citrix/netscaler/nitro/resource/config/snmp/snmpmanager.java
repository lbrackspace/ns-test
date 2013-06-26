/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.snmp;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class snmpmanager_response extends base_response
{
	public snmpmanager[] snmpmanager;
}
/**
* Configuration for manager resource.
*/

public class snmpmanager extends base_resource
{
	private String ipaddress;
	private String netmask;
	private Integer domainresolveretry;

	//------- Read only Parameter ---------;

	private String ip;
	private String domain;
	private Long __count;

	/**
	* <pre>
	* The IPv4 or network address or the host name of the SNMP manager that you want to add to the NetScaler appliance.   
Can be any of the following:

 - IPv4 address of the SNMP manager. 
 - IPv4 network address. The NetScaler appliance accepts and responds to SNMP queries from any device on this network.
 - Associated host-name of an SNMP manager that has an IPv4 address. If you specify a host-name, you must add a DNS name server that resolves the host-name of the SNMP manager to its IP address.

You can add up to a maximum of 100 IP based SNMP managers or networks and a maximum of 5 host-name-based SNMP managers.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public void set_ipaddress(String ipaddress) throws Exception{
		this.ipaddress = ipaddress;
	}

	/**
	* <pre>
	* The IPv4 or network address or the host name of the SNMP manager that you want to add to the NetScaler appliance.   
Can be any of the following:

 - IPv4 address of the SNMP manager. 
 - IPv4 network address. The NetScaler appliance accepts and responds to SNMP queries from any device on this network.
 - Associated host-name of an SNMP manager that has an IPv4 address. If you specify a host-name, you must add a DNS name server that resolves the host-name of the SNMP manager to its IP address.

You can add up to a maximum of 100 IP based SNMP managers or networks and a maximum of 5 host-name-based SNMP managers.<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public String get_ipaddress() throws Exception {
		return this.ipaddress;
	}

	/**
	* <pre>
	* The subnet mask associated with the IPv4 network address specified by the IPAddress parameter. If the IPAddress parameter specifies a specific host, which is IP address or host name of the SNMP manager, accept the default value of 255.255.255.255 for the netmask parameter.
	* </pre>
	*/
	public void set_netmask(String netmask) throws Exception{
		this.netmask = netmask;
	}

	/**
	* <pre>
	* The subnet mask associated with the IPv4 network address specified by the IPAddress parameter. If the IPAddress parameter specifies a specific host, which is IP address or host name of the SNMP manager, accept the default value of 255.255.255.255 for the netmask parameter.
	* </pre>
	*/
	public String get_netmask() throws Exception {
		return this.netmask;
	}

	/**
	* <pre>
	* The amount of time, in seconds, for which the NetScaler appliance waits before sending another DNS query to resolve the host-name of the SNMP manager if the last query failed. After a query succeeds, the appliance waits for the TTL time. This parameter is only valid for host-name based SNMP managers. .<br> Default value: 5<br> Minimum value =  5<br> Maximum value =  20939
	* </pre>
	*/
	public void set_domainresolveretry(int domainresolveretry) throws Exception {
		this.domainresolveretry = new Integer(domainresolveretry);
	}

	/**
	* <pre>
	* The amount of time, in seconds, for which the NetScaler appliance waits before sending another DNS query to resolve the host-name of the SNMP manager if the last query failed. After a query succeeds, the appliance waits for the TTL time. This parameter is only valid for host-name based SNMP managers. .<br> Default value: 5<br> Minimum value =  5<br> Maximum value =  20939
	* </pre>
	*/
	public void set_domainresolveretry(Integer domainresolveretry) throws Exception{
		this.domainresolveretry = domainresolveretry;
	}

	/**
	* <pre>
	* The amount of time, in seconds, for which the NetScaler appliance waits before sending another DNS query to resolve the host-name of the SNMP manager if the last query failed. After a query succeeds, the appliance waits for the TTL time. This parameter is only valid for host-name based SNMP managers. .<br> Default value: 5<br> Minimum value =  5<br> Maximum value =  20939
	* </pre>
	*/
	public Integer get_domainresolveretry() throws Exception {
		return this.domainresolveretry;
	}

	/**
	* <pre>
	* The resolved IP address of the hostname manager.
	* </pre>
	*/
	public String get_ip() throws Exception {
		return this.ip;
	}

	/**
	* <pre>
	* IP address of manager. It will be zero for hostname manager.
	* </pre>
	*/
	public String get_domain() throws Exception {
		return this.domain;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		snmpmanager_response result = (snmpmanager_response) service.get_payload_formatter().string_to_resource(snmpmanager_response.class, response);
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
		return result.snmpmanager;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.ipaddress;
	}

	/**
	* Use this API to add snmpmanager.
	*/
	public static base_response add(nitro_service client, snmpmanager resource) throws Exception {
		snmpmanager addresource = new snmpmanager();
		addresource.ipaddress = resource.ipaddress;
		addresource.netmask = resource.netmask;
		addresource.domainresolveretry = resource.domainresolveretry;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add snmpmanager resources.
	*/
	public static base_responses add(nitro_service client, snmpmanager resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			snmpmanager addresources[] = new snmpmanager[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new snmpmanager();
				addresources[i].ipaddress = resources[i].ipaddress;
				addresources[i].netmask = resources[i].netmask;
				addresources[i].domainresolveretry = resources[i].domainresolveretry;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete snmpmanager of given name.
	*/
	public static base_response delete(nitro_service client, String ipaddress) throws Exception {
		snmpmanager deleteresource = new snmpmanager();
		deleteresource.ipaddress = ipaddress;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete snmpmanager.
	*/
	public static base_response delete(nitro_service client, snmpmanager resource) throws Exception {
		snmpmanager deleteresource = new snmpmanager();
		deleteresource.ipaddress = resource.ipaddress;
		deleteresource.netmask = resource.netmask;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete snmpmanager resources of given names.
	*/
	public static base_responses delete(nitro_service client, String ipaddress[]) throws Exception {
		base_responses result = null;
		if (ipaddress != null && ipaddress.length > 0) {
			snmpmanager deleteresources[] = new snmpmanager[ipaddress.length];
			for (int i=0;i<ipaddress.length;i++){
				deleteresources[i] = new snmpmanager();
				deleteresources[i].ipaddress = ipaddress[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete snmpmanager resources.
	*/
	public static base_responses delete(nitro_service client, snmpmanager resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			snmpmanager deleteresources[] = new snmpmanager[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new snmpmanager();
				deleteresources[i].ipaddress = resources[i].ipaddress;
				deleteresources[i].netmask = resources[i].netmask;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update snmpmanager.
	*/
	public static base_response update(nitro_service client, snmpmanager resource) throws Exception {
		snmpmanager updateresource = new snmpmanager();
		updateresource.ipaddress = resource.ipaddress;
		updateresource.netmask = resource.netmask;
		updateresource.domainresolveretry = resource.domainresolveretry;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update snmpmanager resources.
	*/
	public static base_responses update(nitro_service client, snmpmanager resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			snmpmanager updateresources[] = new snmpmanager[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new snmpmanager();
				updateresources[i].ipaddress = resources[i].ipaddress;
				updateresources[i].netmask = resources[i].netmask;
				updateresources[i].domainresolveretry = resources[i].domainresolveretry;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of snmpmanager resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String ipaddress, String args[]) throws Exception {
		snmpmanager unsetresource = new snmpmanager();
		unsetresource.ipaddress = ipaddress;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of snmpmanager resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, snmpmanager resource, String[] args) throws Exception{
		snmpmanager unsetresource = new snmpmanager();
		unsetresource.ipaddress = resource.ipaddress;
		unsetresource.netmask = resource.netmask;
		unsetresource.domainresolveretry = resource.domainresolveretry;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of snmpmanager resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String ipaddress[], String args[]) throws Exception {
		base_responses result = null;
		if (ipaddress != null && ipaddress.length > 0) {
			snmpmanager unsetresources[] = new snmpmanager[ipaddress.length];
			for (int i=0;i<ipaddress.length;i++){
				unsetresources[i] = new snmpmanager();
				unsetresources[i].ipaddress = ipaddress[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of snmpmanager resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, snmpmanager resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			snmpmanager unsetresources[] = new snmpmanager[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new snmpmanager();
				unsetresources[i].ipaddress = resources[i].ipaddress;
				unsetresources[i].netmask = resources[i].netmask;
				unsetresources[i].domainresolveretry = resources[i].domainresolveretry;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the snmpmanager resources that are configured on netscaler.
	*/
	public static snmpmanager[] get(nitro_service service) throws Exception{
		snmpmanager obj = new snmpmanager();
		snmpmanager[] response = (snmpmanager[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the snmpmanager resources that are configured on netscaler.
	*/
	public static snmpmanager[] get(nitro_service service, options option) throws Exception{
		snmpmanager obj = new snmpmanager();
		snmpmanager[] response = (snmpmanager[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch a snmpmanager resource.
	*/
	public static snmpmanager get(nitro_service service, snmpmanager obj) throws Exception{
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		snmpmanager response = (snmpmanager) obj.get_resource(service,option);
		return response;
	}

	/**
	* Use this API to fetch a snmpmanager resources.
	*/
	public static snmpmanager[] get(nitro_service service, snmpmanager obj[]) throws Exception{
		if (obj != null && obj.length > 0) {
			snmpmanager response[] = new snmpmanager[obj.length];
			for (int i=0;i<obj.length;i++) {
				options option = new options();
				option.set_args(nitro_util.object_to_string_withoutquotes(obj[i]));
				response[i] = (snmpmanager) obj[i].get_resource(service,option);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of snmpmanager resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static snmpmanager[] get_filtered(nitro_service service, String filter) throws Exception{
		snmpmanager obj = new snmpmanager();
		options option = new options();
		option.set_filter(filter);
		snmpmanager[] response = (snmpmanager[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of snmpmanager resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static snmpmanager[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		snmpmanager obj = new snmpmanager();
		options option = new options();
		option.set_filter(filter);
		snmpmanager[] response = (snmpmanager[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the snmpmanager resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		snmpmanager obj = new snmpmanager();
		options option = new options();
		option.set_count(true);
		snmpmanager[] response = (snmpmanager[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of snmpmanager resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		snmpmanager obj = new snmpmanager();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		snmpmanager[] response = (snmpmanager[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of snmpmanager resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		snmpmanager obj = new snmpmanager();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		snmpmanager[] response = (snmpmanager[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}
