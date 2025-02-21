package org.utilities;

import java.nio.file.Paths;
import java.util.Map;

public class AppConfig {

    private static final Map<String, String[]> appDataMap = Map.ofEntries(
            Map.entry("zaingroup", new String[]{"com.euroland.mobiletools.kw_zain", "ZainGroup_MenuListOrder.xlsx"}),
            Map.entry("adib", new String[]{"com.euroland.irapp.ae_adib", "Adib_MenuListOrder.xlsx"}),
            Map.entry("advanced", new String[]{"com.euroland.irapp.sa_2330", "Advanced_MenuListOrder.xlsx"}),
            Map.entry("almamedia", new String[]{"com.euroland.mobiletools.sf_aln", "AlmaMedia_MenuListOrder.xlsx"}),
            // Add other apps as needed
            Map.entry("salik", new String[]{"com.euroland.irapp.ae_salik", "Salik_MenuListOrder.xlsx"})
    );

    public static String getAppPackage(String appName) {
        String[] data = appDataMap.getOrDefault(appName.toLowerCase(), null);
        return (data != null) ? data[0] : "";
    }

    public static String getExcelFilePath(String appName) {
        String[] data = appDataMap.getOrDefault(appName.toLowerCase(), null);
        if (data != null) {
            String excelFilePath = data[1];
            // Dynamically construct the relative path to the Excel file
            return Paths.get(System.getProperty("user.dir"), "src","test","resources" ,"excel_files", excelFilePath).toString();
        }
        return "";
    }
}
