package io.work.gestionUserClient.services;


import io.work.gestionUserClient.security.request.LoginRequest;
import io.work.gestionUserClient.security.request.SignupRequest;
import org.springframework.http.ResponseEntity;

public interface AuthService {
    ResponseEntity<?> authenticateUser(LoginRequest loginRequest);
    ResponseEntity<?> registerUser(SignupRequest signupRequest);
}
