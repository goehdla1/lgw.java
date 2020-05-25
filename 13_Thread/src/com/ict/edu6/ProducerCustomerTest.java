package com.ict.edu6;

public class ProducerCustomerTest {
	public static void main(String[] args) {
		Car c = new Car();
		Producer producer = new Producer(c);
		Thread tProducer = new Thread(producer);
		Customer customer = new Customer(c);
		Thread tCustomer = new Thread(customer);
		tProducer.start();
		tCustomer.start();

	}
}
