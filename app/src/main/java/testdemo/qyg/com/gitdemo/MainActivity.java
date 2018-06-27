package testdemo.qyg.com.gitdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();
        initEvent();
    }

    private void initData() {

    }

    private void initView() {
        tv_test = (TextView) findViewById(R.id.tv_test);
        tv_test.setText("hello world !");
    }

    private void initEvent() {

    }
}
