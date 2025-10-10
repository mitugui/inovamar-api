package br.com.incubadoraifpr.inovamar.infra;

import br.com.incubadoraifpr.inovamar.domain.organization.exception.OrganizationNameAlreadyExistsException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {
    @ExceptionHandler(OrganizationNameAlreadyExistsException.class)
    public ResponseEntity<RestErrorMessage> handleConflict(OrganizationNameAlreadyExistsException e) {
        var errorResponse = new RestErrorMessage(HttpStatus.CONFLICT, e.getMessage());

        return ResponseEntity.status(HttpStatus.CONFLICT).body(errorResponse);
    }
}
