package com.oss.repository;

import com.google.gson.reflect.TypeToken;
import com.oss.model.User;
import com.oss.utils.FileUrls;
import com.oss.utils.FileWriteRead;
import lombok.Getter;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository implements BaseRepository<User,Long> {
    @Getter
    private static final UserRepository instance = new UserRepository();
    private static final Type userType = new TypeToken<List<User>>() {}.getType();
    private UserRepository() {}

    @Override
    public Boolean save(User user) {
        List<User> users = getUsers();
        users.add(user);
        return Boolean.TRUE;
    }

    @Override
    public Boolean update(User oldUser,Long id) {
        List<User> users = getUsers();
        for (User user : users) {
            if (user.getChatId().equals(oldUser.getChatId())) {
                user.setUserState(oldUser.getUserState());
                break;
            }
        }
        setUsers(users);
        return Boolean.TRUE;
    }

    @Override
    public List<User> findAll() {
        return getUsers();
    }

    @Override
    public Optional findById(Long id) {
        List<User> users = getUsers();
        for (User user : users) {
            if (user.getChatId().equals(id)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
    private static List<User> getUsers() {
        List<User> users = FileWriteRead.readFile(FileUrls.USER_URL, userType);
        return users==null?new ArrayList<>():users;
    }
    private static void setUsers(List<User> users) {
        FileWriteRead.writeFile(FileUrls.USER_URL,users);
    }
}
