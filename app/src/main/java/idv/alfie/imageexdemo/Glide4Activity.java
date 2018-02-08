package idv.alfie.imageexdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import static idv.alfie.imageexdemo.MainActivity.HTTPGIF;
import static idv.alfie.imageexdemo.MainActivity.HTTPJPG;
import static idv.alfie.imageexdemo.MainActivity.HTTPPNG;
import static idv.alfie.imageexdemo.MainActivity.HTTPSGIF;
import static idv.alfie.imageexdemo.MainActivity.HTTPSJPG;
import static idv.alfie.imageexdemo.MainActivity.HTTPSSJPG;


public class Glide4Activity extends AppCompatActivity {

    private ImageView imageView;
    private RequestOptions options;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide4);

        imageView = (ImageView)findViewById(R.id.imageView);
        options = new RequestOptions().placeholder(R.mipmap.ic_launcher_round); //佔位圖
    }

    @Override
    protected void onStart() {
        //載入圖片
        Glide.with(getApplicationContext())
                .load(HTTPSGIF)
                //.apply(options)
                .into(imageView);

        super.onStart();
    }

    @Override
    protected void onDestroy() {
        //取消載入
        Glide.with(getApplicationContext())
                .clear(imageView);

        super.onDestroy();
    }
}
