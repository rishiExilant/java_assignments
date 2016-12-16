package com.exilant.assignment.PriorityQueue;

import java.util.Comparator;

public class SortingComparator {

	public static class sortByDecID implements Comparator<Device> {

		@Override
		public int compare(Device o1, Device o2) {
			// TODO Auto-generated method stub
			return o2.getPrice() - o1.getPrice();
		}
	}

	public class sortByIncID implements Comparator<Device> {

		@Override
		public int compare(Device o1, Device o2) {
			// TODO Auto-generated method stub
			return o1.getPrice() - o2.getPrice();
		}

	}

	public class sortByIncName implements Comparator<Device> {

		@Override
		public int compare(Device o1, Device o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}

	}

	public class sortByDecName implements Comparator<Device> {

		@Override
		public int compare(Device o1, Device o2) {
			// TODO Auto-generated method stub
			return o2.getName().compareTo(o1.getName());
		}

	}

}
