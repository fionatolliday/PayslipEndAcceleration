import Output.Messages;
import interfaces.ReaderInterface;
import interfaces.WriterInterface;

public class PaySlipGenerator {

    private ReaderInterface reader;
    private WriterInterface writer;
    private EmployeeDetails employee;

    private Messages messages = new Messages();

    public PaySlipGenerator(ReaderInterface reader, WriterInterface writer) {
        this.reader = reader;
        this.writer = writer;
    }


    public void runPaySlip(){
        writer.write(messages.welcomeMessage());

        String name = reader.read(messages.requestName());
        String surname = reader.read(messages.requestSurname());
        Double salary = Double.parseDouble(reader.read(messages.requestSalary()));
        Float superRate = Float.parseFloat(reader.read(messages.requestSuperRate()));
        String startDate = reader.read(messages.requestPaymentStartDate());
        String endDate = reader.read(messages.requestPaymentEndDate());
        writer.write(messages.payslipGeneratedMessage());

        writer.write("Name: " + name + surname);
        writer.write("Gross Income: " );
        writer.write("Income Tax: " );
        writer.write("Net Income: " );
        writer.write("Super: " + "\n");

        writer.write(messages.thankyouMessage());

        employee = new EmployeeDetails(name,surname, salary, superRate, startDate, endDate);

    }
}


