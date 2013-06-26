/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.base;

import com.citrix.netscaler.nitro.service.nitro_service;


/**
 * Nitro loginchallengeresponse resource class.
 */
public class loginchallengeresponse extends base_resource{
	private String response;
	
	
	/**
	 * loginchallengeresponse class constructor specifying challenge response.
	 * @param response response for the security question.
	 */
	public loginchallengeresponse(String response) 
	{
		this.response = response;
	}
	
	/**
	 * 
	 */
	protected String get_object_name() 
	{
		return null;
	}
	
	/**
	 * gets the Nitro responce.
	 */
	protected  base_resource[] get_nitro_response(nitro_service service, String response) 
	{
		return null;
	}
	
}
