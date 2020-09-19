package com.yobitrust.HachCovid19Back.Services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Service
public class FileUploadService {
    public String fileUpload(MultipartFile file) throws IOException {
        UUID bilanPath=UUID.randomUUID();
        file.transferTo(new File("bilans/"+bilanPath));
        return "~/Desktop/YobiTrust/HachCovid19Back/src/main/resources/bilans/"+bilanPath;
    }
}
