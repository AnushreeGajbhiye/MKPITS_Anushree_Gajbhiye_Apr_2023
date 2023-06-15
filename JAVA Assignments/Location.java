class Location{
int pinCode;
String state;
String city;
}
class Garden{
double area;
List<location> location;
List<Swings> swings;
}
class Employes extends Garden{
String name;
double id;
String employeUniform;
}
class TicketCounter extends Employes{
double rateOfTicket;
String ticketCounterName;
double ticketCounterId;
}
class WatchName extends TicketCounter{
String watchManId;
String watchManName;
double watchManShift;
}
class GardenCleaner extends WatchMan{
double gardenCleanerId;
int gardenCleanerName;
String gardenCleanerGender;
}
class GardenVisitor{
String name;
String NoOfFamilyMembers;
String gender;
}