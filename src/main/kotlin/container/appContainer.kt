package container
import react.*
import react.redux.rConnect
import components.*
import data.*
import hoc.withDisplayName

val appContainer =
    rConnect<State, RProps, AppProps>(
        { state, _->
            films = state.films
            genres = state.genres

        },
        {
            pure = false  // side effect of React Route
        }
    )(
        withDisplayName(
            "MyApp",
            fApp()
        )
            .unsafeCast<RClass<AppProps>>()
    )