package dev.arif.inheritencetabledemo.tableperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "tpc_ta")
public class TA extends User {
    private double averageRating;
}
