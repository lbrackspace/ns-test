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

class sslcipher_servicegroup_binding_response extends base_response
{
	public sslcipher_servicegroup_binding[] sslcipher_servicegroup_binding;
}
/**
	* Binding class showing the servicegroup that can be bound to sslcipher.
	*/

public class sslcipher_servicegroup_binding extends base_resource
{
	private String ciphergroupname;
	private String servicename;
	private Boolean service;
	private String servicegroupname;
	private Boolean servicegroup;
	private String cipheroperation;
	private String ciphgrpals;

	/**
	* <pre>
	* The name of the user-defined cipher group.
	If the cipher group does not exist on the system, a new group is created with the specified name. The ciphers are added to this group.
	If a group identified by cipherGroupName already exists on the system, the ciphers are added to it.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ciphergroupname(String ciphergroupname) throws Exception{
		this.ciphergroupname = ciphergroupname;
	}

	/**
	* <pre>
	* The name of the user-defined cipher group.
	If the cipher group does not exist on the system, a new group is created with the specified name. The ciphers are added to this group.
	If a group identified by cipherGroupName already exists on the system, the ciphers are added to it.<br> Minimum length =  1
	* </pre>
	*/
	public String get_ciphergroupname() throws Exception {
		return this.ciphergroupname;
	}

	/**
	* <pre>
	* A cipher-suite can consist of an individual cipher name, the system predefined cipher-alias name, or user defined cipher-group name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ciphgrpals(String ciphgrpals) throws Exception{
		this.ciphgrpals = ciphgrpals;
	}

	/**
	* <pre>
	* A cipher-suite can consist of an individual cipher name, the system predefined cipher-alias name, or user defined cipher-group name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_ciphgrpals() throws Exception {
		return this.ciphgrpals;
	}

	/**
	* <pre>
	* The operation that is performed when adding the cipher-suite.

Possible cipher operations are:
	ADD - Appends the given cipher-suite to the existing one configured for the virtual server.
	REM - Removes the given cipher-suite from the existing one configured for the virtual server.
	ORD - Overrides the current configured cipher-suite for the virtual server with the given cipher-suite.<br> Default value: 6<br> Possible values = ADD, REM, ORD
	* </pre>
	*/
	public void set_cipheroperation(String cipheroperation) throws Exception{
		this.cipheroperation = cipheroperation;
	}

	/**
	* <pre>
	* The operation that is performed when adding the cipher-suite.

Possible cipher operations are:
	ADD - Appends the given cipher-suite to the existing one configured for the virtual server.
	REM - Removes the given cipher-suite from the existing one configured for the virtual server.
	ORD - Overrides the current configured cipher-suite for the virtual server with the given cipher-suite.<br> Default value: 6<br> Possible values = ADD, REM, ORD
	* </pre>
	*/
	public String get_cipheroperation() throws Exception {
		return this.cipheroperation;
	}

	/**
	* <pre>
	* The name of the SSL service name to which the cipher-suite is to be bound.<br> Minimum length =  1
	* </pre>
	*/
	public void set_servicegroupname(String servicegroupname) throws Exception{
		this.servicegroupname = servicegroupname;
	}

	/**
	* <pre>
	* The name of the SSL service name to which the cipher-suite is to be bound.<br> Minimum length =  1
	* </pre>
	*/
	public String get_servicegroupname() throws Exception {
		return this.servicegroupname;
	}

	/**
	* <pre>
	* Indicates that the cipher operation is to be performed on the named SSL service or service group.
	* </pre>
	*/
	public void set_servicegroup(boolean servicegroup) throws Exception {
		this.servicegroup = new Boolean(servicegroup);
	}

	/**
	* <pre>
	* Indicates that the cipher operation is to be performed on the named SSL service or service group.
	* </pre>
	*/
	public void set_servicegroup(Boolean servicegroup) throws Exception{
		this.servicegroup = servicegroup;
	}

	/**
	* <pre>
	* Indicates that the cipher operation is to be performed on the named SSL service or service group.
	* </pre>
	*/
	public Boolean get_servicegroup() throws Exception {
		return this.servicegroup;
	}

	/**
	* <pre>
	* Indicates that the cipher operation is to be performed on the named SSL service or service group.
	* </pre>
	*/
	public void set_service(boolean service) throws Exception {
		this.service = new Boolean(service);
	}

	/**
	* <pre>
	* Indicates that the cipher operation is to be performed on the named SSL service or service group.
	* </pre>
	*/
	public void set_service(Boolean service) throws Exception{
		this.service = service;
	}

	/**
	* <pre>
	* Indicates that the cipher operation is to be performed on the named SSL service or service group.
	* </pre>
	*/
	public Boolean get_service() throws Exception {
		return this.service;
	}

	/**
	* <pre>
	* The name of the SSL service name to which the cipher-suite is to be bound.<br> Minimum length =  1
	* </pre>
	*/
	public void set_servicename(String servicename) throws Exception{
		this.servicename = servicename;
	}

	/**
	* <pre>
	* The name of the SSL service name to which the cipher-suite is to be bound.<br> Minimum length =  1
	* </pre>
	*/
	public String get_servicename() throws Exception {
		return this.servicename;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		sslcipher_servicegroup_binding_response result = (sslcipher_servicegroup_binding_response) service.get_payload_formatter().string_to_resource(sslcipher_servicegroup_binding_response.class, response);
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
		return result.sslcipher_servicegroup_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.ciphergroupname;
	}

	public static class cipheroperationEnum {
		public static final String ADD = "ADD";
		public static final String REM = "REM";
		public static final String ORD = "ORD";
	}

}