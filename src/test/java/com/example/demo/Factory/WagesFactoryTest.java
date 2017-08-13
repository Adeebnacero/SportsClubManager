package com.example.demo.Factory;

import com.example.demo.Domain.Wages;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;

/**
 * Created by Adeebo on 2017/08/13.
 */
public class WagesFactoryTest {

    Wages wages;
    Map<String, String> wageTest;

    @Before
    public void setUp() throws Exception {

        wageTest = new HashMap<String, String>();
        wageTest.put("wageID","001");
    }

    @Test
    public void testGetWages() throws Exception {

        wages = WagesFactory.getWages(wageTest,new Date(),8,20.6);

        System.out.println(wages.toString());
        assertEquals(true, wages.equals(wages));

    }
}