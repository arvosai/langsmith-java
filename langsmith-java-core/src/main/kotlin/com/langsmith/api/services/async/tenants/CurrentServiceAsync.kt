// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async.tenants

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.PendingIdentity
import com.langsmith.api.models.TenantCurrentMembersCreateParams
import com.langsmith.api.models.TenantCurrentMembersListParams
import com.langsmith.api.models.TenantCurrentStatsRetrieveParams
import com.langsmith.api.models.TenantMembers
import com.langsmith.api.models.TenantStats
import java.util.concurrent.CompletableFuture

interface CurrentServiceAsync {

    /** Add Member To Current Tenant */
    @JvmOverloads
    fun membersCreate(
        params: TenantCurrentMembersCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<PendingIdentity>

    /** Get Current Tenant Members */
    @JvmOverloads
    fun membersList(
        params: TenantCurrentMembersListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<TenantMembers>

    /** Get Current Tenant Stats */
    @JvmOverloads
    fun statsRetrieve(
        params: TenantCurrentStatsRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<TenantStats>
}
