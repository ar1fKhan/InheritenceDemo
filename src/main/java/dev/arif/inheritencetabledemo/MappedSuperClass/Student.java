package dev.arif.inheritencetabledemo.MappedSuperClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "ms_student")
public class Student extends User{
    private double psp;
    private double attendance;
}
