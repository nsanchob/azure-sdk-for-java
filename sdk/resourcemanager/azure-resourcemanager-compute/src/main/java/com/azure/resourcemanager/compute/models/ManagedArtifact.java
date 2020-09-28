// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The managed artifact. */
@Fluent
public final class ManagedArtifact {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedArtifact.class);

    /*
     * The managed artifact id.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Get the id property: The managed artifact id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The managed artifact id.
     *
     * @param id the id value to set.
     * @return the ManagedArtifact object itself.
     */
    public ManagedArtifact withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property id in model ManagedArtifact"));
        }
    }
}
