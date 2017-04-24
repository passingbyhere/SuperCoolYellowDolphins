/*
Team SuperCoolYellowDolphins
Queenie Xiang, Elaina Chung, Fabiola Radosav
APCS2 PD3
LAB #03: RUVIP?
*/

import java.util.ArrayList;
    
public class ArrayPriorityQueue<T> implements PriorityQueue<T>{
    //lowest priority --> highest priority
    
    private ArrayList<T> _data;

    //Constructor 
    public ArrayPriorityQueue() {
	_data = new ArrayList<T>();
    }

    //Checks if the current ArrayList is empty
    //Returns true if it's empty. False otherwise. 
    public boolean isEmpty(){ 
	return _data.size() == 0;
    }

    //Adds an item (Ticket in this case) to its proper position in the queue according to its priority
    //0 is the highest priority and priority decreases as the int value increases
    public void add(T item) {
	for(int i = 0; i < _data.size(); i++) {
	    if ( ( ((Comparable)item).compareTo((Comparable)_data.get(i)))  >= 0 ) {
		_data.add(i, item);
		return;
	    }
	}
	_data.add(_data.size(), item); 
    }
    

    //Returns the item (Ticket in this case) at the head of the ArrayList 
    public T peek() {
	if (_data.size() == 0) {
	    return null;
	}
	
	return _data.get(_data.size()-1);
    }

    //Dequeues the item (Ticket in this case) with the highest priority 
    //Returns the value of the Ticket dequeued 
    public T poll() {
	if (_data.size() == 0) {
	    return null;
	}
	
	return _data.remove(_data.size()-1); 
    }

    public String toString() {
	String retStr = "";
	for (T item: _data) {
	    retStr += item.toString() +
		"\n";
	}
	return retStr;
			   
    }

}
