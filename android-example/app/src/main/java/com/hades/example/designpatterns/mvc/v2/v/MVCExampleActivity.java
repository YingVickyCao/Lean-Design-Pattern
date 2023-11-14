package com.hades.example.designpatterns.mvc.v2.v;

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
import com.hades.example.designpatterns.mvc.v2.LoginContract;
import com.hades.example.designpatterns.mvc.v2.c.LoginController;
import com.hades.example.designpatterns.mvc.v2.m.LoginModel;

/**
 * <pre>
 * MVC
 * M(model) : 数据层。
 * （1）、提供数据给P。
 * （2）、数据来自于I/O、DB、网络请求等。
 *
 *
 * C(Controller)：中间层。业务处理、处理数据。
 * （1）、决定是否显示View，
 * （2）、决定如何去实现业务逻辑。
 * （3）、决定如何调用model
 * （4）、大部分逻辑都会在Controller。也就是P进行数据校验，数据转化
 *
 *
 * V(View)：视图层。
 * （1）、传递用户事件
 * （2）、接受来自P层的数据并显示。
 *
 * <pre/>
 */

/**
 * Android:
 * View ：xml，Activity
 * Controller ： Activity
 * Model：数据层
 * 可以看出，Android 即是View 也是 Controller。
 */
public class MVCExampleActivity extends AppCompatActivity implements LoginContract.IView, LoginContract.IController {
    View loadingView;
    EditText userIdView;
    EditText userPwdView;
    TextView errorTip;
    Button loginBtn;
    Button nextBtn;

    private LoginContract.IController mController;

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

        mController = new LoginController(this, new LoginModel());
    }

    private void clickLogin() {
        mController.onLoginBtnClick(userIdView.getText().toString(), userPwdView.getText().toString());
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
            Toast.makeText(MVCExampleActivity.this, "You can access below menus:" + menus, Toast.LENGTH_LONG).show();
        });
    }

    @Override
    public void loginFailure(int errorCode, @NonNull String errorMessage) {
        runOnUiThread(() -> {
            Toast.makeText(this, errorMessage + ",#" + errorCode, Toast.LENGTH_LONG).show();
        });
    }

    @Override
    public void onLoginBtnClick(@NonNull String userId, @NonNull String userPwd) {

    }
}
