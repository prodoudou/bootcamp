package com.demo;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
import org.junit.jupiter.api.Test;

public class TypeTest {

  @Test
  void testIfObjectIsInstanceOf() {
    Object object = "Hello world";
    assertThat(object, instanceOf(String.class));
    assertThat(object, not(instanceOf(String.class)));

  }

  @Test
  void testIfClassIsCompatibleWith() {// 呢到試繄個CLASS既關係
    assertThat(Integer.class, is(typeCompatibleWith(Number.class)));
    assertThat(Integer.class, is(typeCompatibleWith(Object.class)));
    assertThat(Number.class, is(typeCompatibleWith(Integer.class)));

  }

  @Test 
  void test2(){
    float expected = 3.0f;
    float tolerance = 0.1f;
    assertThat(2.90, closeTo(expected, tolerance));
    assertThat(2.91,closeTo(expected, tolerance));
    
  }
}
