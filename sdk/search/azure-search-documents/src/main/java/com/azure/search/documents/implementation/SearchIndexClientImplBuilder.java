// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.implementation;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;

/** A builder for creating a new instance of the SearchIndexClient type. */
@ServiceClientBuilder(serviceClients = {SearchIndexClientImpl.class})
public final class SearchIndexClientImplBuilder {
    /*
     * The endpoint URL of the search service.
     */
    private String endpoint;

    /**
     * Sets The endpoint URL of the search service.
     *
     * @param endpoint the endpoint value.
     * @return the SearchIndexClientImplBuilder.
     */
    public SearchIndexClientImplBuilder endpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /*
     * The name of the index.
     */
    private String indexName;

    /**
     * Sets The name of the index.
     *
     * @param indexName the indexName value.
     * @return the SearchIndexClientImplBuilder.
     */
    public SearchIndexClientImplBuilder indexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /*
     * The HTTP pipeline to send requests through
     */
    private HttpPipeline pipeline;

    /**
     * Sets The HTTP pipeline to send requests through.
     *
     * @param pipeline the pipeline value.
     * @return the SearchIndexClientImplBuilder.
     */
    public SearchIndexClientImplBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /*
     * The serializer to serialize an object into a string
     */
    private SerializerAdapter serializerAdapter;

    /**
     * Sets The serializer to serialize an object into a string.
     *
     * @param serializerAdapter the serializerAdapter value.
     * @return the SearchIndexClientImplBuilder.
     */
    public SearchIndexClientImplBuilder serializerAdapter(SerializerAdapter serializerAdapter) {
        this.serializerAdapter = serializerAdapter;
        return this;
    }

    /**
     * Builds an instance of SearchIndexClientImpl with the provided parameters.
     *
     * @return an instance of SearchIndexClientImpl.
     */
    public SearchIndexClientImpl buildClient() {
        if (pipeline == null) {
            this.pipeline =
                    new HttpPipelineBuilder()
                            .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                            .build();
        }
        if (serializerAdapter == null) {
            this.serializerAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        }
        SearchIndexClientImpl client = new SearchIndexClientImpl(pipeline, serializerAdapter, endpoint, indexName);
        return client;
    }
}
