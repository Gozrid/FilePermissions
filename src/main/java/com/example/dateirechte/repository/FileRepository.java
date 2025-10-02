package com.example.dateirechte.repository;

import com.example.dateirechte.models.File;
import com.example.dateirechte.models.globals.Permissions;

public class FileRepository {

    private final File[] files = {
            new File("Datei1", "Peter", "G1", Permissions.ALL, Permissions.ALL, Permissions.NONE),
            new File("Datei2", "Hans", "G1", Permissions.ALL, Permissions.ALL, Permissions.NONE),
            new File("Datei3", "Jörges", "G2", Permissions.ALL, Permissions.ALL, Permissions.READ),
            new File("Datei4", "Jörges", "G2", Permissions.ALL, Permissions.ALL, Permissions.NONE)
    };

    public File getFile(int id) {
        if (id < 0 || id >= files.length)
            return files[0];
        return files[id];
    }

}
