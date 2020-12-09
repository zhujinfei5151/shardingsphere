/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
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
 * </p>
 */

package com.dangdang.ddframe.rdb.sharding.config.common.api.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;

import lombok.Getter;
import lombok.Setter;

/**
 * 分片规则配置.
 * 
 * @author gaohongtao
 */
@Getter
@Setter
public class ShardingRuleConfig {
    
    private Map<String, DataSource> dataSource = new HashMap<>();
    
    private Map<String, TableRuleConfig> tables = new HashMap<>();
    
    private List<BindingTableRuleConfig> bindingTables = new ArrayList<>();
    
    private StrategyConfig defaultDatabaseStrategy;
    
    private StrategyConfig defaultTableStrategy;
}
