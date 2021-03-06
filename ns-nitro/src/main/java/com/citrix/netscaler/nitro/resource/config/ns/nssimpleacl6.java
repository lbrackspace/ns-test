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

package com.citrix.netscaler.nitro.resource.config.ns;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class nssimpleacl6_response extends base_response
{
	public nssimpleacl6[] nssimpleacl6;
}
/**
* Configuration for simple ACL6 resource.
*/

public class nssimpleacl6 extends base_resource
{
	private String aclname;
	private Long td;
	private String aclaction;
	private String srcipv6;
	private Integer destport;
	private String protocol;
	private Long ttl;
	private Boolean estsessions;

	//------- Read only Parameter ---------;

	private Long hits;
	private Long __count;

	/**
	* <pre>
	* Name for the simple ACL6 rule. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters. Cannot be changed after the simple ACL6 rule is created.<br> Minimum length =  1
	* </pre>
	*/
	public void set_aclname(String aclname) throws Exception{
		this.aclname = aclname;
	}

	/**
	* <pre>
	* Name for the simple ACL6 rule. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters. Cannot be changed after the simple ACL6 rule is created.<br> Minimum length =  1
	* </pre>
	*/
	public String get_aclname() throws Exception {
		return this.aclname;
	}

	/**
	* <pre>
	* Traffic Domain Id.<br> Minimum value =  0<br> Maximum value =  4094
	* </pre>
	*/
	public void set_td(long td) throws Exception {
		this.td = new Long(td);
	}

	/**
	* <pre>
	* Traffic Domain Id.<br> Minimum value =  0<br> Maximum value =  4094
	* </pre>
	*/
	public void set_td(Long td) throws Exception{
		this.td = td;
	}

	/**
	* <pre>
	* Traffic Domain Id.<br> Minimum value =  0<br> Maximum value =  4094
	* </pre>
	*/
	public Long get_td() throws Exception {
		return this.td;
	}

	/**
	* <pre>
	* Drop incoming IPv6 packets that match the simple ACL6 rule.<br> Possible values = DENY
	* </pre>
	*/
	public void set_aclaction(String aclaction) throws Exception{
		this.aclaction = aclaction;
	}

	/**
	* <pre>
	* Drop incoming IPv6 packets that match the simple ACL6 rule.<br> Possible values = DENY
	* </pre>
	*/
	public String get_aclaction() throws Exception {
		return this.aclaction;
	}

	/**
	* <pre>
	* IP address to match against the source IP address of an incoming IPv6 packet.
	* </pre>
	*/
	public void set_srcipv6(String srcipv6) throws Exception{
		this.srcipv6 = srcipv6;
	}

	/**
	* <pre>
	* IP address to match against the source IP address of an incoming IPv6 packet.
	* </pre>
	*/
	public String get_srcipv6() throws Exception {
		return this.srcipv6;
	}

	/**
	* <pre>
	* Port number to match against the destination port number of an incoming IPv6 packet. 

Omitting the port number creates an all-ports simple ACL6 rule, which matches any port. In that case, you cannot create another simple ACL6 rule specifying a specific port and the same source IPv6 address.
	* </pre>
	*/
	public void set_destport(int destport) throws Exception {
		this.destport = new Integer(destport);
	}

	/**
	* <pre>
	* Port number to match against the destination port number of an incoming IPv6 packet. 

Omitting the port number creates an all-ports simple ACL6 rule, which matches any port. In that case, you cannot create another simple ACL6 rule specifying a specific port and the same source IPv6 address.
	* </pre>
	*/
	public void set_destport(Integer destport) throws Exception{
		this.destport = destport;
	}

	/**
	* <pre>
	* Port number to match against the destination port number of an incoming IPv6 packet. 

Omitting the port number creates an all-ports simple ACL6 rule, which matches any port. In that case, you cannot create another simple ACL6 rule specifying a specific port and the same source IPv6 address.
	* </pre>
	*/
	public Integer get_destport() throws Exception {
		return this.destport;
	}

	/**
	* <pre>
	* Protocol to match against the protocol of an incoming IPv6 packet. You must set this parameter if you set the Destination Port parameter.<br> Possible values = TCP, UDP
	* </pre>
	*/
	public void set_protocol(String protocol) throws Exception{
		this.protocol = protocol;
	}

