package br.com.incubadoraifpr.inovamar.domain.organization;

public record DataOrganizationResponse(Long id, String name) {
    public DataOrganizationResponse (Organization organization) {
        this(organization.getId(), organization.getName());
    }
}
