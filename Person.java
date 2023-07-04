package patient;

// Interface for the class Person.
interface HumanInterface {

    // Sets identification number.
    public void setId(int identification);
    // Gets identification number.
    public int getId();

    // Sets name.
    public void setName(String name);
    // Gets name.
    public String getName();

    // Sets address.
    public void setAddr(String addr);
    // Gets address.
    public String getAddr();

    // Sets phone number.
    public void setPhoneNumber(String phoneNum);
    // Gets phone number.
    public String getPhoneNumber();

    // Represents the class Person.
    public String toString();
}

// Interface for the class Patient.
interface CaseInterface extends HumanInterface {
    // Sets medical card ID.
    public void setMedicalCardID(int medID);
    // Gets medical card ID.
    public int getMedicalCardID();

    // Sets diagnosis.
    public void setDiagnosis(DiagnosisEnum dgns);
    // Gets diagnosis.
    public DiagnosisEnum getDiagnosis();
}

class Person implements HumanInterface {
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String phoneNumber;

    Person(int id, String firstName, String middleName, String lastName, String address, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        System.out.println("New person was created.");
    }

    Person() {
        System.out.println("Empty object was created.");
    }

    Person(int id, String firstName, String middleName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;

        System.out.println("Some data is missing.");
    }

    public void setId(int identification) {
        id = identification;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        String[] arr = name.split(" ");
        if (arr.length == 1)
            firstName = arr[0];

        if (arr.length == 2)
            middleName = arr[1];

        if (arr.length == 3)
            lastName = arr[2];
    }

    public String getName() {
        return firstName + " " + middleName + " " + lastName;
    }

    public void setAddr(String addr) {
        address = addr;
    }

    public String getAddr() {
        return address;
    }

    public void setPhoneNumber(String phoneNum) {
        phoneNumber = phoneNum;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        String str = "id: " + this.getId() + " name: " + this.getName() + " address: " +
                this.getAddr() + " phoneNo: " + this.getPhoneNumber();
        
        return str;
    }
}