import Input.ConsoleReader;
import Output.ConsoleWriter;

public class Main {

    public static void main(String[] args) {

	PaySlipGenerator employeePaySlip = new PaySlipGenerator(new ConsoleReader(),
        new ConsoleWriter());

	employeePaySlip.runPaySlip();

    }
}
