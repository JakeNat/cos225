public class OrderQueue<T> extends LinkedQueue<T> {
	LinkedQueue<CustomerOrder> orders = new LinkedQueue<CustomerOrder>();
	int stock;
	int sizeOfQueue;
	
	public OrderQueue() {
		this.stock = 0;
		this.sizeOfQueue = 0;
	}
	
	public OrderQueue(int stock) {
		this.stock = stock;
		this.sizeOfQueue = 0;
	}
	
	public void addOrder(String name,String date,int quantity,double balance) {
		CustomerOrder order = new CustomerOrder(name,date,quantity,balance);
		orders.enqueue(order);
		sizeOfQueue++;
	}
	
	public void addStock(int toAdd) {
		this.stock += toAdd;
	}
	
	public void serveFirstCustomer() {
		CustomerOrder customer = orders.getFront();
		if (customer.quantity > 0) {
			customer.shipProduct();
			this.stock--;
			if (customer.quantity == 0) {
				orders.dequeue();
				sizeOfQueue--;
			}
		}
	}
	
	public void sellRemainingStock() {
		while (stock != 0) {
			serveFirstCustomer();
		}
	}
	
	public void handleCustomerBalance(int payment) {
		CustomerOrder customer = orders.getFront();
		customer.payBalance(payment);
	}
}
