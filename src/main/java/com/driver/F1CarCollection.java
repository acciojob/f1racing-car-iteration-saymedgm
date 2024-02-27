package com.driver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class F1CarCollection implements Iterable<F1Car> {
	   private List<F1Car> f1Cars = new ArrayList<>();

	    public void addCar(F1Car car) {
	       // your code goes here
	    }

	    @Override
	    public Iterator<F1Car> iterator() {
	    	//your code goes here
	        return f1Cars.iterator();
	    }
}
