package spring.userservice;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class LoginService {

    private static List<User> usersList = new LinkedList<>();

    static {
//        generalgrievous
        usersList.add(new User("user", "$2a$12$CNHewPcMo.pDP0ZMZ.jpnOsaDjQzNmCaGWjxEhn2DRTrwIjgb90sK"));
    }

    public UserDetails findUser(final String login) {
        User myUser = null;
        for (User user : usersList) {
            if (user.getUsername().equals(login)) myUser = user;
        }
        if (myUser == null) {
            throw new UsernameNotFoundException("user not found");
        }
        return new MyLogin(myUser);
    }

}
