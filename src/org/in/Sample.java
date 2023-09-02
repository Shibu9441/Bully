package org.in;

import org.inh.*;
import org.inherit.*;

public class Sample implements Inher, Inh {

	@Override
	public void methodOne() {
		
		System.out.println("Method one is execute");
		
	}

	@Override
	public void methodTwo() {
		
		System.out.println("Method two is execute");
		
	}
	
	public static void main(String[] args) {
		
		Sample s = new Sample();
		s.methodOne();
		s.methodTwo();
	}

}
