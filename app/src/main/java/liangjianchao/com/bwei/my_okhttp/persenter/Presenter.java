package liangjianchao.com.bwei.my_okhttp.persenter;

import liangjianchao.com.bwei.my_okhttp.modle.NewsBean;
import liangjianchao.com.bwei.my_okhttp.modle.Okhttp;

/**
 * Created by lenovo、 on 2017/10/10.
 */
public class Presenter implements Okhttp.CallBack{


    public void onCallBack(){
        Okhttp okhttp = new Okhttp();
        okhttp.MyCallBack(this);
        okhttp.getokhttp();

    }
    @Override
    public void send(NewsBean bean) {

        mpresenter.backpresenter(bean);
    }


    public MyPresenter mpresenter;
    public interface MyPresenter{
       void  backpresenter(NewsBean bean);
    }

    public void MPresenter(MyPresenter mpresenter){
        this.mpresenter=mpresenter;
    }
}
