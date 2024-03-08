// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.async

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.OkRetrieveParams
import com.langsmith.api.models.OkRetrieveResponse
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class OkServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : OkServiceAsync {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<OkRetrieveResponse> =
        jsonHandler<OkRetrieveResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Ok */
    override fun retrieve(
        params: OkRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<OkRetrieveResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("ok")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response.use { retrieveHandler.handle(it) }
        }
    }
}
