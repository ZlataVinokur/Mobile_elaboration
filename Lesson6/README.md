Отчет по практической работе №6
----
В рамках выполнения данной практической работы были рассмотрены такие способы хранения данных в OS Android как хранение данных в специальном файле настроек и хранение файлов во внутреннем и внешнем хранилище. Также были изучены принципы работы с базой данных «SQLite».

Задание №1
--
В основном модуле проекта было реализовано сохранение  данных через метод getSharedPreferences и их вывод в интерфейс приложения. Через «Device Explorer» был найден файл настроек, скриншот которого был добавлен в директорию «raw».

**Приложение:**
![image](https://github.com/user-attachments/assets/b17aac70-0f79-4d60-9415-2191601cfc38)

**Файл настроек:**
![image](https://github.com/user-attachments/assets/5284764b-e3e3-4c14-8633-79977f4a51ee)

Задание №2
--
Далее был создан новый модуль «SecureSharedPreferences», в котром используется AES256 для шифрования данных с мастер-ключом, сгенерированным в “MainActivity”. Скриншот зашифрованного файла помещен в папку raw.

**Приложение:**
![image](https://github.com/user-attachments/assets/f5f5fc0b-c1e7-4067-b03c-d4b53d045fe0)

**Сохранённый файл:**
![image](https://github.com/user-attachments/assets/9eca0ef0-ecd1-41e4-9d0c-f4106e7b4c5c)

Задание №3
--
Был создан новый модуль “InternalFileStorage”, позволяющий пользователю записывать текст во внутреннее хранилище, файл из этого хранилища сохранен в raw.

**Приложение:**
![image](https://github.com/user-attachments/assets/2e62d58e-887f-40b0-afd5-0b54e42e4fb8)

**Сохранённый файл:**
![image](https://github.com/user-attachments/assets/25145e9c-9864-478c-9d10-55759d0f91e7)

Задание №4
--
Был создан новый модуль “Notebook”, где была реализована возможность сохранять цитаты в общедоступной директории Documents, перезаписывая существующие файлы. Два файла с цитатами перенесены в raw.

**Приложение:**
![image](https://github.com/user-attachments/assets/e429ad97-0b1c-46a0-8972-faa680db327c)
![image](https://github.com/user-attachments/assets/6fb62d1d-b8e6-463c-baae-14e5ad8d79ac)

**Загруженные данные из файла:**
![image](https://github.com/user-attachments/assets/d4b61ab9-2207-4ff0-852f-f240891f939e)

**Сохранённые файлы:**
![image](https://github.com/user-attachments/assets/dfba2828-4643-4d87-9b32-0388352be48a)

Задание №5
--
В модуле “EmployeeDB” была создана база данных Superhero с использованием DAO и Room. “MainActivity” создает и заполняет базу данных тестовыми данными, отображая их в списке. Инициализация БД происходит через класс Application.

**Список данных:**
![image](https://github.com/user-attachments/assets/d27d7918-dcc4-48b4-8c66-9924aea24842)

Задание №6
--

**Приложение:**
