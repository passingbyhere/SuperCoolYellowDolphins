import java.util.ArrayList;
    
public class ArrayPriorityQueue<Ticket> implements PriorityQueue<T>{
    private ArrayList<Ticket> _data;
    public ArrayPriorityQueue(){
	_data = new ArrayList<Ticket>();
    }
    
    public boolean isEmpty(){
	return _data.size() == 0;
    }

    public void add(Ticket item){
	for(int i = 0; i < _data.size(); i++) {
	    if ( item.compareTo(_data.get(i)) == 1) {
		_data.add(i, item);
		return;
	    }
	}
	_data.add(_data.size(), item);
    }

    public Ticket peekMin(){
	return _data.get(_data.size()-1);
    }

    public Ticket removeMin(){
	return _data.remove(_data.size()-1);
    }
}
