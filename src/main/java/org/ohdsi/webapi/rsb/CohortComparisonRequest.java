/*
 * Copyright 2016 fdefalco.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ohdsi.webapi.rsb;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 *
 * @author fdefalco
 */
public class CohortComparisonRequest {
  @JsonProperty("treatment")
  public Integer treatment;
  
  @JsonProperty("comparator")
  public Integer comparator;  
  
  @JsonProperty("outcome")
  public Integer outcome;  
  
  @JsonProperty("exclusions")
  public Integer exclusions; 
  
  @JsonProperty("timeAtRisk")
  public Integer timeAtRisk;  

  @JsonProperty("sourceKey")
  public String sourceKey;  
}
