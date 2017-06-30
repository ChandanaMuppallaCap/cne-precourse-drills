package com.galvanize;

import java.util.List;
import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		Business b=new Business("MyHomeAddress");
		Address address=new Address("charles street","columbs","ohio","12341");
		Address address1=new Address("charles street","columbs","ohio","12341");
		List<Address>al=b.getAddresses();


		b.addAddress(address);
		b.addAddress(address1);


		Iterator itr = al.iterator();

		while(itr.hasNext()) {
			Object element = itr.next();
			System.out.println(element.toString());
		}
	}

}
