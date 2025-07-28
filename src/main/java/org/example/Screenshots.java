package org.example;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.xmind.core.util.FileUtils;

import java.io.File;
import java.io.IOException;

public class Screenshots {
    public static int idScreenshot = 1;
    public static int idNewScreenshot;

    public File takeScreenshot(WebDriver driver) throws IOException {
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        idNewScreenshot = idScreenshot++;
        FileUtils.copy(file, new File("./screenshots/screenshot" + idNewScreenshot + ".png"));
        return file;
    }

    public void deleteScreenshot() {
        File directory = new File("./screenshots");
        for (int countIdOfScreenshot = 1 ; countIdOfScreenshot < directory.length() ; countIdOfScreenshot++) {
            File file = new File("./screenshots/screenshot" + countIdOfScreenshot + ".png");
                file.delete();
        }

    }
}
