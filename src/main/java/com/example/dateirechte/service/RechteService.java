package com.example.dateirechte.service;

import com.example.dateirechte.models.File;
import com.example.dateirechte.models.Permission;
import com.example.dateirechte.models.User;
import com.example.dateirechte.repository.FileRepository;
import com.example.dateirechte.repository.UserRepository;

public class RechteService {

    private final UserRepository userRepository;
    private final FileRepository fileRepository;

    public RechteService() {
        this.userRepository = new UserRepository();
        this.fileRepository = new FileRepository();
    }

    public String whatRightDoesTheUserHave(int userId, int fileId) {
        User user = userRepository.getUser(userId);
        File file = fileRepository.getFile(fileId);

        if (user.getUsername().equals(file.getOwnerName())) {
            return getPermissions(file.getOwnerPermissions());
        }

        if (user.getGroup().equals(file.getGroupName())) {
            return getPermissions(file.getGroupPermissions());
        }

        return getPermissions(file.getOthersPermissions());
    }

    private String getPermissions(Permission permissionsFile) {
        String read = "--- ";
        String write = "--- ";
        String execute = "--- ";

        if (permissionsFile.isRead()) {
            read = "read ";
        }

        if (permissionsFile.isWrite()) {
            write = "write ";
        }

        if (permissionsFile.isExecute()) {
            execute = "execute";
        }

        return read + write + execute;
    }

}
