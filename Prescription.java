package FinalProject;

////////////////////////////////////// Presciption class ////////////////////////////////////////////

import java.util.HashMap;


    public class Prescription {
    private int ID;
    private int patientID;
    private String Date;
    private String drugName;
    private String drugType;
    private String drugDuration;
    private String drugAdvice;
    private static HashMap<Integer, String>  Presciption_by_id= new HashMap<Integer, String>();    
////////////////////////////////////// setters and getters ////////////////////////////////////////////

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getDrugType() {
        return drugType;
    }

    public void setDrugType(String drugType) {
        this.drugType = drugType;
    }

    public String getDrugDuration() {
        return drugDuration;
    }

    public void setDrugDuration(String drugDuration) {
        this.drugDuration = drugDuration;
    }

    public String getDrugAdvice() {
        return drugAdvice;
    }

    public void setDrugAdvice(String drugAdvice) {
        this.drugAdvice = drugAdvice;
    }
////////////////////////////////////// end setters and getters end //////////////////////////////////////

////////////////////////////////////// constructers////////////////////////////////////////////////////////
   
    public Prescription() {
        this(-1,-1,"no date","no drugName","no drugType","drugDuration","drugAdvice");
    }
  
    public Prescription(int ID, int patientID, String Date, String drugName, String drugType, String drugDuration, String drugAdvice) {
        this.ID = ID;
        this.patientID =patientID;
        this.Date = Date;
        this.drugName = drugName;
        this.drugType = drugType;
        this.drugDuration = drugDuration;
        this.drugAdvice = drugAdvice;
        Presciption_by_id.put(ID, this.toString());
    }
//////////////////////////////////////end constructers end//////////////////////////////////////

////////////////////////////////////// methods //////////////////////////////////////////////////

        @Override
        public String toString() {
            return "Presciption{" + "ID=" + ID + ", patientID=" + patientID + ", Date=" + Date + ", drugName=" + drugName + ", drugType=" + drugType + ", drugDuration=" + drugDuration + ", drugAdvice=" + drugAdvice + '}';
        }

    
    public static String showPrescription(int ID) {
        return Presciption_by_id.get(ID);
    }
////////////////////////////////////// end methods end //////////////////////////////////////////////////
    }
//////////////////////////////////////end Presciption class end////////////////////////////////////////////