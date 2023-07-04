package patient;

interface HumanInterface {
    public void setId(int identification);
    public int getId();

    public void setName(String name);
    public String getName();

    public void setAddr(String addr);
    public String getAddr();

    public void setPhoneNumber(String phoneNum);
    public String getPhoneNumber();

    public String toString();
}

interface CaseInterface extends HumanInterface {
    public void setMedicalCardID(int medID);
    public int getMedicalCardID();

    public void setDiagnosis(DiagnosisEnum dgns);
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

    public String toString() {
        String str = "id: " + this.getId() + " name: " + this.getName() + " address: " +
                this.getAddr() + " phoneNo: " + this.getPhoneNumber();
        
        return str;
    }
}