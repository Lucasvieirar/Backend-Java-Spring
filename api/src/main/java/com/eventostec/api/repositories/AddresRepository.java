package com.eventostec.api.repositories;

import com.eventostec.api.domain.event.address.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AddresRepository extends JpaRepository <Address, UUID> {
}
