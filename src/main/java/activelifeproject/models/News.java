package activelifeproject.models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "news")
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "header")
    private String header;

    @Column(name = "annotation")
    private String annotation;

    @Column(name = "content")
    private String content;

    @Column(name = "image")
    private String image;
}
