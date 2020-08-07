package com.yiibai.common;

public class Person {
	private Address address;
	public Person(Address address){
		this.address = address;
	}
	private Ability ability;

	public Ability getAbility() {
		return ability;
	}

	public void setAbility(Ability ability) {
		this.ability = ability;
	}

	@Override
	public String toString() {
		return "Person [address=" + address + ", ability=" + ability + "]";
	}

	
	
}
