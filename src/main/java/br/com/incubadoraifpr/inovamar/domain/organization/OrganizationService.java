package br.com.incubadoraifpr.inovamar.domain.organization;

import br.com.incubadoraifpr.inovamar.domain.organization.exception.OrganizationNameAlreadyExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizationService {
    @Autowired
    private OrganizationRepository organizationRepository;

    public Organization create(DataOrganizationCreate dataOrganizationCreate) {
        if (organizationRepository.existsByName(dataOrganizationCreate.name())) {
            throw new OrganizationNameAlreadyExistsException("Organization with name " + dataOrganizationCreate.name() + " already exists");
        }

        var organization = new Organization(dataOrganizationCreate);
        return organizationRepository.save(organization);
    }
}
