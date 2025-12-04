package eStoreApplication.data.repository;

import lombok.NonNull;
import eStoreApplication.data.models.Receipt;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ReceiptRepository extends MongoRepository<@NonNull Receipt,@NonNull String> {
    List<Receipt> findAllByPayerName(String payerName);
    List<Receipt> findAllByPayerNumber(String number);
    List<Receipt> findAllByPayerEmail(String email);

}
