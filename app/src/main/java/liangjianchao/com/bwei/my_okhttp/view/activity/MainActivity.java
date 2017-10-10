package liangjianchao.com.bwei.my_okhttp.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import liangjianchao.com.bwei.my_okhttp.R;
import liangjianchao.com.bwei.my_okhttp.modle.NewsBean;
import liangjianchao.com.bwei.my_okhttp.persenter.Presenter;

public class MainActivity extends AppCompatActivity implements Presenter.MyPresenter{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Presenter presenter = new Presenter();
        presenter.MPresenter(this);
        presenter.onCallBack();
    }


    @Override
    public void backpresenter(NewsBean bean) {


    }
}
