package com.hades.example.designpatterns.proxy._1_remote_proxy_4_report.after;

import java.io.Serializable;

public interface State extends Serializable {
    // 动作：投入25分钱
    void insertQuarter();

    // 动作：退回25分钱
    void ejectQuarter();

    // 动作：转动曲柄
    boolean turnCrank();

    // 动作：发放糖果
    void dispense();
}