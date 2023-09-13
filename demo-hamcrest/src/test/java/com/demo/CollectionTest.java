package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.*;

import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

public class CollectionTest {

  @Test
  void testList() {
    List<String> strings = Arrays.asList("Apple", "banna", "cherry");
    assertThat(strings, hasItem("cherry"));
    assertThat(strings, hasItems("cherry", "apple"));//呢個就係計大細階
    assertThat(strings, hasSize(3));
     // number of items + ordering
    assertThat(strings, contains("apple","banana"));// ordering
    assertThat(strings, not(contains("apple","cherryu","banana")));// ordering
    assertThat(strings, not(contains("apple","cherry")));// ordering
    assertThat(strings, containsInAnyOrder("apple", "cherry","banana"));
    assertThat(strings, not(containsInAnyOrder("apple", "cherry","banana")));

    List<String> emptyList = new ArrayList<>();
    assertThat(emptyList, empty());




  }
}
