package datastructures;

import datastructures.utility.Utility;

public class AnagramInQueue {

	static Queue<Integer> q =  new Queue<>();
	static int array[] = Utility.findAnagram(true);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<array.length;i++) 
		{
			q.enqueue(array[i]);
		}
		//q.show();
		print();
	}
	
	public static void print() 
	{
		for(int i=0;i<array.length;i++) {
		System.out.println(q.dequeue());
		}
	}

}
