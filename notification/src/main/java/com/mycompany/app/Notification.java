package com.mycompany.app;

import lombok.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@SpringBootApplication
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Notification {
    @Id
    @SequenceGenerator(name = "notification_id_sequnce" , sequenceName = "notification_id_sequnce")
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "notification_id_sequnce")
    private Integer notificationId;
    private Integer toCustomerId;
    private String toCustomerEmail;
    private String sender;
    private String message;
    private LocalDateTime sentAt;
}
