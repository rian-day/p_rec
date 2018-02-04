package com.goi.service.Impl;

import com.goi.repository.UserRepository;
import com.goi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public int checkUser(String userName, String password) {
        return 0;
    }
}
