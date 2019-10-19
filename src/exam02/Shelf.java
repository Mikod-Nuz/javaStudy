package exam02;

import java.util.ArrayList;

/**
 * @author sykim
 *
 */
public class Shelf {

	protected ArrayList<String> shelf;

	public Shelf(){
		shelf = new ArrayList<String>();
	}

	public ArrayList<String> getShelf(){
		return shelf;
	}

	public int getCount(){
		return shelf.size();
	}
}
