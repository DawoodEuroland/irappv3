package org.utilities;

import java.nio.file.Paths;
import java.util.Map;

public class AppConfig {

    private static final Map<String, String[]> appDataMap = Map.ofEntries(
                    //1.companycode          //2.app activity package  //3.Menu list order //4.share graph link                                                                     //5.financial calendar link                            //6.press release link  //7.keyfiguresAnnualExcelFile  //8.interactive analysis link(iat)  //9.Document Library File              //10.share price lookup link (spl)                                       //11.total shareholders return link(TSR)         //12.Analyst Ratings link
            Map.entry("acwa", new String[]{"com.euroland.irapp.sa_acwa", "", "https://gamma.euroland.com/tools/sharegraph/?s=2033&companycode=sa-acwa&lang=en-GB", "https://gamma.euroland.com/tools/fincalendar2/?companycode=sa-acwa&lang=en-GB", "", "", "https://ksatools.eurolandir.com/tools/ia/?companycode=sa-acwa&lang=en-gb", "", "https://gamma.euroland.com/tools/splookup/?companycode=sa-acwa&lang=en-GB", "https://tools.eurolandir.com/tools/tsr/iframe/?companycode=sa-acwa&lang=en-GB", ""}),
            Map.entry("ades", new String[]{"com.euroland.irapp.eg_ades", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("adib", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("advanced", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("agthia", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("alarabia", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("almazaya", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("alrajhi", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("alandalus", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("alinma", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("alma", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("almarai", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("alpha", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("alujain", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("aqua", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("arab", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("arabian", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("aramex", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("assa", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("bahri", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("banco", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("bat", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("bsf", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("clp", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("cbq", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("corelab", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("dar", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("deyaar", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("dpworld", new String[]{"com.euroland.mobiletools.ae_dpw", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("hmg", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("dfm", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("dukhan", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("elm", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("emmardev", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("emmarprop", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("emsteel", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("esg", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("fab", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("fortum", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("ihc", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("jahez", new String[]{"com.euroland.irapp.sa_9526", "", "https://ksatools.eurolandir.com/tools/sharegraph/?s=2388&companycode=sa-9526&lang=en-GB", "https://ksatools.eurolandir.com/tools/fincalendar2/?companycode=sa-9526&lang=en-GB", "https://ksatools.eurolandir.com/tools/pressreleases/?companycode=sa-9526&lang=en-GB", "", "https://ksatools.eurolandir.com/tools/ia/?companycode=SA-9526&lang=en-GB", "", "", "https://ksatools.eurolandir.com/tools/tsr/iframe/?companycode=sa-9526&lang=en-GB", ""}),
            Map.entry("kddi", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("kingdom", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("lindex", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("maaden", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("mashreq", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("masraf", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("mbc", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("mobily", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("modern", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("mondon", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("multiply", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("nbf", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("nbo", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("nmdc", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("omantel", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("ooredoo", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("ooredoooman", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("oqep", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("oqgn", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("qib", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("qiib", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("qnb", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("riyad", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("saco", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("salik", new String[]{"com.euroland.irapp.ae_salik", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("saib", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("sec", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("securitas", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("stckw", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("uacj", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("udc", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("waha", new String[]{"", "", "", "", "", "", "", "", "", "", ""}),
            Map.entry("zaingroup", new String[]{"com.euroland.mobiletools.kw_zain", "ZainGroup_MenuListOrder.xlsx", "https://tools.eurolandir.com/tools/sharegraph/?s=2665&companycode=kw-zain&lang=en-GB", "https://tools.euroland.com/tools/FinCalendar2/?companycode=sa-saco&lang=en-gb", "", "AD_shaded_ZainGroup.xlsx", "https://tools.eurolandir.com/tools/ia/?companycode=kw-zain&v=r2022&lang=en-GB", "", "https://tools.eurolandir.com/tools/splookup/?companycode=kw-zain&v=kw-zain_redesign&lang=en-GB", "https://tools.euroland.com/tools/tsr/iframe/?companycode=kw-zain&lang=en-gb", "https://gamma.euroland.com/tools/ee/?companyCode=kw-zain&suffix=r2022&lang=en&pid=5"})



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
            return Paths.get(System.getProperty("user.dir"), "src","test","resources" ,"excel_files","menu_order_files", excelFilePath).toString();
        }
        return "";
    }
    public static String  getShareGraphLink(String appName){
        String[] data = appDataMap.getOrDefault(appName.toLowerCase(),null);
        if (data != null){
            return data[2];
        }

        return "";
    }
    public static String  getFinancialCalendarLink(String appName){
        String[] data = appDataMap.getOrDefault(appName.toLowerCase(),null);
        if (data != null){
            return data[3];
        }

        return "";
    }

    public static String  getPressReleaseLink(String appName){
        String[] data = appDataMap.getOrDefault(appName.toLowerCase(),null);
        if (data != null){
            return data[4];
        }

        return "";
    }

    public static String getKeyFiguresAnnualExcelFilePath(String appName) {
        String[] data = appDataMap.getOrDefault(appName.toLowerCase(), null);
        if (data != null) {
            String excelFilePath = data[5];
            // Dynamically construct the relative path to the Excel file
            return Paths.get(System.getProperty("user.dir"), "src","test","resources" ,"excel_files","key_figures_files", excelFilePath).toString();
        }
        return "";
    }
    public static String getInteractiveAnalysisLink(String appName){
        String[] data = appDataMap.getOrDefault(appName.toLowerCase(),null);
        if (data != null){
            return data[6];
        }

        return "";
    }
    public static String  getDocumentLibraryExcelFilePath(String appName){
        String[] data = appDataMap.getOrDefault(appName.toLowerCase(), null);
        if (data != null) {
            String excelFilePath = data[7];
            // Dynamically construct the relative path to the Excel file
            return Paths.get(System.getProperty("user.dir"), "src","test","resources" ,"excel_files","", excelFilePath).toString();
        }
        return "";
    }
    public static String  getSharePriceLookupLink(String appName){
        String[] data = appDataMap.getOrDefault(appName.toLowerCase(),null);
        if (data != null){
            return data[8];
        }

        return "";
    }
    public static String  getTotalShareholdersReturnLink(String appName){
        String[] data = appDataMap.getOrDefault(appName.toLowerCase(),null);
        if (data != null){
            return data[9];
        }

        return "";
    }
    public static String  getAnalystRatingsLink(String appName){
        String[] data = appDataMap.getOrDefault(appName.toLowerCase(),null);
        if (data != null){
            return data[10];
        }

        return "";
    }

}
