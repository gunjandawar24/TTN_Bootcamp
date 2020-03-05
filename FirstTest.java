package com.im;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FirstTest {
    First first = new First();
    @Test
    void shouldReturnNewString_When_SubstringIsFound() {
        //given
        String mainString = "Gunjan Dawar is a Trainee";
        String findstring = "Trainee";
        String replacedString = "Employee";
        String expectedString = "Gunjan Dawar is an Employee";

        //when
        String calculateString = first.replaceSubString(mainString, findstring, replacedString);

        //then
        assertEquals(expectedString, calculateString);
    }

    @Test
    void shouldReturnOriginalString_When_SubstringIsNotFound() {
        //given
        String mainString = "Gunjan kathuria";
        String findstring = "kathuria";
        String replacedString = "Dawar";
        String expectedString = "Gunjan Dawar";

        //when
        String calculateString = first.replaceSubString(mainString, findstring, replacedString);

        //then
        assertEquals(expectedString, calculateString);

    }

    @Test
    void shouldReturnOddElementOnly_When_OddElementExist_AfterFilterEvenElement() {
        //given
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            list.add(i);
        }
        List<Integer> expectedlist = new ArrayList<>();
        expectedlist.add(1);
        expectedlist.add(3);
        expectedlist.add(5);

        //when
        List calculatelist = first.filterEvenElements(list);

        //then
        assertEquals(expectedlist, calculatelist);

    }

    @Test
    void shouldThrowMessageInvalidInput_When_ListIsNotExist() {
        //given
        List<BigDecimal> list = null;
        //List<BigDecimal> list=new ArrayList<>();

        //when
        try {
            first.calculateAverage(list);
        }

        //then
        catch (RuntimeException r) {
            System.out.println(r);

        }
    }

    @Test
    void shouldThrowMessageInvalidInput_When_ListIsEmpty() {
        //given
        List<BigDecimal> list = new ArrayList<>();

        //when
        try {
            first.calculateAverage(list);
        }

        //then
        catch (RuntimeException r) {
            System.out.println(r);

        }
    }

    @Test
    void shouldReturnAveragevalue_When_ListContainsElement() {

        //given
        List<BigDecimal> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add(new BigDecimal(1212121));
            list.add(new BigDecimal(1212121));
            list.add(new BigDecimal(1212121));
            list.add(new BigDecimal(1212121));
        }
        BigDecimal expectedaverage = new BigDecimal(1212121);

        //when
        BigDecimal calculateaverage = first.calculateAverage(list);

        //then
        assertEquals(expectedaverage, calculateaverage);
    }

    @Test
    void shouldReturnTrue_When_StringIsNotpalindrome() {
        //given
        String originalinput = "nitin";

        //when
        boolean palindromecheck = first.isPallindrome(originalinput);

        //then
        assertFalse(palindromecheck);

    }
}