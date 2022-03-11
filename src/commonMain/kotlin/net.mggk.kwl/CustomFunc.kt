package net.mggk.kwl

import kotlin.js.JsExport
import kotlin.js.JsName

@kotlin.js.ExperimentalJsExport
@JsExport()
class CustomFunc {
    @JsName("sayHello")
    fun sayHello() {
        println("Hello from kotlin library :D")
    }
    @JsName("multiplyPerTwo")
    fun multiplyPerTwo(x: Int): Int {
        return 2 * x
    }
}