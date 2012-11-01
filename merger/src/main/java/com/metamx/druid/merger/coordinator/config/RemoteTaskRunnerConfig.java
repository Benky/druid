/*
 * Druid - a distributed column store.
 * Copyright (C) 2012  Metamarkets Group Inc.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package com.metamx.druid.merger.coordinator.config;

import com.metamx.druid.merger.common.config.IndexerZkConfig;
import org.skife.config.Config;
import org.skife.config.Default;

/**
 */
public abstract class RemoteTaskRunnerConfig extends IndexerZkConfig
{
  @Config("druid.indexer.terminateResources.periodMs")
  @Default("3600000") // 1 hr
  public abstract long getTerminateResourcesPeriodMs();

  @Config("druid.indexer.terminateResources.windowMs")
  @Default("300000") // 5 mins
  public abstract long getTerminateResourcesWindowMs();

  @Config("druid.indexer.minWorkerVersion")
  public abstract String getMinWorkerVersion();
}