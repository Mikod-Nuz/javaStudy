/**
 *
 */
package exam01;

/**
 * 1. 우수 고객 등급은 VIP
 * 2. 제품을 살 때는 항상 10%할인
 * 3. 보너스 포인트는 5%적립
 * 4. 담당 전문 상담원을 배정
 * @author sykim
 *
 */
public class VipCustomer extends Customer{

	private int agentId;  // VIP 곡객 담당 상담원 아이디
	double saleRatio;	// 할인율

	public VipCustomer(int customerId, String customerName, int agentId) {
		super(customerId, customerName);
		customerGrade = "VIP";	// 기본등급
		bonusRatio = 0.05;	// 보너스 포인트 기본 적립비율
		saleRatio = 0.1;	//할인율 10%
		this.agentId = agentId;
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return (int) (price - (price * saleRatio));
	}

	public int getAgentId() {
		return agentId;
	}

	public String showCustomerInfo() {
		return super.showCustomerInfo() + "담당 상담원 번호는 " + agentId +"입니다.";
	}
}
