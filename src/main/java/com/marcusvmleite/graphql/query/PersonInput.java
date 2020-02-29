package com.marcusvmleite.graphql.query;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonInput {

    private Long id;
    private String name;
    private String email;
    private Integer age;

}
