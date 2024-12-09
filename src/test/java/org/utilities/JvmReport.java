package org.utilities;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class JvmReport {
    public static void generateJvmReport(String path) {
        File f = new File("C:\\Users\\Dawood.Ibrahim.EUROLAND\\IdeaProjects\\IRAPPV3_Automation\\target\\Reports");
        Configuration c = new Configuration(f, "IRAPPV3");
        c.addClassifications("Platform", "Android");
        c.addClassifications("Device", "Samsung S24");
        c.addClassifications("AndroidVersion", "14");
        List<String> l = new ArrayList<String>();
        l.add(path);

        ReportBuilder r = new ReportBuilder(l, c);
        r.generateReports();
    }
}
