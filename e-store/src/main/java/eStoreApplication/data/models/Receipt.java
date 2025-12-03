package eStoreApplication.data.models;

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
    // naming convention error fixed PaymentDate to paymentDate
    String paymentDate;
    boolean hasPaid;
    String proofOfPayment;

    // Custom constructor for service use
    // public Receipt(String payerName, String payerNumber, String payerEmail, String amountPaid) {
    //     this.payerName = payerName;
    //     this.payerNumber = payerNumber;
    //     this.payerEmail = payerEmail;
    //     this.amountPaid = amountPaid;
    // }
}
