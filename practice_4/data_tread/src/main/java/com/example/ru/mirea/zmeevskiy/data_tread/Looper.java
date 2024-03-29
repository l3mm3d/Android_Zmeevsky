package com.example.ru.mirea.zmeevskiy.data_tread;

import android.annotation.SuppressLint;
import android.os.Message;
import android.util.Log;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class Looper extends Thread {
    private int number = 0;
    Handler handler;
    @SuppressLint("HandlerLeak")
    @Override
    public void run(){
        Log.d("MyLooper", "run");
        Looper.prepare();
        handler = new Handler(){
            /**
             * Publish a <tt>LogRecord</tt>.
             * <p>
             * The logging request was made initially to a <tt>Logger</tt> object,
             * which initialized the <tt>LogRecord</tt> and forwarded it here.
             * <p>
             * The <tt>Handler</tt>  is responsible for formatting the message, when and
             * if necessary.  The formatting should include localization.
             *
             * @param record description of the log event. A null record is
             *               silently ignored and is not published
             */
            @Override
            public void publish(LogRecord record) {

            }

            /**
             * Flush any buffered output.
             */
            @Override
            public void flush() {

            }

            /**
             * Close the <tt>Handler</tt> and free all associated resources.
             * <p>
             * The close method will perform a <tt>flush</tt> and then close the
             * <tt>Handler</tt>.   After close has been called this <tt>Handler</tt>
             * should no longer be used.  Method calls may either be silently
             * ignored or may throw runtime exceptions.
             *
             * @throws SecurityException if a security manager exists and if
             *                           the caller does not have <tt>LoggingPermission("control")</tt>.
             */
            @Override
            public void close() throws SecurityException {

            }


            public void handleMessage(Message msg){
                Log.d("MyLooper", number + ":"+ msg.getData().getString("KEY"));
                number++;
            }
        };
        Looper.loop();
    }

    private static void loop() {
    }

    private static void prepare() {
    }
}
