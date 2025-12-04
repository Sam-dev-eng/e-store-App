package eStoreApplication.data.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("E-STORE")

public class Receipt {
    @Id
    String id;
    String payerName;
    String payerNumber;
    String payerEmail;
    String amountPaid;
    String paymentDate;
    boolean hasPaid;
    String proofOfPayment;

    public Receipt(String payerName, String payerNumber, String payerEmail, String amountPaid) {
        this.payerName = payerName;
        this.payerNumber = payerNumber;
        this.amountPaid = amountPaid;
        this.payerEmail = payerEmail;
    }


}
