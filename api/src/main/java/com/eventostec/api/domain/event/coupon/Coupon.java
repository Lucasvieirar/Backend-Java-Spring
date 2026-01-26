package com.eventostec.api.domain.event.coupon;

import com.eventostec.api.domain.event.event.Event;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name="coupon")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Coupon {
    @Id
    @GeneratedValue
    private UUID id;
    private String code;
    private Integer discount;
    private Data valid;

    @ManyToMany
    @JoinColumn(name = "event_id")
    private Event event;
}
