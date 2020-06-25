package cn.itcast.order.activity;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.WindowManager;

import cn.itcast.order.R;

public class WelcomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        //设置全屏
        getWindow().setFlags(WindowManager.LayoutParams.FLAGS_CHANGED, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //设置延时时间
        handler.sendEmptyMessageDelayed(0, 3000);
    }


    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg){            //实现页面的跳转
            Intent intent=new Intent(WelcomeActivity.this, ShopActivity.class);
            startActivity(intent);
            finish();
            super.handleMessage(msg);
        }
    };
}
