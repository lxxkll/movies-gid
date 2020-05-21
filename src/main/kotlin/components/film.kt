package components

import container.filmListContainer
import data.Film
import react.*
import org.w3c.dom.events.Event
import hoc.withDisplayName
import kotlinx.html.id
import react.dom.*
import react.router.dom.navLink
import react.router.dom.route
import react.router.dom.switch
import kotlin.js.Date

interface FilmProps : RProps {
    var film: Film
    var index: Int
}

val fFilm =
    functionalComponent<FilmProps> {
        tr {
            td {  navLink("/films/${it.index}") {+it.film.name } }
            td { +it.film.genre }
            td { +"${it.film.year}" }
        }
    }

fun RBuilder.film(
    film: Film,
    number: Int
) = child(
    withDisplayName("Film", fFilm)
) {
    attrs.film = film
    attrs.index = number
}