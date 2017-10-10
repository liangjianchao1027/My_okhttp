package liangjianchao.com.bwei.my_okhttp.modle;

import android.os.Handler;
import android.os.Message;

import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by lenovo、 on 2017/10/10.
 */
public class Okhttp {

    private Handler h = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            NewsBean bean = (NewsBean) msg.obj;
            mcallback.send(bean);
        }
    };

    public void getokhttp(){

        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(new HttpInterceptor()).build();
        Request build = new Request.Builder().url("").build();

        client.newCall(build).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String string = response.body().string();
                Gson gson = new Gson();
                NewsBean newsBean = gson.fromJson(string, NewsBean.class);

                Message message = h.obtainMessage();
                message.obj=newsBean;
                h.sendMessage(message);
            }
        });



    }

    public CallBack mcallback;

    public interface CallBack{
        void send(NewsBean bean);
    }

    public void MyCallBack(CallBack mcallbackd){
        this.mcallback=mcallback;
    }
}
