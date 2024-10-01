package me.diegopagotto.piwhois.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Getter
public class WhoIsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String domainName;
    private String registrar;
    private String registrantEmail;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

}

