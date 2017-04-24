import cs1.Keyboard; 

public class HelpDesk{
    private ArrayPriorityQueue<Ticket> _queue;
    String problem;
    int topic;
    int employment;
    int priority;

    //creates a new Ticket
    public void newProblem () {
	_queue = new ArrayPriorityQueue<Ticket>();
	
	System.out.println("Welcome to the SuperCoolYellowDolphin's Help Desk! How can we help you today?");
	
	System.out.println("What's your name?");
	String name = Keyboard.readString();
	
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

	Ticket currentTix = new Ticket( priority, name, problem);

	_queue.add(currentTix); 

	System.out.println(currentTix); 
    }

    //solves the ticket with the highest priority
    public void solve(){
	int fixed;
	Ticket currentTix = _queue.peek();
	System.out.println("Okay come on up " + currentTix.getName());
	if(currentTix.getIssue().equals("Software")){
	    System.out.println("I see you have " + currentTix.getIssue() + " issues.");
	    System.out.println("Turn it off and then on.");
	    System.out.println("Does it work now?");
	    System.out.println("\t1: Yes");
	    System.out.println("\t1: No");
	    fixed = Keyboard.readInt();
	    if(fixed == 1){
		System.out.println("Yay! It's now fixed. Thank you for stopping by.");
	        currentTix.setSolution("Turn it on and off");
		currentTix.setStatus(1);
		System.out.println("Here's your receipt.");
		System.out.println(currentTix);
		_queue.poll();
	    }
	    else{
		System.out.println("Sorry we can't help you.");
		currentTix.setSolution("None.");
		System.out.println("Here's your receipt.");
		System.out.println(currentTix);
		_queue.poll();
	    }
	    return;
	}
	if(currentTix.getIssue().equals("Hardware")){
	    System.out.println("I see you have " + currentTix.getIssue() + " issues.");
	    System.out.println("We're going to take it to another place to fix it.");
	    currentTix.setSolution("It's someone else's problem now.");
	    currentTix.setStatus(1);
	    System.out.println("Here's your receipt.");
	    System.out.println(currentTix);
	    _queue.poll();
	    return;
	}
    }	
    
    
    public static void main (String[] args) {
	HelpDesk Tester = new HelpDesk(); 
	Tester.newProblem();
	Tester.solve();
    }
    
    
}
