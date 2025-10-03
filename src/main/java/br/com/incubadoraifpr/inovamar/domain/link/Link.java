package br.com.incubadoraifpr.inovamar.domain.link;

import br.com.incubadoraifpr.inovamar.domain.publiccall.PublicCall;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "Link")
@Table(name = "links")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Link {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "public_call_id", nullable = false)
    private PublicCall publicCall;

    @Column(length = 500)
    private String title;

    @Column(length = 500)
    private String url;
}
