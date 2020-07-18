package com.example.jackknife;

import android.os.Bundle;

import com.example.jackknife.databinding.ActivityMainBinding;
import com.lwh.jackknife.BaseActivity;

//第6步，开始写业务代码
public class MainActivity extends BaseActivity<ActivityMainBinding> {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initData(Bundle savedInstanceState) {
        mBinding.tvHelloWorld.setText("Hello, JackKnife MVVM!");
    }
}