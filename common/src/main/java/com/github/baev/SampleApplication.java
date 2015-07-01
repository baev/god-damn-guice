package com.github.baev;

import java.util.Random;

/**
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 30.06.15
 */
public class SampleApplication {

    private String superString;

    public SampleApplication() {
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            int num = random.nextInt(9);
            superString += Integer.toString(num);
        }
    }

    public String getSuperString() {
        return superString;
    }
}
