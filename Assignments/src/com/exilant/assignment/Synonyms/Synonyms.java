package com.exilant.assignment.Synonyms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Synonyms {
	public static void main(String[] args) {
		HashMap<String, String[]> list = new HashMap<String, String[]>();
		list.put("Beautiful", new String[] { "Attractive", "Pretty", "Lovely", "Stunning" });
		list.put("Fair", new String[] { "Just", "Objective", "Impartial", "Unbiased" });
		list.put("Happy", new String[] { "Content", "Joyful", "Mirthful", "Upbeat" });
		list.put("Strong", new String[] { "Stable", "Secure", "Solid", "Tough" });
		list.put("Honest", new String[] { "Honorable", "Fair" });
		System.out.println("Enter the word for which you want synonyms : ");
		Scanner sc = new Scanner(System.in);
		String key = sc.next();
		if (list.containsKey(key)) {
			String[] array = list.get(key);
			System.out.println("Synonyms of " +key  +" are:");
			for (String string : array) {
				System.out.println(string);
			}
		} else {
			System.out.println("Synonyms not found");
		}

	}
}
