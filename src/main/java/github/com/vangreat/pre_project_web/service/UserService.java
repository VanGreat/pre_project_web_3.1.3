package github.com.vangreat.pre_project_web.service;

import github.com.vangreat.pre_project_web.model.Role;
import github.com.vangreat.pre_project_web.model.User;

import java.util.List;

public interface UserService {
    void createUser(String firstName, String lastName, Byte age, String email, String password, String role);

    void editUser(Long id, String firstName, String lastName, Byte age, String email, String password, String role);

    void deleteUser(Long id);

    User getUser(Long id);

    List<User> getAllUsers();

    User getUserByEmail(String email);

    Role getRoleByName(String name);
}
