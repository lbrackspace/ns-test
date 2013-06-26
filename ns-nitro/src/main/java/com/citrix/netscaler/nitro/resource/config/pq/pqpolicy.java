/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.pq;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class pqpolicy_response extends base_response
{
	public pqpolicy[] pqpolicy;
}
/**
* Configuration for PQ policy resource.
*/

public class pqpolicy extends base_resource
{
	private String policyname;
	private String rule;
	private Long priority;
	private Long weight;
	private Long qdepth;
	private Long polqdepth;

	//------- Read only Parameter ---------;

	private Long hits;
	private Long __count;

	/**
	* <pre>
	* The name for the priority queuing policy. The name can include a maximum of 31 characters that include letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at sign (@), equals (=), colon (:), and underscore (_) symbols. The name can begin with a letter, number, or the underscore (_) symbol.<br> Minimum length =  1
	* </pre>
	*/
	public void set_policyname(String policyname) throws Exception{
		this.policyname = policyname;
	}

	/**
	* <pre>
	* The name for the priority queuing policy. The name can include a maximum of 31 characters that include letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at sign (@), equals (=), colon (:), and underscore (_) symbols. The name can begin with a letter, number, or the underscore (_) symbol.<br> Minimum length =  1
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
	}

	/**
	* <pre>
	* The condition for applying the policy. When requests are received by a system, they are classified into different priority levels based on the expression logic that they match.
Expression logic is expression names, separated by the logical operators || and &&, and possibly grouped using parenthesis. If the expression contains blanks (for example, between an expression name and a logical operator), then the entire argument must be enclosed in double quotes.
The following are valid expression logic:
- ns_ext_cgi||ns_ext_asp
- ns_non_get && (ns_header_cookie||ns_header_pragma)
When a request comes to the system, it is prioritized based on the expression list that is matched.
	* </pre>
	*/
	public void set_rule(String rule) throws Exception{
		this.rule = rule;
	}

	/**
	* <pre>
	* The condition for applying the policy. When requests are received by a system, they are classified into different priority levels based on the expression logic that they match.
Expression logic is expression names, separated by the logical operators || and &&, and possibly grouped using parenthesis. If the expression contains blanks (for example, between an expression name and a logical operator), then the entire argument must be enclosed in double quotes.
The following are valid expression logic:
- ns_ext_cgi||ns_ext_asp
- ns_non_get && (ns_header_cookie||ns_header_pragma)
When a request comes to the system, it is prioritized based on the expression list that is matched.
	* </pre>
	*/
	public String get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* The priority of queuing the request. When a request matches the configured rule, and if server resources are not available, this option specifies a priority for queuing the request until server resources are available. Enter the value as a positive integer 1, 2 or 3. The highest priority is 1 and the lowest priority is 3.<br> Minimum value =  1<br> Maximum value =  3
	* </pre>
	*/
	public void set_priority(long priority) throws Exception {
		this.priority = new Long(priority);
	}

	/**
	* <pre>
	* The priority of queuing the request. When a request matches the configured rule, and if server resources are not available, this option specifies a priority for queuing the request until server resources are available. Enter the value as a positive integer 1, 2 or 3. The highest priority is 1 and the lowest priority is 3.<br> Minimum value =  1<br> Maximum value =  3
	* </pre>
	*/
	public void set_priority(Long priority) throws Exception{
		this.priority = priority;
	}

	/**
	* <pre>
	* The priority of queuing the request. When a request matches the configured rule, and if server resources are not available, this option specifies a priority for queuing the request until server resources are available. Enter the value as a positive integer 1, 2 or 3. The highest priority is 1 and the lowest priority is 3.<br> Minimum value =  1<br> Maximum value =  3
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* The weight for the priorty level. Each priority level is assigned a weight according to which it is served when server resources are available. The weight for a higher priority request must be set higher than that of a lower priority request. The default weights for the priority queues 1, 2, and 3 are 3, 2, and 1 respectively. 
Specify the weights as 0 through 101. A weight of 0 indicates that the particular priority level must be served only when there are no requests in any of the priority queues. A weight of 101 specifies a weight of infinity. This means that this priority level is served irrespective of the number of clients waiting in other priority queues.<br> Minimum value =  0<br> Maximum value =  101
	* </pre>
	*/
	public void set_weight(long weight) throws Exception {
		this.weight = new Long(weight);
	}

