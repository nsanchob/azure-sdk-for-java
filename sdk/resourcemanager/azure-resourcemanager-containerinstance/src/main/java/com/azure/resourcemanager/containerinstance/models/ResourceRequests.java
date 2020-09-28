// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The resource requests. */
@Fluent
public final class ResourceRequests {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceRequests.class);

    /*
     * The memory request in GB of this container instance.
     */
    @JsonProperty(value = "memoryInGB", required = true)
    private double memoryInGB;

    /*
     * The CPU request of this container instance.
     */
    @JsonProperty(value = "cpu", required = true)
    private double cpu;

    /*
     * The GPU request of this container instance.
     */
    @JsonProperty(value = "gpu")
    private GpuResource gpu;

    /**
     * Get the memoryInGB property: The memory request in GB of this container instance.
     *
     * @return the memoryInGB value.
     */
    public double memoryInGB() {
        return this.memoryInGB;
    }

    /**
     * Set the memoryInGB property: The memory request in GB of this container instance.
     *
     * @param memoryInGB the memoryInGB value to set.
     * @return the ResourceRequests object itself.
     */
    public ResourceRequests withMemoryInGB(double memoryInGB) {
        this.memoryInGB = memoryInGB;
        return this;
    }

    /**
     * Get the cpu property: The CPU request of this container instance.
     *
     * @return the cpu value.
     */
    public double cpu() {
        return this.cpu;
    }

    /**
     * Set the cpu property: The CPU request of this container instance.
     *
     * @param cpu the cpu value to set.
     * @return the ResourceRequests object itself.
     */
    public ResourceRequests withCpu(double cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * Get the gpu property: The GPU request of this container instance.
     *
     * @return the gpu value.
     */
    public GpuResource gpu() {
        return this.gpu;
    }

    /**
     * Set the gpu property: The GPU request of this container instance.
     *
     * @param gpu the gpu value to set.
     * @return the ResourceRequests object itself.
     */
    public ResourceRequests withGpu(GpuResource gpu) {
        this.gpu = gpu;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (gpu() != null) {
            gpu().validate();
        }
    }
}
