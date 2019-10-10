import Output.Messages;
import calculator.GrossIncomeCalculator;
import calculator.IncomeTaxCalculator;
import calculator.NetIncomeCalculator;
import calculator.SuperannuationCalculator;
import interfaces.ReaderInterface;
import interfaces.WriterInterface;
import tax.TaxBands;

public class PaySlipGenerator {

    private ReaderInterface reader;
    private WriterInterface writer;

    private Messages messages = new Messages();
    private GrossIncomeCalculator grossIncome = new GrossIncomeCalculator();
    private IncomeTaxCalculator incomeTax = new IncomeTaxCalculator(new TaxBands());
    private NetIncomeCalculator netIncome = new NetIncomeCalculator();
    private SuperannuationCalculator superR = new SuperannuationCalculator();

    EmployeeDetails employee;


    public PaySlipGenerator(ReaderInterface reader, WriterInterface writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public void getEmployeeDetails(){
        String name = reader.read(messages.requestName());
        String surname = reader.read(messages.requestSurname());
        double salary = Double.parseDouble(reader.read(messages.requestSalary()));
        float superRate = Float.parseFloat(reader.read(messages.requestSuperRate()));
        String startDate = reader.read(messages.requestPaymentStartDate());
        String endDate = reader.read(messages.requestPaymentEndDate());
        writer.write(messages.payslipGeneratedMessage());
        employee = new EmployeeDetails(name, surname, salary, superRate, startDate, endDate);
    }


    public void createPayslip(){
        writer.write("Name: " + employee.getName() + " " + employee.getSurname());
        writer.write("Pay Period: " + employee.getPayStartDate() + " - " + employee.getPayEndDate());
        writer.write("Gross Income: " + grossIncome.getGrossIncome(employee.getAnnualSalary()));
        writer.write("Income Tax: " + incomeTax.getIncomeTax(employee.getAnnualSalary()));
        writer.write("Net Income: " + netIncome.getNetIncome(grossIncome.getGrossIncome(employee.getAnnualSalary()),
                incomeTax.getIncomeTax(employee.getAnnualSalary())));
        writer.write("Super: " + superR.getSuperannuation(grossIncome.getGrossIncome(employee.getAnnualSalary()),
                employee.getSuperRate()) +
                "\n");

    }


    public void runPaySlip(){
        writer.write(messages.welcomeMessage());

        getEmployeeDetails();
        createPayslip();

        writer.write(messages.thankyouMessage());

    }
}


