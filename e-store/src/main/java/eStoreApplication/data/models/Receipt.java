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
    String PaymentDate;
    boolean hasPaid;
    String proofOfPayment;

}
