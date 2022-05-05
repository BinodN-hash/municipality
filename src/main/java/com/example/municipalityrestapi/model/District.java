package com.example.municipalityrestapi.model;
import lombok.*;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "districts")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class District {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String districtCode;
    private String districtName;


    @OneToMany(mappedBy = "district")
    private List<Municipality> municipalities;


}