	/**
	* <pre>
	* The weight for the priorty level. Each priority level is assigned a weight according to which it is served when server resources are available. The weight for a higher priority request must be set higher than that of a lower priority request. The default weights for the priority queues 1, 2, and 3 are 3, 2, and 1 respectively. 
Specify the weights as 0 through 101. A weight of 0 indicates that the particular priority level must be served only when there are no requests in any of the priority queues. A weight of 101 specifies a weight of infinity. This means that this priority level is served irrespective of the number of clients waiting in other priority queues.<br> Minimum value =  0<br> Maximum value =  101
	* </pre>
	*/
	public void set_weight(Long weight) throws Exception{
		this.weight = weight;
	}

	/**
	* <pre>
	* The weight for the priorty level. Each priority level is assigned a weight according to which it is served when server resources are available. The weight for a higher priority request must be set higher than that of a lower priority request. The default weights for the priority queues 1, 2, and 3 are 3, 2, and 1 respectively. 
Specify the weights as 0 through 101. A weight of 0 indicates that the particular priority level must be served only when there are no requests in any of the priority queues. A weight of 101 specifies a weight of infinity. This means that this priority level is served irrespective of the number of clients waiting in other priority queues.<br> Minimum value =  0<br> Maximum value =  101
	* </pre>
	*/
	public Long get_weight() throws Exception {
		return this.weight;
	}

