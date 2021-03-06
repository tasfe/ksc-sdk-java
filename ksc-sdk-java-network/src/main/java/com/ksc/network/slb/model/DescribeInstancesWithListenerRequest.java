package com.ksc.network.slb.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.model.Filter;
import com.ksc.network.slb.model.transform.DescribeInstancesWithListenerRequestMarshaller;

import java.io.Serializable;

public class DescribeInstancesWithListenerRequest extends KscWebServiceRequest
		implements Serializable, Cloneable, DryRunSupportedRequest<DescribeInstancesWithListenerRequest> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2681670918913999259L;
	/**
	 * <p>
	 * One or more filters. Filter names and values are case-sensitive.
	 * </p>
	 * <ul>
	 * <li>
	 * <p>
	 * <code>listener-id</code> - 监听器的ID
	 * </p>
	 * </li>
	 * </ul>
	 */
	private com.ksc.internal.SdkInternalList<Filter> filters;
	/**
	 * <p>
	 * 监听器和主机绑定的ID
	 * </p>
	 * <p>
	 * Default: 描述负载均衡器下所有的真实服务器信息
	 * </p>
	 */
	private com.ksc.internal.SdkInternalList<String> registerIds;

	public com.ksc.internal.SdkInternalList<Filter> getFilters() {
		if (filters == null) {
			filters = new com.ksc.internal.SdkInternalList<Filter>();
		}
		return filters;
	}

	public void setFilters(com.ksc.internal.SdkInternalList<Filter> filters) {
		this.filters = filters;
	}

	public com.ksc.internal.SdkInternalList<String> getRegisterIds() {
		if (registerIds == null) {
			registerIds = new com.ksc.internal.SdkInternalList<String>();
		}
		return registerIds;
	}

	public void setRegisterIds(com.ksc.internal.SdkInternalList<String> registerIds) {
		this.registerIds = registerIds;
	}

	public void addFilters(Filter... filters) {
		if (this.filters == null) {
			this.filters = new com.ksc.internal.SdkInternalList<Filter>();
		}
		for (Filter filter : filters) {
			this.filters.add(filter);
		}
	}

	public void addRegisterIds(String... registerIds) {
		if (this.registerIds == null) {
			this.registerIds = new com.ksc.internal.SdkInternalList<String>();
		}
		for (String registerId : registerIds) {
			this.registerIds.add(registerId);
		}
	}

	@Override
	public Request<DescribeInstancesWithListenerRequest> getDryRunRequest() {
		Request<DescribeInstancesWithListenerRequest> request = new DescribeInstancesWithListenerRequestMarshaller()
				.marshall(this);
		request.addParameter("DryRun", Boolean.toString(true));
		return request;
	}

}
