package com.example.haha;

import com.example.haha.mama.JTest;
import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
public class JTest1Test {

    @InjectMocks
    private JTest jTest;

    @Test
    @DisplayName("성공")
    public void boo() {

        System.out.println("adffffdd5ddffdf");
        int a = jTest.foo();
        assertEquals(a, 4);
    }
}
