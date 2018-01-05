/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cms.model.v20170301;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20170301.ProfileGetResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ProfileGetResponse extends AcsResponse {

	private Integer errorCode;

	private String errorMessage;

	private Boolean success;

	private String requestId;

	private Long userId;

	private Boolean autoInstall;

	private Boolean enableInstallAgentNewECS;

	public Integer getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Boolean getAutoInstall() {
		return this.autoInstall;
	}

	public void setAutoInstall(Boolean autoInstall) {
		this.autoInstall = autoInstall;
	}

	public Boolean getEnableInstallAgentNewECS() {
		return this.enableInstallAgentNewECS;
	}

	public void setEnableInstallAgentNewECS(Boolean enableInstallAgentNewECS) {
		this.enableInstallAgentNewECS = enableInstallAgentNewECS;
	}

	@Override
	public ProfileGetResponse getInstance(UnmarshallerContext context) {
		return	ProfileGetResponseUnmarshaller.unmarshall(this, context);
	}
}
