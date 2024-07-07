package ru.danbel.main.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.Cursor
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text
import ru.danbel.main.primaryText

@Composable
fun TextButton(
    text: String,
    onClick: () -> Unit,
    style: StyleScope.() -> Unit = {},
    color: CSSColorValue = primaryText
) {
    P(
        attrs = {
            style {
                color(color)
                cursor(Cursor.Pointer.toString())
                style()
            }
            onClick {
                onClick()
            }
        }
    ) {
        Text(value = text)
    }
}