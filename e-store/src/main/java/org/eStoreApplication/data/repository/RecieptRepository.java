package org.eStoreApplication.data.repository;

import lombok.NonNull;
import org.eStoreApplication.data.models.Receipt;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RecieptRepository extends MongoRepository<@NonNull Receipt,@NonNull String> {
    List<Receipt> findAllByPayerName(String payerName);
    List<Receipt> findAllByPayerNumber(String number);
    List<Receipt> findAllByPayerEmail(String email);

}
