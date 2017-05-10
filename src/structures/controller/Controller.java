package structures.controller;

import java.lang.Object;
import java.util.*;
import structures.model.*;

public class Controller 
{
	public void start()
	{	
		Customer customer = new Customer(0);
		Customer customer2 = new Customer(1);
		Queue<Customer> customerQueue;
		customerQueue = new LinkedList<Customer>();
		
		customerQueue.add(customer);
		customerQueue.add(customer2);
		customerQueue.remove();
		
		Carpet carpet = new Carpet("Shag");
		Carpet carpet1 = new Carpet("Beige");
		
		Stack<Carpet> carpetStack;
		carpetStack = new Stack<Carpet>();
		
		carpetStack.push(carpet);
		carpetStack.push(carpet1);
		carpetStack.pop();
		carpetStack.peek();
	}
		
		
		
		
		
	
}
