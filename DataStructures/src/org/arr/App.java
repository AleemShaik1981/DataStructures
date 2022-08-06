package org.arr;

import java.util.*; 



public class App {

	
	public static void main(String[] args) 
	{
		App app = new App();
		List<String> st = new LinkedList<>(); 
		st.add("India"); 
		st.add("Saudi"); 
		st.add("Qatar"); 
		st.add("Kuwait"); 
		st.add("Bahrain"); 
		app.printList(st);
		System.out.println("+++++++++++++++");
		//st.sort(null);
		//app.printList(st);
		Collections.reverse(st);
		System.out.println("+++++++++++++++");
		app.printList(st);
		
	}
	
	void printList(List<String> listitem) {
		ListIterator<String> item = listitem.listIterator(); 
		while(item.hasNext()) {
			System.out.println(item.next());
		}
		
	}

}
