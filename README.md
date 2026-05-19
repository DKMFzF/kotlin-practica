# Parctiva UI (Kotlin, Android)

Проект реализует UI из практической работы:
- экран входа;
- экран выбора адреса на карте;
- экран настроек.

Все данные на экранах заполняются статическими объектами в `StaticData`.

## Что реализовано

- Нативный Android-проект на Kotlin (`minSdk 24`, `targetSdk 34`).
- Верстка экранов выполнена в XML (без динамической загрузки данных).
- Переходы между экранами:
  - `LoginActivity` -> `LocationActivity`;
  - `LocationActivity` -> `SettingsActivity`;
  - из `SettingsActivity` по кнопке назад.
- Статические данные находятся в `app/src/main/java/com/example/parctiva/ui/model/StaticData.kt`.

## Сборка APK через командную строку

### Требования

- JDK 17 (`java -version`).
- Android SDK:
  - переменная окружения `ANDROID_HOME` или `ANDROID_SDK_ROOT`;
  - установленные пакеты `platforms;android-34` и `build-tools;34.0.0`.

### Команды

Из корня проекта:

```bash
chmod +x ./gradlew
./gradlew assembleDebug
```

### Где находится APK

Готовый файл после успешной сборки:

`app/build/outputs/apk/debug/app-debug.apk`

## Архив для сдачи

Рекомендуемый формат: `zip`.

Пример команды из корня проекта:

```bash
cd ..
zip -r kotlin-parctiva.zip kotlin-parctiva -x "kotlin-parctiva/.git/*" "kotlin-parctiva/.gradle/*" "kotlin-parctiva/**/build/*"
```

В архив должны входить:
- исходный код проекта;
- этот `README.md` с инструкцией по сборке.
