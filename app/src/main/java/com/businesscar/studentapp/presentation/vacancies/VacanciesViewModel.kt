package com.businesscar.studentapp.presentation.vacancies

import com.businesscar.studentapp.domain.entity.VacancyEntity
import com.businesscar.studentapp.presentation.CoreViewModel
import com.businesscar.studentapp.presentation.vacancies.VacanciesFragment.VacanciesFragmentState

class VacanciesViewModel : CoreViewModel<VacanciesFragmentState>() {

    init {
        applyState(
            VacanciesFragmentState(
                listOf(
                    VacancyEntity(
                        "Toyota inc.",
                        "Разработчик node.js",
                        "Google Drive",
                        "Маунтин-Вью, Калифорния, США",
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Google_%22G%22_Logo.svg/240px-Google_%22G%22_Logo.svg.png"
                    ),
                    VacancyEntity(
                        "Lexus",
                        "Разработчик Android",
                        "Яндекс.Дзен",
                        "Москва, Садовническая набережная 82",
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/6/65/Yandex_official_logo.svg/1280px-Yandex_official_logo.svg.png"
                    ),
                    VacancyEntity(
                        "Сбербанк",
                        "Разработчик Android",
                        "Сбер друг",
                        "Москва, Кутузовский проспект 32",
                        "https://icdn.lenta.ru/images/2020/09/21/21/20200921212138973/detail_30efcf43395af59daf77810c8267a28b.png"
                    ),
                    VacancyEntity(
                        "Райффайзен банк",
                        "Разработчик Android",
                        "Райффайзен капитал",
                        "Москва, Смоленская-Сенная 28",
                        "https://toplogos.ru/images/logo-raiffeisen-bank.jpg"
                    ),
                    VacancyEntity(
                        "Рекламная компания РОССТ",
                        "Разработчик Android",
                        "Mayber",
                        "Москва, Нижняя Красносельская 40/12к20",
                        "https://assets-global.website-files.com/5e3177cecf36f6591e4e38cb/5ea2a86505e63bdd814cf868_Logo.png"
                    ),
                    VacancyEntity(
                        "Meta inc.",
                        "Senior data-scientist",
                        "Facebook",
                        "Менло-Парк, Калифорния, США",
                        "https://assets-global.website-files.com/5e3177cecf36f6591e4e38cb/5ea2a86505e63bdd814cf868_Logo.png"
                    ),
                    VacancyEntity(
                        "Amazon",
                        "Rocket-science researcher",
                        "Blue origin",
                        "Сиэтл, Вашингтон, США",
                        "https://assets-global.website-files.com/5e3177cecf36f6591e4e38cb/5ea2a86505e63bdd814cf868_Logo.png"
                    ),
                    VacancyEntity(
                        "Netflix",
                        "Java developer",
                        "Netflix on smart TV",
                        "Лос Гатос, Калифорния, США",
                        "https://assets-global.website-files.com/5e3177cecf36f6591e4e38cb/5ea2a86505e63bdd814cf868_Logo.png"
                    ),
                    VacancyEntity(
                        "Apple inc.",
                        "IOS Разработчик",
                        "Safari app",
                        "Купертино, Калифорния, США",
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8a/Apple_Logo.svg/1719px-Apple_Logo.svg.png"
                    ),
                )
            )
        )
    }
}