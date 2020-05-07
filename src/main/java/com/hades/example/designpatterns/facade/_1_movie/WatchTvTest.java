package com.hades.example.designpatterns.facade._1_movie;

public class WatchTvTest {
    public static void main(String[] args) {
        WatchTvTest test = new WatchTvTest();
        test.test();
    }

    private void test() {
        PopcornPopper popcornPopper = new PopcornPopper();
        TV tv = new TV();

        startWatchTv(popcornPopper, tv);
        endWatchTv(popcornPopper, tv);

        HomeTheaterFacade facade = new HomeTheaterFacade(popcornPopper, tv);
        facade.startWatchTv();
        facade.endWatchTv();
    }

    private void startWatchTv(PopcornPopper popcornPopper, TV tv) {
        popcornPopper.on();
        popcornPopper.pop();

        tv.on();
        tv.play();
    }

    private void endWatchTv(PopcornPopper popcornPopper, TV tv) {
        popcornPopper.off();
        tv.off();
    }
}
