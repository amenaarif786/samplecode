package com.assessment.sampleapp.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull private String name;
    @NonNull private String description;
    @NonNull private double price;

//    @OneToMany(mappedBy = "product")
//    private Set<ProductOrderJoin> productOrderQuantity;

    @CreationTimestamp
    private Date createdAt;

    @UpdateTimestamp
    private Date updatedAt;
}
