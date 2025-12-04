package eStoreApplication.services.auth;
import eStoreApplication.data.models.User;
import eStoreApplication.data.repository.UserRepository;
import eStoreApplication.dtos.requests.RegisterCustomerRequest;
import eStoreApplication.exceptions.IncorrectPasswordException;
import eStoreApplication.exceptions.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthServicesImpl implements AuthServices{
    @Autowired
    UserRepository userRepository;


    @Override
    public String login(String email, String password) {
        Optional<User> user = userRepository.findByEmail(email);
        if(user.isEmpty()) throw new UserNotFoundException("Incorrect credentials");
        if(!user.get().getPassword().equals(password)) throw new IncorrectPasswordException("incorrect Email or Password");
        return user.get().toString();
    }

    @Override
    public String register(RegisterCustomerRequest request) {
        User user = new User();
        user.setRole("CUSTOMER");
        user.setName(request.getName());
        user.setPhoneNumber(request.getPhoneNumber());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        User saved = userRepository.save(user);
        return saved.toString();
    }
}
