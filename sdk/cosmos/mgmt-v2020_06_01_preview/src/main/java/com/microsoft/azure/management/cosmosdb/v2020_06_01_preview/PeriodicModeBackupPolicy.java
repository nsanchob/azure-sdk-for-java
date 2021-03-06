/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The object representing periodic mode backup policy.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = PeriodicModeBackupPolicy.class)
@JsonTypeName("Periodic")
public class PeriodicModeBackupPolicy extends BackupPolicy {
    /**
     * Configuration values for periodic mode backup.
     */
    @JsonProperty(value = "periodicModeProperties")
    private PeriodicModeProperties periodicModeProperties;

    /**
     * Get configuration values for periodic mode backup.
     *
     * @return the periodicModeProperties value
     */
    public PeriodicModeProperties periodicModeProperties() {
        return this.periodicModeProperties;
    }

    /**
     * Set configuration values for periodic mode backup.
     *
     * @param periodicModeProperties the periodicModeProperties value to set
     * @return the PeriodicModeBackupPolicy object itself.
     */
    public PeriodicModeBackupPolicy withPeriodicModeProperties(PeriodicModeProperties periodicModeProperties) {
        this.periodicModeProperties = periodicModeProperties;
        return this;
    }

}
