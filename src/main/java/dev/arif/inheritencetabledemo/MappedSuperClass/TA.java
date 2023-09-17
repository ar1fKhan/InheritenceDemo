package dev.arif.inheritencetabledemo.MappedSuperClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "ms_ta")
public class TA extends User{
    private double averageRating;
}
