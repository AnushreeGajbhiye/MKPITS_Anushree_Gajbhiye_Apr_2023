package Hospital;

class HospitalMain implements Hospital,HospitalDepartments,Cardiologist,SuperSpecialistInCardiologist{
    @Override
    public void totalNoOfPatients(){
        System.out.println("N number of patients");
    }
    public void departmentHead(){
        System.out.println(" Dr. Jha");
    }
    public void doctorName(){
        System.out.println("Deepak");
    }
    public void cardioDgree(){
        System.out.println("Mbbs");
    }

    public static void main(String[] args) {
        HospitalMain hospitalMain = new HospitalMain();
         hospitalMain.totalNoOfPatients();
         hospitalMain.departmentHead();
         hospitalMain.doctorName();
         hospitalMain.cardioDgree();

    }


}
