public class EmployeeDetails {

    private String name;
    private String surname;
    private double annualSalary;
    private float superRate;
    private String payStartDate;
    private String payEndDate;


    public EmployeeDetails (String name, String surname, double annualSalary, float superRate,
                            String payStartDate, String payEndDate){
        this.name = name;
        this.surname = surname;
        this.annualSalary = annualSalary;
        this.superRate = superRate;
        this.payStartDate = payStartDate;
        this.payEndDate = payEndDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public void setSuperRate(float superRate) {
        this.superRate = superRate;
    }

    public void setPayStartDate(String payStartDate) {
        this.payStartDate = payStartDate;
    }

    public void setPayEndDate(String payEndDate) {
        this.payEndDate = payEndDate;
    }



    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public float getSuperRate() {
        return superRate;
    }

    public String getPayStartDate() {
        return payStartDate;
    }

    public String getPayEndDate() {
        return payEndDate;
    }
}
