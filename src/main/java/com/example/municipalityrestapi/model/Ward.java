package com.example.municipalityrestapi.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "ward")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Ward {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String wardCode;
    private String wardName;

    private String municipalityCode;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "municipality_id")
    private Municipality municipality;

}
