package com.businesscar.studentapp.presentation.vacancies

import com.businesscar.studentapp.presentation.CoreViewModel
import com.businesscar.studentapp.presentation.vacancies.VacanciesFragment.VacanciesFragmentState

class VacanciesViewModel : CoreViewModel<VacanciesFragmentState>() {

    init {
        applyState(
            VacanciesFragmentState(
                listOf(
                    VacancyItem(
                        "Google inc.",
                        "Разработчик node.js",
                        "Google Drive",
                        "Маунтин-Вью, Калифорния, США"
                    ),
                    VacancyItem(
                        "Яндекс",
                        "Разработчик Android",
                        "Яндекс.Дзен",
                        "Москва, Садовническая набережная 82"
                    ),
                    VacancyItem(
                        "Сбербанк",
                        "Разработчик Android",
                        "Сбер друг",
                        "Москва, Кутузовский проспект 32"
                    ),
                    VacancyItem(
                        "Райффайзен банк",
                        "Разработчик Android",
                        "Райффайзен капитал",
                        "Москва, Смоленская-Сенная 28"
                    ),
                    VacancyItem(
                        "Рекламная компания РОССТ",
                        "Разработчик Android",
                        "Mayber",
                        "Москва, Нижняя Красносельская 40/12к20"
                    ),
                    VacancyItem(
                        "Meta inc.",
                        "Senior data-scientist",
                        "Facebook",
                        "Менло-Парк, Калифорния, США"
                    ),
                    VacancyItem(
                        "Amazon",
                        "Rocket-science researcher",
                        "Blue origin",
                        "Сиэтл, Вашингтон, США"
                    ),
                    VacancyItem(
                        "Netflix",
                        "Java developer",
                        "Netflix on smart TV",
                        "Лос Гатос, Калифорния, США"
                    ),
                    VacancyItem(
                        "Apple inc.",
                        "IOS Разроботчик",
                        "Safari app",
                        "Купертино, Калифорния, США"
                    ),
                )
            )
        )
    }
}