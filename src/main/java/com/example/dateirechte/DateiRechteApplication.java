package com.example.dateirechte;

import com.example.dateirechte.repository.FileRepository;
import com.example.dateirechte.service.RechteService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DateiRechteApplication {

    private static final FileRepository fileRepository = new FileRepository();
    private static final RechteService rechteService = new RechteService();

    public static void main(String[] args) {

        print(0,0); // Nutzer (0) und Owner der Datei (0) sind gleich. Die Owner Permissions greifen hier
        print(0,1); // Nutzer (0) und Owner der Datei (1) sind nicht gleich. Jedoch passt die Gruppe des Nutzers zur Gruppe der Datei. Die Gruppen Permissions greifen hier.
        print(0,2); // Nutzer (0) und Owner der Datei (2) sind nicht gleich. Die Gruppe des Nutzers und der Datei sind unterschiedlich. Die Others Permissions greifen hier.
        print(0,3); //  (0) und Owner der Datei (2) sind nicht gleich. Die Gruppe des Nutzers und der Datei sind unterschiedlich. Die Others Permissions greifen hier. Die Datei hat hier jedoch andere Permissions für Others.

    }

    private static void print(int userId, int fileId) {
        System.out.println(
                rechteService.whatRightDoesTheUserHave(userId, fileId));
    }

}
