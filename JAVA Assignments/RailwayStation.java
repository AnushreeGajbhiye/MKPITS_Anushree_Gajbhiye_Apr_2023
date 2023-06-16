class RailwayStation{
int railwayStationName;
int railwayStationId;
String section;
}
class Department extends RailwayStation{
String departmentName;
String departmentId;
double noOfEmployee;
}
class DepartmentHead extends Department{
String departmentHeadName;
String departmentHeadUniform;
String departmentHeadId;
}
class Locopiolate extends  DepartmentHead {
String locopiolateName;
String locopiolateAddress;
double locopiolateSalary;
} 
class Tc extends Locopiolate {
String TcName;
String TcWorkingShift ;
double locopiolateSalary;
}
class Passengers{
String passengerGender;
String passengerAddharCard;
String passengerSeatNo;
}
