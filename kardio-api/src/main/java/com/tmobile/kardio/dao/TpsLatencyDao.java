/*******************************************************************************
 * Copyright 2019 T-Mobile USA, Inc.
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
 * See the LICENSE file for additional language around disclaimer of warranties.
 * Trademark Disclaimer: Neither the name of "T-Mobile, USA" nor the names of
 * its contributors may be used to endorse or promote products derived from this
 * software without specific prior written permission.
 ******************************************************************************/
package com.tmobile.kardio.dao;

import java.text.ParseException;
import java.util.List;

import com.tmobile.kardio.bean.TpsLatency;
import com.tmobile.kardio.bean.TpsLatencyHistory;


public interface TpsLatencyDao {
	public List<TpsLatency> getCurrentTpsLatency(String environment,String platform);

	public List<TpsLatencyHistory> getTpsAndLatOfParent(String startDate, String endDate, String environment,
			String componentIdsStrg,String platform) throws ParseException;

	public List<TpsLatencyHistory> getTpsAndLatOfComponent(String startDate, String endDate, String environment,
			String componentIdsStrg,String platform) throws ParseException;

	public TpsLatency getCurrentTpsAndLatency(String environment, String componentIdsStrg, boolean isParent,String platform);
}
