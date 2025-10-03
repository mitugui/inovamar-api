package br.com.incubadoraifpr.inovamar.domain.organization;

import jakarta.persistence.*;
import lombok.*;

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
}