	/**
	* <pre>
	* The queue depth threshold value. When the number of waiting requests in the queue (or queue size) on the virtual server to which this policy is bound, increases to the specified qdepth value, any subsequent requests are dropped to the lowest priority level.<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_qdepth(long qdepth) throws Exception {
		this.qdepth = new Long(qdepth);
	}

	/**
	* <pre>
	* The queue depth threshold value. When the number of waiting requests in the queue (or queue size) on the virtual server to which this policy is bound, increases to the specified qdepth value, any subsequent requests are dropped to the lowest priority level.<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_qdepth(Long qdepth) throws Exception{
		this.qdepth = qdepth;
	}

	/**
	* <pre>
	* The queue depth threshold value. When the number of waiting requests in the queue (or queue size) on the virtual server to which this policy is bound, increases to the specified qdepth value, any subsequent requests are dropped to the lowest priority level.<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public Long get_qdepth() throws Exception {
		return this.qdepth;
	}

	/**
	* <pre>
	* The policy queue depth threshold value. When the number of waiting requests in all the queue belonging to this policy (or the policy queue size) increases to the specified polqdepth value, all subsequent requests are dropped to the lowest priority level.<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_polqdepth(long polqdepth) throws Exception {
		this.polqdepth = new Long(polqdepth);
	}

	/**
	* <pre>
	* The policy queue depth threshold value. When the number of waiting requests in all the queue belonging to this policy (or the policy queue size) increases to the specified polqdepth value, all subsequent requests are dropped to the lowest priority level.<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_polqdepth(Long polqdepth) throws Exception{
		this.polqdepth = polqdepth;
	}

	/**
	* <pre>
	* The policy queue depth threshold value. When the number of waiting requests in all the queue belonging to this policy (or the policy queue size) increases to the specified polqdepth value, all subsequent requests are dropped to the lowest priority level.<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public Long get_polqdepth() throws Exception {
		return this.polqdepth;
	}

	/**
	* <pre>
	* Total number of hits.
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
		pqpolicy_response result = (pqpolicy_response) service.get_payload_formatter().string_to_resource(pqpolicy_response.class, response);
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
		return result.pqpolicy;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.policyname;
	}

	/**
	* Use this API to add pqpolicy.
	*/
	public static base_response add(nitro_service client, pqpolicy resource) throws Exception {
		pqpolicy addresource = new pqpolicy();
		addresource.policyname = resource.policyname;
		addresource.rule = resource.rule;
		addresource.priority = resource.priority;
		addresource.weight = resource.weight;
		addresource.qdepth = resource.qdepth;
		addresource.polqdepth = resource.polqdepth;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add pqpolicy resources.
	*/
	public static base_responses add(nitro_service client, pqpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			pqpolicy addresources[] = new pqpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new pqpolicy();
				addresources[i].policyname = resources[i].policyname;
				addresources[i].rule = resources[i].rule;
				addresources[i].priority = resources[i].priority;
				addresources[i].weight = resources[i].weight;
				addresources[i].qdepth = resources[i].qdepth;
				addresources[i].polqdepth = resources[i].polqdepth;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete pqpolicy of given name.
	*/
	public static base_response delete(nitro_service client, String policyname) throws Exception {
		pqpolicy deleteresource = new pqpolicy();
		deleteresource.policyname = policyname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete pqpolicy.
	*/
	public static base_response delete(nitro_service client, pqpolicy resource) throws Exception {
		pqpolicy deleteresource = new pqpolicy();
		deleteresource.policyname = resource.policyname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete pqpolicy resources of given names.
	*/
	public static base_responses delete(nitro_service client, String policyname[]) throws Exception {
		base_responses result = null;
		if (policyname != null && policyname.length > 0) {
			pqpolicy deleteresources[] = new pqpolicy[policyname.length];
			for (int i=0;i<policyname.length;i++){
				deleteresources[i] = new pqpolicy();
				deleteresources[i].policyname = policyname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete pqpolicy resources.
	*/
	public static base_responses delete(nitro_service client, pqpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			pqpolicy deleteresources[] = new pqpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new pqpolicy();
				deleteresources[i].policyname = resources[i].policyname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update pqpolicy.
	*/
	public static base_response update(nitro_service client, pqpolicy resource) throws Exception {
		pqpolicy updateresource = new pqpolicy();
		updateresource.policyname = resource.policyname;
		updateresource.weight = resource.weight;
		updateresource.qdepth = resource.qdepth;
		updateresource.polqdepth = resource.polqdepth;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update pqpolicy resources.
	*/
	public static base_responses update(nitro_service client, pqpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			pqpolicy updateresources[] = new pqpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new pqpolicy();
				updateresources[i].policyname = resources[i].policyname;
				updateresources[i].weight = resources[i].weight;
				updateresources[i].qdepth = resources[i].qdepth;
				updateresources[i].polqdepth = resources[i].polqdepth;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of pqpolicy resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String policyname, String args[]) throws Exception {
		pqpolicy unsetresource = new pqpolicy();
		unsetresource.policyname = policyname;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of pqpolicy resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, pqpolicy resource, String[] args) throws Exception{
		pqpolicy unsetresource = new pqpolicy();
		unsetresource.policyname = resource.policyname;
		unsetresource.weight = resource.weight;
		unsetresource.qdepth = resource.qdepth;
		unsetresource.polqdepth = resource.polqdepth;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of pqpolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String policyname[], String args[]) throws Exception {
		base_responses result = null;
		if (policyname != null && policyname.length > 0) {
			pqpolicy unsetresources[] = new pqpolicy[policyname.length];
			for (int i=0;i<policyname.length;i++){
				unsetresources[i] = new pqpolicy();
				unsetresources[i].policyname = policyname[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of pqpolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, pqpolicy resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			pqpolicy unsetresources[] = new pqpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new pqpolicy();
				unsetresources[i].policyname = resources[i].policyname;
				unsetresources[i].weight = resources[i].weight;
				unsetresources[i].qdepth = resources[i].qdepth;
				unsetresources[i].polqdepth = resources[i].polqdepth;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the pqpolicy resources that are configured on netscaler.
	*/
	public static pqpolicy[] get(nitro_service service) throws Exception{
		pqpolicy obj = new pqpolicy();
		pqpolicy[] response = (pqpolicy[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the pqpolicy resources that are configured on netscaler.
	*/
	public static pqpolicy[] get(nitro_service service, options option) throws Exception{
		pqpolicy obj = new pqpolicy();
		pqpolicy[] response = (pqpolicy[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch pqpolicy resource of given name .
	*/
	public static pqpolicy get(nitro_service service, String policyname) throws Exception{
		pqpolicy obj = new pqpolicy();
		obj.set_policyname(policyname);
		pqpolicy response = (pqpolicy) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch pqpolicy resources of given names .
	*/
	public static pqpolicy[] get(nitro_service service, String policyname[]) throws Exception{
		if (policyname !=null && policyname.length>0) {
			pqpolicy response[] = new pqpolicy[policyname.length];
			pqpolicy obj[] = new pqpolicy[policyname.length];
			for (int i=0;i<policyname.length;i++) {
				obj[i] = new pqpolicy();
				obj[i].set_policyname(policyname[i]);
				response[i] = (pqpolicy) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of pqpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static pqpolicy[] get_filtered(nitro_service service, String filter) throws Exception{
		pqpolicy obj = new pqpolicy();
		options option = new options();
		option.set_filter(filter);
		pqpolicy[] response = (pqpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of pqpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static pqpolicy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		pqpolicy obj = new pqpolicy();
		options option = new options();
		option.set_filter(filter);
		pqpolicy[] response = (pqpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the pqpolicy resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		pqpolicy obj = new pqpolicy();
		options option = new options();
		option.set_count(true);
		pqpolicy[] response = (pqpolicy[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of pqpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		pqpolicy obj = new pqpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		pqpolicy[] response = (pqpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of pqpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		pqpolicy obj = new pqpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		pqpolicy[] response = (pqpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}