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
<<<<<<< HEAD



    //Reading Inputs:

    public void NewProblem() {
	int topic; 
	System.out.println("Welcome to the SuperCoolYellowDolphin's Help Desk! How can we help you today?");

	System.out.println("Select a topic!");
	System.out.println("\t1: Software issues");
	System.out.println("\t2: Hardware issues");

	topic = Keyboard.readInt();

	if (topic == 1) {
	    problem = "Software";
	}

	if (topic == 2) {
	    problem = "Hardware";
	}
    }
}



	    
	


    
=======
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

    //compare
    public int compareTo(Ticket otherTicket){
	if(this._priority < otherTicket._priority){
	    return -1;
	}
	if(this._priority > otherTicket._priority){
	    return 1;
	}
	else{
	    return 0;
	}
    }
}
>>>>>>> e32ec61cc3c889f08ec83f53739f3a2037d07818
