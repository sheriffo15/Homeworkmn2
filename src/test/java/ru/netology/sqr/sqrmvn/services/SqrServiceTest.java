package ru.netology.sqr.sqrmvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqrServiceTest {

    @Test
    public void calcFullTest() {
        SqrService service = new SqrService();
        int actual = service.calc(100, 550);
        int expected = 14;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void calcMinTest() {
        SqrService service = new SqrService();
        int actual = service.calc(100, 101);
        int expected = 1;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void calcMaxTest(){
        SqrService service = new SqrService();
        int actual = service.calc(549, 550);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void calcExtraTest() {
        SqrService service = new SqrService();
        int actual = service.calc(0, 9);
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

}