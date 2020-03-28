package com.exam.foodorder.service;

import com.exam.foodorder.model.Client;
import com.exam.foodorder.repository.ClientRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserAuthService implements UserDetailsService {

    @Autowired
    private ClientRepo clientRepo;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Optional<Client> user = clientRepo.findByClientName(s);
        if (user.isPresent())
            return user.get();

        throw new UsernameNotFoundException("User does not exit");
    }
}
