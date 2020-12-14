package com.hyq.hm.test.timewarpscan;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private Camera2SurfaceView cameraView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cameraView = findViewById(R.id.camera_view);
    }
    public void onScan(View view){
        cameraView.setScanVideo(!cameraView.isScanVideo());
        Button button = (Button) view;
        if(cameraView.isScanVideo()){
            button.setText("取消");
        }else{
            button.setText("定格");
        }
    }
}
