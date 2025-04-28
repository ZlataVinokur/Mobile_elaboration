Отчет по практической работе №2
----
В прцессе выполнения данной работы был создан проект Lesson2, в котором были изучены инструменты отладки, жизненный цикл activity, процесс создания и вызова activity и диалоговые окна.

Жизненный цикл activity
--
Был создан модуль ActivityLifecycle и добавлено поле для текстового ввода, также были переопределены основные методы жизненного цикла. При помощи класса Log для каждого метода жизненного цикла выводится сообщение с именем данного метода.

**Приложение**

![image](https://github.com/user-attachments/assets/1d142b2c-c1c5-4726-91fe-46f3ae7be37d)

**Окно «logcat» до и после ввода текста и повторного открытия приложения:**
![image](https://github.com/user-attachments/assets/7af7ba54-6f7d-485a-89c7-a64e696c658e)
![image](https://github.com/user-attachments/assets/7c4b7def-bae1-4ebd-ac5e-a66eb83150b6)

Вопросы:
1. Будет ли вызван метод «onCreate» после нажатия на кнопку «Home» и возврата в приложение?
   Нет, метод onCreate не будет вызван. onCreate вызывается только при первом запуске активности, возвращение в приложение после нажатия на кнопку "Home" происходит путем возобновления активности.
2. Изменится ли значение поля «EditText» после нажатия на кнопку «Home» и возврата в приложение?
   Нет, так как после выхода в «Home» вызывается метод onPause() и значение поля сохраняется.
3. Изменится ли значение поля «EditText» после нажатия на кнопку «Back» и возврата в приложение?
   Значение EditText будет сохранено и восстановится при возврате, так как был создан метод onSaveInstanceState(), реализующий сохранение состояния.

Процесс создания и вызова activity
--
Был создан модуль «MultiActivity» и добавлены поле для текстового ввода и кнопка, реализован обработчик события нажатия на кнопку. Далее была создана «Secondctivity» с текстовым полем. Далее была реализована логика получения во второй активности текста из первой активности.

**Приложение с введенным текстом:**
![image](https://github.com/user-attachments/assets/5dda06d8-c781-4728-a747-34c34226e97c)

**Вторая активность с полученными данными:**
![image](https://github.com/user-attachments/assets/2ff98b67-6267-40c7-a6b0-43516e76af5d)

**Окно «logcat»:**
![image](https://github.com/user-attachments/assets/566203e5-f87d-4931-99d5-79f9523e0fc8)
![image](https://github.com/user-attachments/assets/68fc1b08-e384-4641-bed2-c88b7471bac1)

Также был создан модуль «IntentFilter» и добавлены кнопки для просмотра веб-страницы и передачи ФИО студента в
другое приложение, и настроена логика их работы.

**Приложение:**
![image](https://github.com/user-attachments/assets/9fd50e2b-1d01-48df-8e36-7250d012f2fc)

**Просмотр веб-страницы:**
![image](https://github.com/user-attachments/assets/f0eedd03-16fb-4f42-b525-809bb895096b)

**Передача ФИО студента:**
![image](https://github.com/user-attachments/assets/fa14ff93-fafb-4a27-9af8-97b90dbfa51a)

Диалоговые окна
--
Был создан новый модуль «ToastApp», добавлены поле ввода и кнопка. Далее был реализован подсчёт символов в поле ввода и вывод результата.

**Приложение с подсчётом символов:**
![image](https://github.com/user-attachments/assets/5d6de57d-65d8-4ac5-9680-adb474da5752)

Далее был добавлен новый модуль «NotificationApp», в котором было реализовано получение уведомления по клику.
**Получение уведомления:**
![image](https://github.com/user-attachments/assets/f5aa7cbd-7344-4b16-b2fc-a07dc86941e1)

Для работы с диалоговыми окнами был создан новый модуль Dialog. Были сконструированы диалоговые окна для добавленных java классов: AlertDialogFragment, MyTimeDialogFragment, MyDateDialogFragment, MyProgressDialogFragment. 

**Приложение:**
![image](https://github.com/user-attachments/assets/dd30c84d-30c7-45c0-9726-174d281f461b)

**Диалоговое окно:**
![image](https://github.com/user-attachments/assets/a932a20b-6be4-4532-b6c7-2cb71170718a)

**Выбор даты:**
![image](https://github.com/user-attachments/assets/ef685f34-e8b7-458b-b581-d2fad8749709)

**Выбор времени:**
![image](https://github.com/user-attachments/assets/8a26bc49-d889-4e13-97fc-cdb72fe6354a)

**Прогресс:**
![image](https://github.com/user-attachments/assets/0bc9dc3e-eede-4e1c-a6f3-b9c0cb3dca74)
