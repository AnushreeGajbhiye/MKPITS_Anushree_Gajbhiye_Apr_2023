 class Hospital{
 double area;
 List<Rooms> rooms;
 List<Floors> floors;
  }
 class Doctor extends Hospital{
  List<Doctors> doctors;
  double doctorId;
  String name;
  String age;
  String specialist;
    }
  class patient extends Doctor{
  String diseaseType;
  String diseaseLevel; 
  }
 class Payment{
 String totalBill;
 String stayingDays;
 String paymentMode;
   }

