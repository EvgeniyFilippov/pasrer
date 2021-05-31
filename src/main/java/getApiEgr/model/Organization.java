package getApiEgr.model;

public class Organization {
    private String unp;
    private String fullName;
    private String shortName;
    private String address;
    private String dateOfRegistration;
    private String сodeOfTax;
    private String nameOfTax;
    private String state;
    private String dateOfChange;
    private String reasonOfChange;

    public String getUnp() {
        return unp;
    }

    public void setUnp(String unp) {
        this.unp = unp;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(String dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public String getСodeOfTax() {
        return сodeOfTax;
    }

    public void setСodeOfTax(String сodeOfTax) {
        this.сodeOfTax = сodeOfTax;
    }

    public String getNameOfTax() {
        return nameOfTax;
    }

    public void setNameOfTax(String nameOfTax) {
        this.nameOfTax = nameOfTax;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDateOfChange() {
        return dateOfChange;
    }

    public void setDateOfChange(String dateOfChange) {
        this.dateOfChange = dateOfChange;
    }

    public String getReasonOfChange() {
        return reasonOfChange;
    }

    public void setReasonOfChange(String reasonOfChange) {
        this.reasonOfChange = reasonOfChange;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "unp='" + unp + '\'' +
                ", fullName='" + fullName + '\'' +
                ", shortName='" + shortName + '\'' +
                ", address='" + address + '\'' +
                ", dateOfRegistration='" + dateOfRegistration + '\'' +
                ", сodeOfTax='" + сodeOfTax + '\'' +
                ", nameOfTax='" + nameOfTax + '\'' +
                ", state='" + state + '\'' +
                ", dateOfChange='" + dateOfChange + '\'' +
                ", reasonOfChange='" + reasonOfChange + '\'' +
                '}';
    }
}
