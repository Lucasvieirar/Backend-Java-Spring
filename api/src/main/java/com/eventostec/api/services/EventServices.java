package com.eventostec.api.services;

import com.eventostec.api.domain.event.event.Event;
import com.eventostec.api.domain.event.event.EventRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class EventServices {

    public Event createEvent(EventRequestDTO data){
        String imgUrl = null;

        if(data.image() != null){
            imgUrl = this.uploadImg(data.image());
        }
        Event newEvent = new Event();
        newEvent.setTitle(data.tittle());
        newEvent.setDescription(data.description());
        newEvent.setEventURl(data.eventURl());
        newEvent.setDate(data.date());
        newEvent.setImgUrl(imgUrl);

        return newEvent;
    }

    private String uploadImg(MultipartFile file){

    }
}
