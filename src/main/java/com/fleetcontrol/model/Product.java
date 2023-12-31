package com.fleetcontrol.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Entity
@Table(name = "products")

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private Double unitValue;

    private Double weight;

    @Builder.Default
    private boolean available = true;

}
