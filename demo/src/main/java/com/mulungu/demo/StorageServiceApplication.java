package com.mulungu.demo;

import com.mulungu.demo.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@SpringBootApplication
@RestController
@RequestMapping("/document")
public class StorageServiceApplication {

	@Autowired
	private StorageService service;

	@PostMapping
	public ResponseEntity<?> uploadDocument(@RequestParam("document")MultipartFile file) throws IOException{
		String uploadDocument = service.uploadDocument(file);
		return ResponseEntity.status(HttpStatus.OK)
				.body(uploadDocument);
	}

	@GetMapping("/{fileName}")
	public ResponseEntity<?> downloadDocument(@PathVariable String fileName){
		byte[] documentData= service.downloadDocument(fileName);
		return ResponseEntity.status(HttpStatus.OK)
				.contentType(MediaType.valueOf("document/pdf"))
				.body(documentData);
	}



	public static void main(String[] args) {

		SpringApplication.run(StorageServiceApplication.class, args);
	}

}



