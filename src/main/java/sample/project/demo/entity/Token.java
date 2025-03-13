package sample.project.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Token")
@Builder
public class Token {

    private Integer id;

    private String token;
    private LocalDate createdAt;
    private LocalDate expiredAt;
    private LocalDate validatedAt;
    @ManyToOne
    @JoinColumn(name="UserId",nullable = false)
    private User user;


}
