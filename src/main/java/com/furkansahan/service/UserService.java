package com.furkansahan.service;

import com.furkansahan.dto.UserLocationDTO;
import com.furkansahan.model.User;
import com.furkansahan.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserLocationDTO> getAllUsersLocation(){
        return userRepository.findAll()
                .stream()
                .map(this::convertEntityDto)
                .collect(Collectors.toList());

    }
    private UserLocationDTO convertEntityDto(User user) {
        UserLocationDTO userLocationDTO = new UserLocationDTO();
        userLocationDTO.setUserId(user.getId());
        userLocationDTO.setEmail(user.getEmail());
        userLocationDTO.setPlace(user.getLocation().getPlace());
        userLocationDTO.setLongitude(user.getLocation().getLongitude());
        userLocationDTO.setLatitude(user.getLocation().getLatitude());
        return userLocationDTO;
    }
}