	/**
	* <pre>
	* Protocol to match against the protocol of an incoming IPv6 packet. You must set this parameter if you set the Destination Port parameter.<br> Possible values = TCP, UDP
	* </pre>
	*/
	public String get_protocol() throws Exception {
		return this.protocol;
	}

	/**
	* <pre>
	* Number of seconds, in multiples of four, after which the simple ACL6 rule expires. If you do not want the simple ACL6 rule to expire, do not specify a TTL value.<br> Minimum value =  4<br> Maximum value =  2147483647
	* </pre>
	*/
	public void set_ttl(long ttl) throws Exception {
		this.ttl = new Long(ttl);
	}

	/**
	* <pre>
	* Number of seconds, in multiples of four, after which the simple ACL6 rule expires. If you do not want the simple ACL6 rule to expire, do not specify a TTL value.<br> Minimum value =  4<br> Maximum value =  2147483647
	* </pre>
	*/
	public void set_ttl(Long ttl) throws Exception{
		this.ttl = ttl;
	}

	/**
	* <pre>
	* Number of seconds, in multiples of four, after which the simple ACL6 rule expires. If you do not want the simple ACL6 rule to expire, do not specify a TTL value.<br> Minimum value =  4<br> Maximum value =  2147483647
	* </pre>
	*/
	public Long get_ttl() throws Exception {
		return this.ttl;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public void set_estsessions(boolean estsessions) throws Exception {
		this.estsessions = new Boolean(estsessions);
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public void set_estsessions(Boolean estsessions) throws Exception{
		this.estsessions = estsessions;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public Boolean get_estsessions() throws Exception {
		return this.estsessions;
	}

	/**
	* <pre>
	* Number of hits for this SACL6 rule.
	* </pre>
	*/
	public Long get_hits() throws Exception {
		return this.hits;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		nssimpleacl6_response result = (nssimpleacl6_response) service.get_payload_formatter().string_to_resource(nssimpleacl6_response.class, response);
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
		return result.nssimpleacl6;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.aclname;
	}

	/**
	* Use this API to add nssimpleacl6.
	*/
	public static base_response add(nitro_service client, nssimpleacl6 resource) throws Exception {
		nssimpleacl6 addresource = new nssimpleacl6();
		addresource.aclname = resource.aclname;
		addresource.td = resource.td;
		addresource.aclaction = resource.aclaction;
		addresource.srcipv6 = resource.srcipv6;
		addresource.destport = resource.destport;
		addresource.protocol = resource.protocol;
		addresource.ttl = resource.ttl;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add nssimpleacl6 resources.
	*/
	public static base_responses add(nitro_service client, nssimpleacl6 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nssimpleacl6 addresources[] = new nssimpleacl6[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new nssimpleacl6();
				addresources[i].aclname = resources[i].aclname;
				addresources[i].td = resources[i].td;
				addresources[i].aclaction = resources[i].aclaction;
				addresources[i].srcipv6 = resources[i].srcipv6;
				addresources[i].destport = resources[i].destport;
				addresources[i].protocol = resources[i].protocol;
				addresources[i].ttl = resources[i].ttl;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to clear nssimpleacl6.
	*/
	public static base_response clear(nitro_service client) throws Exception {
		nssimpleacl6 clearresource = new nssimpleacl6();
		return clearresource.perform_operation(client,"clear");
	}

	/**
	* Use this API to clear nssimpleacl6 resources.
	*/
	public static base_responses clear(nitro_service client, nssimpleacl6 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nssimpleacl6 clearresources[] = new nssimpleacl6[resources.length];
			for (int i=0;i<resources.length;i++){
				clearresources[i] = new nssimpleacl6();
			}
			result = perform_operation_bulk_request(client, clearresources,"clear");
		}
		return result;
	}

	/**
	* Use this API to flush nssimpleacl6.
	*/
	public static base_response flush(nitro_service client, nssimpleacl6 resource) throws Exception {
		nssimpleacl6 flushresource = new nssimpleacl6();
		flushresource.estsessions = resource.estsessions;
		return flushresource.perform_operation(client,"flush");
	}

	/**
	* Use this API to flush nssimpleacl6 resources.
	*/
	public static base_responses flush(nitro_service client, nssimpleacl6 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nssimpleacl6 flushresources[] = new nssimpleacl6[resources.length];
			for (int i=0;i<resources.length;i++){
				flushresources[i] = new nssimpleacl6();
				flushresources[i].estsessions = resources[i].estsessions;
			}
			result = perform_operation_bulk_request(client, flushresources,"flush");
		}
		return result;
	}

	/**
	* Use this API to delete nssimpleacl6 of given name.
	*/
	public static base_response delete(nitro_service client, String aclname) throws Exception {
		nssimpleacl6 deleteresource = new nssimpleacl6();
		deleteresource.aclname = aclname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete nssimpleacl6.
	*/
	public static base_response delete(nitro_service client, nssimpleacl6 resource) throws Exception {
		nssimpleacl6 deleteresource = new nssimpleacl6();
		deleteresource.aclname = resource.aclname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete nssimpleacl6 resources of given names.
	*/
	public static base_responses delete(nitro_service client, String aclname[]) throws Exception {
		base_responses result = null;
		if (aclname != null && aclname.length > 0) {
			nssimpleacl6 deleteresources[] = new nssimpleacl6[aclname.length];
			for (int i=0;i<aclname.length;i++){
				deleteresources[i] = new nssimpleacl6();
				deleteresources[i].aclname = aclname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete nssimpleacl6 resources.
	*/
	public static base_responses delete(nitro_service client, nssimpleacl6 resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nssimpleacl6 deleteresources[] = new nssimpleacl6[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new nssimpleacl6();
				deleteresources[i].aclname = resources[i].aclname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the nssimpleacl6 resources that are configured on netscaler.
	*/
	public static nssimpleacl6[] get(nitro_service service) throws Exception{
		nssimpleacl6 obj = new nssimpleacl6();
		nssimpleacl6[] response = (nssimpleacl6[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the nssimpleacl6 resources that are configured on netscaler.
	*/
	public static nssimpleacl6[] get(nitro_service service, options option) throws Exception{
		nssimpleacl6 obj = new nssimpleacl6();
		nssimpleacl6[] response = (nssimpleacl6[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch nssimpleacl6 resource of given name .
	*/
	public static nssimpleacl6 get(nitro_service service, String aclname) throws Exception{
		nssimpleacl6 obj = new nssimpleacl6();
		obj.set_aclname(aclname);
		nssimpleacl6 response = (nssimpleacl6) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch nssimpleacl6 resources of given names .
	*/
	public static nssimpleacl6[] get(nitro_service service, String aclname[]) throws Exception{
		if (aclname !=null && aclname.length>0) {
			nssimpleacl6 response[] = new nssimpleacl6[aclname.length];
			nssimpleacl6 obj[] = new nssimpleacl6[aclname.length];
			for (int i=0;i<aclname.length;i++) {
				obj[i] = new nssimpleacl6();
				obj[i].set_aclname(aclname[i]);
				response[i] = (nssimpleacl6) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of nssimpleacl6 resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static nssimpleacl6[] get_filtered(nitro_service service, String filter) throws Exception{
		nssimpleacl6 obj = new nssimpleacl6();
		options option = new options();
		option.set_filter(filter);
		nssimpleacl6[] response = (nssimpleacl6[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of nssimpleacl6 resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static nssimpleacl6[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nssimpleacl6 obj = new nssimpleacl6();
		options option = new options();
		option.set_filter(filter);
		nssimpleacl6[] response = (nssimpleacl6[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the nssimpleacl6 resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		nssimpleacl6 obj = new nssimpleacl6();
		options option = new options();
		option.set_count(true);
		nssimpleacl6[] response = (nssimpleacl6[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of nssimpleacl6 resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		nssimpleacl6 obj = new nssimpleacl6();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nssimpleacl6[] response = (nssimpleacl6[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of nssimpleacl6 resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nssimpleacl6 obj = new nssimpleacl6();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nssimpleacl6[] response = (nssimpleacl6[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class protocolEnum {
		public static final String TCP = "TCP";
		public static final String UDP = "UDP";
	}
	public static class aclactionEnum {
		public static final String DENY = "DENY";
	}
}
