package com.github.baev;

import org.eclipse.aether.artifact.DefaultArtifact;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import ru.yandex.qatools.clay.Aether;

import java.net.URLClassLoader;

import static ru.yandex.qatools.allure.report.AllureReportBuilder.mavenSettings;

/**
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 30.06.15
 */
public class MyTest {

    public static final DefaultArtifact artifact = new DefaultArtifact("com.github.baev", "common", "jar", "1.0-SNAPSHOT");

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @Test
    public void testName() throws Exception {
        for (int i = 0; i < 100000; i++) {
            try (URLClassLoader classLoader = Aether.aether(mavenSettings()).resolve(artifact).getAsClassLoader()) {
                Class<?> clazz = classLoader.loadClass("com.github.baev.Main");
                Object instance = clazz.newInstance();
                System.out.println(String.format("%d: %s", i, instance.getClass().getName()));
            }
        }
    }
}
