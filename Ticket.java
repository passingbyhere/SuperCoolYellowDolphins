/*
Team SuperCoolYellowDolphins
Queenie Xiang, Elaina Chung, Fabiola Radosav
APCS2 PD3
LAB #03: RUVIP?
*/

public class Ticket implements Comparable{
    //Instance variables representing the properties of a Ticket
    private String _ID;
    private int _status; //0 -- unsolved. 1 -- solved 
    private int _priority; // 0 -- highest priority. Priority decreases as the number increases 
    private String _submitterName; 
    private String _issue;
    private String _solution;

    //Constructor;
    public Ticket( int inputPriority, String inputName, String inputProblem, String inputID){
	_priority = inputPriority;
	_submitterName = inputName;
	_issue = inputProblem;
	_ID = inputID; 	
	_status = 0;
	_solution = ""; 
    }

   
    
    //Accessors
    public String getID() {
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
    public int compareTo(Object other){
	//If the priority of this ticket is less than the otherTicket being compared, return -1
	if ( this._priority > ((Ticket)other)._priority ) {
	    return 1;
	}
	
	//If the priority of this ticket is greater than the otherTicket being compared, return 1
	else if ( this._priority == ((Ticket)other)._priority ) {
	    return 0;
	}

	//If the priority of this ticket is equal to the otherTicket being compared, return 0
	else {
	    return -1;
	}
	
    }

    public String toString() {
	String retStr = "";
	retStr += 
	    "\nTicket ID: " + getID() + 
	    "\nSubmitter Name: " + getName() +
	    "\nIssue: " + getIssue() +
	    "\nStatus: " + retStatus() +
	    "\nSolution: " + getSolution();
	return retStr; 
    }
	   
}

