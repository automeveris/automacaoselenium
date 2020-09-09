package com.bddeveris.steps;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Assert;
import org.junit.Test;


public class test {
	
	@Test
	public void compararData() throws ParseException
	{

        String a = "19.10.1975";
        String b = "1975-10-19";

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = sdf1.parse(a);
        Date d2 = sdf2.parse(b);
        sdf1.applyPattern("dd/MM/yyyy");
        sdf2.applyPattern("dd/MM/yyyy");

		String newDate1 = sdf1.format(d1);
		String newDate2 = sdf2.format(d2);
        System.out.println(newDate1 + newDate2);
        Assert.assertEquals(newDate1, newDate2);
		
	
	}
}
