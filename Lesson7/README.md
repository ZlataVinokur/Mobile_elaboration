Отчет по практической работе №7
----
В рамках работы изучены сетевые взаимодействия в Android, библиотека Retrofit и облачная платформа Firebase, включая работу с JSON-данными, их синхронизацию, кэширование и аутентификацию пользователей.

Задание №1
--
Создан модуль “TimeService” для получения текущей даты и времени от публичных Daytime-серверов через прямое сокет соединение и AsyncTask.

**Приложение:**
![image](https://github.com/user-attachments/assets/62c524b3-45da-4e9b-b53f-ae8687feeb45)

Задание №2
--
В модуле “HttpURLConnection” определяется местоположение пользователя по IP через ipinfo.io и запрашивается текущая погода через API open-meteo.com, отображая страну, город, температуру, скорость и направление ветра.

**Приложение:**
![image](https://github.com/user-attachments/assets/8cf8ecdf-e001-4177-bc64-2076322971eb)

Задание №3
--
В созданном модуле “FirebaseAuth” используется Firebase для аутентификации пользователей по электронной почте и паролю, реализуя регистрацию, вход, выход и отправку письма подтверждения. После успешной авторизации отображается статус пользователя и его UID.

**Подключение Firebase:**
![image](https://github.com/user-attachments/assets/6045359c-20ae-4b37-a0d2-0d5ef0ebde3e)

**Приложение:**
![image](https://github.com/user-attachments/assets/1855178f-7b49-47dc-b01c-34cd100b4174)

**Верификация:**
![image](https://github.com/user-attachments/assets/ce519294-c3a7-4023-ae34-464ddfa92df4)
![image](https://github.com/user-attachments/assets/591d345a-c7fc-4441-bd75-a03cb0513025)

**Пользователь в Firebase:**
![image](https://github.com/user-attachments/assets/f7b54902-c912-4873-8748-14f8581b5830)

Задание №4
--
В MireaProject настроена аутентификация пользователя Firebase. WeatherFragment получает геолокацию пользователя по IP и отображает текущую погоду (температура и скорость ветра) с API open-meteo.com.

**Подключение Firebase:**
![image](https://github.com/user-attachments/assets/0215a36f-5799-4f46-a2bc-9c5fd7276558)

**Вход в приложение:**
![image](https://github.com/user-attachments/assets/f7fcd4fa-f03c-44df-b35f-eb03ccfcf942)
![image](https://github.com/user-attachments/assets/5265475f-7e18-48c4-9182-cb5aff938311)

**Пользователь в Firebase:**
![image](https://github.com/user-attachments/assets/8ade5e41-a796-42a2-956b-b00614070c65)

**Погода:**
![image](https://github.com/user-attachments/assets/f6b97640-3955-4614-b155-0ca2ff651577)

