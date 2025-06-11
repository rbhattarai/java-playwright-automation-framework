package com.example;

import com.microsoft.playwright.*;
import java.nio.file.Paths;

public class PlaywrightDriverManager {
  private static Browser browser;
  private static BrowserContext context;

  public static void start(String certRole, String envUrl) {
    String certPath = "certs/rohan_bhattarai_proj_" + certRole + ".p12";
    String certPassword = "changeit";

    Playwright playwright = Playwright.create();

    BrowserType.LaunchOptions options = new BrowserType.LaunchOptions();
    options.setHeadless(false);
    options.setIgnoreHTTPSErrors(true);
    options.setClientCertificate(new BrowserType.ClientCertificate(
      Paths.get(certPath),
      certPassword
    ));

    browser = playwright.chromium().launch(options);

    Browser.NewContextOptions ctxOptions = new Browser.NewContextOptions();
    ctxOptions.setIgnoreHTTPSErrors(true);
    ctxOptions.setClientCertificate(new Browser.NewContextOptions.ClientCertificate(
      Paths.get(certPath),
      certPassword
    ));

    context = browser.newContext(ctxOptions);
  }

  public static Page newPage() {
    return context.newPage();
  }

  public static void close() {
    if (context != null) context.close();
    if (browser != null) browser.close();
  }
}
