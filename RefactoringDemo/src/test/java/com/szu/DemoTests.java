package com.szu;

import com.szu.demo1.Customer;
import com.szu.demo1.Movie;
import com.szu.demo1.Rental;
import org.junit.*;

/**
 * @Author: YHJ
 * @Description:
 * @Date:Create：in 5/29/2019 20:01
 * @Modified By：
 */
public class DemoTests {

    @Test
    public void testStatement(){
        Movie movie1=new Movie("movie1",1);
        Movie movie2=new Movie("movie2",2);
        Rental rental1=new Rental(movie1,5);
        Rental rental2=new Rental(movie1,2);
        Rental rental3=new Rental(movie2,3);
        Customer customer1=new Customer("customer1");
        customer1.addRental(rental1);
        customer1.addRental(rental3);
        Customer customer2=new Customer("customer2");
        customer2.addRental(rental2);
        Assert.assertEquals("Rental Record for customer1\n" +
                "\tmovie1\t15.0\n" +
                "\tmovie2\t1.5\n" +
                "Amount owed is 16.5\n" +
                "You earned 3 frequent renter points",customer1.statement());
        Assert.assertEquals("Rental Record for customer2\n" +
                "\tmovie1\t6.0\n" +
                "Amount owed is 6.0\n" +
                "You earned 2 frequent renter points",customer2.statement());
    }
}
