package io.github.aaronclong.generics;

import static  org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by aaronlong on 5/18/17.
 */
public class MyArrayListTest {

  private MyArrayList<String> arrayListString;

  @Before
  public void setUp() {
    arrayListString = new MyArrayList<>();
  }

  @Test
  public void testArrayListAddGet() {
    for(int i = 0; i < 25; i++) {
      arrayListString.add("String " + i);
    }
    for (int i =0; i < 25; i++) {
      assertEquals("Checking the correct addition and retrieval of items",
              "String " + i, arrayListString.get(i));
    }
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void checkIndexOutOfBoundIsThrownForGreater() {
    arrayListString.get(5);
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void checkIndexOutOfBoundIsThrownForLess() {
    arrayListString.get(-1);
  }
}
