Отчет по практической работе №1
----
В прцессе выполнения данной работы был создан проект Lesson1, в котором были созданы 3 модуля: Layouttype, controllesson1, buttonclicker. Был добавлен эмулятор для отображения работы.
![image](https://github.com/user-attachments/assets/75dde863-739f-4bee-ba1c-b2ac6382a08f)

Модуль layouttype
--
В модуле layouttype было создано несколько файлов "Layout resource file", в каждом из которых были реализованы различные виды макетов для построения интерфейса, в том числе LinearLayout, TableLayout, ConstraintLayout. В каждом из макетов были добавлены и настроены необходимые элементы интерфейса.

**Макет с LinearLayout:**
![image](https://github.com/user-attachments/assets/ffcc4b95-1360-4296-b3b5-e11e3c70cfd7)

**Макет с TableLayout:**
![image](https://github.com/user-attachments/assets/50185fcc-5c2a-4183-8863-07eb5dd81895)

**Макет с ConstraintLayout:**
![image](https://github.com/user-attachments/assets/f5529846-0393-427e-8a72-caf6c1043249)

Модуль controllesson1
--
В модуле control_lesson1 был создан и настроен собственный макет с использованием следующих элементов: textView, button, imageButton, checkBox и imageview. Размещение элементов в интерфейсе было настроено с помощью разных layout элементов.

**Итоговый макет:**
![image](https://github.com/user-attachments/assets/072e2655-1906-4865-b9c3-f52b43451f1f)

Был создан файл activity_second.xml, содержащий текстовое поле editText и 6 кнопок. Далее был добавлен файл activity_second.xml (land) для изменения ориентации экрана устройства.

**Макеты с activity_second.xml:**
![image](https://github.com/user-attachments/assets/b0b598ba-a821-4ecb-9fb6-ea57b52e1f5f)
![image](https://github.com/user-attachments/assets/324e148c-5599-4754-85e1-6a4be36d02cf)

Модуль buttonclicker
--
В модуле buttonclicker в файле activity_main.xml был создан макет с использованием текстового поля, двух кнопок и чекбокса. Настройка и изменение свойств элементов были реализованы при помощи кода в MainActivity, листинг представлен ниже. 

Листинг MainActivity:
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
            textViewStudent.setText("Это сделал не я");
        } else {
            textViewStudent.setText("Мой номер по списку № 5");
        }
    }
}
```

**Результат:**
![image](https://github.com/user-attachments/assets/1a60cc1d-8645-4e25-aea3-a19f9cb71186)
![image](https://github.com/user-attachments/assets/1c50375a-ba5a-489a-874a-e832daeb58e4)
![image](https://github.com/user-attachments/assets/9233a357-4548-4398-ab07-2c41d44d0d12)

Вывод
---
В рамках выполнения данного практического задания было проведено ознакомление с программным обеспечением, предназначенным для разработки мобильных приложений под операционную систему Android. Изучены принципы создания новых проектов, а также модулей внутри этих проектов. В ходе работы были разработаны тестовые проекты, в которых применялись и настраивались разнообразные макеты и элементы пользовательского интерфейса. Исследованы методы смены ориентации экрана, реализовано программное управление состоянием элементов и изучены два различных подхода к созданию обработчиков событий для кнопок.
