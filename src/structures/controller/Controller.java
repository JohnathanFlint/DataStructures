package structures.controller;

import java.lang.Object;
import java.util.*;
import structures.model.*;

public class Controller 
{
	private LinkedList<Customer> customerQueue;
	private Stack<Carpet> carpetStack;
	
	public void start()
	{	
		carpetStack = new Stack<Carpet>();
		customerQueue = new LinkedList<Customer>();
		
		Customer customer = new Customer(1);
		Customer customer2 = new Customer(2);
		
		customerQueue.add(customer);
		customerQueue.add(customer2);
		customerQueue.remove();
		
		Carpet carpet = new Carpet("Shag");
		Carpet carpet1 = new Carpet("Beige");
		
		carpetStack.push(carpet);
		carpetStack.push(carpet1);
		carpetStack.pop();
		carpetStack.peek();
	}
		
		
		
		
		
	
}
