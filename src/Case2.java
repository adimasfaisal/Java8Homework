import java.util.Comparator;
import java.util.stream.Collectors;

public class Case2 {
    public static void main(String[] args) {
        List<Invoice> invoices = new ArrayList<>();
        List<Invoice> oracleAndTrainingInvoices = invoices.stream()
                        .filter(invoice -> invoice.contains("Training")).sorted(Comparator.comparingInt(Invoice::getAmount)).collect(Collectors.toList());

        List<Integer> ids = new ArrayList<>();
        List<Integer> firstFiveIds = new ArrayList<>();

        ids = Invoice.stream().map(Invoice::getId).collect(Collectors.toList());
        firstFiveIds = Invoice.stream().map(Invoice::getId).limit(5).collect(Collectors.toList());
}
