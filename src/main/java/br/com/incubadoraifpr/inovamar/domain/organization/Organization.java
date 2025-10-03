package br.com.incubadoraifpr.inovamar.domain.organization;

import br.com.incubadoraifpr.inovamar.domain.publiccall.PublicCall;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name = "Organization")
@Table(name = "organizations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "organization", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PublicCall> publicCalls;

    public Organization(DataOrganizationCreate dataOrganizationCreate) {
        this.name = dataOrganizationCreate.name();
    }
}
