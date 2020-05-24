package components

import container.filmFullContainer
import container.filmListContainer
import container.filmsToWatchContainer
import container.topFilmsContainer
import data.Film
import data.Genre
import org.w3c.dom.HTMLInputElement
import org.w3c.dom.events.Event
import react.*
import react.dom.*
import react.router.dom.*

interface AppProps : RProps {
    var films: Array<Film>
    var genres: Array<Genre>
}

interface RouteNumberResult : RProps {
    var number: String
}

fun fApp() =
    functionalComponent<AppProps> { props ->
        div("home") {
            div {
                ul {
                    li { navLink("/films") { +"Список фильмов" } }
                    li { navLink("/want") { +"Фильмы к просмотру" } }
                    li { navLink("/watched") { +"Просмотренные фильмы" } }
                    li { navLink("/top") { +"Рейтинг" } }
                }
            }
            div("desc") {
                +"Добро пожаловать на Кино-гайд"
                br { }
                +"Добро пожаловать на Кино-гайд
Здесь вы можете отслеживать вышдешие фильмы, добавлять их в список к просмотру и оценивать, а также на основе рейтинга создатся ваш уникальный список фильмов которые вам понравились."
            }
        }
        switch {
            route("/films",
                exact = true,
                render = { filmListContainer {} }
            )
            route("/films/:number",
                exact = true,
                render = renderObject(
                    { props.films[it] },
                    { index, _ ->
                        filmFullContainer {
                            attrs.index = index
                        }
                    }
                )
            )
            route("/want",
                exact = true,
                render = { filmsToWatchContainer{} }
            )
            route("/watched",
                exact = true,
                render = { watchedFilms(props.films) }
            )
            route("/top",
                exact = true,
                render = { topFilmsContainer{}}
            )
        }
    }

fun <O> RBuilder.renderObject(
    selector: (Int) -> O?,
    rElement: (Int, O) -> ReactElement
) =
    { route_props: RouteResultProps<RouteNumberResult> ->
        val num = route_props.match.params.number.toIntOrNull() ?: -1
        val obj = selector(num)
        if (obj != null) {
            rElement(num, obj)
        } else
            p { +"Object not found" }
    }

fun RBuilder.app(
) =
    child(
        fApp()
    ) {
    }
