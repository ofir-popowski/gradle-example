package gradle.example

import custom.test.SomeTestService
import kotlin.test.Test
import kotlin.test.assertNotNull

class AppTest {
    @Test fun testAppHasAGreeting() {
        val classUnderTest = App()
        SomeTestService().sayHello()
        assertNotNull(classUnderTest.greeting, "app should have a greeting")
    }
}
