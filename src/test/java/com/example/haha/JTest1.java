package com.example.haha;

import com.example.haha.mama.JTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class JTest1 {

    @InjectMocks
    private JTest jTest;

    @Test
    @DisplayName("성공")
    public void boo() {

        System.out.println("adfffddddffdf");
        int a = jTest.foo();
        assertEquals(a, 5);
    }
}
