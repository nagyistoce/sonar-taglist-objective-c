/*
 * Sonar, open source software quality management tool.
 * Copyright (C) 2009 SonarSource
 * mailto:contact AT sonarsource DOT com
 *
 * Sonar is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * Sonar is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with Sonar; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */

package org.sonar.plugins.taglist.objectivec;

import org.sonar.api.measures.Metric;
import org.sonar.api.measures.MetricFinder;

public final class TaglistMetrics {

	private final MetricFinder metricFinder;

	public TaglistMetrics(final MetricFinder metricFinder) {
		this.metricFinder = metricFinder;
	}

	public Metric getTags() { 
		return metricFinder.findByKey("tags");
	}
	public Metric getMandatoryTags() {
		return metricFinder.findByKey("mandatory_tags");
	}
	public Metric getOptionalTags() {
		return metricFinder.findByKey("optional_tags");
	}
	public Metric getTagsDistribution() {
		return metricFinder.findByKey("tags_distribution");
	}
	public Metric getNosonarTags() {
		return metricFinder.findByKey("nosonar_tags");
	}

}