/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.cmp;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class cmpparameter_response extends base_response
{
	public cmpparameter cmpparameter;
}
/**
* Configuration for CMP parameter resource.
*/

public class cmpparameter extends base_resource
{
	private String cmplevel;
	private Long quantumsize;
	private String servercmp;
	private String heurexpiry;
	private Long heurexpirythres;
	private Long heurexpiryhistwt;
	private Long minressize;
	private Long cmpbypasspct;
	private String cmponpush;
	private String policytype;
	private String addvaryheader;
	private String externalcache;

	/**
	* <pre>
	* Compression level.<br> Default value: NSCMPLVL_OPTIMAL<br> Possible values = optimal, bestspeed, bestcompression
	* </pre>
	*/
	public void set_cmplevel(String cmplevel) throws Exception{
		this.cmplevel = cmplevel;
	}

	/**
	* <pre>
	* Compression level.<br> Default value: NSCMPLVL_OPTIMAL<br> Possible values = optimal, bestspeed, bestcompression
	* </pre>
	*/
	public String get_cmplevel() throws Exception {
		return this.cmplevel;
	}

	/**
	* <pre>
	* Minimum amount of data to compress as one unit.<br> Default value: 57344<br> Minimum value =  8<br> Maximum value =  63488
	* </pre>
	*/
	public void set_quantumsize(long quantumsize) throws Exception {
		this.quantumsize = new Long(quantumsize);
	}

	/**
	* <pre>
	* Minimum amount of data to compress as one unit.<br> Default value: 57344<br> Minimum value =  8<br> Maximum value =  63488
	* </pre>
	*/
	public void set_quantumsize(Long quantumsize) throws Exception{
		this.quantumsize = quantumsize;
	}

	/**
	* <pre>
	* Minimum amount of data to compress as one unit.<br> Default value: 57344<br> Minimum value =  8<br> Maximum value =  63488
	* </pre>
	*/
	public Long get_quantumsize() throws Exception {
		return this.quantumsize;
	}

	/**
	* <pre>
	* Compression at back-end server.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_servercmp(String servercmp) throws Exception{
		this.servercmp = servercmp;
	}

	/**
	* <pre>
	* Compression at back-end server.<br> Default value: ON<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_servercmp() throws Exception {
		return this.servercmp;
	}

	/**
	* <pre>
	* Heuristic basefile expiry.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_heurexpiry(String heurexpiry) throws Exception{
		this.heurexpiry = heurexpiry;
	}

	/**
	* <pre>
	* Heuristic basefile expiry.<br> Default value: OFF<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_heurexpiry() throws Exception {
		return this.heurexpiry;
	}

	/**
	* <pre>
	* Threshold compression ratio for heuristic basefile expiry, multiplied by 100. For example, to set the threshold ratio to 1.25, specify 125.<br> Default value: 100<br> Minimum value =  1<br> Maximum value =  1000
	* </pre>
	*/
	public void set_heurexpirythres(long heurexpirythres) throws Exception {
		this.heurexpirythres = new Long(heurexpirythres);
	}

	/**
	* <pre>
	* Threshold compression ratio for heuristic basefile expiry, multiplied by 100. For example, to set the threshold ratio to 1.25, specify 125.<br> Default value: 100<br> Minimum value =  1<br> Maximum value =  1000
	* </pre>
	*/
	public void set_heurexpirythres(Long heurexpirythres) throws Exception{
		this.heurexpirythres = heurexpirythres;
	}

	/**
	* <pre>
	* Threshold compression ratio for heuristic basefile expiry, multiplied by 100. For example, to set the threshold ratio to 1.25, specify 125.<br> Default value: 100<br> Minimum value =  1<br> Maximum value =  1000
	* </pre>
	*/
	public Long get_heurexpirythres() throws Exception {
		return this.heurexpirythres;
	}

	/**
	* <pre>
	* For heuristic basefile expiry, weightage to be given to historical delta compression ratio, specified as percentage.  For example, to give 25% weightage to historical ratio (and therefore 75% weightage to the ratio for current delta compression transaction), specify 25.<br> Default value: 50<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_heurexpiryhistwt(long heurexpiryhistwt) throws Exception {
		this.heurexpiryhistwt = new Long(heurexpiryhistwt);
	}

	/**
	* <pre>
	* For heuristic basefile expiry, weightage to be given to historical delta compression ratio, specified as percentage.  For example, to give 25% weightage to historical ratio (and therefore 75% weightage to the ratio for current delta compression transaction), specify 25.<br> Default value: 50<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_heurexpiryhistwt(Long heurexpiryhistwt) throws Exception{
		this.heurexpiryhistwt = heurexpiryhistwt;
	}

	/**
	* <pre>
	* For heuristic basefile expiry, weightage to be given to historical delta compression ratio, specified as percentage.  For example, to give 25% weightage to historical ratio (and therefore 75% weightage to the ratio for current delta compression transaction), specify 25.<br> Default value: 50<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public Long get_heurexpiryhistwt() throws Exception {
		return this.heurexpiryhistwt;
	}

	/**
	* <pre>
	* Size of the smallest HTTP response that will be compressed.
	* </pre>
	*/
	public void set_minressize(long minressize) throws Exception {
		this.minressize = new Long(minressize);
	}

	/**
	* <pre>
	* Size of the smallest HTTP response that will be compressed.
	* </pre>
	*/
	public void set_minressize(Long minressize) throws Exception{
		this.minressize = minressize;
	}

	/**
	* <pre>
	* Size of the smallest HTTP response that will be compressed.
	* </pre>
	*/
	public Long get_minressize() throws Exception {
		return this.minressize;
	}

