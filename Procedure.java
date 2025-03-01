
public class Procedure {
    // Fields
    private String procedureName, procedureDate;
    private String practitionerName;
    private double charges;

    // No-arg constructor
    public Procedure() {}

    // Parametrized constructor for procedure name and date
    public Procedure(String procedureName, String procedureDate) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
    }

    // Parametrized constructor for all attributes
    public Procedure(String procedureName, String procedureDate, String practitionerName, double charges) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = practitionerName;
        this.charges = charges;
    }

    // Accessors (getters)
    public String getProcedureName() { return procedureName; }
    public String getProcedureDate() { return procedureDate; }
    public String getPractitionerName() { return practitionerName; }
    public double getCharges() { return charges; }

    // Mutators (setters)
    public void setProcedureName(String procedureName) { this.procedureName = procedureName; }
    public void setProcedureDate(String procedureDate) { this.procedureDate = procedureDate; }
    public void setPractitionerName(String practitionerName) { this.practitionerName = practitionerName; }
    public void setCharges(double charges) { this.charges = charges; }

    // toString method with indentation
    @Override
    public String toString() {
        return "\tProcedure Name: " + procedureName + "\n" +
               "\tDate: " + procedureDate + "\n" +
               "\tPractitioner: " + practitionerName + "\n" +
               "\tCharges: $" + String.format("%.2f", charges);
    }
}