package proxy.staticproxy;

import proxy.service.Person;
import proxy.service.impl.Renter;

public class StaticProxyTest {

	public static void main(String[] args) {
		System.out.println("*้ๆไปฃ็*");
		Person renter = new Renter();
		RenterProxy proxy = new RenterProxy(renter);
		proxy.rentHouse();
	}

}
