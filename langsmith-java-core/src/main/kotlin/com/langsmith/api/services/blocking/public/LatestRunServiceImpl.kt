// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking.public

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.PublicLatestRunRetrieveParams
import com.langsmith.api.models.RunPublicSchema
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler

class LatestRunServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : LatestRunService {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<RunPublicSchema> =
        jsonHandler<RunPublicSchema>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get the shared run. */
    override fun retrieve(
        params: PublicLatestRunRetrieveParams,
        requestOptions: RequestOptions
    ): RunPublicSchema {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("public", params.getPathParam(0), "run")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
