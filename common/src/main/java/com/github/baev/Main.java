package com.github.baev;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;

/**
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 30.06.15
 */
public class Main {

    public Main() {
        Guice.createInjector(new AbstractModule() {

            @Override
            protected void configure() {
            }
        }).injectMembers(this);
    }

}
