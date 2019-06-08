package khoapham.ptp.phamtanphat.fragment2802;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager = getSupportFragmentManager();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Fragment xu ly bat dong bo;
        //1 : Su dung fragment cho xml
//            + Fragment xml : nó chỉ nhìn vào kích thước view con để hiển thị
//                android:layout_width="wrap_content"
//                android:layout_height="wrap_content"
//            + Khi đưa fragment vào xml phải có id và name
        //2 : Sư dụng fragment cho code
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        AndroidFragment androidFragment = new AndroidFragment();
        fragmentTransaction.add(R.id.framelayout,androidFragment);
        fragmentTransaction.commit();
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Log.d("BBB",fragmentManager.getFragments().size() + "");
//            }
//        },2000);

    }
}
