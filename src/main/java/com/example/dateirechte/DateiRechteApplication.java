package com.example.dateirechte;

import com.example.dateirechte.repository.FileRepository;
import com.example.dateirechte.service.RechteService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DateiRechteApplication {

    private static final FileRepository fileRepository = new FileRepository();
    private static final RechteService rechteService = new RechteService();

    public static void main(String[] args) {

        print("Owner :", 0,0);
        print("Gruppe:", 0,1);
        print("Others:", 0,2);
        print("Others:", 0,3);

    }

    private static void print(String prefix, int userId, int fileId) {
        System.out.println(
                prefix + " " +
                rechteService.whatRightDoesTheUserHave(userId, fileId) + " " +
                        fileRepository.getFile(fileId).getOwnerName() + " " +
                        fileRepository.getFile(fileId).getGroupName());
    }

}
