package FinalProject;

////////////////////////////////////// Clinic class ////////////////////////////////////////////
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
public class Clinic implements Comparator{
private String name;
private int maximum_number_of_patients;
public  ArrayList<patient> Patient_Array= new ArrayList<patient>();
public static ArrayList<patient> Patient_Array_by_cond = new ArrayList<patient>();
public HashMap<String, patient> patienthashmap = new HashMap<String, patient>();
public Clinic()
    {
       this.name="no name";
       this.maximum_number_of_patients=-1;
      
    }
       

public Clinic(String name, int maximum_number_of_patients)
    {
     this.name = name;
     this.maximum_number_of_patients = maximum_number_of_patients; 
    }

public String getClinicName()
{
    return name;
}

public void add_patient(patient p)
{
    
    if(Patient_Array.size()<maximum_number_of_patients)
    {
    if(Patient_Array.contains(p))
    {
        System.out.println("Patient already exists!");
    }
    else
    {
        Patient_Array.add(p);
        patienthashmap.put(p.name, p);
    }
    }
    else System.out.println("Clinic full! You cant add this patient");
    
}
public void remove_patient(patient p)
{
    if((Patient_Array.contains(p)))
    Patient_Array.remove(p);
    else System.out.println("Patient not found !");
}
public void move_patient(patient p, Clinic c)
{
   c.Patient_Array.add(p); 
   this.Patient_Array.remove(p); 
}
public String get_list_of_patients()
{
    Patient_Array.sort(this);
   return Patient_Array.toString();
}
public String  get_list_of_patients_by_medical_condition(String s)
{
    for (int i = 0; i <Patient_Array.size(); i++) {
        if(Patient_Array.get(i).getMedicalcondition().equalsIgnoreCase(s))
        {
            Patient_Array_by_cond.add(Patient_Array.get(i));
        }
    }
    return Patient_Array_by_cond.toString();
}
public String get_patient_history(patient p)
{
   return p.toString();
}

    @Override
    public int compare(Object o1, Object o2) {
        if ((o1 instanceof patient) && (o2 instanceof patient))
        {
            if((((patient) o1).getAppointment()).isBefore((((patient) o2).getAppointment())))
                return -1;
            else if((((patient) o1).getAppointment()).isAfter((((patient) o2).getAppointment())))
                return +1;
            else return 0;
                }
        System.out.println("Error in comparing");
        return 0;
    }

 
        
    


}