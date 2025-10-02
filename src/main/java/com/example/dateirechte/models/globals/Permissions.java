package com.example.dateirechte.models.globals;

import com.example.dateirechte.models.Permission;

public class Permissions {

    public static final Permission READ = new Permission(true, false, false);
    public static final Permission WRITE = new Permission(false, true, false);
    public static final Permission EXECUTE = new Permission(false, false, true);

    public static final Permission READ_WRITE = new Permission(true, true, false);
    public static final Permission READ_EXECUTE = new Permission(true, false, true);
    public static final Permission WRITE_EXECUTE = new Permission(false, true, true);

    public static final Permission NONE = new Permission(false, false, false);
    public static final Permission ALL = new Permission(true, true, true);

}
