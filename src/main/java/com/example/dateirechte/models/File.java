package com.example.dateirechte.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class File {

    private String fileName;

    private String ownerName;
    private String groupName;

    // int -> 1. read; 2. write; 3. execute => 000 --> nichts erlaubt | 111 --> alles erlaubt
    private Permission ownerPermissions;
    private Permission groupPermissions;
    private Permission othersPermissions;

}