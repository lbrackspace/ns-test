/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.stat.transform;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class transformpolicylabel_response extends base_response
{
	public transformpolicylabel_stats[] transformpolicylabel;
}
/**
* Statistics for transform policy label resource.
*/

public class transformpolicylabel_stats extends base_resource
{
	private String labelname;
	private Long pipolicylabelhits;
	private Long pipolicylabelhitsrate;

	/**
	* <pre>
	* The name of the transform policy label for which statistics will be displayed.  If not given statistics are shown for all transform policylabels.
	* </pre>
	*/
	public void set_labelname(String labelname) throws Exception{
		this.labelname = labelname;
	}

	/**
	* <pre>
	* The name of the transform policy label for which statistics will be displayed.  If not given statistics are shown for all transform policylabels.<br> Minimum length =  1
	* </pre>
	*/
	public String get_labelname() throws Exception {
		return this.labelname;
	}

	/**
	* <pre>
	* Number of times policy label was invoked. 
	* </pre>
	*/
	public Long get_pipolicylabelhitsrate() throws Exception {
		return this.pipolicylabelhitsrate;
	}

	/**
	* <pre>
	* Number of times policy label was invoked. 
	* </pre>
	*/
	public Long get_pipolicylabelhits() throws Exception {
		return this.pipolicylabelhits;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		transformpolicylabel_response result = (transformpolicylabel_response) service.get_payload_formatter().string_to_resource(transformpolicylabel_response.class, response);
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
		return result.transformpolicylabel;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.labelname;
	}

	/**
	* Use this API to fetch the statistics of all transformpolicylabel_stats resources that are configured on netscaler.
	*/
	public static transformpolicylabel_stats[] get(nitro_service service) throws Exception{
		transformpolicylabel_stats obj = new transformpolicylabel_stats();
		transformpolicylabel_stats[] response = (transformpolicylabel_stats[])obj.stat_resources(service);
		return response;
	}

	/**
	* Use this API to fetch the statistics of all transformpolicylabel_stats resources that are configured on netscaler.
	*/
	public static transformpolicylabel_stats[] get(nitro_service service, options option) throws Exception{
		transformpolicylabel_stats obj = new transformpolicylabel_stats();
		transformpolicylabel_stats[] response = (transformpolicylabel_stats[])obj.stat_resources(service,option);
		return response;
	}

	/**
	* Use this API to fetch statistics of transformpolicylabel_stats resource of given name .
	*/
	public static transformpolicylabel_stats get(nitro_service service, String labelname) throws Exception{
		transformpolicylabel_stats obj = new transformpolicylabel_stats();
		obj.set_labelname(labelname);
		transformpolicylabel_stats response = (transformpolicylabel_stats) obj.stat_resource(service);
		return response;
	}

}