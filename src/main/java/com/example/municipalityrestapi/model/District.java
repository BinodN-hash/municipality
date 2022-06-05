package com.example.municipalityrestapi.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "district")
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

    private String provinceCode;


    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "province_id")
    private Province province;

    @OneToMany(mappedBy = "district")
    private List<Municipality> municipalities;


}
