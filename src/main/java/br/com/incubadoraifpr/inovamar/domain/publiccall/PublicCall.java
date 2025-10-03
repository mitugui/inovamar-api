package br.com.incubadoraifpr.inovamar.domain.publiccall;

import br.com.incubadoraifpr.inovamar.domain.organization.Organization;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "PublicCall")
@Table(name = "public_calls")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class PublicCall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "organization_id", nullable = false)
    private Organization organization;

    private String title;

    @Column(length = 500)
    private String description;

    private String submissionDeadline;
    private Double funding;
}
