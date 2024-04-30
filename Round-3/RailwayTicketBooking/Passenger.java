// passenger detail class

import java.util.*;

public class Passenger{

    static int id;
    String name;
    int age;
    String berthPreference; //U or M or L
    int passengerId; 
    String alloted; //alloted type [U , M , L , RAC , WAIT LIST]
    int number; //seat number

    public Passenger(String name , int age  , String berthPreference){
        this.name = name;
        this.age = age;
        this.berthPreference = berthPreference;
        this.passengerId = id++;
        alloted = "";
        number = -1;
    }
}