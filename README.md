**Отчет по 1 практической работе**
----
В прцессе выполнения данной работы был создан проект Lesson1, в котором были созданы 3 модуля: Layouttype, control_lesson, button_clicker. Был добавлен эмулятор для отображения работы.
![image](https://github.com/user-attachments/assets/75dde863-739f-4bee-ba1c-b2ac6382a08f)

Модуль layouttype
--
В модуле layouttype было создано несколько файлов типа "Layout resource file", в каждом из которых были реализованы различные виды макетов для построения интерфейса. 

**Макет с использованием LinearLayout:**
![image](https://github.com/user-attachments/assets/ffcc4b95-1360-4296-b3b5-e11e3c70cfd7)

**Макет с использованием TableLayout:**
![image](https://github.com/user-attachments/assets/50185fcc-5c2a-4183-8863-07eb5dd81895)

**Макет с использованием ConstraintLayout:**
![image](https://github.com/user-attachments/assets/f5529846-0393-427e-8a72-caf6c1043249)

Модуль control_lesson1
--
В модуле control_lesson1 в главном файле activity_main.xml был создан и настроен макет с использованием следующих элементов: textView, button, imageButton, checkBox и imageview.

**Итоговый макет:**
![image](https://github.com/user-attachments/assets/072e2655-1906-4865-b9c3-f52b43451f1f)

Был создан второй файл activity_second.xml, содержащий текстовое поле и 6 кнопок:
![image](https://github.com/user-attachments/assets/b0b598ba-a821-4ecb-9fb6-ea57b52e1f5f)

Далее был создан альтернативный файл activity_second.xml (land) для альбомной ориентации:
![image](https://github.com/user-attachments/assets/324e148c-5599-4754-85e1-6a4be36d02cf)

Модуль buttonclicker
--
В модуле buttonclicker в главном файле activity_main.xml был создан макет с использованием текстового поля, двух кнопок и чекбокса. Изменения свойств элементов были реализованы при помощи кода в файле MainActivity. 
**Результат:**
![image](https://github.com/user-attachments/assets/d36f8770-c53b-4d9c-8709-6d90cfebbaf2)
![image](https://github.com/user-attachments/assets/16fd18ec-7e5c-4fe7-80bb-f7e266c84ce8)
![image](https://github.com/user-attachments/assets/89ca475e-a8a1-44bc-a1ea-facdc33c12d9)


**Код файла MainActivity:**
```
package ru.mirea.vinokurovazo.buttonclicker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView textViewStudent;
    private Button btnWhoAmI;
    private Button btnItIsNotMe;
    private CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        textViewStudent = findViewById(R.id.textViewStudent);
        btnWhoAmI = findViewById(R.id.btnWhoAmI);
        checkBox = findViewById(R.id.checkBox);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.tvOut), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        View.OnClickListener oclBtnWhoAmI = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewStudent.setText("Мой номер по списку № 5");
            }
        };
        btnWhoAmI.setOnClickListener(oclBtnWhoAmI);
    }

    public void onMyButtonClick(View view) {
        boolean isChecked = !checkBox.isChecked();
        checkBox.setChecked(isChecked);

        if (isChecked) {
            textViewStudent.setText("Это не я");
        } else {
            textViewStudent.setText("Мой номер по списку № 5");
        }

    }
}
```
Выводы
---
В рамках выполнения данного задания было проведено ознакомление с программным обеспечением, предназначенным для разработки мобильных приложений под операционную систему Android. Изучены принципы создания новых проектов, а также модулей внутри этих проектов. В ходе работы были разработаны тестовые проекты, в которых применялись разнообразные макеты и элементы пользовательского интерфейса. Исследованы методы обеспечения поддержки смены ориентации экрана, реализовано программное управление состоянием элементов и изучены два различных подхода к созданию обработчиков событий для кнопок.
