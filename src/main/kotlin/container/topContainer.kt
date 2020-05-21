package container

import components.FilmFullProps
import components.TopFilms
import components.fFilmFull
import components.fTopFilms
import data.*
import hoc.withDisplayName
import org.w3c.dom.events.Event
import react.*
import react.redux.rConnect
import redux.*

interface TopFilmDispatchProps : RProps {
    var sortByYear: (Event) -> Unit
    var sortByRate: (Event) -> Unit
}

interface TopFilmStateProps: RProps {
    var films: Array<Film>
}

val fTopHoc =
    rConnect<
            State,
            RAction,
            WrapperAction,
            RProps,                         // Own Props
            TopFilmStateProps,
            TopFilmDispatchProps,
            TopFilms
            >(
        mapStateToProps = { state, _ ->
            films = state.films
        },
        mapDispatchToProps = { dispatch, _ ->
            sortByYear = { dispatch(SortByYear()) }
            sortByRate = { dispatch(SortByRate()) }

        }
    )

val topFilmsRClass =
    withDisplayName(
        "TopFilms",
        fTopFilms
    )
        .unsafeCast<RClass<TopFilms>>()

val topFilmsContainer =
    fTopHoc(topFilmsRClass)