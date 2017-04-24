/*
Team SuperCoolYellowDolphins
Queenie Xiang, Elaina Chung, Fabiola Radosav
APCS2 PD3
LAB #03: RUVIP?
*/

import cs1.Keyboard; 

public class HelpDesk{
    private ArrayPriorityQueue<Ticket> _queue = new ArrayPriorityQueue<Ticket>();
    String problem;
    int topic;
    int employment;
    int priority;
    String ID; 


    //Creates a new Ticket according to the submitter's inputs 
    public void newProblem () {
	System.out.println("What's your name?");
	String name = Keyboard.readString();

	System.out.println("Create your own unique ID! Both letters and digits are allowed. We recommend that you restrict your input to 6-7 characters.");
	ID = Keyboard.readString();
	
	System.out.println("What kind of issues are you experiencing? Select a topic:");
	System.out.println("\t1: Software issues");
	System.out.println("\t2: Hardware issues");
	topic  = Keyboard.readInt();

	if (topic == 1) {
	    problem = "Software";
	}

	if (topic == 2) {
	    problem = "Hardware";
	}
	
	System.out.println("Okay, great! Before we start solving your issue, what is your current employment status here?");
	System.out.println("\t1: Intern");
	System.out.println("\t2: Newly Employed");
	System.out.println("\t3: Manager");
	System.out.println("\t4: President Of A Department");
	System.out.println("\t5: C-Status (CEO)");

	employment = Keyboard.readInt();

	if (employment == 1) {
	    priority = 4;
	}
	if (employment == 2) {
	    priority = 3;
	}
	
	if (employment == 3) {
	    priority = 2;
	}
	
	if (employment == 4) {
	    priority = 1;
	}
	
	if (employment == 5) {
	    priority = 0;
	}

	System.out.println("Okay great! You're all set. I will now create your ticket. \nHere is your ticket information:");
	
	Ticket currentTix = new Ticket( priority, name, problem, ID);
	_queue.add(currentTix);
	
	System.out.println(currentTix); 
    } 

    //Resolve the tickets starting from the start (head) of the _queue with the submitters of the highest priority. 
    public void solve() {
	int _solvedStatus; 

	Ticket currentTix = _queue.peek();
	
	System.out.println("Hello! Come on up " + currentTix.getName());

	//If the submitter is of high employment in the company: 
	if ( (currentTix.getPriority() == 0) || (currentTix.getPriority() == 1) ) {
	    System.out.println("Because of your current employment position, the fastest way and easiest way to solve your problem is to replace your current computer with a brand new one! Don't worry, we will copy over all the files and reinstall all the programs found in your old computer.");
	    currentTix.setSolution("Replaced the machine due to employment status.");
	    currentTix.setStatus(1); //Ticket is now closed
	    
	    System.out.println("Here's your receipt:");
	    System.out.println(currentTix);
	    _queue.poll(); //Remove Ticket from _queue
	}

	//If the issue is a related to software: 
	if ( currentTix.getIssue().equals("Software") ) {
	    System.out.println("I see you have " + currentTix.getIssue() + " issues.");

	    System.out.println("Have you tried restarting your machine? Please turn it off and then on.");
	    System.out.println("\nDoes it work now?");
	    System.out.println("\t1: Yes");
	    System.out.println("\t2: No");
	    _solvedStatus = Keyboard.readInt();
	    
	    if (_solvedStatus == 1) {
		System.out.println("Yay! It's now fixed. Thank you for stopping by!");
	        currentTix.setSolution("Restarted the machine");
		currentTix.setStatus(1); //Ticket is now closed 

		System.out.println("Here's your receipt:");
		System.out.println(currentTix);
		_queue.poll(); 
	    }
	    
	    else {
		System.out.println("Sorry we can't help you.");
		currentTix.setSolution("None.");
		
		System.out.println("Here's your receipt:");
		System.out.println(currentTix);
		_queue.poll(); //Remove Ticket from _queue
	    }
	}

	//If the issue is related to hardware: 
	if ( currentTix.getIssue().equals("Hardware") ) {
	    System.out.println("I see you have " + currentTix.getIssue() + " issues.");
	    System.out.println("Hm... The issue seems more complicated than what we can handle. We're going to send it to our main base located at 251 SREBMAHC Street and the SuperCoolYellowDolphins will resolve it there.");
	    currentTix.setSolution("Sent to main base for repair.");
	    currentTix.setStatus(1); //Ticket is now closed 
	  
	    System.out.println("Here's your receipt:");
	    System.out.println(currentTix);
	    _queue.poll(); //Remove Ticket from _queue
	} 	
    }

    //Simulation of the operations of HelpDesk
    public void HelpDeskSimulation() {
	boolean isEmptyQueue = false;
	int selection; 
	
	while (! isEmptyQueue ) {
	    System.out.println("Welcome to the SuperCoolYellowDolphin's Help Desk! How can we help you today?");
	    System.out.println("\t1: I need help and want to submit a new ticket!");
	    System.out.println("\t2: Check current status of the ticket queue."); 
	    selection = Keyboard.readInt();

	    if (selection == 1) {
		newProblem();
	    }

	    else if (selection == 2) {	
	        solve();
		if ( _queue.isEmpty() ) {
		    isEmptyQueue = true;
		}
	    } 
	}
	System.out.println("It looks like we're done here.");
    }
    
    //Main Method 
    public static void main (String[] args) {
	HelpDesk Tester = new HelpDesk(); 
	Tester.HelpDeskSimulation();
    }  
}
