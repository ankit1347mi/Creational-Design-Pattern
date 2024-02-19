package com.tyss.designpattern.prototype;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AbstractMain {
    public static void main(String[] args) {
        Developer developer = new Developer("Rohit", Role.DEVELOPER);
        log.info("before cloning {}", developer);
        Developer developer1 = (Developer) developer.cloneObject();
        developer1.setFullName("Ankit");
        log.info("After Cloning {}", developer1);

        Manger manger = new Manger("Vipul", Role.MANAGER);
        log.info("before cloning {}", manger);
        Manger manger1 = (Manger) manger.cloneObject();
        manger1.setFullName("Aneesh");
        log.info("After Cloning {}", manger1);
    }
}
