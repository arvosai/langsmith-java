// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.langsmith.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TracerSessionWithoutVirtualFieldsTest {

    @Test
    fun createTracerSessionWithoutVirtualFields() {
        val tracerSessionWithoutVirtualFields =
            TracerSessionWithoutVirtualFields.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .defaultDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("string")
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .extra(JsonValue.from(mapOf<String, Any>()))
                .lastRunStartTimeLive(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("string")
                .referenceDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(tracerSessionWithoutVirtualFields).isNotNull
        assertThat(tracerSessionWithoutVirtualFields.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tracerSessionWithoutVirtualFields.tenantId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tracerSessionWithoutVirtualFields.defaultDatasetId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tracerSessionWithoutVirtualFields.description()).contains("string")
        assertThat(tracerSessionWithoutVirtualFields.endTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tracerSessionWithoutVirtualFields._extra())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(tracerSessionWithoutVirtualFields.lastRunStartTimeLive())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tracerSessionWithoutVirtualFields.name()).contains("string")
        assertThat(tracerSessionWithoutVirtualFields.referenceDatasetId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tracerSessionWithoutVirtualFields.startTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
