package ru.danbel.main.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.borderColor
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Text
import ru.danbel.main.primaryText
import ru.danbel.main.tintColor

@Composable
fun MainButton(
    text: String,
    onClick: () -> Unit
) {
    Button(
        attrs = {
            style {
                borderRadius(15.px)
                padding(10.px, 20.px)
                backgroundColor(tintColor)
                cursor(Cursor.Pointer.toString())
                color(primaryText)
                borderColor(tintColor)
                fontSize(14.px)
            }
            onClick { onClick() }
        }
    ) {
        Text(text)
    }
}