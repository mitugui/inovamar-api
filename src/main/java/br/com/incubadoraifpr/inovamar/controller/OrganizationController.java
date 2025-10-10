package br.com.incubadoraifpr.inovamar.controller;

import br.com.incubadoraifpr.inovamar.domain.organization.*;
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
    private OrganizationService organizationService;

    @PostMapping
    @Transactional
    public ResponseEntity<DataOrganizationResponse> create(@RequestBody @Valid DataOrganizationCreate dataOrganizationCreate) {
        var saved = organizationService.create(dataOrganizationCreate);
    
        return ResponseEntity
                .status(HttpStatus.CREATED).
                body(new DataOrganizationResponse(saved));
    }
}
