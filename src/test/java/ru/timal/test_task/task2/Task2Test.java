package ru.timal.test_task.task2;



import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class Task2Test {

    @Test
    @TestMethodInfo(priority = Priority.Critical, author = "Test user", lastModified = "20.08.2019")
    public void annotation() {
        assertEquals(1, 1);
    }
}
