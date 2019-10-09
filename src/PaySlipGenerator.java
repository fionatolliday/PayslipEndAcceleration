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
    private EmployeeDetails employee;

    private Messages messages = new Messages();
    private GrossIncomeCalculator grossIncome = new GrossIncomeCalculator();
    private IncomeTaxCalculator incomeTax = new IncomeTaxCalculator(new TaxBands());
    private NetIncomeCalculator netIncome = new NetIncomeCalculator();
    private SuperannuationCalculator superR = new SuperannuationCalculator();

    public PaySlipGenerator(ReaderInterface reader, WriterInterface writer) {
        this.reader = reader;
        this.writer = writer;
    }


    public void runPaySlip(){
        writer.write(messages.welcomeMessage());

        String name = reader.read(messages.requestName());
        String surname = reader.read(messages.requestSurname());
        double salary = Double.parseDouble(reader.read(messages.requestSalary()));
        float superRate = Float.parseFloat(reader.read(messages.requestSuperRate()));
        String startDate = reader.read(messages.requestPaymentStartDate());
        String endDate = reader.read(messages.requestPaymentEndDate());
        writer.write(messages.payslipGeneratedMessage());

        writer.write("Name: " + name + " " + surname);
        writer.write("Pay Period: " + startDate + " - " + endDate);
        writer.write("Gross Income: " + grossIncome.getGrossIncome(salary));
        writer.write("Income Tax: " + incomeTax.getIncomeTax(salary));
        writer.write("Net Income: " + netIncome.getNetIncome(grossIncome.getGrossIncome(salary),
                incomeTax.getIncomeTax(salary)));
        writer.write("Super: " + superR.getSuperannuation(grossIncome.getGrossIncome(salary),
                superRate) +
                "\n");

        writer.write(messages.thankyouMessage());

        employee = new EmployeeDetails(name,surname, salary, superRate, startDate, endDate);

    }
}


