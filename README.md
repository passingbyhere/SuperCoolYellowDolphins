# Team SuperCoolYellowDolphins
## LAB #03: Help Desk
### Elaina Chung, Fabiola Radosav, Queenie Xiang

  ## Design 
  We used ArrayPriorityQueue to create a ticket line for people using the Help Desk. In the ArrayPriorityQueue, we used an ArrayList to represent the queue. We decided to enqueue with a linear run time and dequeue with a constant runtime. In our enqueue (or add) method, we placed a Ticket by comparing its priority with the already existing Tickets. The ticket with the highest priority will be at position queue.size()-1 while the ticket with the lowest priority will be at position 0. When dequeueing, the method poll() will always just remove the Ticket at position queue.size()-1. 
  
  ### Ticket
  This class is used to represent a ticket submitted in normal situations. We used different instance variables to represent the different properties of a Ticket: ID, submitter's name, issue, solution, status, and priority of the ticket according to the submitter's employment status. If the employment is of the highest employment, his/her status is represent by the int 0. The priority decreases as the int increases. 
  What's noteworthy is our implementation of the compareTo method in this class. The compareTo method compares the priority between two different tickets and is used by ArrayPriorityQueue to add in tickets to their proper position depending on their priority. 
  
  ### HelpDesk 
  This class is used to represent the operations or procedures of a HelpDesk. There are three main methods of this class: newProblem(), solve(), and HelpDeskSimulation(). HelpDeskSimulation() is the method that brings together the other two (as suggested by its name). This method runs as long as Tickets remain in the queue (while the queue is not empty). Upon each simulation, the user has a choice between selecting submitting a new ticket, thus calling newProblem() which will create a new Ticket depending on the user's inputs, or checking the current status of the queue, which will prompt solve() that will attempt to solve the issue of the ticket with the highest priority. Our team aimed for simplicity when selecting the types of issues: software vs. hardware, and when solving for these issues: the issue is either fixed by restarting the machine, the machine gets replaced for the submitters with higher employment status, the machine is sent back to the main base for repair, or the issue isn't solvable. 
  
  ## Embellishments
  * Realistic interactions between the user and the program -- there are a lot of options that the user can choose from when entering in their ticket information and receiving a solution  
  * CompareTo method and implementing a Comparable interface
  * Option of submitting a new ticket or checking the current status of the queue 
  * Allowing the user to create his/her own unique ID number 
  