	/**
	* <pre>
	* CPU usage (%) at which NetScaler should start progressively bypassing compression on HTTP requests.<br> Default value: 100<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_cmpbypasspct(long cmpbypasspct) throws Exception {
		this.cmpbypasspct = new Long(cmpbypasspct);
	}

	/**
	* <pre>
	* CPU usage (%) at which NetScaler should start progressively bypassing compression on HTTP requests.<br> Default value: 100<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public void set_cmpbypasspct(Long cmpbypasspct) throws Exception{
		this.cmpbypasspct = cmpbypasspct;
	}

	/**
	* <pre>
	* CPU usage (%) at which NetScaler should start progressively bypassing compression on HTTP requests.<br> Default value: 100<br> Minimum value =  0<br> Maximum value =  100
	* </pre>
	*/
	public Long get_cmpbypasspct() throws Exception {
		return this.cmpbypasspct;
	}

	/**
	* <pre>
	* Enable/disable compression on PUSH packet.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_cmponpush(String cmponpush) throws Exception{
		this.cmponpush = cmponpush;
	}

	/**
	* <pre>
	* Enable/disable compression on PUSH packet.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_cmponpush() throws Exception {
		return this.cmponpush;
	}

	/**
	* <pre>
	* The type of the HTTP compression global policy bindings to be used for virtual servers that have no HTTP compression policies bound.<br> Default value: CLASSIC<br> Possible values = CLASSIC, ADVANCED
	* </pre>
	*/
	public void set_policytype(String policytype) throws Exception{
		this.policytype = policytype;
	}

	/**
	* <pre>
	* The type of the HTTP compression global policy bindings to be used for virtual servers that have no HTTP compression policies bound.<br> Default value: CLASSIC<br> Possible values = CLASSIC, ADVANCED
	* </pre>
	*/
	public String get_policytype() throws Exception {
		return this.policytype;
	}

	/**
	* <pre>
	* Enable/disable vary header insertion during compression for HTTP/1.1 client.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_addvaryheader(String addvaryheader) throws Exception{
		this.addvaryheader = addvaryheader;
	}

	/**
	* <pre>
	* Enable/disable vary header insertion during compression for HTTP/1.1 client.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_addvaryheader() throws Exception {
		return this.addvaryheader;
	}

	/**
	* <pre>
	* Enable insertion of  Cache-Control: private response directive to indicate response message is intended for a single user and must not be cached by a shared or proxy cache.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_externalcache(String externalcache) throws Exception{
		this.externalcache = externalcache;
	}

	/**
	* <pre>
	* Enable insertion of  Cache-Control: private response directive to indicate response message is intended for a single user and must not be cached by a shared or proxy cache.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_externalcache() throws Exception {
		return this.externalcache;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		cmpparameter[] resources = new cmpparameter[1];
		cmpparameter_response result = (cmpparameter_response) service.get_payload_formatter().string_to_resource(cmpparameter_response.class, response);
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
		resources[0] = result.cmpparameter;
		return resources;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return null;
	}

	/**
	* Use this API to update cmpparameter.
	*/
	public static base_response update(nitro_service client, cmpparameter resource) throws Exception {
		cmpparameter updateresource = new cmpparameter();
		updateresource.cmplevel = resource.cmplevel;
		updateresource.quantumsize = resource.quantumsize;
		updateresource.servercmp = resource.servercmp;
		updateresource.heurexpiry = resource.heurexpiry;
		updateresource.heurexpirythres = resource.heurexpirythres;
		updateresource.heurexpiryhistwt = resource.heurexpiryhistwt;
		updateresource.minressize = resource.minressize;
		updateresource.cmpbypasspct = resource.cmpbypasspct;
		updateresource.cmponpush = resource.cmponpush;
		updateresource.policytype = resource.policytype;
		updateresource.addvaryheader = resource.addvaryheader;
		updateresource.externalcache = resource.externalcache;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of cmpparameter resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, cmpparameter resource, String[] args) throws Exception{
		cmpparameter unsetresource = new cmpparameter();
		unsetresource.cmplevel = resource.cmplevel;
		unsetresource.quantumsize = resource.quantumsize;
		unsetresource.servercmp = resource.servercmp;
		unsetresource.heurexpiry = resource.heurexpiry;
		unsetresource.heurexpirythres = resource.heurexpirythres;
		unsetresource.heurexpiryhistwt = resource.heurexpiryhistwt;
		unsetresource.minressize = resource.minressize;
		unsetresource.cmpbypasspct = resource.cmpbypasspct;
		unsetresource.cmponpush = resource.cmponpush;
		unsetresource.policytype = resource.policytype;
		unsetresource.addvaryheader = resource.addvaryheader;
		unsetresource.externalcache = resource.externalcache;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the cmpparameter resources that are configured on netscaler.
	*/
	public static cmpparameter get(nitro_service service) throws Exception{
		cmpparameter obj = new cmpparameter();
		cmpparameter[] response = (cmpparameter[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the cmpparameter resources that are configured on netscaler.
	*/
	public static cmpparameter get(nitro_service service,  options option) throws Exception{
		cmpparameter obj = new cmpparameter();
		cmpparameter[] response = (cmpparameter[])obj.get_resources(service,option);
		return response[0];
	}

	public static class externalcacheEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class addvaryheaderEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class servercmpEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class cmplevelEnum {
		public static final String optimal = "optimal";
		public static final String bestspeed = "bestspeed";
		public static final String bestcompression = "bestcompression";
	}
	public static class policytypeEnum {
		public static final String CLASSIC = "CLASSIC";
		public static final String ADVANCED = "ADVANCED";
	}
	public static class cmponpushEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class heurexpiryEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
}
