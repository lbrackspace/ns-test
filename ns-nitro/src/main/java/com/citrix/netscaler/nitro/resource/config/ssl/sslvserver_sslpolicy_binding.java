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

class sslvserver_sslpolicy_binding_response extends base_response
{
	public sslvserver_sslpolicy_binding[] sslvserver_sslpolicy_binding;
}
/**
	* Binding class showing the sslpolicy that can be bound to sslvserver.
	*/

public class sslvserver_sslpolicy_binding extends base_resource
{
	private String policyname;
	private Long priority;
	private Long polinherit;
	private String vservername;
	private String gotopriorityexpression;
	private Boolean invoke;
	private String labeltype;
	private String labelname;
	private Long __count;

	/**
	* <pre>
	* The priority of the policies bound to this SSL service.
	* </pre>
	*/
	public void set_priority(long priority) throws Exception {
		this.priority = new Long(priority);
	}

	/**
	* <pre>
	* The priority of the policies bound to this SSL service.
	* </pre>
	*/
	public void set_priority(Long priority) throws Exception{
		this.priority = priority;
	}

	/**
	* <pre>
	* The priority of the policies bound to this SSL service.
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* The name of the SSL policy binding.
	* </pre>
	*/
	public void set_policyname(String policyname) throws Exception{
		this.policyname = policyname;
	}

	/**
	* <pre>
	* The name of the SSL policy binding.
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
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
		This field is applicable only to rewrite and responder policies.<br> Default value: "END"
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
		This field is applicable only to rewrite and responder policies.<br> Default value: "END"
	* </pre>
	*/
	public String get_gotopriorityexpression() throws Exception {
		return this.gotopriorityexpression;
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
	* Type of SSL policy label invocation. Applicable to SSL, rewrite and cache policies.<br> Possible values = vserver, service, policylabel
	* </pre>
	*/
	public void set_labeltype(String labeltype) throws Exception{
		this.labeltype = labeltype;
	}

	/**
	* <pre>
	* Type of SSL policy label invocation. Applicable to SSL, rewrite and cache policies.<br> Possible values = vserver, service, policylabel
	* </pre>
	*/
	public String get_labeltype() throws Exception {
		return this.labeltype;
	}

	/**
	* <pre>
	* The name of the SSL virtual server to which the SSL policy needs to be bound.<br> Minimum length =  1
	* </pre>
	*/
	public void set_vservername(String vservername) throws Exception{
		this.vservername = vservername;
	}

	/**
	* <pre>
	* The name of the SSL virtual server to which the SSL policy needs to be bound.<br> Minimum length =  1
	* </pre>
	*/
	public String get_vservername() throws Exception {
		return this.vservername;
	}

	/**
	* <pre>
	* Whether the bound policy is a inherited policy or not.
	* </pre>
	*/
	public Long get_polinherit() throws Exception {
		return this.polinherit;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		sslvserver_sslpolicy_binding_response result = (sslvserver_sslpolicy_binding_response) service.get_payload_formatter().string_to_resource(sslvserver_sslpolicy_binding_response.class, response);
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
		return result.sslvserver_sslpolicy_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.vservername;
	}

	public static base_response add(nitro_service client, sslvserver_sslpolicy_binding resource) throws Exception {
		sslvserver_sslpolicy_binding updateresource = new sslvserver_sslpolicy_binding();
		updateresource.vservername = resource.vservername;
		updateresource.policyname = resource.policyname;
		updateresource.priority = resource.priority;
		updateresource.gotopriorityexpression = resource.gotopriorityexpression;
		updateresource.invoke = resource.invoke;
		updateresource.labeltype = resource.labeltype;
		updateresource.labelname = resource.labelname;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, sslvserver_sslpolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslvserver_sslpolicy_binding updateresources[] = new sslvserver_sslpolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new sslvserver_sslpolicy_binding();
				updateresources[i].vservername = resources[i].vservername;
				updateresources[i].policyname = resources[i].policyname;
				updateresources[i].priority = resources[i].priority;
				updateresources[i].gotopriorityexpression = resources[i].gotopriorityexpression;
				updateresources[i].invoke = resources[i].invoke;
				updateresources[i].labeltype = resources[i].labeltype;
				updateresources[i].labelname = resources[i].labelname;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, sslvserver_sslpolicy_binding resource) throws Exception {
		sslvserver_sslpolicy_binding deleteresource = new sslvserver_sslpolicy_binding();
		deleteresource.vservername = resource.vservername;
		deleteresource.policyname = resource.policyname;
		deleteresource.priority = resource.priority;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, sslvserver_sslpolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslvserver_sslpolicy_binding deleteresources[] = new sslvserver_sslpolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new sslvserver_sslpolicy_binding();
				deleteresources[i].vservername = resources[i].vservername;
				deleteresources[i].policyname = resources[i].policyname;
				deleteresources[i].priority = resources[i].priority;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch sslvserver_sslpolicy_binding resources of given name .
	*/
	public static sslvserver_sslpolicy_binding[] get(nitro_service service, String vservername) throws Exception{
		sslvserver_sslpolicy_binding obj = new sslvserver_sslpolicy_binding();
		obj.set_vservername(vservername);
		sslvserver_sslpolicy_binding response[] = (sslvserver_sslpolicy_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sslvserver_sslpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static sslvserver_sslpolicy_binding[] get_filtered(nitro_service service, String vservername, String filter) throws Exception{
		sslvserver_sslpolicy_binding obj = new sslvserver_sslpolicy_binding();
		obj.set_vservername(vservername);
		options option = new options();
		option.set_filter(filter);
		sslvserver_sslpolicy_binding[] response = (sslvserver_sslpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sslvserver_sslpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static sslvserver_sslpolicy_binding[] get_filtered(nitro_service service, String vservername, filtervalue[] filter) throws Exception{
		sslvserver_sslpolicy_binding obj = new sslvserver_sslpolicy_binding();
		obj.set_vservername(vservername);
		options option = new options();
		option.set_filter(filter);
		sslvserver_sslpolicy_binding[] response = (sslvserver_sslpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count sslvserver_sslpolicy_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String vservername) throws Exception{
		sslvserver_sslpolicy_binding obj = new sslvserver_sslpolicy_binding();
		obj.set_vservername(vservername);
		options option = new options();
		option.set_count(true);
		sslvserver_sslpolicy_binding response[] = (sslvserver_sslpolicy_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of sslvserver_sslpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String vservername, String filter) throws Exception{
		sslvserver_sslpolicy_binding obj = new sslvserver_sslpolicy_binding();
		obj.set_vservername(vservername);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslvserver_sslpolicy_binding[] response = (sslvserver_sslpolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of sslvserver_sslpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String vservername, filtervalue[] filter) throws Exception{
		sslvserver_sslpolicy_binding obj = new sslvserver_sslpolicy_binding();
		obj.set_vservername(vservername);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslvserver_sslpolicy_binding[] response = (sslvserver_sslpolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class ocspcheckEnum {
		public static final String Mandatory = "Mandatory";
		public static final String Optional = "Optional";
	}
	public static class crlcheckEnum {
		public static final String Mandatory = "Mandatory";
		public static final String Optional = "Optional";
	}
	public static class labeltypeEnum {
		public static final String vserver = "vserver";
		public static final String service = "service";
		public static final String policylabel = "policylabel";
	}

}