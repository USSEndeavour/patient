package patient;

import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        Patient p1 = new Patient(1, "Andrii", "Petrovych", "Petrenko", "1 Str, City1, Country1", "+234523455234", 6, DiagnosisEnum.FLU);
        Patient p2 = new Patient(2, "Ivan", "Ivanovych", "Ivanenko", "4 Str, City9, Country19", "+32452349879", 2, DiagnosisEnum.APPENDICITIS);
        Patient p3 = new Patient(3, "Petro", "Petrovych", "Andriyenko", "43 Str, City27, Country11", "+8768688768903", 4, DiagnosisEnum.OTITIS);
        Patient p4 = new Patient(4, "Vasyl", "Mykolayovych", "Zolotarenko", "56 Str, City42, Country17", "+098329343842", 9, DiagnosisEnum.SINUSITIS);
        Patient p5 = new Patient(5, "Mykola", "Petrovych", "Klymenko", "70 Str, City9, Country6", "+592754234822", 12, DiagnosisEnum.FLU);
        Patient p6 = new Patient(6, "Nazarii", "Romanovych", "Goncharuk", "23 Str, City3, Country85", "+83748378432", 7, DiagnosisEnum.ANGINA);
        Patient p7 = new Patient(7, "Ivan", "Nazarovych", "Bratchuk", "2 Str, City2, Country13", "+4852948592234", 5, DiagnosisEnum.ALLERGY);
        Patient p8 = new Patient(8, "Andrii", "Petrovych", "Vasylenko", "123 Str, City21, Country112", "+234523455234", 0, DiagnosisEnum.FLU);
        Patient p9 = new Patient(9, "Vasyl", "Andriiyovych", "Abramenko", "56 Str, City29, Country451", "+240520942409", 32, DiagnosisEnum.ANGINA);
        Patient p10 = new Patient(10, "Roman", "Nazarovych", "Stetseenko", "13 Str, City125, Country341", "+923582458839", 26, DiagnosisEnum.OTITIS);
        Patient p11 = new Patient(11, "Andrii", "Vasyliovych", "Otamanenko", "341 Str, City17, Country311", "+2358245983820", 10, DiagnosisEnum.HEALTHY);
        Patient p12 = new Patient(12, "Mykola", "Romanovych", "Kozachenko", "731 Str, City124, Country194", "+9275027495729", 19, DiagnosisEnum.APPENDICITIS);
        Patient p13 = new Patient(13, "Antoniy", "Petrovych", "Sternenko", "873 Str, City61, Country241", "+288265923629430", 27, DiagnosisEnum.ALLERGY);
        Patient p14 = new Patient(14, "Volodymyr", "Petrovych", "Goncharenko", "535 Str, City125, Country71", "+92857239549293", 20, DiagnosisEnum.ANGINA);
        Patient p15 = new Patient(15, "Nazarii", "Volodymyrovych", "Ostapchuk", "134 Str, City241, Country201", "+2852748592345", 16, DiagnosisEnum.HEALTHY);

        Patient[] pats = {p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15};

        System.out.println("\n\n --- All patients in the hospital --- : \n");
        for (Patient pt: pats)
            System.out.println(" -- " + pt.toString() + "\n");

        PatientsHandler ph = new PatientsHandler(pats);

        System.out.println("\n --- Patients with same diagnosis --- : \n");
        ph.getSameDiagnosisPatients(DiagnosisEnum.FLU);
        System.out.println("\n --- Patients with medcardID within a given range --- : \n");
        ph.getMedicalCardIdRangePatients(5, 20);
    }
}