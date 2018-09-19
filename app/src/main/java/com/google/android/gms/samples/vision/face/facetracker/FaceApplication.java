package com.google.android.gms.samples.vision.face.facetracker;

import android.app.Application;
import android.speech.tts.TextToSpeech;

import com.google.android.gms.vision.face.Face;

import java.util.Locale;

/**
 * Created by zy on 2017/12/29.
 */

public class FaceApplication extends Application {

    private static FaceApplication instance;
    public static TextToSpeech mSpeech;

    public static FaceApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initTTS();
    }

    private void initTTS() {
        // 创建TTS对象
        mSpeech = new TextToSpeech(this, new TextToSpeech.OnInitListener() {

            @Override
            public void onInit(int status) {
                // TODO Auto-generated method stub
                if (status == TextToSpeech.SUCCESS) {
                    mSpeech.setLanguage(Locale.CHINESE);    //设置语言为英语
                }
            }
        });
    }
}
