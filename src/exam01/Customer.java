/**
 *
 */
package exam01;

/**
 * @author sykim
 *
 */
public class Customer {
	protected int customerId;	// 고객아이디
	protected String customerName;	// 고객이름
	protected String customerGrade;	// 고객등급
	int bonusPoint;	// 보너스 포인트
	double bonusRatio;	// 적립비율

	public Customer() {
		initCustomer();
	}

	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
		initCustomer();
	}

	private void initCustomer() {
		customerGrade = "SILVER";	// 기본등급
		bonusRatio = 0.01;	// 보너스 포인트 기본 적립비율
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}

	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade +"이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
}
