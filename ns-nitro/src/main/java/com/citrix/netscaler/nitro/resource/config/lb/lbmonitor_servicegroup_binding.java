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

class lbmonitor_servicegroup_binding_response extends base_response
{
	public lbmonitor_servicegroup_binding[] lbmonitor_servicegroup_binding;
}
/**
	* Binding class showing the servicegroup that can be bound to lbmonitor.
	*/

public class lbmonitor_servicegroup_binding extends base_resource
{
	private String monitorname;
	private String servicename;
	private String dup_state;
	private Long dup_weight;
	private String servicegroupname;
	private String state;
	private Long weight;

	/**
	* <pre>
	* The name of the service group to which the monitor is to be bound.<br> Minimum length =  1
	* </pre>
	*/
	public void set_servicegroupname(String servicegroupname) throws Exception{
		this.servicegroupname = servicegroupname;
	}

	/**
	* <pre>
	* The name of the service group to which the monitor is to be bound.<br> Minimum length =  1
	* </pre>
	*/
	public String get_servicegroupname() throws Exception {
		return this.servicegroupname;
	}

	/**
	* <pre>
	* The state of the monitor. If the monitor is enabled, probes of the monitor's type are sent to the service. If the monitor is disabled, probes of the monitor's type are not sent to the service.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_dup_state(String dup_state) throws Exception{
		this.dup_state = dup_state;
	}

	/**
	* <pre>
	* The state of the monitor. If the monitor is enabled, probes of the monitor's type are sent to the service. If the monitor is disabled, probes of the monitor's type are not sent to the service.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_dup_state() throws Exception {
		return this.dup_state;
	}

	/**
	* <pre>
	* The name of the service or a service group to which the monitor is to be bound.<br> Minimum length =  1
	* </pre>
	*/
	public void set_servicename(String servicename) throws Exception{
		this.servicename = servicename;
	}

	/**
	* <pre>
	* The name of the service or a service group to which the monitor is to be bound.<br> Minimum length =  1
	* </pre>
	*/
	public String get_servicename() throws Exception {
		return this.servicename;
	}

	/**
	* <pre>
	* The state of the monitor. If the monitor is enabled, probes of the monitor's type are sent to the service. If the monitor is disabled, probes of the monitor's type are not sent to the service.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* The state of the monitor. If the monitor is enabled, probes of the monitor's type are sent to the service. If the monitor is disabled, probes of the monitor's type are not sent to the service.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* The weight for the specified service monitor binding.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_dup_weight(long dup_weight) throws Exception {
		this.dup_weight = new Long(dup_weight);
	}

	/**
	* <pre>
	* The weight for the specified service monitor binding.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_dup_weight(Long dup_weight) throws Exception{
		this.dup_weight = dup_weight;
	}

	/**
	* <pre>
	* The weight for the specified service monitor binding.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public Long get_dup_weight() throws Exception {
		return this.dup_weight;
	}

	/**
	* <pre>
	* The name of the monitor to be bound.<br> Minimum length =  1
	* </pre>
	*/
	public void set_monitorname(String monitorname) throws Exception{
		this.monitorname = monitorname;
	}

	/**
	* <pre>
	* The name of the monitor to be bound.<br> Minimum length =  1
	* </pre>
	*/
	public String get_monitorname() throws Exception {
		return this.monitorname;
	}

	/**
	* <pre>
	* The weight for the specified service monitor binding.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_weight(long weight) throws Exception {
		this.weight = new Long(weight);
	}

	/**
	* <pre>
	* The weight for the specified service monitor binding.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_weight(Long weight) throws Exception{
		this.weight = weight;
	}

	/**
	* <pre>
	* The weight for the specified service monitor binding.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public Long get_weight() throws Exception {
		return this.weight;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		lbmonitor_servicegroup_binding_response result = (lbmonitor_servicegroup_binding_response) service.get_payload_formatter().string_to_resource(lbmonitor_servicegroup_binding_response.class, response);
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
		return result.lbmonitor_servicegroup_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.monitorname;
	}

	public static class dup_stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}

}