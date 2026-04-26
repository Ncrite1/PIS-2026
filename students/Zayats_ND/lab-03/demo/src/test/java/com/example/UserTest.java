package com.example;

import com.model.User;
import com.value_objects.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    void createUser() {
        User u = new User(1L, new Email("a@a.com"), new UserName("John"));

        assertNotNull(u);
        assertFalse(u.getEvents().isEmpty());
    }
}