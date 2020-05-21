package data




data class Film(
    val name: String,
    val genre: String,
    val year: Int,
    val actors: String,
    val picture: String,
    var desc: String,
    var seen: Boolean,
    var wannaSee: Boolean,
    var rate: Int,
    var date: String
)

fun filmList(): Array<Film> {
    return arrayOf(
        Film(
            " 0.5 Любовь ",
            "Романтика",
            2014,
            "ТПурба Ргиал, Джесси Чиан",
            "http://static.dramastyle.com/images/3/1/20652/0-5-Love__3.jpg",
            "Каждый изначально один. У него свой собственный мир, свои представления, своя система ценностей, манера поведения. " +
                    "Когда два человека вместе, они заботятся друг о друге, отказываются от своих принципов и упрямства, " +
                    "стараются приспособиться друг к другу. Именно тогда они превращаются из одного в половину. " +
                    "И тогда их ждёт стабильность и гармония в отношениях. Это то, к чему стремятся главные герои фильма. " +
                    "Но жизнь не так проста, чтобы позволить им жить долго и счастливо. " +
                    "Для этого нужно очень постараться: преодолеть трудности, стать мудрее, познать любовь и получить свои уроки. ",
            true,
            false,
            9,
            "11.05.2020"
        ),
        Film(
            "100 стихов для Стеллы ",
            "Романтика",
            2017,
            "Джейси Сантос, Белла Падилья",
            "https://dorams.com/wp-content/uploads/6436/poster/40927.jpg",
            "На протяжении 4 лет учёбы в колледже студент-заика Фидель " +
                    "пытается закончить сборник из 100 стихов для Стеллы, подающей надежды рок-звезды, чтобы завоевать её сердце.",
            true,
            false,
            10,
            "11.05.2020"
        ),
        Film(
            "1987: Когда придёт тот день ",
            "Драма",
            2017,
            "Ха Чон У, Ким Тэ Ри, Ким Юн Сок, Пак Хи Сун, Ю Хэ Чжин, Ли Хи Чжун",
            "https://kenh14cdn.com/2017/a2-1510284653242.jpeg",
            "В 1987 году студент университета и член демократического движения Пак Чон Чхоль был захвачен полицией и замучен до смерти. " +
                    "Полиция и правительство пытаются прикрыть дело Пак Чон Чхоля, но средства массовой информации и студенты пытаются раскрыть правду.",
            false,
            false,
            0,
            ""
        ),
        Film(
            "2017 BTS Live Trilogy Episode III: The Wings Tour in Seoul",
            "Концерт",
            2017,
            "BTS",
            "http://image.tmdb.org/t/p/original/rfNtobmMpqPzlxowwFZcWUmATYb.jpg",
            "Концерт Wings 18-19 февраля 2017 года. Будет представлено видео с концерта, а также реакция парней на выступления.",
            false,
            false,
            0,
            ""
        ),
        Film(
            "2018 BTS World Tour LOVE YOURSELF In Seoul",
            "Концерт",
            2018,
            "BTS",
            "https://pbs.twimg.com/media/EVLJS27UMAEcUtB.jpg:large",
            "Тур BTS 'LOVE YOURSELF' продолжает творить историю, распродавая арены по всему миру. " +
                    "Откройте для себя сногсшибательное и ошеломительное выступление BTS на концерте в Сеуле," +
                    " которое ознаменовало торжественное открытие тура, на большом экране! ",
            false,
            false,
            0,
            ""
        ),
        Film(
            "21 карат",
            "Комедия",
            2018,
            "Лю Жуй Линь, Го Цзин Фэй, Бао Бэй Эр, Да Пэн, Дильраба Дильмурат",
            "https://st.kp.yandex.net/im/poster/3/1/4/kinopoisk.ru-21-Carats-3144600.jpg",
            "Лю Цзя Инь (Дильраба) обанкротилась после расставания со своим богатым парнем. " +
                    "Оказавшись в затруднительном положении и вынужденная платить по долгам, она продает все свое имущество." +
                    "Ван Цзи Вэй (Го Цзин Фэй) родился скромным и идет на крайности, чтобы сэкономить деньги. " +
                    "Случайная встреча заставляет их жить под одной крышей и пересматривать свои пренебрежительные взгляды," +
                    " когда дело доходит до денег и любви.",
            false,
            false,
            0,
            ""
        ),
        Film(
            "Божественная ярость",
            "Мистика",
            2019,
            "Хон Сын Бом, Ан Сон Ги, У До Хван, Со Чжон Ён, Чон Да Ын, Пэ Хён Сон, Чо Ын Хён, Хан Да Ми, Пак Со Джун",
            "https://avatars.mds.yandex.net/get-zen_doc/1639101/pub_5db7d35de3062c00b072d255_5db7d54e7cccba00affcf62e/scale_1200",
            "История о человеке, потерявшем отца в детстве и борющемся вместе со священником-экзорцистом с силами зла. ",
            false,
            false,
            0,
            ""
        ),
        Film(
            "Абсурдный несчастный случай",
            "Криминал",
            2017,
            "Жэнь Су Си, Чэнь Си Сюй, Гао Е",
            "https://channelmyanmar.org/wp-content/uploads/2017/11/MV5BMDM4YjIyZjAtMzU4Ny00MmIzLTg1ZWItNzIzMjEzMGY5YjUyXkEyXkFqcGdeQXVyNzYzOTEzMDg@._V1_SY1000_CR007141000_AL_-1.jpg",
            "События происходят в небольшом населённом пункте на северо-востоке Китая. " +
                    "Главный герой по имени Ян Байвань владеет рестораном-гостиницей совместно со своей женой Ма Лилянь." +
                    " Подозревая жену в супружеской неверности, Ян Байвань нанимает человека, чтобы её убить. " +
                    "Однако в дальнейшем всё идёт не по плану. В результате убивают совсем другого человека, " +
                    "в чём оказываются замешаны посторонние люди, случайно появившиеся на месте событий. ",
            false,
            false,
            0,
            ""
        ),
        Film(
            "Апелляция",
            "Детектив",
            2017,
            "Чон У, Кан Ха Ныль",
            "https://asia-holics.ru/wp-content/uploads/2017/07/new-trial2.jpg",
            "Ли Чжун Ён (Чон У) - адвокат. Он берется за новое дело, чтобы очистить имя Хён У (Кан Ха Ныль). " +
                    "Парня обвинили в убийстве и посадили в тюрьму, " +
                    "когда он был ещё подростком. Молодой человек провел в заточении 10 лет.",
            false,
            false,
            0,
            ""
        )
        ,
        Film(
            "Аферисты",
            "Детектив",
            2017,
            "Ю Джи Тхэ, Хён Бин",
            "https://st.kp.yandex.net/im/poster/3/0/4/kinopoisk.ru-Kkun-3043075.jpg",
            "Прокурор (Ю Джи Тхэ) и мошенник (Хён Бин) работают вместе, чтобы поймать " +
                    "группу отъявленных преступников, которые сбежали с 4 трлн. вон (приблизительно 3.6 млрд. \$).",
            false,
            false,
            0,
            ""
        ),
        Film(
            "Ветеран ",
            "Комедия",
            2015,
            " О Даль Су, Ю А Ин, Хван Чон Мин, Ю Хэ Чжин",
            "https://www.film.ru/sites/default/files/movies/posters/15915115-851040.jpg",
            "Детектив Со Ду Чхоль пытается засадить за решетку Чо Тэ О. Но сделать это не так просто как кажется. " +
                    "Ведь парень не кто-нибудь, а наследник крупной компании с хорошими связями. " +
                    "Получится ли у детектива довести дело до конца?",
            false,
            false,
            0,
            ""
        ),
        Film(
            "Высокие каблуки ",
            "Драма",
            2017,
            " Чха Сын Вон",
            "https://www.kinopoisk.ru/images/film_big/840387.jpg",
            "История детектива Чжи Ука из отдела особо тяжких преступлений, " +
                    "внешне сурового мужчины, вынужденного скрывать свою внутреннюю женскую сущность.",
            false,
            false,
            0,
            ""
        )
        ,
        Film(
            " Головокружение  ",
            "Романтика",
            2019,
            " Пак Йе Ён, Ли Су Ин, Пак Ён Су, Ха До Квон, Чхон У Хи",
            "https://torrentss.ru/_ld/272/27227.jpg",
            "30-летняя Су Ён работает графическим дизайнером в компании, находящейся на " +
                    "42-м этаже высотного офисного здания. Она мечтает о стабильной жизни, но её реальность далека от этого." +
                    " Су Ён страдает от долгих телефонных разговоров о деньгах с вечно пьяной матерью, от страха, что её контракт " +
                    "могут не продлить, от неопределенности в отношениях со своим парнем Джи Су (Тео Ю), который работает в той же " +
                    "компании руководителем отдела, а потом внезапно увольняется. Vertigo - название кафе, где они иногда встречались. " +
                    " От стресса у нее появляются звон в ушах и внезапные головокружения." +
                    " Однажды она замечает по ту сторону окна мойщика окон Квон У (Чон Джэ Кван). " +
                    "Он издали наблюдает за девушкой, напоминающей ему погибшую сестру.",
            false,
            false,
            0,
            ""
        )
    )
}