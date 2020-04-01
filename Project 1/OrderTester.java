public class OrderTester {

	public static void main(String[] args) {
		// Instantiate an OrderQueue with a stock of 12
		OrderQueue<CustomerOrder> orders = new OrderQueue<CustomerOrder>(12);
		
		// Enqueue three customer orders with a positive balance, and quantities of 3, 5, and 8
		orders.addOrder("Jack","March 27",3,15);
		orders.addOrder("Jeb","March 28",5,25);
		orders.addOrder("Jeff","March 29",8,40);
		
		// Clear the balance of the first customer
		orders.handleCustomerBalance(15);
		
		// Attempt to force the balance of the first customer to go negative (it should remain at 0)
		orders.handleCustomerBalance(100);
		
		// Clear the stock by filling as many orders as possible with the stock of 22
		orders.sellRemainingStock();
		
		// Add an additional 10 units to stock
		orders.addStock(10);
		
		// Add three additional customer orders, with a positive balance, and quantities of 2, 2, 3
		orders.addOrder("Body","April 1",2,10);
		orders.addOrder("Braxton","April 1",2,10);
		orders.addOrder("Braydon","April 2",3,15);
		
		// Clear the order queue
		while (!orders.isEmpty()) {
			orders.dequeue();
		}
	}
}