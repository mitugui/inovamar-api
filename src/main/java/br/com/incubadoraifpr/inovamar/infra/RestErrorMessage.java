package br.com.incubadoraifpr.inovamar.infra;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public record RestErrorMessage(HttpStatus status, String message, LocalDateTime timestamp) {
    public RestErrorMessage(HttpStatus status, String message) {
        this(status, message, LocalDateTime.now());
    }
}
