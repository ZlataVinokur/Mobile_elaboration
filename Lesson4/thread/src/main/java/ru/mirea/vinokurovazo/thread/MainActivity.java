package ru.mirea.vinokurovazo.thread;

import android.os.Bundle;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

import ru.mirea.vinokurovazo.thread.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private Handler handler = new Handler(Looper.getMainLooper());

    private final AtomicInteger counter = new AtomicInteger(1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Thread mainThread = Thread.currentThread();

        binding.textViewInfo.setText("Имя текущего потока: " + mainThread.getName());

        mainThread.setName("МОЙ НОМЕР ГРУППЫ: БСБО-09-22, НОМЕР ПО СПИСКУ: 5, МОЙ ЛЮБИИМЫЙ ФИЛЬМ: Птицекалипсис");

        binding.textViewInfo.append("\nНовое имя потока: " + mainThread.getName());

        Log.d(MainActivity.class.getSimpleName(), "Stack: " + Arrays.toString(mainThread.getStackTrace()));
        Log.d(MainActivity.class.getSimpleName(), "Group: " + mainThread.getThreadGroup());

        binding.button.setOnClickListener(v -> startWorkerThread());
    }

    private void startWorkerThread() {
        String pairsStr = binding.editTextTotalPairs.getText().toString();
        String daysStr = binding.editTextStudyDays.getText().toString();
        if (pairsStr.isEmpty() || daysStr.isEmpty()) {
            binding.textViewResult.setText("Внесите ваши данные:");
            return;
        }

        Runnable worker = new Runnable() {
            @Override
            public void run() {
                int threadNum = counter.getAndIncrement();
                Log.d("ThreadProject", String.format(
                        "Запущен поток №%d студентом группы БСБО-09-22 номер по списку 5",
                        threadNum
                ));

                long endTime = System.currentTimeMillis() + 20 * 1000;
                while (System.currentTimeMillis() < endTime) {
                    synchronized (this) {
                        try {
                            wait(endTime - System.currentTimeMillis());
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                }
                Log.d("ThreadProject", "Выполнен поток №" + threadNum);

                int totalPairs = Integer.parseInt(pairsStr);
                int days = Integer.parseInt(daysStr);
                double avg = days != 0 ? (double) totalPairs / days : 0.0;

                handler.post(() -> binding.textViewResult.setText(String.format("Среднее кол-во пар в день: %.2f", avg)));
            }
        };

        new Thread(worker).start();
    }
}