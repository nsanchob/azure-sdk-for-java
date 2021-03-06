/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_08_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.loganalytics.v2020_08_01.Cluster;
import rx.Observable;
import com.microsoft.azure.management.loganalytics.v2020_08_01.ClusterPatch;
import com.microsoft.azure.management.loganalytics.v2020_08_01.Identity;
import com.microsoft.azure.management.loganalytics.v2020_08_01.ClusterSku;
import com.microsoft.azure.management.loganalytics.v2020_08_01.ClusterEntityStatus;
import com.microsoft.azure.management.loganalytics.v2020_08_01.KeyVaultProperties;
import rx.functions.Func1;

class ClusterImpl extends GroupableResourceCoreImpl<Cluster, ClusterInner, ClusterImpl, LogAnalyticsManager> implements Cluster, Cluster.Definition, Cluster.Update {
    private ClusterPatch updateParameter;
    ClusterImpl(String name, ClusterInner inner, LogAnalyticsManager manager) {
        super(name, inner, manager);
        this.updateParameter = new ClusterPatch();
    }

    @Override
    public Observable<Cluster> createResourceAsync() {
        ClustersInner client = this.manager().inner().clusters();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(new Func1<ClusterInner, ClusterInner>() {
               @Override
               public ClusterInner call(ClusterInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Cluster> updateResourceAsync() {
        ClustersInner client = this.manager().inner().clusters();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<ClusterInner, ClusterInner>() {
               @Override
               public ClusterInner call(ClusterInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ClusterInner> getInnerAsync() {
        ClustersInner client = this.manager().inner().clusters();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new ClusterPatch();
    }

    @Override
    public String clusterId() {
        return this.inner().clusterId();
    }

    @Override
    public Identity identity() {
        return this.inner().identity();
    }

    @Override
    public KeyVaultProperties keyVaultProperties() {
        return this.inner().keyVaultProperties();
    }

    @Override
    public String nextLink() {
        return this.inner().nextLink();
    }

    @Override
    public ClusterEntityStatus provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public ClusterSku sku() {
        return this.inner().sku();
    }

    @Override
    public ClusterImpl withIdentity(Identity identity) {
        this.inner().withIdentity(identity);
        return this;
    }

    @Override
    public ClusterImpl withNextLink(String nextLink) {
        this.inner().withNextLink(nextLink);
        return this;
    }

    @Override
    public ClusterImpl withKeyVaultProperties(KeyVaultProperties keyVaultProperties) {
        if (isInCreateMode()) {
            this.inner().withKeyVaultProperties(keyVaultProperties);
        } else {
            this.updateParameter.withKeyVaultProperties(keyVaultProperties);
        }
        return this;
    }

    @Override
    public ClusterImpl withSku(ClusterSku sku) {
        if (isInCreateMode()) {
            this.inner().withSku(sku);
        } else {
            this.updateParameter.withSku(sku);
        }
        return this;
    }

}
