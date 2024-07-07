package ru.danbel.main.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.core.Page
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text
import ru.danbel.main.Utils.openLinkInBrowser
import ru.danbel.main.components.Divider
import ru.danbel.main.components.MainButton
import ru.danbel.main.components.TextButton
import ru.danbel.main.data.GITHUB_URL
import ru.danbel.main.data.allData
import ru.danbel.main.primaryText

@Page
@Composable
fun HomePage() {
    Column(
        modifier = Modifier
            .padding(16.px)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Div(attrs = { style { height(30.px) } })

        Img(src = "profile.png", attrs = {
            style {
                width(125.px)
                padding(15.px)
            }
        })

        P(
            attrs = {
                style {
                    color(primaryText)
                    fontWeight("900")
                    fontFamily("FontFamily")
                    fontSize(22.px)
                    marginBottom(16.px)
                }
            }
        ) {
            Text("DanBel - Данила Беляков")
        }

        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(10.px)
        ) {
            allData.forEach { item ->
                Column(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Div(attrs = { style { height(8.px) } })
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(right = 16.px)
                    ) {
                        item.icon?.let { icon ->
                            Img(src = icon, attrs = {
                                style {
                                    width(35.px)
                                }
                            })
                            Div(attrs = { style { width(8.px) } })
                        }

                        P(
                            attrs = {
                                style {
                                    color(primaryText)
                                    fontWeight("700")
                                    fontFamily("FontFamily")
                                    fontSize(20.px)
                                }
                            }
                        ) {
                            Text(item.title)
                        }
                    }

                    Divider()

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.px)
                    ) {
                        item.links.forEach { linkData ->
                            MainButton(
                                text = linkData.text,
                                onClick = {
                                    openLinkInBrowser(linkData.link)
                                }
                            )
                        }
                    }
                }
            }
        }
    }

    TextButton(
        text = "Kotlin Multiplatform",
        style = {
            fontWeight("200")
            position(Position.Absolute)
            bottom(16.px)
            right(16.px)
        },
        onClick = {
            openLinkInBrowser(GITHUB_URL)
        }
    )
}
