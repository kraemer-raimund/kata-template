package org.example

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class ExampleTest {

    @BeforeEach
    fun setUp() {
        // You may or may not need to initialize something before each test.
    }

    @AfterEach
    fun tearDown() {
        // You may or may not need to deinitialize something after each test.
    }

    @Test
    fun succeeds() {
        assertThat(42).isLessThan(1337)
        assertThat(ArrayList<String>()).isEmpty()
    }

    @Test
    fun fails() {
        assertThat("A").isEqualTo("B")
        assertThat(Any()).isNull()
    }
}
