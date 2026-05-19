package com.example.parctiva.ui.model

data class LoginUiData(
    val email: String,
    val passwordMask: String,
    val forgotPasswordLabel: String,
    val socialButtons: List<String>
)

data class LocationUiData(
    val points: String,
    val storeName: String,
    val addressType: String,
    val streetAddress: String,
    val tags: List<String>,
    val isFavorite: Boolean
)

data class SettingsSection(
    val title: String,
    val items: List<String>
)

object StaticData {
    val login = LoginUiData(
        email = "contact@dacodetech.com",
        passwordMask = "••••••••••",
        forgotPasswordLabel = "Забыли пароль?",
        socialButtons = listOf("Войти с Apple", "Войти с Google")
    )

    val location = LocationUiData(
        points = "+5",
        storeName = "Магазин продуктов",
        addressType = "Локация",
        streetAddress = "г. Красноярск, ул. Академика Киренского 22",
        tags = listOf("Дом", "Работа", "Спорт"),
        isFavorite = true
    )

    val settings = listOf(
        SettingsSection(
            title = "Аккаунт",
            items = listOf("Изменить профиль", "Безопасность", "Сообщения", "Приватность")
        ),
        SettingsSection(
            title = "Карта",
            items = listOf("Удалённые метки", "Избранное")
        ),
        SettingsSection(
            title = "Триггеры",
            items = listOf("Сообщить о проблеме", "Добавить аккаунт", "Выйти")
        )
    )
}
