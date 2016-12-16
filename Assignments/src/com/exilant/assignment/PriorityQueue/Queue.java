package com.exilant.assignment.PriorityQueue;
import java.util.PriorityQueue;
public class Queue {

	public static void main(String[] args) {

		PriorityQueue<Device> deviceList = new PriorityQueue<>(10, new SortingComparator.sortByDecID());
		deviceList.add(new Device("LG", 10000));
		deviceList.add(new Device("Apple", 20000));
		deviceList.add(new Device("Samsung", 30000));
		deviceList.add(new Device("Moto", 40000));
		System.out.println("List of Device in descending order of price is  : \n");

		for (Device device : deviceList) {
			System.out.println(device.getName() + "\t\t" + device.getPrice());
		}

	}

}
