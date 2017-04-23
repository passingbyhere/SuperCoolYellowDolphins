/*
Team SuperCoolYellowDolphins
Queenie Xiang, Elaina Chung, Fabiola Radosav
APCS2 PD3
LAB #03: RUVIP?
*/

public class Ticket implements Comparable{
    //Instance variables representing the properties of a Ticket
    private int _ID = 000000; //Starting off value for _ID 
    private int _status; //0 -- unsolved. 1 -- solved 
    private int _priority; // 0 -- highest priority. Priority decreases as the number increases 
    private String _submitterName; 
    private String _issue;
    private String _solution;

    //Constructor;
    public Ticket( int inputPriority, String inputName, String inputProblem){
	_priority = inputPriority;
	_submitterName = inputName;
	_issue = inputProblem;

	_ID = createID(); 	
	_status = 0;
	_solution = ""; 
    }

    //Create an unique ID per ticket:
    //Every time a new Ticket is submitted,the ID number will increment by 1. This will guarantee unique-ness while ensuring that a large number of tickets can be created without conflicts. 
    public int createID() {
	_ID += 1;
	return _ID; 	
    }
    
    //Accessors
    public int getID() {
	return _ID;
    }
    
    public int getStatus() {
	return _status;
    }
    
    public int getPriority() {
	return _priority;
    }
    
    public String getName() {
	return _submitterName;
    }

    public String getIssue() {
	return _issue;
    }
    
    public String getSolution() {
	return _solution;
    } 


    //Mutators
    public void setStatus(int stat){
	_status = stat;
    }
    public void setPriority(int priority){
	_priority = priority;
    }
    public void setName(String name){
	_submitterName = name;
    }
    public void setSolution(String solution){
        _solution = solution;
    }
 

    //Returns corresponding status
    public String retStatus() {
	if (_status == 0) {
	    return "Unsolved";
	}

	else {
	    return "Solved";
	}

    }
	
    //Compares the priority of two tickets
    public int compareTo(Ticket otherTicket){
	//If the priority of this ticket is less than the otherTicket being compared, return -1
	if ( this._priority < otherTicket._priority ) {
	    return -1;
	}
	
	//If the priority of this ticket is greater than the otherTicket being compared, return 1
	else if ( this._priority > otherTicket._priority ) {
	    return 1;
	}

	//If the priority of this ticket is equal to the otherTicket being compared, return 0
	else {
	    return 0;
	}
    }

    public String toString() {
	String retStr = "";
	retStr +=
	    "Ticket ID: " + getID() + 
	    "\nSubmitter Name: " + getName() +
	    "\nIssue: " + getIssue() +
	    "\nStatus: " + retStatus() +
	    "\nSolution: " + getSolution();
	return retStr; 
    }
	   
}

