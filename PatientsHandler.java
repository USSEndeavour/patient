package patient;

interface PatientsHandlerInterface {

    public void getSameDiagnosisPatients(DiagnosisEnum dgns);

    public void getMedicalCardIdRangePatients(int medIDStartRange, int medIDStopRange);

}

class PatientsHandler implements PatientsHandlerInterface {
    Patient[] patients;
    PatientsHandler(Patient[] patients) {
        this.patients = patients;
    }

    public void getSameDiagnosisPatients(DiagnosisEnum dgns) {
        for (Patient pt: patients) {
            if (pt.getDiagnosis() == dgns)
                System.out.println(pt.toString());
        }
    }

    public void getMedicalCardIdRangePatients(int medIDStartRange, int medIDStopRange) {
        for (Patient pt: patients) {
            if (pt.getMedicalCardID() > medIDStartRange && pt.getMedicalCardID() < medIDStopRange)
                System.out.println(pt.toString());
        }
    }
}