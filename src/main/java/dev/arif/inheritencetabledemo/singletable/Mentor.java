package dev.arif.inheritencetabledemo.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "st_mentor")
@DiscriminatorValue(value = "3")
public class Mentor extends User{
    private double averageRating;

}
