package ru.mirea.vinokurovazo.looper;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import ru.mirea.vinokurovazo.looper.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private MyLooper myLooper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Handler mainHandler = new Handler(Looper.getMainLooper()) {
            @Override
            public void handleMessage(Message msg) {
                String res = msg.getData().getString("result");
                Log.d("MainActivity", res);
            }
        };

        myLooper = new MyLooper(mainHandler);
        myLooper.start();

        binding.button.setOnClickListener(v -> {
            if (myLooper.mHandler == null) {
                Log.d("MainActivity", "загрузка Looper");
                return;
            }

            String age = binding.editTextAge.getText().toString();
            String job = binding.editTextJob.getText().toString();

            Message msg = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putString("AGE", age);
            bundle.putString("JOB", job);
            msg.setData(bundle);

            myLooper.mHandler.sendMessage(msg);
        });
    }
}