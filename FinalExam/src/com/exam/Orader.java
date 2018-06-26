package com.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Orader {
	int total = 0;
	List<Meal> meals = new ArrayList<>();
	
	public void on(){
		System.out.println("請輸入餐點:");
		for (int i=0; i<meals.size(); i++){
			Meal meal = meals.get(i);
			System.out.println(meal.getId() + "\t" + meal.getName() + "\t" );
		}
		Scanner scanner = new Scanner(System.in);
	
			}
		
	}
