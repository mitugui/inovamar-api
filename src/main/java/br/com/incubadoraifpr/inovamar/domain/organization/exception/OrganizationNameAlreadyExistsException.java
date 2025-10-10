package br.com.incubadoraifpr.inovamar.domain.organization.exception;

public class OrganizationNameAlreadyExistsException extends RuntimeException {
    public OrganizationNameAlreadyExistsException(String message) {
        super(message);
    }
}
