import java.util.*;

public class TicketBooker{

    static int availableLowerBerth = 1;
    static int availableUpperBerth = 1;
    static int availableMiddleBerth = 1;
    static int availableRacTickets = 1;
    static int availableWaitingList = 1;

    static Queue<Integer> waitingList = new LinkedList<>();
    static Queue<Integer> racList = new LinkedList<>();
    static List<Integer> bookedTicketList = new ArrayList<>();

    static List<Integer> lowerBerthPositions = new ArrayList<>(Arrays.asList(1));
    static List<Integer> middleBerthPositions = new ArrayList<>(Arrays.asList(1));
    static List<Integer> upperBerthPositions = new ArrayList<>(Arrays.asList(1));

    static List<Integer> racPositions = new ArrayList<>(Arrays.asList(1));
    static List<Integer> waitingListPositions = new ArrayList<>(Arrays.asList(1));

    static Map<Integer, Passenger > passengers  = new HashMap<>();
    
    //book ticket
    public void bookTicket(Passenger p , Passenger berthInfo , String allotedBerth){

        p.number = berthInfo;
        p.alloted = allotedBerth;

        passengers.put(p.passengerId,p);

        bookedTicketList.add(p.passengerId);

        System.out.println("--------------------------Booked Successfully");
        
    }

    public void addToRAC(Passenger p , int racInfo ,String allotedRAC){

        p.number = racInfo;
        p.alloted = allotedRAC;
        passengers.put(p.passengerId,p);

        racList.add(p.passengerId);

        availableRacTickets--;

        racPositions.remove(0);

        System.out.println("-----------------------added to RAC Successfully");
    }

    public void addToWaitingList(Passenger p , int waitingListInfo  , String allotedWL){
        p.number = waitingListInfo;
        p.alloted = allotedWL;

        passengers.put(p.passengerId,p);

        waitingList.add(p.passengerId);

        availableWaitingList--;

        waitingListPositions.remove(0);

        System.out.println("---------------------added to waiting list successfully");
    }
    //cancel ticket

    public void cancelTicket(int passengerId){

        Passenger p = passengers.get(passengerId);

        passengers.remove(passengerId);

        bookedTicketList.remove(passengerId);

        int posionBooked = p.number;

        System.out.println("------------cancelled successfully");

        if(p.alloted.equals("L")){

            availableLowerBerth++;
            lowerBerthPositions.add(posionBooked);

        }
        else if(p.alloted.equals("M")){
            availableMiddleBerth++;
            middleBerthPositions.add(posionBooked);
        }
        else if(p.alloted.equals("U")){
            availableUpperBerth++;
            upperBerthPositions.add(posionBooked);
        }

        if(racList.size() > 0){

            Passenger passengerFromRAC = passengers.get(racList.poll());
            int positionRac = passengerFromRAC.number;
            racPositions.add(positionRac);
            racList.remove(passengerFromRAC.passengerId);
            availableRacTickets++;

            if(waitingList.size() > 0){

                Passenger passengerFromWaitingList = passengers.get(waitingList.poll());
                waitingListPositions.add(positionWL);
                waitingList.remove(passengerFromWaitingList.passengerId);

                passengerFromWaitingList.number = racPositions.get(0);
                passengerFromWaitingList.alloted = "RAC";
                racPositions.remove(0);
                racList.add(passengerFromWaitingList.passengerId);

                availableWaitingList++;
                availableRacTickets--;
            }
            Main.bookTicket(passengerFromRAC);
        }
    }
    //print available

    public void printAvailable(){

        System.out.println("Available lower berth " + availableLowerBerth );
        System.out.println("Available Middle berth " + availableMiddleBerth );
        System.out.println("Available Upper Berth " + availableUpperBerth );
        System.out.println("Available Rac positions " + availableRacTickets );
        System.out.println("Available Waiting Lists " + availableWaitingList );
        System.out.println("-----------------------------------------" );
    }

    public void printPassengers(){

        if(passengers.size() == 0){
            System.out.println("No details of passengers available");
            return;
        }
        for(Passenger p : passengers.values()){

            System.out.println("PASSENGER ID" + passengerId);
            System.out.println("Name " + p.name);
            System.out.println("Age " + p.age);
            System.out.println("Status " + p.number + p.alloted);
            System.out.println("--------------------------");
        }
    }
}