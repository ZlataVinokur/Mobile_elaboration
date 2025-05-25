Отчет по практической работе №4
----
В ходе практической работы были изучены компонент «viewBinding» и реаализация принципа связывания элементов интерфейса с кодом, работа с потоками, принципы работы с Service и жизненный цикл сервисов, а также библиотека «WorkManager».

Задание №1
--
Для работы был создан модуль «musicplayer», где было созданы портретная и горизонтальная активности для реализации плеера. Далее в задании была реализована логика связывания элементов из файла разметки по средствам binding.

**Приложение:**
![image](https://github.com/user-attachments/assets/f76e2fe5-2036-4ddc-b60b-de0ee5608362)

**Горизонтальная ориентация:**
![image](https://github.com/user-attachments/assets/88a7c328-aa89-41b0-84be-50a92c5b057a)


Задание №2
--
Был создан новый модуль «thread». В «MainActivity» была реализована логика подсчёта среднего количества пар в день и передача данных из фонового в основной поток.

**Приложение:**
![image](https://github.com/user-attachments/assets/0239feea-d593-4ff7-b8d8-5dba1c231f90)

**Результаты:**
![image](https://github.com/user-attachments/assets/fd8a1660-e3f2-40fb-b283-c765c04dd0ff)

**Logcat:**
![image](https://github.com/user-attachments/assets/c84d7afb-1e8f-426c-9faa-b08aa6356014)
![image](https://github.com/user-attachments/assets/32996da5-f2bd-46a6-ab8f-22b540500c52)

Задание №3.1
--
Был создан новый модуль «data_thread». Согласно заданию была реализован запуска процессов «runOnUiThread», «postDelayed» и «post» и вывод их выполнения.

**Приложение:**
![image](https://github.com/user-attachments/assets/ab3fd1a0-1bd2-450d-acc5-d5d38de9f2ab)

**Запуск процессов:**
![image](https://github.com/user-attachments/assets/5a80dba8-265a-4fc3-8a50-7c826c3172f4)
![image](https://github.com/user-attachments/assets/bb3f178b-74fb-46ee-87a7-da27166bd66c)
![image](https://github.com/user-attachments/assets/22fe2350-fe64-419f-b49e-a24483cb0344)

Задание №3.2
--
Далее был создан новый модуль «looper» и добавлен собственный класс, реализуюзий обработку сообщений. Реализована логика работы потока и передачи данных между потоками.

**Приложение:**
![image](https://github.com/user-attachments/assets/a8c41deb-2af9-4fd8-a2e9-9effa449eea1)

**Logcat:**
![image](https://github.com/user-attachments/assets/5a97013a-5f2e-4e3a-9efb-2244173c9dce)

Задание №3.3
--
Для задания был добавлен модуль «cryptoloader», где было реализовано шифрование текста при помощи алгоритма AES и его передача через Bundle, а также процесс дешифровки данных, и возврат их в изначальный поток.

**Приложение и уведомление о расшифровке:**
![image](https://github.com/user-attachments/assets/d0e53049-3d33-4dc5-85c4-2c79e1bd37ff)

**Logcat:**
![image](https://github.com/user-attachments/assets/23961a98-00e1-44c1-8f99-e57ac1ae67af)

Задание №4
--
Был создан модуль «serviceapp» с классом PlayerService, содержащим логику воспроизведения аудио из ресурсов и уведомления о запуске трека. В интерфейсе добавлены кнопки управления и текстовое поле для отображения названия композиции.

**Уведомление о проигрывании музыки:**
![image](https://github.com/user-attachments/assets/9c6af52a-e2a6-4edc-8132-e052aaf07af9)

Задание №5
--
Был добавлен модуль WorkManager с зависимостью в build.gradle, где создан класс UploadWorker для имитации фоновой задачи с логированием. В MainActivity реализован запуск этой задачи только при наличии интернета и подключении к зарядке.

**Logcat:**
![image](https://github.com/user-attachments/assets/fdce3430-aeef-4cad-82b3-633c6fe34f19)

Задание №6
--
Был создан фрагмент BackgroundTaskFragment с кнопкой для запуска фоновой задачи и отображением статуса, а также реализован класс BackgroundWorker, выполняющий имитацию фоновой работы через WorkManager с проверкой подключения к интернету. Для навигации добавлен новый пункт меню, связанный с созданным фрагментом, и настроен WorkManager для отслеживания состояния выполнения задачи.

**Приложение:**
![image](https://github.com/user-attachments/assets/584a549b-f741-43c5-9ada-e27f8b4e4d87)

**Статусы фоновой задачи:**
![image](https://github.com/user-attachments/assets/eff5b2fc-6e03-43e5-a3c1-512f88af0eb1)
![image](https://github.com/user-attachments/assets/bd499096-b2e1-4077-a07c-50d8317a743a)



