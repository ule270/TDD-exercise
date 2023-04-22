package testjava;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sourcejava.Main;

public class TestMain {
    Main main;

    @Before
    public void init(){
        main = new Main();
    }
    //    Given: an array of numbers as strings,
    //    i.e., {"1", "5", "15", "9", "4"}
    //    Task: sort the numbers
    //    Restriction: the numbers must stay strings
    //    no converting to integers
    @Test
    public void testSort() {
        //given
        String[] arr = new String[] {"1", "5", "15", "9", "4"};
        String[] expected = new String[]{"1", "4", "5", "9", "15"};

        //when
        String[] actual = main.sorter(arr);

        //then
        Assert.assertEquals(expected, actual);
    }
}
