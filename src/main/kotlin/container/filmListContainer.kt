package container

import components.FilmListProps
import components.FilmProps
import components.fFilmList
import data.*
import hoc.withDisplayName
import org.w3c.dom.events.Event
import react.*
import react.redux.rConnect
import redux.*

interface FilmListDispatchProps : RProps {
    var add: (Event) -> Unit
}

interface FilmListStateProps : RProps {
    var films: Array<Film>
    var genres: Array<Genre>
}

val filmListHoc =
    rConnect<
            State,
            RAction,
            WrapperAction,
            RProps,                         // Own Props
            FilmListStateProps,
            FilmListDispatchProps,
            FilmListProps
            >(
        mapStateToProps = { state, _ ->
            films = state.films
            genres = state.genres
        },
        mapDispatchToProps = { dispatch, _ ->
            add = {dispatch(AddFilm())}
        }
    )

val filmListRClass =
    withDisplayName(
        "FilmList",
        fFilmList
    )
        .unsafeCast<RClass<FilmListProps>>()

val filmListContainer =
    filmListHoc(filmListRClass)