package com.hades.example.designpatterns.facade;

public class HomeTheaterFacade {
    PopcornPopper popcornPopper;
    TV tv;

    public HomeTheaterFacade(PopcornPopper popcornPopper, TV tv) {
        this.popcornPopper = popcornPopper;
        this.tv = tv;
    }

    public void startWatchTv() {
        popcornPopper.on();
        popcornPopper.pop();

        tv.on();
        tv.play();
    }

    public void endWatchTv() {
        popcornPopper.off();
        tv.off();
    }
}