package br.com.incubadoraifpr.inovamar.controller;

import br.com.incubadoraifpr.inovamar.domain.organization.DataOrganizationCreate;
import br.com.incubadoraifpr.inovamar.domain.organization.DataOrganizationResponse;
import br.com.incubadoraifpr.inovamar.domain.organization.Organization;
import br.com.incubadoraifpr.inovamar.domain.organization.OrganizationRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/organizations")
public class OrganizationController {
    @Autowired
    private OrganizationRepository organizationRepository;

    @PostMapping
    @Transactional
    public ResponseEntity<?> create(@RequestBody @Valid DataOrganizationCreate dataOrganizationCreate) {
        if (organizationRepository.existsByName(dataOrganizationCreate.name())) {
            return ResponseEntity
                    .status(HttpStatus.CONFLICT)
                    .body("Organization with name " + dataOrganizationCreate.name() + " already exists");
        }

        var organization = new Organization(dataOrganizationCreate);
        var saved = organizationRepository.save(organization);

        return ResponseEntity
                .status(HttpStatus.CREATED).
                body(new DataOrganizationResponse(saved));
    }
}
