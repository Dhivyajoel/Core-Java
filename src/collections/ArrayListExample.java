package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>List1 = new ArrayList<String>();
		
		List1.add("John");
		List1.add("Leena");
		List1.add("Priyanka");
		List1.add("Rohan");
		List1.add("Laurence");
		
		
		System.out.println("List is this"+List1);
		System.out.println("Size of Array List is "+List1.size());
		
		List1.remove(1);
		
		System.out.println("List is this after removing Leena "+ List1);
		System.out.println("Size of Array List "+ List1.size());
		System.out.println("The data of the 4th position is " + List1.get(3));
		
		List1.set(0,  "James");
		System.out.println("List is this after replacing John " + List1);
		
		List1.add(1, "Leena");
		System.out.println("List is this after adding Leena again" + List1);
		
		Collections.sort(List1);
		System.out.println("List is this after sort " + List1);
		
		
for(int index=0;index<List1.size();index++) {
			
			System.out.println(List1.get(index));
		}
		
		for(String name:List1) {
			
			System.out.println(name);
			
		}

		
		for(int index=0;index<List1.size();index++) {
			if(List1.get(index).equals("Priyanka")){
	            System.out.println(index);
	            break;
	        }
		}

	}

}





