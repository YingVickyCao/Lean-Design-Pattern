package com.hades.example.designpatterns.mvc.c;

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
import com.hades.example.designpatterns.mvc.LoginContract;
import com.hades.example.designpatterns.mvc.m.LoginModel;
import com.hades.example.designpatterns.mvc.m.LoginResponseBean;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * View ：xml，Activity
 * Controller ： Activity
 * Model：数据层
 */
public class MVCExampleActivity extends AppCompatActivity implements LoginContract.IView, LoginContract.IController, ICallback {
    View loadingView;
    EditText userIdView;
    EditText userPwdView;
    TextView errorTip;
    Button loginBtn;
    Button nextBtn;

    private LoginContract.IModel mModel;
//    private LoginContract.IModel mController;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_mvc_example);

        loadingView = findViewById(R.id.loadingView);
        errorTip = findViewById(R.id.errorTip);
        userIdView = findViewById(R.id.userId);
        userPwdView = findViewById(R.id.userPwd);
        loginBtn = findViewById(R.id.login);
        nextBtn = findViewById(R.id.next);
        loginBtn.setOnClickListener(v -> clickLogin());
        mModel = new LoginModel();
    }


    private void clickLogin() {
        showLoading();
        onLoginBtnClick(userIdView.getText().toString(), userPwdView.getText().toString());
    }

    @Override
    public void onLoginBtnClick(@NonNull String userId, @NonNull String userPwd) {
        if (!isValidUserId(userId)) {
            setUserIdError(1, "user id is empty");
            return;
        }
        if (!isValidUserPwd(userId)) {
            setUserPwdError(2, "user password is empty");
            return;
        }
        showLoading();
        mModel.login(userId, userPwd, new ICallback() {
            @Override
            public void onSuccess(@NonNull LoginResponseBean responseBean) {
                hideLoading();
                if (!responseBean.isSuccess()) {
                    loginFailure(0, "login response data is invalid");
                    return;
                }
                String menus = convertLoginMenus(responseBean.getMenus());
                loginSuccess(menus);
            }

            @Override
            public void onError(@NotNull int errorCode, @NotNull String error) {
                hideLoading();
                loginFailure(errorCode, error);
            }
        });
    }

    private boolean isValidUserId(String userId) {
        return null != userId && !userId.isEmpty();
    }

    private boolean isValidUserPwd(String userId) {
        return null != userId && !userId.isEmpty();
    }

    private String convertLoginMenus(List<String> menus) {
        if (null == menus || menus.isEmpty()) {
            return null;
        }
        StringBuilder result = new StringBuilder();
        for (String menu : menus) {
            result.append(menu).append("\n");
        }
        return result.toString();
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

    }

    @Override
    public void onError(int errorCode, @NonNull String error) {

    }
}
