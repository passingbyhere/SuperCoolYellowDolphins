import java.util

public class HelpDesk{
    private ArrayPriorityQueue<Ticket> _line;

    public void NewProblem () {
	int topic; 
	System.out.println("Welcome to the SuperCoolYellowDolphin's Help Desk! How can we help you today?");
	
	System.out.println("What's your name?");
	String name = Keyboard.readString();

	System.out.println("Select a topic!");
	System.out.println("\t1: Software issues");
	System.out.println("\t2: Hardware issues");

	topic = Keyboard.readInt();

	if (topic == 1) {
	    String problem = "Software";
	}

	if (topic == 2) {
	    String problem = "Hardware";
	}
    }
    
    
}
