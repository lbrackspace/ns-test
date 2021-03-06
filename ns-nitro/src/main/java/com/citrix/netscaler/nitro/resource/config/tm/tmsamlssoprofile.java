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

package com.citrix.netscaler.nitro.resource.config.tm;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class tmsamlssoprofile_response extends base_response
{
	public tmsamlssoprofile[] tmsamlssoprofile;
}
/**
* Configuration for SAML sso action resource.
*/

public class tmsamlssoprofile extends base_resource
{
	private String name;
	private String samlsigningcertname;
	private String assertionconsumerserviceurl;
	private String relaystaterule;
	private String sendpassword;
	private String samlissuername;
	private Long __count;

	/**
	* <pre>
	* Name for the new saml single sign-on profile. Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters. Cannot be changed after an SSO action is created.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my action" or 'my action').<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the new saml single sign-on profile. Must begin with an ASCII alphanumeric or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters. Cannot be changed after an SSO action is created.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my action" or 'my action').<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Name of the signing authority as given in the SAML servers SSL certificate.<br> Minimum length =  1
	* </pre>
	*/
	public void set_samlsigningcertname(String samlsigningcertname) throws Exception{
		this.samlsigningcertname = samlsigningcertname;
	}

	/**
	* <pre>
	* Name of the signing authority as given in the SAML servers SSL certificate.<br> Minimum length =  1
	* </pre>
	*/
	public String get_samlsigningcertname() throws Exception {
		return this.samlsigningcertname;
	}

	/**
	* <pre>
	* URL to which the assertion is to be sent.<br> Minimum length =  1
	* </pre>
	*/
	public void set_assertionconsumerserviceurl(String assertionconsumerserviceurl) throws Exception{
		this.assertionconsumerserviceurl = assertionconsumerserviceurl;
	}

	/**
	* <pre>
	* URL to which the assertion is to be sent.<br> Minimum length =  1
	* </pre>
	*/
	public String get_assertionconsumerserviceurl() throws Exception {
		return this.assertionconsumerserviceurl;
	}

	/**
	* <pre>
	* Expression to extract relaystate to be sent along with assertion.
	* </pre>
	*/
	public void set_relaystaterule(String relaystaterule) throws Exception{
		this.relaystaterule = relaystaterule;
	}

	/**
	* <pre>
	* Expression to extract relaystate to be sent along with assertion.
	* </pre>
	*/
	public String get_relaystaterule() throws Exception {
		return this.relaystaterule;
	}

	/**
	* <pre>
	* Option to send password in assertion.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_sendpassword(String sendpassword) throws Exception{
		this.sendpassword = sendpassword;
	}

	/**
	* <pre>
	* Option to send password in assertion.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_sendpassword() throws Exception {
		return this.sendpassword;
	}

	/**
	* <pre>
	* The name to be used in requests sent from	Netscaler to IdP to uniquely identify Netscaler.<br> Minimum length =  1
	* </pre>
	*/
	public void set_samlissuername(String samlissuername) throws Exception{
		this.samlissuername = samlissuername;
	}

