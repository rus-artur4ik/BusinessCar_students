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
                        "Toyota Tsusho Сorporation",
                        "Автомеханик",
                        "Группа Компаний БИЗНЕС КАР",
                        "Октябрьское поле, Москва, проспект Маршала Жукова, 49к1",
                        "https://b4051664-be9e-4979-89c4-770444c116cd.selcdn.net/media/cache/new_toyotabc/company_logo_social/tradeins.space/uploads/company/4226/logo-30_mono.png"
                    ),

                    VacancyEntity(
                        "Inchcape",
                        "Менеджер по привлечению клиентов",
                        "Inchcape Russia",
                        "Москва, МКАД, 44-й километр, внешняя сторона",
                        "https://is2-ssl.mzstatic.com/image/thumb/Purple123/v4/10/24/da/1024daf8-3368-5479-076c-d6b634f058f7/source/512x512bb.jpg"
                    ),

                    VacancyEntity(
                        "Toyota Tsusho Сorporation",
                        "Продавец консультант новых автомобилей",
                        "Группа Компаний БИЗНЕС КАР",
                        "Октябрьское поле, Москва, проспект Маршала Жукова, 49к1",
                        "https://b4051664-be9e-4979-89c4-770444c116cd.selcdn.net/media/cache/new_toyotabc/company_logo_social/tradeins.space/uploads/company/4226/logo-30_mono.png"
                    ),

                    VacancyEntity(
                        "Inchcape",
                        "Менеджер по выкупу автомобилей с пробегом",
                        "Inchcape Russia",
                        "МКАД29/МКАД44/Шелепиха",
                        "https://is2-ssl.mzstatic.com/image/thumb/Purple123/v4/10/24/da/1024daf8-3368-5479-076c-d6b634f058f7/source/512x512bb.jpg"
                    ),


                    VacancyEntity(
                        "Inchcape",
                        "Менеджер по работе с клиентами (удаленная работа)",
                        "Inchcape Russia",
                        "Москва, МКАД, 44-й километр, внешняя сторона",
                        "https://is2-ssl.mzstatic.com/image/thumb/Purple123/v4/10/24/da/1024daf8-3368-5479-076c-d6b634f058f7/source/512x512bb.jpg"
                    ),

                    VacancyEntity(
                        "Renault",
                        "Автомеханик / Автослесарь",
                        "RTDService",
                        "Чехов, Симферопольское шоссе, 1Б", "https://hhcdn.ru/employer-logo/1597175.jpeg"
                    ),

                    VacancyEntity(
                        "Renault",
                        "Уборщик служебных помещений",
                        "RTDService",
                        "Тамбов, улица Киквидзе, 116",
                        "https://hhcdn.ru/employer-logo/1597175.jpeg"
                    ),

                    VacancyEntity(
                        "Toyota Tsusho Сorporation",
                        "Web-разработчик",
                        "Группа Компаний БИЗНЕС КАР",
                        "Октябрьское поле, Москва, проспект Маршала Жукова, 49к1",
                        "https://b4051664-be9e-4979-89c4-770444c116cd.selcdn.net/media/cache/new_toyotabc/company_logo_social/tradeins.space/uploads/company/4226/logo-30_mono.png"
                    ),
                )
            )
        )
    }
}