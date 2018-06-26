package com.exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		FileReader fr;
		try {
			fr = new FileReader("menu.txt");
			BufferedReader br = new BufferedReader(fr);
			String line,tempstring;
			String[] tempArray = new String[4];
			ArrayList meal = new ArrayList();
			int i = 0;
			while((line = br.readLine())!=null){
				tempstring = line;
				tempArray = tempstring.split(",");
			    for(i=0;i< tempArray.length;i++)
	            {          
	               meal.add(tempArray[i]);
	            }
			}
			int a = meal.size()/4;
			int count = 0;
			String[][]trans_array = new String [a][4];
			for(int j=0; j<7; j++)
	        {
	            for(int k=0; k<4; k++)
	            {
	                trans_array[j][k]=(String) meal.get(count);
	                count++;
	            }
	        }
			
			for(int l=0;  l<7; l++){
				String s = "";
				
					s =  trans_array[l][0];
					String b =  trans_array[l][1];
					
				
				
				System.out.println(s+")"+b);
			}
			Scanner sc = new Scanner(System.in);
		

			System.out.println("請輸入餐點:");
			
			
			System.out.println("請輸入數量:");
			//String a = br.readLine();
			//String[]b = a.split(",");
			//int n = Integer.parseInt(b[0]);
			//String h = b[1];
			//System.out.println(c);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}
			

