package br.com.incubadoraifpr.inovamar.domain.organization;

import jakarta.validation.constraints.NotBlank;

public record DataOrganizationCreate(@NotBlank String name) {
}
