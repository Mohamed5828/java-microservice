package com.mycompany.app;

import com.mycompany.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class NotificationService {
    private final NotificationRepository notificationRepository;
    public void send(NotificationRequest notificationRquest){
        notificationRepository.save(
                Notification.builder()
                        .toCustomerId(notificationRquest.toCustomerId())
                        .toCustomerEmail(notificationRquest.toCustomerName())
                        .sender("Mohamed")
                        .sentAt(LocalDateTime.now())
                        .build()
        );
    }
}
