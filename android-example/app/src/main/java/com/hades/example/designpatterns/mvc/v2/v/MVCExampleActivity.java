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
import com.hades.example.designpatterns.mvc.v2.c.ICallback;
import com.hades.example.designpatterns.mvc.v2.c.LoginController;
import com.hades.example.designpatterns.mvc.v2.m.LoginModel;
import com.hades.example.designpatterns.mvc.v2.m.LoginResponseBean;

/**
 * Android:
 * View ：Activity
 * Controller ： LoginController
 * Model：LoginModel
 */
public class MVCExampleActivity extends AppCompatActivity implements LoginContract.IView, ICallback {
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

        LoginModel model = new LoginModel();
        model.setCallback(this);
        mController = new LoginController(model);
    }

    private void clickLogin() {
        String userId = userIdView.getText().toString();
        String userPwd = userPwdView.getText().toString();
        if (!mController.isValidUserId(userId)) {
            setUserIdError(1, "user id is empty");
            return;
        }
        if (!mController.isValidUserPwd(userPwd)) {
            setUserPwdError(2, "user password is empty");
            return;
        }
        showLoading();
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
    public void onSuccess(@NonNull LoginResponseBean responseBean) {
        hideLoading();
        if (!responseBean.isSuccess() || null == responseBean.getMenus() || responseBean.getMenus().isEmpty()) {
            loginFailure(0, "login response data is invalid");
            return;
        }
        String menus = mController.convertLoginMenus(responseBean.getMenus());
        loginSuccess(menus);
    }

    @Override
    public void onError(int errorCode, @NonNull String error) {
        hideLoading();
        loginFailure(errorCode, error);
    }
}
