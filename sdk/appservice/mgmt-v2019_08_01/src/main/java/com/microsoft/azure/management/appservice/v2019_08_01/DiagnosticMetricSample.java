/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class representing Diagnostic Metric.
 */
public class DiagnosticMetricSample {
    /**
     * Time at which metric is measured.
     */
    @JsonProperty(value = "timestamp")
    private DateTime timestamp;

    /**
     * Role Instance. Null if this counter is not per instance
     * This is returned and should be whichever instance name we desire to be
     * returned
     * i.e. CPU and Memory return RDWORKERNAME (LargeDed..._IN_0)
     * where RDWORKERNAME is Machine name below and RoleInstance name in
     * parenthesis.
     */
    @JsonProperty(value = "roleInstance")
    private String roleInstance;

    /**
     * Total value of the metric. If multiple measurements are made this will
     * have sum of all.
     */
    @JsonProperty(value = "total")
    private Double total;

    /**
     * Maximum of the metric sampled during the time period.
     */
    @JsonProperty(value = "maximum")
    private Double maximum;

    /**
     * Minimum of the metric sampled during the time period.
     */
    @JsonProperty(value = "minimum")
    private Double minimum;

    /**
     * Whether the values are aggregates across all workers or not.
     */
    @JsonProperty(value = "isAggregated")
    private Boolean isAggregated;

    /**
     * Get time at which metric is measured.
     *
     * @return the timestamp value
     */
    public DateTime timestamp() {
        return this.timestamp;
    }

    /**
     * Set time at which metric is measured.
     *
     * @param timestamp the timestamp value to set
     * @return the DiagnosticMetricSample object itself.
     */
    public DiagnosticMetricSample withTimestamp(DateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get role Instance. Null if this counter is not per instance
     This is returned and should be whichever instance name we desire to be returned
     i.e. CPU and Memory return RDWORKERNAME (LargeDed..._IN_0)
     where RDWORKERNAME is Machine name below and RoleInstance name in parenthesis.
     *
     * @return the roleInstance value
     */
    public String roleInstance() {
        return this.roleInstance;
    }

    /**
     * Set role Instance. Null if this counter is not per instance
     This is returned and should be whichever instance name we desire to be returned
     i.e. CPU and Memory return RDWORKERNAME (LargeDed..._IN_0)
     where RDWORKERNAME is Machine name below and RoleInstance name in parenthesis.
     *
     * @param roleInstance the roleInstance value to set
     * @return the DiagnosticMetricSample object itself.
     */
    public DiagnosticMetricSample withRoleInstance(String roleInstance) {
        this.roleInstance = roleInstance;
        return this;
    }

    /**
     * Get total value of the metric. If multiple measurements are made this will have sum of all.
     *
     * @return the total value
     */
    public Double total() {
        return this.total;
    }

    /**
     * Set total value of the metric. If multiple measurements are made this will have sum of all.
     *
     * @param total the total value to set
     * @return the DiagnosticMetricSample object itself.
     */
    public DiagnosticMetricSample withTotal(Double total) {
        this.total = total;
        return this;
    }

    /**
     * Get maximum of the metric sampled during the time period.
     *
     * @return the maximum value
     */
    public Double maximum() {
        return this.maximum;
    }

    /**
     * Set maximum of the metric sampled during the time period.
     *
     * @param maximum the maximum value to set
     * @return the DiagnosticMetricSample object itself.
     */
    public DiagnosticMetricSample withMaximum(Double maximum) {
        this.maximum = maximum;
        return this;
    }

    /**
     * Get minimum of the metric sampled during the time period.
     *
     * @return the minimum value
     */
    public Double minimum() {
        return this.minimum;
    }

    /**
     * Set minimum of the metric sampled during the time period.
     *
     * @param minimum the minimum value to set
     * @return the DiagnosticMetricSample object itself.
     */
    public DiagnosticMetricSample withMinimum(Double minimum) {
        this.minimum = minimum;
        return this;
    }

    /**
     * Get whether the values are aggregates across all workers or not.
     *
     * @return the isAggregated value
     */
    public Boolean isAggregated() {
        return this.isAggregated;
    }

    /**
     * Set whether the values are aggregates across all workers or not.
     *
     * @param isAggregated the isAggregated value to set
     * @return the DiagnosticMetricSample object itself.
     */
    public DiagnosticMetricSample withIsAggregated(Boolean isAggregated) {
        this.isAggregated = isAggregated;
        return this;
    }

}
