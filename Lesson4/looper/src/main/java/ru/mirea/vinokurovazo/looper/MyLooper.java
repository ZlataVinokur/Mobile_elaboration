package ru.mirea.vinokurovazo.looper;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

public class MyLooper extends Thread {
    public Handler mHandler;
    private final Handler mainHandler;

    public MyLooper(Handler mainHandler) {
        this.mainHandler = mainHandler;
    }

    @Override
    public void run() {
        Looper.prepare();
        mHandler = new Handler(Looper.myLooper()) {
            @Override
            public void handleMessage(Message msg) {
                Bundle data = msg.getData();
                String ageStr = data.getString("AGE");
                String job = data.getString("JOB");
                int age = 0;
                try {
                    age = Integer.parseInt(ageStr);
                } catch (NumberFormatException ignored) {
                }

                Log.d("MyLooper", "Получил: мой возраст=" + age + ", моя работа=" + job);

                try {
                    Thread.sleep(age * 1000L);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                String result = String.format("Результаты: возраст=%d, профессия=%s", age, job);

                Message reply = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString("result", result);
                reply.setData(bundle);
                mainHandler.sendMessage(reply);
            }
        };
        Looper.loop();
    }
}