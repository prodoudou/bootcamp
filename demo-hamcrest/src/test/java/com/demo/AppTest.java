package com.demo;

import static org.junit.Assert.assertTrue;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

// Junit5

public class AppTest {

    @Test // Junit5
    public void test() {
        int value = 40;

        assertThat(value, is(equalTo(40)));
        assertThat(value, equalTo(40));
        //
        assertThat(value, is(greaterThan(30)));//有冇IS係grammer問題
        assertThat(value, greaterThan(30));
        //
        assertThat(value, is(not(greaterThan(50))));
        assertThat(value, is(lessThan(60)));
        //
        assertThat(value, is(lessThanOrEqualTo(60)));
        assertThat(value, is(greaterThanOrEqualTo(40)));
        

    }

    @Test
    void testString() {
        String str = "Hello world";
        assertThat(str, containsString("world"));
        assertThat(str, not(containsString("world!")));

        String str2 = new String("Hello world");
        assertThat(str, equalTo(str2));// check value of strings
        assertThat(str, is(not(sameInstance(str2))));
        assertThat(str2, is(notNullValue()));

        String nullString = null;
        assertThat(nullString, is(nullValue()));

        assertThat(str, startsWith("Hello"));
        assertThat(str, not(startsWith("hello7")));
        assertThat(str, endsWith("world"));
        assertThat(str, not(endsWith(" world7 ")));

        String emptyString = "";
        assertThat(emptyString, is(emptyString()));
    }

    @Test
    void testLogicalMatcher() {
        int val = 42;
        assertThat(val, allOf(
                greaterThan(41),
                lessThan(43),
                greaterThanOrEqualTo(42),
                lessThanOrEqualTo(42)

        ));
        // OR
        assertThat(val, anyOf(
                greaterThan(43), // false
                lessThan(40), // false
                greaterThanOrEqualTo(50), // false
                lessThanOrEqualTo(42)// true
        ));

    }
}