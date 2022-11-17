package proxy.staticproxy;

import proxy.service.Person;

public class RenterProxy implements Person {

	private Person renter;
	public RenterProxy(Person renter){
		this.renter = renter;
	}
	@Override
	public void rentHouse() {
		System.out.println("中介找房东租房，转租给租客！");
		renter.rentHouse();
		System.out.println("中介给租客钥匙，租客入住！");
	}

}
