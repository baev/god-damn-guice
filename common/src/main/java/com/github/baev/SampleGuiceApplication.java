package com.github.baev;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;

/**
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 30.06.15
 */
public class SampleGuiceApplication {

    public SampleGuiceApplication() {
        Guice.createInjector(new AbstractModule() {

            @Override
            protected void configure() {
            }
        }).injectMembers(this);
    }

}
