import java.util.*;

public class Main{

    public static void bookTicket(Passenger p){

        TicketBooker booker = new TicketBooker();

        if(TicketBooker.availableWaitingList == 0){

            System.out.println("No tickets available");
            return;
        }

        if((p.berthPreference.equals("L") && TicketBooker.availableLowerBerth > 0) ||
            (p.berthPreference.equals("M") && TicketBooker.availableMiddleBerth > 0) ||
            (p.berthPreference.equals("U") && TicketBooker.availableUpperBerth > 0))
        {

            System.out.println("Prefered berth available");

            if(p.berthPreference.equals("L")){

                System.out.println("Lower berth given");

                booker.bookTicket(p,(TicketBooker.lowerBerthPositions.get(0)), "L");

                TicketBooker.lowerBerthPositions.remove(0);
                TicketBooker.availableLowerBerth--;

            }
            else if(p.berthPreference.equals("M")){

                System.out.println("Middle berth given");

                booker.bookTicket(p,(TicketBooker.middleBerthPositions.get(0)), "M");

                TicketBooker.middleBerthPositions.remove(0);
                TicketBooker.availableMiddleBerth--;
            }
            else if(p.berthPreference.equals("U")){

                System.out.println("Upper berth given");

                booker.bookTicket(p,(TicketBooker.upperBerthPositions.get(0)), "U");

                TicketBooker.upperBerthPositions.remove(0);
                TicketBooker.availableUpperBerth--;
            }
        }

        //if my preference is not available means it process will execute..
        else if(TicketBooker.availableLowerBerth > 0){

            System.out.println("Lower Berth given");

            booker.bookTicket(p , (TicketBooker.lowerBerthPositions.get(0)),"L");

            TicketBooker.lowerBerthPositions.remove(0);
            TicketBooker.availableLowerBerth--;
        }
        else if(TicketBooker.availableMiddleBerth > 0){

            System.out.println("Middle berth diven");

            booker.bookTicket(p,(TicketBooker.middleBerthPositions.get(0)),"M");

            TicketBooker.middleBerthPositions.remove(0);

            TicketBooker.availableMiddleBerth--;
        }
        else if(TicketBooker.availableUpperBerth > 0){

            System.out.println("Upper berth given");

            booker.bookTicket(p,(TicketBooker.upperBerthPositions.get(0)),"U");

            TicketBooker.upperBerthPositions.remove(0);
            TicketBooker.availableUpperBerth--;
        }

        else if(TicketBooker.availableRacTickets > 0){

            System.out.println("Rac TICKETS available");

            booker.addToRAC(p , (TicketBooker.racPositions.get(0)),"RAC");
        }

        else if(TicketBooker.availableWaitingList > 0){

            System.out.println("Added to waiting list");
            booker.addToWaitingList(p , (TicketBooker.waitingListPositions.get(0)), "WL");
        }   
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        boolean loop = true;

        while(loop){

            System.out.println("1. Book Ticket \n 2. Cancel Ticket \n 3.Available Tickets \n 4. Booked Tickets  \n 5.Exit");
            int choice = sc.nextInt();

            switch(choice){
                //booking the ticket process
                case 1:
                {
                    System.out.println("Enter Passenger name , age and berth preference (L,M or U)");
                    String name = sc.nextLine();
                    int age = sc.nextInt();

                    String birthPreference = sc.nextLine();

                    Passenger p = new Passenger(name, age , birthPreference);

                    bookTicket(p);
                }
                break;

                //cancel ticket

                case 2:
                {
                    System.out.println("Enter the passenger Id to cancel the ticket");
                    int id = sc.nextInt();
                    cancelTicket(id);
                } 
                break;   

                case 3:
                {
                    TicketBooker booker = new TicketBooker();
                    booker.printAvailable();
                }
                break;

                case 4:{

                    TicketBooker booker = new TicketBooker();
                    booker.printPassengers();
                }
                break;

                case 5:
                {
                    loop =false;
                }
                break;
                default;
                break;            
            }   
        }
    }
}