package com.tyss.designpattern.singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SingletonMain {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("Hello");
        log.info("data is {}", singleton);

        Singleton instance = Singleton.getInstance("2024");
        log.info("data is {}", instance);

    }
}
