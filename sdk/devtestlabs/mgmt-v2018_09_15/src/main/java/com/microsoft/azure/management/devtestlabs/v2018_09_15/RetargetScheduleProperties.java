/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties for retargeting a virtual machine schedule.
 */
public class RetargetScheduleProperties {
    /**
     * The resource Id of the virtual machine on which the schedule operates.
     */
    @JsonProperty(value = "currentResourceId")
    private String currentResourceId;

    /**
     * The resource Id of the virtual machine that the schedule should be
     * retargeted to.
     */
    @JsonProperty(value = "targetResourceId")
    private String targetResourceId;

    /**
     * Get the resource Id of the virtual machine on which the schedule operates.
     *
     * @return the currentResourceId value
     */
    public String currentResourceId() {
        return this.currentResourceId;
    }

    /**
     * Set the resource Id of the virtual machine on which the schedule operates.
     *
     * @param currentResourceId the currentResourceId value to set
     * @return the RetargetScheduleProperties object itself.
     */
    public RetargetScheduleProperties withCurrentResourceId(String currentResourceId) {
        this.currentResourceId = currentResourceId;
        return this;
    }

    /**
     * Get the resource Id of the virtual machine that the schedule should be retargeted to.
     *
     * @return the targetResourceId value
     */
    public String targetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Set the resource Id of the virtual machine that the schedule should be retargeted to.
     *
     * @param targetResourceId the targetResourceId value to set
     * @return the RetargetScheduleProperties object itself.
     */
    public RetargetScheduleProperties withTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
        return this;
    }

}
