package idv.alfie.imageexdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //載入網路圖片連結
    public static final String HTTPSJPG = "https://i.ytimg.com/vi/FJOe9EKeAK8/maxresdefault.jpg";
    public static final String HTTPSSJPG = "https://glcp.toplogis.com/part_img/TT201706-000963-s.jpg"; //自簽憑證
    public static final String HTTPJPG = "http://img.ltn.com.tw/Upload/ent/page/800/2017/10/20/phpUGp63B.jpg";
    public static final  String HTTPSGIF = "https://upload.cc/i/ChiJ8Y.gif";
    public static final String HTTPGIF ="http://img.idol001.com/origin/2017/08/27/25b280d5c31abdef55da40ab580a5bce1503816000.gif";
    public static final String HTTPPNG ="http://wfarm3.dataknet.com/static/resources/icons/set112/f2afb6f7.png";
    public static final String HTTPSSVG ="https://image.flaticon.com/icons/svg/337/337954.svg"; //glide4不支援


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onGlide4Click(View view){
        startActivity(new Intent(this, Glide4Activity.class));
    }
}
