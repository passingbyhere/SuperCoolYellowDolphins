import java.util.ArrayList;
    
public class ArrayPriorityQueue<T> implements PriorityQueue<T>{
    private ArrayList _data;
    public ArrayPriorityQueue(){
	_data = new ArrayList();
    }
    public boolean isEmpty(){
	return _data.size() == 0;
    }
    public void add(T x){
	for(int i = 0; i < _data.size(); i++){
	    if(x >= (int)_data.get(i)){
		_data.add(i, x);
		return;
	    }
	}
	_data.add(_data.size(), x);
    }
    public T peekMin(){
	return _data.get(_data.size()-1);
    }
    public T removeMin(){
	return _data.remove(_data.size()-1);
    }
}
