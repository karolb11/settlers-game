package com.broniec.settlers.village;

import com.broniec.settlers.entity.MapObject;
import com.broniec.settlers.user.User;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "villages")
@Data
public class Village extends MapObject {
    @Id
    @Column(name = "village_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User owner;

    private int wood;

    private int timberCampLevel;
}
