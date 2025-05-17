package ru.mirea.vinokurovazo.data_thread;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.concurrent.TimeUnit;

import ru.mirea.vinokurovazo.data_thread.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        final Runnable runn1 = new Runnable() {
            public void run() {
                binding.textViewInfo.setText("executed runn_1");
                Log.d("DataThread", "runn1");
            }
        };
        final Runnable runn2 = new Runnable() {
            public void run() {
                binding.textViewInfo.setText("executed runn_2");
                Log.d("DataThread", "runn2");
            }
        };
        final Runnable runn3 = new Runnable() {
            public void run() {
                binding.textViewInfo.setText("executed runn_3");
                Log.d("DataThread", "runn3");
            }
        };

        Thread t = new Thread(new Runnable() {
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(3);
                    runOnUiThread(runn1);
                    Log.d("DataThread", "runOnUiThread(runn1) called");
                    TimeUnit.SECONDS.sleep(3);
                    binding.textViewInfo.post(runn2);
                    Log.d("DataThread", "binding.textViewInfo.post(runn2) called");
                    binding.textViewInfo.postDelayed(runn3, 1000);
                    Log.d("DataThread", "binding.textViewInfo.postDelayed(runn3, 1000) called");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();

        binding.textViewInfo.append(
                "Последовательность процессов:\n" +
                        "1 - runOnUiThread (выполняется в UI потоке)\n" +
                        "2 - post (добавляется в очередь сообщений)\n" +
                        "3 - postDelayed (выполняется с установленной задержкой)\n" +
                        "\n" +
                        "Порядок выполнения процессов зависит от времени попадания в очередь\n"
        );
    }
}