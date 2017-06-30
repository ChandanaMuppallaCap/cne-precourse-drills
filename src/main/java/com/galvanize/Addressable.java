package com.galvanize;

import java.util.List;

public interface Addressable {
	public abstract List<Address> getAddresses();
	public abstract void addAddress(Address address);
	

}
