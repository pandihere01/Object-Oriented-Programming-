import java.util.*;

public class Flight{

    static int id = 0;
    int flightID;

    int tickets;
    int price;

    ArrayList<String> passengerDetails;

    ArrayList<Integer> passengerIDs;

    ArrayList<Integer> bookedTicketsPerPessenger;

    ArrayList<Integer> passengerCost;

    public Flight(){

        tickets = 50;
        price = 5000;
        id = id +1 ;
        flightID = id;

        passengerDetails = new ArrayList<String>();
        passengerIDs = new ArrayList<String>();
        bookedTicketsPerPessenger = new ArrayList<String>();
        passengerCost = new ArrayList<String>();
    }
    public void addPassengerDetails(String passengerDetail , int numberOfTickets , int passengerID){

        passengerDetails.add(passengerDetail);
        passengerIDs.add(passengerID);
        passengerCost.add(price * numberOfTickets);

        price += 200 * numberOfTickets;

        tickets = numberOfTickets;
        bookedTicketsPerPessenger.add(numberOfTickets);
        System.out.println("Booked Successfully");
    }

    public void cancelTicket(int passengerID){

        int indexToRemove = passengerIDs.indexOf(passengerID);

        if(indexToRemove < 0){

            System.out.println("Passenger ID not found!!");
            return;
        }

        int ticketsToCancel = bookedTicketsPerPessenger.get(indexToRemove);

        tickets += ticketsToCancel;

        price -= 200 * ticketsToCancel;

        System.out.println("Refund Amount after cancelation : " + passengerCost.get(indexToRemove));

        bookedTicketsPerPessenger.remove(indexToRemove);
        passengerIDs.remove(Integer.valueOf(passengerID));
        passengerDetails.remove(indexToRemove);
        passengerCost.remove(indexToRemove);

        System.out.println("Cancelled Booked Tickets Successfully!!");
    }

    public void flightSummary(){

        System.out.println("Flight ID " + flightID + " --" + "Remaining Tickets " + tickets + " --" + "Current Ticket Price " + price);
    }

    public void printDetails(){

        System.out.println("Flight ID " + flightID + "-->");

        for(String detail : passengerDetails){

            System.out.println(detail);
        }
    }
}