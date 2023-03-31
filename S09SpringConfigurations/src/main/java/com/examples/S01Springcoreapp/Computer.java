package com.examples.S01Springcoreapp;

public class Computer {
	private int cpu;
	private String ram;
	private String storage;

	public Computer(int cpu, String ram, String storage) {
		this.cpu = cpu;
		this.ram = ram;
		this.storage = storage;
	}

	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", ram=" + ram + ", storage=" + storage + "]";
	}

}
