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
        reader.read(messages.requestName());
        reader.read(messages.requestSurname());
        reader.read(messages.requestSalary());
        reader.read(messages.requestSuperRate());
        reader.read(messages.requestPaymentStartDate());
        reader.read(messages.requestPaymentEndDate());
        writer.write(messages.payslipGeneratedMessage());
    }
}
