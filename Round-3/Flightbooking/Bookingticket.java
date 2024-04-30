import java.util.*;

public class Bookingticket{

    public static void book(Flight CurrentFlight , int tickets , int passengerID){

        String passengerDetail = "";
        passengerDetail = "Passenger ID " + Passengerid + " --" + "Number of ticket details " + tickets + " --- "+ "Total cost " + CurrentFlight.price * tickets;

        CurrentFlight.addPassengerDetails(passengerDetail , tickets , passengerID); 

        CurrentFlight.flightSummary();
        CurrentFlight.printDetails(); 
    }

    public static void main(String[] args){

        ArrayList <Flight> flights = new ArrayList<Flight>();

        for(int i = 0; i < 2 ; i++){

            flights.add(new Flight());
        }

        int passengerID = 1;

        while(true){

            System.out.println("1. Book   2. Cancel  3.PrintDetails");

            Scanner sc= new Scanner(System.in);

            int choice = sc.nextInt();


            switch(choice){

                case 1:{

                    System.out.println("Enter Flight ID");
                    int fid = sc.nextInt();

                    if(fid > flights.size()){

                        System.out.println("Invalid Flight ID");
                        break;
                    }

                    Flight CurrentFlight = null;

                    for(Flight f : flights){

                        if(f.flightID == fid){

                            CurrentFlight = f;

                            f.flightSummary();
                            break;
                        }
                    }
                    System.out.println("Enter the number of tickets");

                    int t = sc.nextInt();

                    if(t > CurrentFlight.tickets){

                        System.out.println("Not enough tickets");
                        break;
                    }

                    book(CurrentFlight , t , passengerID);

                    passengerID = passengerID + 1;
                    break;
                }

                case 2:{

                    System.out.println("Enter flight ID with passenger id to cancel the ticket booking");

                    int fid = sc.nextInt();

                }

            }
        }
    }

}