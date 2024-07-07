package ru.danbel.main

import kotlinx.browser.window

object Utils {
    fun openLinkInBrowser(url: String) {
        window.open(url, "_blank")
    }
}