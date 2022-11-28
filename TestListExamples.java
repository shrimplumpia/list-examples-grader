import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

//Interface StringChecker { boolean checkString(String s); }

class Checker implements StringChecker {

   public boolean checkString(String s) {
    if(s.length() < 5) {
      return true;
    }
    return false;
  }

}

public class TestListExamples {
  // Write your grading tests here!

  @Test (timeout = 100)
  public void testFilter() {
    List<String> input = Arrays.asList("one","two","three","seven","nine","four");
    StringChecker checker = new Checker();

    List<String> output = Arrays.asList("one","two","nine","four");
        assertEquals(output, ListExamples.filter(input,checker));
  }

  //test that the code actually runs
  @Test (timeout = 500)
  public void testMerge() {

    List<String> sort1 = Arrays.asList("a","b","c","f","g");
    List<String> sort2 = Arrays.asList ("d","l","n","o","z");
    List<String> expect = Arrays.asList("a","b","c","d","f","g","l","n","o","z");
    assertEquals(expect, ListExamples.merge(sort1,sort2));

  }

  @Test (timeout = 500)
  public void testMergeOrder() {
    //takes in two lists, add 3 elements to input 1
    //add 3 elements to input 2
    //merge, see if the expected array matches the merged array
    ArrayList<String> input1 = new ArrayList<>();
    ArrayList<String> input2 = new ArrayList<>();
    ArrayList<String> expectedList = new ArrayList<>();

    input1.add("a");
    input1.add("b");
    input2.add("c");
    input2.add("d");
    input1.add("e");

    expectedList.add("a");
    expectedList.add("b");
    expectedList.add("c");
    expectedList.add("d");
    expectedList.add("e");

    assertArrayEquals(expectedList.toArray(), ListExamples.merge(input1,input2).toArray());

  }
}

