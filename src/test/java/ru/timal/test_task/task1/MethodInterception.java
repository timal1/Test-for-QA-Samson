package ru.timal.test_task.task1;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MethodInterception {

    @Test
    public void annotationValue() {
        MainPage mainPage = createPage(MainPage.class);
        assertNotNull(mainPage);
        assertEquals(".//*[@test-attr='button_search']", mainPage.buttonSearch());
        assertEquals(".//*[@test-attr='input_search']", mainPage.textInputSearch());
    }

    private static MainPage createPage(Class<MainPage> clazz) {
        return (MainPage) Proxy.newProxyInstance(InvocationHandlerImpl.class.getClassLoader(), new Class[] { clazz },
                new InvocationHandlerImpl());
    }

}
