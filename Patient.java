package patient;

class Patient extends Person implements CaseInterface {
    private int medicalCardID;
    private DiagnosisEnum diagnosis;

    Patient(int id, String firstName, String middleName, String lastName, String address,
            String phoneNumber, int medicalCardID, DiagnosisEnum diagnosis) {
        super(id, firstName, middleName, lastName, address, phoneNumber);
        this.medicalCardID = medicalCardID;
        this.diagnosis = diagnosis;
    }

    Patient(int id, String firstName, String middleName, String lastName,
            String address, String phoneNumber) {
        super(id, firstName, middleName, lastName, address, phoneNumber);
    }
    
    public void setMedicalCardID(int medID) {
        medicalCardID = medID;
    }
    
    public int getMedicalCardID() {
        return medicalCardID;
    }
    
    public void setDiagnosis(DiagnosisEnum dgns) {
        diagnosis = dgns;
    }
    
    public DiagnosisEnum getDiagnosis() {
        return diagnosis;
    }

    @Override
    public String toString() {
        String str = "\n id: " + this.getId() + "\n name: " + this.getName() + "\n address: " +
                this.getAddr() + "\n phoneNo: " + this.getPhoneNumber() +
                "\n medical card id: " + getMedicalCardID() + "\n diagnosis: " + getDiagnosis() + "\n";
        return str;
    }
    
}