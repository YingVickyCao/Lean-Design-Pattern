package com.hades.example.designpatterns.mvp.v;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.hades.example.designpatterns.R;
import com.hades.example.designpatterns.mvp.LoginContract;
import com.hades.example.designpatterns.mvp.m.LoginModel;
import com.hades.example.designpatterns.mvp.p.LoginPresenter;

/**
 * <pre>
 * MVP
 * M(model) : 数据层。
 * （1）、提供数据给P。
 * （2）、数据来自于I/O、DB、网络请求等。
 *
 *
 * P(presenter)：中间层。业务处理、处理数据。
 * （1）、决定是否显示View，
 * （2）、决定如何去实现业务逻辑。
 * （3）、决定如何调用model
 * （4）、大部分逻辑都会在Presenter。也就是P进行数据校验，数据转化
 *
 *
 * V(View)：视图层。
 * （1）、传递用户时间
 * （2）、接受来自P层的数据并显示。
 *
 * <pre/>
 */
public class MVPExampleActivity extends AppCompatActivity implements LoginContract.IView {
    View loadingView;
    EditText userIdView;
    EditText userPwdView;
    TextView errorTip;
    Button loginBtn;
    Button nextBtn;

    private LoginContract.IPresenter mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvp_example);

        loadingView = findViewById(R.id.loadingView);
        errorTip = findViewById(R.id.errorTip);
        userIdView = findViewById(R.id.userId);
        userPwdView = findViewById(R.id.userPwd);
        loginBtn = findViewById(R.id.login);
        nextBtn = findViewById(R.id.next);

        loginBtn.setOnClickListener(v -> clickLogin());

        mPresenter = new LoginPresenter(this, new LoginModel());
    }

    private void clickLogin() {
        mPresenter.onLoginBtnClick(userIdView.getText().toString(), userPwdView.getText().toString());
    }

    @Override
    public void showLoading() {
        runOnUiThread(() -> loadingView.setVisibility(View.VISIBLE));
    }

    @Override
    public void hideLoading() {
        runOnUiThread(() -> loadingView.setVisibility(View.GONE));
    }

    @Override
    public void setUserIdError(int errorCode, @NonNull String errorMessage) {
        runOnUiThread(() -> {
            errorTip.setText(errorMessage + ",#" + errorCode);
        });
    }

    @Override
    public void setUserPwdError(int errorCode, @NonNull String errorMessage) {
        runOnUiThread(() -> {
            errorTip.setText(errorMessage + ",#" + errorCode);
        });
    }

    @Override
    public void loginSuccess(@NonNull String menus) {
        runOnUiThread(() -> {
            nextBtn.setEnabled(true);
            loginBtn.setEnabled(false);
            userIdView.setEnabled(false);
            userPwdView.setEnabled(false);
            Toast.makeText(MVPExampleActivity.this, "You can access below menus:" + menus, Toast.LENGTH_LONG).show();
        });
    }

    @Override
    public void loginFailure(int errorCode, @NonNull String errorMessage) {
        runOnUiThread(() -> {
            Toast.makeText(this, errorMessage + ",#" + errorCode, Toast.LENGTH_LONG).show();
        });
    }
}
