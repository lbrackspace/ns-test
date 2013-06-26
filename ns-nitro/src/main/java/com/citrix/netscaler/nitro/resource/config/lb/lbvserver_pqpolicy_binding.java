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

class lbvserver_pqpolicy_binding_response extends base_response
{
	public lbvserver_pqpolicy_binding[] lbvserver_pqpolicy_binding;
}
/**
	* Binding class showing the pqpolicy that can be bound to lbvserver.
	*/

public class lbvserver_pqpolicy_binding extends base_resource
{
	private String policyname;
	private String name;
	private Long priority;
	private String gotopriorityexpression;
	private String bindpoint;
	private Boolean invoke;
	private String labeltype;
	private String labelname;
	private Long __count;

	/**
	* <pre>
	* The priority for the policy.<br> Minimum value =  1<br> Maximum value =  2147483647
	* </pre>
	*/
	public void set_priority(long priority) throws Exception {
		this.priority = new Long(priority);
	}

	/**
	* <pre>
	* The priority for the policy.<br> Minimum value =  1<br> Maximum value =  2147483647
	* </pre>
	*/
	public void set_priority(Long priority) throws Exception{
		this.priority = priority;
	}

	/**
	* <pre>
	* The priority for the policy.<br> Minimum value =  1<br> Maximum value =  2147483647
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* Expression specifying the priority of the next policy which will get evaluated if the current policy rule evaluates to TRUE.
	o	If gotoPriorityExpression is not present or if it is equal to END then the policy bank evaluation ends here
	o	Else if the gotoPriorityExpression is equal to NEXT then the next policy in the priority order is evaluated.
	o	Else gotoPriorityExpression is evaluated. The result of gotoPriorityExpression (which has to be a number) is processed as follows:
		-	An UNDEF event is triggered if
			.	gotoPriorityExpression cannot be evaluated
			.	gotoPriorityExpression evaluates to number which is smaller than the maximum priority in the policy bank but is not same as any policy's priority
			.	gotoPriorityExpression evaluates to a priority that is smaller than the current policy's priority
		-	If the gotoPriorityExpression evaluates to the priority of the current policy then the next policy in the priority order is evaluated.
		-	If the gotoPriorityExpression evaluates to the priority of a policy further ahead in the list then that policy will be evaluated next.
		This field is applicable only to rewrite and responder policies.
	* </pre>
	*/
	public void set_gotopriorityexpression(String gotopriorityexpression) throws Exception{
		this.gotopriorityexpression = gotopriorityexpression;
	}

	/**
	* <pre>
	* Expression specifying the priority of the next policy which will get evaluated if the current policy rule evaluates to TRUE.
	o	If gotoPriorityExpression is not present or if it is equal to END then the policy bank evaluation ends here
	o	Else if the gotoPriorityExpression is equal to NEXT then the next policy in the priority order is evaluated.
	o	Else gotoPriorityExpression is evaluated. The result of gotoPriorityExpression (which has to be a number) is processed as follows:
		-	An UNDEF event is triggered if
			.	gotoPriorityExpression cannot be evaluated
			.	gotoPriorityExpression evaluates to number which is smaller than the maximum priority in the policy bank but is not same as any policy's priority
			.	gotoPriorityExpression evaluates to a priority that is smaller than the current policy's priority
		-	If the gotoPriorityExpression evaluates to the priority of the current policy then the next policy in the priority order is evaluated.
		-	If the gotoPriorityExpression evaluates to the priority of a policy further ahead in the list then that policy will be evaluated next.
		This field is applicable only to rewrite and responder policies.
	* </pre>
	*/
	public String get_gotopriorityexpression() throws Exception {
		return this.gotopriorityexpression;
	}

	/**
	* <pre>
	* Name of the policy bound to the LB vserver.
	* </pre>
	*/
	public void set_policyname(String policyname) throws Exception{
		this.policyname = policyname;
	}

	/**
	* <pre>
	* Name of the policy bound to the LB vserver.
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
	}

	/**
	* <pre>
	* The virtual server name to which the service is bound.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The virtual server name to which the service is bound.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Bindpoint, specifying where to bind the policy. This field is applicable only to rewrite and cache policies.<br> Possible values = REQUEST, RESPONSE
	* </pre>
	*/
	public void set_bindpoint(String bindpoint) throws Exception{
		this.bindpoint = bindpoint;
	}

	/**
	* <pre>
	* Bindpoint, specifying where to bind the policy. This field is applicable only to rewrite and cache policies.<br> Possible values = REQUEST, RESPONSE
	* </pre>
	*/
	public String get_bindpoint() throws Exception {
		return this.bindpoint;
	}

	/**
	* <pre>
	* Type of policy label invocation. Applicable only to rewrite and cache policies.<br> Possible values = reqvserver, resvserver, policylabel
	* </pre>
	*/
	public void set_labeltype(String labeltype) throws Exception{
		this.labeltype = labeltype;
	}

