package com.vishwajeet.redisapp.service;

import com.vishwajeet.redisapp.entity.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Cacheable(value = "users", key = "#id")
    public User getUserById(String id) {
        simulateSlowDatabaseCall();
        return new User(id, "User "+id);
    }

    private void simulateSlowDatabaseCall() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();;
        }
    }
}
