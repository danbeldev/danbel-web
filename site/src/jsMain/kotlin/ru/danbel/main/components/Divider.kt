package ru.danbel.main.components

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Hr
import ru.danbel.main.tintColor

@Composable
fun Divider(
    color: CSSColorValue = tintColor,
    width: CSSNumeric = 100.percent,
    height: CSSNumeric = 1.px
) {
    Hr(
        attrs = {
            style {
                color(color)
                width(width)
                height(height)
            }
        }
    )
}