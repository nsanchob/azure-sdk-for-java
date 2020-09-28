// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.fluent.RestorableDroppedManagedDatabasesClient;
import com.azure.resourcemanager.sql.fluent.models.RestorableDroppedManagedDatabaseInner;
import com.azure.resourcemanager.sql.models.RestorableDroppedManagedDatabaseListResult;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in RestorableDroppedManagedDatabasesClient.
 */
public final class RestorableDroppedManagedDatabasesClientImpl implements RestorableDroppedManagedDatabasesClient {
    private final ClientLogger logger = new ClientLogger(RestorableDroppedManagedDatabasesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final RestorableDroppedManagedDatabasesService service;

    /** The service client containing this operation class. */
    private final SqlManagementClientImpl client;

    /**
     * Initializes an instance of RestorableDroppedManagedDatabasesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    RestorableDroppedManagedDatabasesClientImpl(SqlManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    RestorableDroppedManagedDatabasesService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SqlManagementClientRestorableDroppedManagedDatabases to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientR")
    private interface RestorableDroppedManagedDatabasesService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql"
                + "/managedInstances/{managedInstanceName}/restorableDroppedDatabases")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RestorableDroppedManagedDatabaseListResult>> listByInstance(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("managedInstanceName") String managedInstanceName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql"
                + "/managedInstances/{managedInstanceName}/restorableDroppedDatabases/{restorableDroppedDatabaseId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RestorableDroppedManagedDatabaseInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("managedInstanceName") String managedInstanceName,
            @PathParam("restorableDroppedDatabaseId") String restorableDroppedDatabaseId,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RestorableDroppedManagedDatabaseListResult>> listByInstanceNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);
    }

    /**
     * Gets a list of restorable dropped managed databases.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of restorable dropped managed databases.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RestorableDroppedManagedDatabaseInner>> listByInstanceSinglePageAsync(
        String resourceGroupName, String managedInstanceName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (managedInstanceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter managedInstanceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2017-03-01-preview";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByInstance(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            managedInstanceName,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            context))
            .<PagedResponse<RestorableDroppedManagedDatabaseInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets a list of restorable dropped managed databases.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of restorable dropped managed databases.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RestorableDroppedManagedDatabaseInner>> listByInstanceSinglePageAsync(
        String resourceGroupName, String managedInstanceName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (managedInstanceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter managedInstanceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2017-03-01-preview";
        context = this.client.mergeContext(context);
        return service
            .listByInstance(
                this.client.getEndpoint(),
                resourceGroupName,
                managedInstanceName,
                this.client.getSubscriptionId(),
                apiVersion,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Gets a list of restorable dropped managed databases.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of restorable dropped managed databases.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<RestorableDroppedManagedDatabaseInner> listByInstanceAsync(
        String resourceGroupName, String managedInstanceName) {
        return new PagedFlux<>(
            () -> listByInstanceSinglePageAsync(resourceGroupName, managedInstanceName),
            nextLink -> listByInstanceNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of restorable dropped managed databases.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of restorable dropped managed databases.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<RestorableDroppedManagedDatabaseInner> listByInstanceAsync(
        String resourceGroupName, String managedInstanceName, Context context) {
        return new PagedFlux<>(
            () -> listByInstanceSinglePageAsync(resourceGroupName, managedInstanceName, context),
            nextLink -> listByInstanceNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets a list of restorable dropped managed databases.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of restorable dropped managed databases.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RestorableDroppedManagedDatabaseInner> listByInstance(
        String resourceGroupName, String managedInstanceName) {
        return new PagedIterable<>(listByInstanceAsync(resourceGroupName, managedInstanceName));
    }

    /**
     * Gets a list of restorable dropped managed databases.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of restorable dropped managed databases.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RestorableDroppedManagedDatabaseInner> listByInstance(
        String resourceGroupName, String managedInstanceName, Context context) {
        return new PagedIterable<>(listByInstanceAsync(resourceGroupName, managedInstanceName, context));
    }

    /**
     * Gets a restorable dropped managed database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a restorable dropped managed database.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RestorableDroppedManagedDatabaseInner>> getWithResponseAsync(
        String resourceGroupName, String managedInstanceName, String restorableDroppedDatabaseId) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (managedInstanceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter managedInstanceName is required and cannot be null."));
        }
        if (restorableDroppedDatabaseId == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter restorableDroppedDatabaseId is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2017-03-01-preview";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            managedInstanceName,
                            restorableDroppedDatabaseId,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets a restorable dropped managed database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a restorable dropped managed database.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<RestorableDroppedManagedDatabaseInner>> getWithResponseAsync(
        String resourceGroupName, String managedInstanceName, String restorableDroppedDatabaseId, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (managedInstanceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter managedInstanceName is required and cannot be null."));
        }
        if (restorableDroppedDatabaseId == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter restorableDroppedDatabaseId is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2017-03-01-preview";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                resourceGroupName,
                managedInstanceName,
                restorableDroppedDatabaseId,
                this.client.getSubscriptionId(),
                apiVersion,
                context);
    }

    /**
     * Gets a restorable dropped managed database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a restorable dropped managed database.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RestorableDroppedManagedDatabaseInner> getAsync(
        String resourceGroupName, String managedInstanceName, String restorableDroppedDatabaseId) {
        return getWithResponseAsync(resourceGroupName, managedInstanceName, restorableDroppedDatabaseId)
            .flatMap(
                (Response<RestorableDroppedManagedDatabaseInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets a restorable dropped managed database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a restorable dropped managed database.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RestorableDroppedManagedDatabaseInner get(
        String resourceGroupName, String managedInstanceName, String restorableDroppedDatabaseId) {
        return getAsync(resourceGroupName, managedInstanceName, restorableDroppedDatabaseId).block();
    }

    /**
     * Gets a restorable dropped managed database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param restorableDroppedDatabaseId The restorableDroppedDatabaseId parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a restorable dropped managed database.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<RestorableDroppedManagedDatabaseInner> getWithResponse(
        String resourceGroupName, String managedInstanceName, String restorableDroppedDatabaseId, Context context) {
        return getWithResponseAsync(resourceGroupName, managedInstanceName, restorableDroppedDatabaseId, context)
            .block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of restorable dropped managed databases.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RestorableDroppedManagedDatabaseInner>> listByInstanceNextSinglePageAsync(
        String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        return FluxUtil
            .withContext(context -> service.listByInstanceNext(nextLink, context))
            .<PagedResponse<RestorableDroppedManagedDatabaseInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of restorable dropped managed databases.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RestorableDroppedManagedDatabaseInner>> listByInstanceNextSinglePageAsync(
        String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        context = this.client.mergeContext(context);
        return service
            .listByInstanceNext(nextLink, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}
