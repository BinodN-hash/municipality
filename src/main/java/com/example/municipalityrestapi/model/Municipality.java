package com.example.municipalityrestapi.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "municipality")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Municipality {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String municipalityCode;
    private String municipalityName;

    private String districtCode;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "district_id")
    private District district;

    @OneToMany(mappedBy = "municipality")
    private List<Ward> wards;


}
