package com.eventostec.api.domain.event.event;

import org.springframework.web.multipart.MultipartFile;

public record EventRequestDTO(String tittle, String description, Long date, String city, Boolean remote, String eventURl, MultipartFile image) {
}
