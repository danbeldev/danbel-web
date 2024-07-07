package ru.danbel.main.data

data class BaseData(
    val title: String,
    val icon: String? = null,
    val links: List<LinkData> = emptyList()
)

data class LinkData(
    val text: String,
    val link: String
)

private val pgkLinkData = listOf(
    LinkData(
        text = "Schedule Admin",
        link = "https://pgk.admin.danbel.ru:30"
    ),
    LinkData(
        text = "Schedule Telegram",
        link = "https://t.me/pgk63_bot"
    ),
    LinkData(
        text = "Schedule Alice",
        link = "https://alice.ya.ru/s/99694ba7-cba5-4eab-b10a-462075686778"
    )
)

private val servicesLinkData = listOf(
    LinkData(
        text = "Mail",
        link = "https://mail.danbel.ru:30"
    ),
    LinkData(
        text = "Plex",
        link = "https://plex.danbel.ru:30"
    ),
    LinkData(
        text = "PgAdmin",
        link = "https://pgadmin.danbel.ru:30"
    ),

    LinkData(
        text = "Jenkins",
        link = "https://jenkins.danbel.ru:30"
    ),
    LinkData(
        text = "Gitea",
        link = "https://git.danbel.ru:30"
    ),
    LinkData(
        text = "TpLink",
        link = "https://tp.danbel.ru:30"
    ),
    LinkData(
        text = "Torrent",
        link = "https://torrent.danbel.ru:30"
    )
).sortedBy { it.text }

private val apiLinkData = listOf(
    LinkData(
        text = "PGK Schedule",
        link = "https://api.danbel.ru:30/pgk/schedule/v1.1/swagger-ui/index.html"
    ),
    LinkData(
        text = "PGK Schedule Script",
        link = "https://api.danbel.ru:30/pgk/schedule/script"
    ),
)

val allData = listOf(
    BaseData(
        title = "ПГК",
        links = pgkLinkData,
        icon = "/college.png"
    ),
    BaseData(
        title = "Services",
        links = servicesLinkData,
        icon = "/cloud_server.png"
    ),
    BaseData(
        title = "API",
        links = apiLinkData,
        icon = "/api.png"
    )
)

const val GITHUB_URL = "https://github.com/danbeldev/danbel-web"