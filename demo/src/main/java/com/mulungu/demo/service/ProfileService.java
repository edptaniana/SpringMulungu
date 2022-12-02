package com.mulungu.demo.service;


import com.mulungu.demo.Model.Usuario;
import com.mulungu.demo.Repository.ProfileRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.time.Instant;
@Getter
@Setter
@Service
public class ProfileService {
    private final ProfileRepository profileRepository;

    public ProfileService(ProfileRepository profileRepository, ProfileRepository profileRepository1){
        this.profileRepository = profileRepository;
    }
    public <IncluirProfileRequest> Profile alterar(IncluirProfileRequest ProfileRequest) {
        var data = Instant.now();

        var profile = new com.mulungu.demo.Model.Profile();
        Object profileRequest = new Object();
        BeanUtils.copyProperties(profileRequest, profile);
        profile.setSenhaProfile("senha");


        return (Profile) profile;
    }
}
