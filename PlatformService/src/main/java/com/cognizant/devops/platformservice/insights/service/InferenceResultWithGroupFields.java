/*******************************************************************************
 * Copyright 2017 Cognizant Technology Solutions
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package com.cognizant.devops.platformservice.insights.service;

import java.util.ArrayList;
import java.util.List;

public class InferenceResultWithGroupFields {
	
	private String groupField;
	private Long totalDocuments;
	private List<InferenceResultDetails> details = new ArrayList<>(5);
	
	public String getGroupField() {
		return groupField;
	}

	public void setGroupField(String groupField) {
		this.groupField = groupField;
	}

	public Long getTotalDocuments() {
		return totalDocuments;
	}

	public void setTotalDocuments(Long totalDocuments) {
		this.totalDocuments = totalDocuments;
	}

	public List<InferenceResultDetails> getDetails() {
		return details;
	}

	public void setDetails(List<InferenceResultDetails> details) {
		this.details = details;
	}

}
