package com.broniec.settlers.entity;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.awt.*;

@Entity
@Getter
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"cordX", "cordY"}))
public abstract class MapObject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size()
    private int cordX;
    private int cordY;
}
