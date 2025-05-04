package FinalProject;

public class NewMain {

    public static void main(String[] args) {
Clinic c1 = new Clinic("B clinic", 3);
Clinic c2 = new Clinic("A clinic", 10);
patient p1 = new patient("Ali Kheireddine", "70739793", "Lebanon-Chiah", 1990,3,4,1, "Doctor AJM", "mared",1111,1,1,1,1,new Prescription(1, 1, "2032",  "Insulin", "Rapid Acting", "2 to 4 hour",  "Ali Kheireddine "));
patient p2 = new patient("Ahmad", "123123", "Lebanon-Hart", 1990,3,4,1, "Doctor AJM", "mared",1112,1,1,1,1,new Prescription(1, 1, "2032",  "Ly", "Rapid Acting", "2 to 4 hour",  "Ahmad"));
patient p3 = new patient("yusef", "123321321", "manta2a", 2002, 10, 3, 1, "yasser", "mared",1111,2,10,1,1, new Prescription(3, 4, "2022", "advil", "Rapid", "2", "yusef"));
patient p4 = new patient("Nour", "18032", "byroth", 2003, 12, 03, 0, "Yasser", "mared",1111,1,9,9,9,  new Prescription(3, 4, "2022", "advil", "Rapid", "2", "Nour"));
    
  
    }
}