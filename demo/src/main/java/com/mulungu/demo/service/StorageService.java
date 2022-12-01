package com.mulungu.demo.service;



import com.mulungu.demo.Repository.StorageRepository;
import com.mulungu.demo.entity.DocumentData;
import com.mulungu.demo.util.DocumentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

@Service
public class StorageService {



    private StorageRepository repository;


    public String uploadDocument(MultipartFile file) throws IOException {

        DocumentData documentData = repository.save(DocumentData.builder()
                .name(file.getOriginalFilename())
                .type(file.getContentType())
                .documentData(DocumentUtils.compressDocument(file.getBytes())).build());
        if (documentData != null) {
            return "file uploaded successfully : " + file.getOriginalFilename();
        }
        return null;
    }

    public byte[] downloadDocument(String fileName){
        Optional<DocumentData> dbDocumentData = repository.findByName(fileName);
        byte[] documents= DocumentUtils.decompressDocument(dbDocumentData.get().getDocumentData());
        return documents;
    }
}