	/**
	* <pre>
	* Type of policy label invocation. Applicable only to rewrite and cache policies.<br> Possible values = reqvserver, resvserver, policylabel
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
	public void set_labelname(String labelname) throws Exception{
		this.labelname = labelname;
	}

	/**
	* <pre>
	* Name of the label to invoke if the current policy rule evaluates to TRUE.
	* </pre>
	*/
	public String get_labelname() throws Exception {
		return this.labelname;
	}

	/**
	* <pre>
	* Invoke flag.
	* </pre>
	*/
	public void set_invoke(boolean invoke) throws Exception {
		this.invoke = new Boolean(invoke);
	}

	/**
	* <pre>
	* Invoke flag.
	* </pre>
	*/
	public void set_invoke(Boolean invoke) throws Exception{
		this.invoke = invoke;
	}

	/**
	* <pre>
	* Invoke flag.
	* </pre>
	*/
	public Boolean get_invoke() throws Exception {
		return this.invoke;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		lbvserver_pqpolicy_binding_response result = (lbvserver_pqpolicy_binding_response) service.get_payload_formatter().string_to_resource(lbvserver_pqpolicy_binding_response.class, response);
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
		return result.lbvserver_pqpolicy_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	public static base_response add(nitro_service client, lbvserver_pqpolicy_binding resource) throws Exception {
		lbvserver_pqpolicy_binding updateresource = new lbvserver_pqpolicy_binding();
		updateresource.name = resource.name;
		updateresource.policyname = resource.policyname;
		updateresource.priority = resource.priority;
		updateresource.gotopriorityexpression = resource.gotopriorityexpression;
		updateresource.bindpoint = resource.bindpoint;
		updateresource.invoke = resource.invoke;
		updateresource.labeltype = resource.labeltype;
		updateresource.labelname = resource.labelname;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, lbvserver_pqpolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lbvserver_pqpolicy_binding updateresources[] = new lbvserver_pqpolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new lbvserver_pqpolicy_binding();
				updateresources[i].name = resources[i].name;
				updateresources[i].policyname = resources[i].policyname;
				updateresources[i].priority = resources[i].priority;
				updateresources[i].gotopriorityexpression = resources[i].gotopriorityexpression;
				updateresources[i].bindpoint = resources[i].bindpoint;
				updateresources[i].invoke = resources[i].invoke;
				updateresources[i].labeltype = resources[i].labeltype;
				updateresources[i].labelname = resources[i].labelname;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, lbvserver_pqpolicy_binding resource) throws Exception {
		lbvserver_pqpolicy_binding deleteresource = new lbvserver_pqpolicy_binding();
		deleteresource.name = resource.name;
		deleteresource.policyname = resource.policyname;
		deleteresource.bindpoint = resource.bindpoint;
		deleteresource.priority = resource.priority;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, lbvserver_pqpolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			lbvserver_pqpolicy_binding deleteresources[] = new lbvserver_pqpolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new lbvserver_pqpolicy_binding();
				deleteresources[i].name = resources[i].name;
				deleteresources[i].policyname = resources[i].policyname;
				deleteresources[i].bindpoint = resources[i].bindpoint;
				deleteresources[i].priority = resources[i].priority;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch lbvserver_pqpolicy_binding resources of given name .
	*/
	public static lbvserver_pqpolicy_binding[] get(nitro_service service, String name) throws Exception{
		lbvserver_pqpolicy_binding obj = new lbvserver_pqpolicy_binding();
		obj.set_name(name);
		lbvserver_pqpolicy_binding response[] = (lbvserver_pqpolicy_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of lbvserver_pqpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static lbvserver_pqpolicy_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		lbvserver_pqpolicy_binding obj = new lbvserver_pqpolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		lbvserver_pqpolicy_binding[] response = (lbvserver_pqpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of lbvserver_pqpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static lbvserver_pqpolicy_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		lbvserver_pqpolicy_binding obj = new lbvserver_pqpolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		lbvserver_pqpolicy_binding[] response = (lbvserver_pqpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count lbvserver_pqpolicy_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		lbvserver_pqpolicy_binding obj = new lbvserver_pqpolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		lbvserver_pqpolicy_binding response[] = (lbvserver_pqpolicy_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of lbvserver_pqpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		lbvserver_pqpolicy_binding obj = new lbvserver_pqpolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		lbvserver_pqpolicy_binding[] response = (lbvserver_pqpolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of lbvserver_pqpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		lbvserver_pqpolicy_binding obj = new lbvserver_pqpolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		lbvserver_pqpolicy_binding[] response = (lbvserver_pqpolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class bindpointEnum {
		public static final String REQUEST = "REQUEST";
		public static final String RESPONSE = "RESPONSE";
	}
	public static class labeltypeEnum {
		public static final String reqvserver = "reqvserver";
		public static final String resvserver = "resvserver";
		public static final String policylabel = "policylabel";
	}

}