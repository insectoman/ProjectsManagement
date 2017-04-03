package com.project.java.prz.service;

import com.project.java.prz.domain.User;
import com.project.java.prz.dto.UserDTO;
import com.project.java.prz.mapper.UserMapper;
import com.project.java.prz.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;

/**
 * Created by Piotr on 03.04.2017.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO getOne(Integer id) {
        User user = userRepository.findOne(id);
        return UserMapper.INSTANCE.convertToDto(user);
    }

    @Override
    public List<UserDTO> getAll() {
        return Collections.emptyList();
    }

}