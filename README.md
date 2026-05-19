# Parctiva UI (Kotlin, Android)

Проект реализует UI:
- экран входа;
- экран выбора адреса на карте;
- экран настроек.

<img width="274" height="473" alt="Снимок экрана_20260520_021922" src="https://github.com/user-attachments/assets/8005953a-0048-4f3b-b630-9c4ce9dc3db4" />
<img width="297" height="543" alt="Снимок экрана_20260520_021909" src="https://github.com/user-attachments/assets/c207818e-0b2b-4da8-8ebd-d5480e4d8c40" />
<img width="259" height="561" alt="Снимок экрана_20260520_021846" src="https://github.com/user-attachments/assets/d33727f9-12fb-4494-bd85-7ea67b71a1a3" />


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
