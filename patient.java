package FinalProject;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class patient {
    Scanner input = new Scanner(System.in);
    SimpleDateFormat dateformat = new SimpleDateFormat("Y/dd/MM H m");
    
    
     String name;
 int ID;
     static int nbofpatient=1;
     String phonenumber;
    String address;
    LocalDate dateofbirth;
    private int sex;
    private String doctor;
    private String medicalcondition;
    ArrayList <Prescription> prescriptionlist=new ArrayList<Prescription>();
    private LocalDateTime appointment;


////////////////////////////////////// constructers//////////////////////////////////////
    public patient()
    {
    this("no name","no phonenumber","no address",-1,-1,-1,9999,"no doctor","no medicalcondition",0,0,0,0,0,null);
    }
    public patient(String name, String phonenumber,String address, int year,int month,int day, int sex, String doctor,String medicalcondition,int appointmentyear,int appointmentmonth,int appointmentday,int appointmenthour,int appointmentminute ,Prescription p) {
       if(sex!=0 && sex!=1)
       { 
           do{
               System.out.println("Please re enter the sex of the patient: 0 for the female and 1 for the male");
               sex = input.nextInt();
           }while(sex==0 || sex==1);
       }
        if(!(name.equalsIgnoreCase("no name")))
        {
            
        this.name = name;
        this.ID=this.nbofpatient;
        this.nbofpatient++;
        this.phonenumber = phonenumber;
        this.address =address;
        this.dateofbirth = LocalDate.of(year, month, day);
        this.sex = sex;
        this.doctor = doctor;
        this.medicalcondition = medicalcondition;
        this.prescriptionlist.add(p);

        this.appointment=LocalDateTime.of(appointmentyear, appointmentmonth, appointmentday, appointmenthour, appointmentminute);
        }
    }
//////////////////////////////////////end constructers end//////////////////////////////////////

////////////////////////////////////// setters and getters//////////////////////////////////////
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public static int getNbofpatient() {
        return nbofpatient;
    }

    public static void setNbofpatient(int nbofpatient) {
        patient.nbofpatient = nbofpatient;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(LocalDate dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getMedicalcondition() {
        return medicalcondition;
    }

    public void setMedicalcondition(String medicalcondition) {
        this.medicalcondition = medicalcondition;
    }

    public ArrayList<Prescription> getPrescriptionlist() {
        return prescriptionlist;
    }

    public void setPrescriptionlist(ArrayList<Prescription> prescriptionlist) {
        this.prescriptionlist = prescriptionlist;
    }

    public LocalDateTime getAppointment() {
        return appointment;
    }

    public void setAppointment(LocalDateTime appointment) {
        this.appointment = appointment;
    }
//////////////////////////////////////end setters and getters end//////////////////////////////////////

////////////////////////////////////// methods ////////////////////////////////////////////////////////

    @Override
    public String toString() {
        return "patient{ name=" + name + ", ID=" + ID + ", phonenumber=" + phonenumber + ", address=" + address + ", dateofbirth=" + dateofbirth + ", sex=" + sex + ", doctor=" + doctor + ", medicalcondition=" + medicalcondition + ", appointment=" + appointment+
                getPrescriptionlist() + "\t" + '}';
    }




    public ArrayList<String> toStringforPrescription() {
            ArrayList toStringforPrescriptions =new ArrayList();
    for (int i = 0; i <getPrescriptionlist().size(); i++) {
       
       toStringforPrescriptions.add(getPrescriptionlist().get(i).toString());
        }
   return toStringforPrescriptions;
    }

////////////////////////////////////// end methods end ////////////////////////////////////////////////////////
}
//////////////////////////////////////end patient class end////////////////////////////////////////////