// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.fluent.models.RecoverableDatabaseInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in RecoverableDatabasesClient. */
public interface RecoverableDatabasesClient {
    /**
     * Gets a recoverable database, which is a resource representing a database's geo backup.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a recoverable database, which is a resource representing a database's geo backup.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<RecoverableDatabaseInner>> getWithResponseAsync(
        String resourceGroupName, String serverName, String databaseName);

    /**
     * Gets a recoverable database, which is a resource representing a database's geo backup.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a recoverable database, which is a resource representing a database's geo backup.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RecoverableDatabaseInner> getAsync(String resourceGroupName, String serverName, String databaseName);

    /**
     * Gets a recoverable database, which is a resource representing a database's geo backup.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a recoverable database, which is a resource representing a database's geo backup.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RecoverableDatabaseInner get(String resourceGroupName, String serverName, String databaseName);

    /**
     * Gets a recoverable database, which is a resource representing a database's geo backup.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a recoverable database, which is a resource representing a database's geo backup.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RecoverableDatabaseInner> getWithResponse(
        String resourceGroupName, String serverName, String databaseName, Context context);

    /**
     * Gets a list of recoverable databases.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of recoverable databases.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<RecoverableDatabaseInner> listByServerAsync(String resourceGroupName, String serverName);

    /**
     * Gets a list of recoverable databases.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of recoverable databases.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RecoverableDatabaseInner> listByServer(String resourceGroupName, String serverName);

    /**
     * Gets a list of recoverable databases.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of recoverable databases.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RecoverableDatabaseInner> listByServer(String resourceGroupName, String serverName, Context context);
}
