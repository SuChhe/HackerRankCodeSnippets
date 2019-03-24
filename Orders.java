

public class Orders implements Comparable<Orders> {
	int orderNumber;
	int waitTime;
	
	public Orders(int a, int b) {
		super();
		orderNumber = a;
		waitTime = b;
	}
	
	public int getOrderNumber() {
		return orderNumber;
	}
	
	public int getWaitTime() {
		return waitTime;
	}

	@Override
	public int compareTo(Orders o) {
		// TODO Auto-generated method stub
		return this.waitTime - o.getWaitTime();
	}
	
	public String toString() {
		return orderNumber + " " + waitTime;
	}

}
