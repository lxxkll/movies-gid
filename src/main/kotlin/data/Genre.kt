package data

data class Genre(
    val genre: String
)

fun genreList(): Array<Genre> {
    return arrayOf(
        Genre ("Детектив"),
        Genre("Драма"),
        Genre ("Криминал"),
        Genre("Комедия"),
        Genre("Концерт"),
        Genre("Мистика"),
        Genre ("Романтика")
    )
}