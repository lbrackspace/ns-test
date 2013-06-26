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

import com.citrix.netscaler.nitro.resource.config.network.vrid_nsip6_binding;
import com.citrix.netscaler.nitro.resource.config.network.vrid_interface_binding;
import com.citrix.netscaler.nitro.resource.config.network.vrid_nsip_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class vrid_binding_response extends base_response
{
	public vrid_binding[] vrid_binding;
}
/**
	* Binding class showing the resources that can be bound to vrid_binding. 
	*/

public class vrid_binding extends base_resource
{
	private Long id;
	private vrid_nsip6_binding	vrid_nsip6_binding[] = null;
	private vrid_interface_binding	vrid_interface_binding[] = null;
	private vrid_nsip_binding	vrid_nsip_binding[] = null;

	/**
	* <pre>
	* An integer value that uniquely identifies the VMAC address.<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public void set_id(long id) throws Exception {
		this.id = new Long(id);
	}

	/**
	* <pre>
	* An integer value that uniquely identifies the VMAC address.<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public void set_id(Long id) throws Exception{
		this.id = id;
	}

	/**
	* <pre>
	* An integer value that uniquely identifies the VMAC address.<br> Minimum value =  1<br> Maximum value =  255
	* </pre>
	*/
	public Long get_id() throws Exception {
		return this.id;
	}

	/**
	* <pre>
	* nsip6 that can be bound to vrid.
	* </pre>
	*/
	public vrid_nsip6_binding[] get_vrid_nsip6_bindings() throws Exception {
		return this.vrid_nsip6_binding;
	}

	/**
	* <pre>
	* nsip that can be bound to vrid.
	* </pre>
	*/
	public vrid_nsip_binding[] get_vrid_nsip_bindings() throws Exception {
		return this.vrid_nsip_binding;
	}

	/**
	* <pre>
	* interface that can be bound to vrid.
	* </pre>
	*/
	public vrid_interface_binding[] get_vrid_interface_bindings() throws Exception {
		return this.vrid_interface_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		vrid_binding_response result = (vrid_binding_response) service.get_payload_formatter().string_to_resource(vrid_binding_response.class, response);
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
		return result.vrid_binding;
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

	/**
	* Use this API to fetch vrid_binding resource of given name .
	*/
	public static vrid_binding get(nitro_service service, Long id) throws Exception{
		vrid_binding obj = new vrid_binding();
		obj.set_id(id);
		vrid_binding response = (vrid_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch vrid_binding resources of given names .
	*/
	public static vrid_binding[] get(nitro_service service, Long id[]) throws Exception{
		if (id !=null && id.length>0) {
			vrid_binding response[] = new vrid_binding[id.length];
			vrid_binding obj[] = new vrid_binding[id.length];
			for (int i=0;i<id.length;i++) {
				obj[i] = new vrid_binding();
				obj[i].set_id(id[i]);
				response[i] = (vrid_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}