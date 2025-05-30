Отчет по практической работе №5
----
В рамках выполнения данной практической работы были изучены основы использования аппаратных возможностей мобильных устройств, применение различных сенсоров и датчиков для реализации функций при мобильной разработке.

Задание №1
--
В новом проекте был добавлен компонент «ListView» для отображения списка существующих датчиков на устройстве и реализована логика их вывода на экран.

**Приложение:**
![image](https://github.com/user-attachments/assets/d2313dbc-4b01-4a62-80f9-fab8da0ad436)

Задание №2
--
Для работы был создан новый модуль «Accelerometer», где с использованием интерфейса «SensorEventListener» реализована логика вывода показаний акселерометра по трём осям в пространстве и обновление показаний при изменении положения устройства.

**Приложение:**
![image](https://github.com/user-attachments/assets/059018a0-a706-413a-ae48-2fdf0cac5776)

**Приложение с измененным положением устройства:**
![image](https://github.com/user-attachments/assets/fc00c809-4659-4654-b365-6cdcfe6a147c)

Задание №3
--
Был создан новый модуль «Camera», в котором был реализован вызов системного приложения камеры, сохранение изображения в папку приложения
и отображение снимка на экране устройства, при помощи описания путей в paths.xml.

**Разрешение на использование камеры:**
![image](https://github.com/user-attachments/assets/06ce0ed1-8581-4269-bc42-b253c4fa0d3a)

**Приложение камеры:**
![image](https://github.com/user-attachments/assets/274b87a4-bbb4-4ea4-9764-8164656b1a82)

**Сохраненное фото:**
![image](https://github.com/user-attachments/assets/457b04c1-2718-4ac9-8a4f-260c65106492)

Задание №4
--
Был создан новый модуль «AudioRecord», где было реализовано разрешение на использование микрофона, также при помощи класса «MediaRecorder» добавлены функции записи аудиофайла и воспроизведения этого файла, также реализован учет состояния кнопок для остановки одновременного доступа к файлу.

**Разрешение на использование микрофона:**
![image](https://github.com/user-attachments/assets/32d88f3f-6e71-4af1-a81c-0ed399679358)

**Запись:**
![image](https://github.com/user-attachments/assets/a1771ac9-1e7a-4e47-9b3d-3b88286527c3)

**Сохраненная запись:**
![image](https://github.com/user-attachments/assets/6cb5722a-9605-43a8-a2bb-1d51249559cb)

Задание №5
--
В MireaProject были добавлены новые фрагменты для использования функционала датчика, камеры и микрофона. Первый добавленный фрагмент использует показания акселерометра для определения направления на север в градусах. Также был добавлен фрагмент для создания контакта с возможностью прикрепить к нему фото, снятое на камеру после получения разрешения. Следующий реализованный фрагмент использует функционал микрофона для записи голосовой заметки, запись также требует разрешения от пользователя.

**Меню приложения:**
![image](https://github.com/user-attachments/assets/1db415c3-cf5a-4217-87d4-02b7381ce683)

**Функционал компаса:**
![image](https://github.com/user-attachments/assets/1795de60-e804-4d77-ac45-95114ce7c8bb)

**Функционал камеры:**
![image](https://github.com/user-attachments/assets/030a8d1a-6fdc-46e1-b478-deb51eaaa1b6)
![image](https://github.com/user-attachments/assets/f7068cee-525b-48b2-9e62-a5b9dd1206b6)
![image](https://github.com/user-attachments/assets/facc4709-2138-4f1e-aa9b-0a49f0d7fcc8)

**Функционал микрофона:**
![image](https://github.com/user-attachments/assets/368b5334-f224-44c4-99bf-dbf947bfdf7d)
![image](https://github.com/user-attachments/assets/7e609ec4-04ee-4d8b-a0cc-804b7f42aa01)

