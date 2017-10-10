package liangjianchao.com.bwei.my_okhttp.view.interfacse;

/**
 * Created by lenovo、 on 2017/10/10.
 */
public interface IHomeView extends MVPView {

    void OnSouccess(String string);
    void OnError(int errCode,String errMessage);
}
