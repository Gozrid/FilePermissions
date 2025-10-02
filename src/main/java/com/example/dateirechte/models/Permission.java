package com.example.dateirechte.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Permission {

    private boolean read;
    private boolean write;
    private boolean execute;

}