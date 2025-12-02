package eStoreApplication.data.repository;
import eStoreApplication.data.models.User;
import org.jspecify.annotations.NonNull;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<@NonNull User,@NonNull String>{
    List<User> findAllByRole(String role);
    Optional<User> findByEmail(String role);
    Optional<User> findByPhoneNumber(String number);
}
