package ru.danbel.main

import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.theme.colors.palette.background
import com.varabyte.kobweb.silk.theme.colors.palette.color

@InitSilk
fun initTheme(ctx: InitSilkContext) {
    ctx.theme.palettes.light.background = primaryBackground
    ctx.theme.palettes.light.color = tintColor
    ctx.theme.palettes.dark.background = primaryBackground
    ctx.theme.palettes.dark.color = tintColor
}
