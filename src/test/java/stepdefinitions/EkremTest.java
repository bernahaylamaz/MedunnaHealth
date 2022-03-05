package stepdefinitions;

import org.junit.Test;

public class EkremTest {
    @Test
    public void test(){
        int say1 = 3;
        int say2 = 5;
        System.out.println("Iki sayiyi topla: " + (say1+say2));

        System.out.println("Iki sayiyi carp: " + (say1*say2));

        System.out.println("Iki sayiyi carp: " + (say1*say2*say1));
    }
}
