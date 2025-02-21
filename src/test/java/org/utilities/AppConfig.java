package org.utilities;

public class AppConfig {

    public static String getAppPackage(String appName) {
        switch (appName.toLowerCase()) {
            case "bsf":
                return "com.euroland.irapp.sa_bsf";
            case "nbo":
                return "com.nbo.ir";
            case "adib":
                return "com.euroland.irapp.ae_adib";
            case "bat":
                return "com.euroland.irapp.uk_bats";
            // Add more cases for other apps
            case "xyz":
                return "com.xyz.ir";
            default:
                throw new IllegalArgumentException("Invalid app name: " + appName);
        }
    }

}