	/**
	* <pre>
	* The name to be used in requests sent from	Netscaler to IdP to uniquely identify Netscaler.<br> Minimum length =  1
	* </pre>
	*/
	public String get_samlissuername() throws Exception {
		return this.samlissuername;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		tmsamlssoprofile_response result = (tmsamlssoprofile_response) service.get_payload_formatter().string_to_resource(tmsamlssoprofile_response.class, response);
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
		return result.tmsamlssoprofile;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	/**
	* Use this API to add tmsamlssoprofile.
	*/
	public static base_response add(nitro_service client, tmsamlssoprofile resource) throws Exception {
		tmsamlssoprofile addresource = new tmsamlssoprofile();
		addresource.name = resource.name;
		addresource.samlsigningcertname = resource.samlsigningcertname;
		addresource.assertionconsumerserviceurl = resource.assertionconsumerserviceurl;
		addresource.relaystaterule = resource.relaystaterule;
		addresource.sendpassword = resource.sendpassword;
		addresource.samlissuername = resource.samlissuername;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add tmsamlssoprofile resources.
	*/
	public static base_responses add(nitro_service client, tmsamlssoprofile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			tmsamlssoprofile addresources[] = new tmsamlssoprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new tmsamlssoprofile();
				addresources[i].name = resources[i].name;
				addresources[i].samlsigningcertname = resources[i].samlsigningcertname;
				addresources[i].assertionconsumerserviceurl = resources[i].assertionconsumerserviceurl;
				addresources[i].relaystaterule = resources[i].relaystaterule;
				addresources[i].sendpassword = resources[i].sendpassword;
				addresources[i].samlissuername = resources[i].samlissuername;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete tmsamlssoprofile of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		tmsamlssoprofile deleteresource = new tmsamlssoprofile();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete tmsamlssoprofile.
	*/
	public static base_response delete(nitro_service client, tmsamlssoprofile resource) throws Exception {
		tmsamlssoprofile deleteresource = new tmsamlssoprofile();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete tmsamlssoprofile resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			tmsamlssoprofile deleteresources[] = new tmsamlssoprofile[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new tmsamlssoprofile();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete tmsamlssoprofile resources.
	*/
	public static base_responses delete(nitro_service client, tmsamlssoprofile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			tmsamlssoprofile deleteresources[] = new tmsamlssoprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new tmsamlssoprofile();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update tmsamlssoprofile.
	*/
	public static base_response update(nitro_service client, tmsamlssoprofile resource) throws Exception {
		tmsamlssoprofile updateresource = new tmsamlssoprofile();
		updateresource.name = resource.name;
		updateresource.samlsigningcertname = resource.samlsigningcertname;
		updateresource.assertionconsumerserviceurl = resource.assertionconsumerserviceurl;
		updateresource.sendpassword = resource.sendpassword;
		updateresource.samlissuername = resource.samlissuername;
		updateresource.relaystaterule = resource.relaystaterule;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update tmsamlssoprofile resources.
	*/
	public static base_responses update(nitro_service client, tmsamlssoprofile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			tmsamlssoprofile updateresources[] = new tmsamlssoprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new tmsamlssoprofile();
				updateresources[i].name = resources[i].name;
				updateresources[i].samlsigningcertname = resources[i].samlsigningcertname;
				updateresources[i].assertionconsumerserviceurl = resources[i].assertionconsumerserviceurl;
				updateresources[i].sendpassword = resources[i].sendpassword;
				updateresources[i].samlissuername = resources[i].samlissuername;
				updateresources[i].relaystaterule = resources[i].relaystaterule;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of tmsamlssoprofile resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, tmsamlssoprofile resource, String[] args) throws Exception{
		tmsamlssoprofile unsetresource = new tmsamlssoprofile();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of tmsamlssoprofile resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			tmsamlssoprofile unsetresources[] = new tmsamlssoprofile[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new tmsamlssoprofile();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of tmsamlssoprofile resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, tmsamlssoprofile resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			tmsamlssoprofile unsetresources[] = new tmsamlssoprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new tmsamlssoprofile();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the tmsamlssoprofile resources that are configured on netscaler.
	*/
	public static tmsamlssoprofile[] get(nitro_service service) throws Exception{
		tmsamlssoprofile obj = new tmsamlssoprofile();
		tmsamlssoprofile[] response = (tmsamlssoprofile[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the tmsamlssoprofile resources that are configured on netscaler.
	*/
	public static tmsamlssoprofile[] get(nitro_service service, options option) throws Exception{
		tmsamlssoprofile obj = new tmsamlssoprofile();
		tmsamlssoprofile[] response = (tmsamlssoprofile[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch tmsamlssoprofile resource of given name .
	*/
	public static tmsamlssoprofile get(nitro_service service, String name) throws Exception{
		tmsamlssoprofile obj = new tmsamlssoprofile();
		obj.set_name(name);
		tmsamlssoprofile response = (tmsamlssoprofile) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch tmsamlssoprofile resources of given names .
	*/
	public static tmsamlssoprofile[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			tmsamlssoprofile response[] = new tmsamlssoprofile[name.length];
			tmsamlssoprofile obj[] = new tmsamlssoprofile[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new tmsamlssoprofile();
				obj[i].set_name(name[i]);
				response[i] = (tmsamlssoprofile) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of tmsamlssoprofile resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static tmsamlssoprofile[] get_filtered(nitro_service service, String filter) throws Exception{
		tmsamlssoprofile obj = new tmsamlssoprofile();
		options option = new options();
		option.set_filter(filter);
		tmsamlssoprofile[] response = (tmsamlssoprofile[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of tmsamlssoprofile resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static tmsamlssoprofile[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		tmsamlssoprofile obj = new tmsamlssoprofile();
		options option = new options();
		option.set_filter(filter);
		tmsamlssoprofile[] response = (tmsamlssoprofile[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the tmsamlssoprofile resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		tmsamlssoprofile obj = new tmsamlssoprofile();
		options option = new options();
		option.set_count(true);
		tmsamlssoprofile[] response = (tmsamlssoprofile[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of tmsamlssoprofile resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		tmsamlssoprofile obj = new tmsamlssoprofile();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		tmsamlssoprofile[] response = (tmsamlssoprofile[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of tmsamlssoprofile resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		tmsamlssoprofile obj = new tmsamlssoprofile();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		tmsamlssoprofile[] response = (tmsamlssoprofile[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class sendpasswordEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
}
