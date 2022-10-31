package com.library.management.LibraryManagement.security;

import com.library.management.LibraryManagement.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Component
public class AuthUserDetailService implements UserDetailsService {

    private UserDAO userDAO;

    @Override
    public UserDetails loadUserByUsername(String username) {
        UserClient userClient = userDAO.getUser(username);
        if (null == userClient){
            throw new UsernameNotFoundException("no user found with username "+username);
        }
        return new User(userClient.getUsername(), userClient.getPassword(), getAuthorities(userClient.getRoles()));
    }


    public Set<GrantedAuthority> getAuthorities(List<Roles> roles) {
        Set<GrantedAuthority> authorities = new HashSet<>();
        for (Roles role : roles) {
            authorities.add(new SimpleGrantedAuthority(role.getRoleName()));
        }
        return authorities;
    }

    @Autowired
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

}
