public class Ticket implements Comparable{
    //variables
    private int _status;
    private int _priority;
    private String name;
    private String solDescription;
    private int ID;
    private String problem;

    //constructor;
    public Ticket(int status, int priority, String _name, String solution, int _ID, String _problem){
	_status = status;
	_priority = priority;
	name = _name;
	solDescription = solution;
	ID = _ID;
	problem = _problem;
    }

    //Accessors
    public int getStatus(){
	return _status;
    }
    public int getPriority(){
	return _priority;
    }
    public String getName(){
	return name;
    }
    public String getSol(){
	return solDescription;
    }
    public int getID(){
	return ID;
    }
    public String getProblem(){
	return problem;
    }

    //Mutators
    public void setStatus(int stat){
	_status = stat;
    }
    public void setPriority(int priority){
	_priority = priority;
    }
    public void setName(String _name){
	name = _name;
    }
    public void setSol(String solution){
	solDesscription = stolution;
    }
    public void setID(int _ID){
	ID = _ID;
    }
    public void setProblem(String _problem){
	problem = _problem;
    }
}
