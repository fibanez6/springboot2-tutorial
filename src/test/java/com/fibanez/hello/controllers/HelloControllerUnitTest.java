package com.fibanez.hello.controllers;

import org.junit.Test;
import org.springframework.validation.support.BindingAwareModelMap;

import static org.junit.Assert.assertEquals;

public class HelloControllerUnitTest {

    @Test
    public void sayHello() {
        HelloController controller = new HelloController();
        String result = controller.sayHello("dolly", new BindingAwareModelMap());
        assertEquals("hello", result);
    }
}
