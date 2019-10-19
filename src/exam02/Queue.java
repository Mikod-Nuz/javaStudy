package exam02;

/**
 * @author sykim
 *
 */
public interface Queue {

	void enQueue(String title);
	String deQueue();
	int getSize();
}
