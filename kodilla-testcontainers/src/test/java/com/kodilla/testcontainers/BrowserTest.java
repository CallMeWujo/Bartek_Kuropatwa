package com.kodilla.testcontainers;

//public class BrowserTest {
//    public static BrowserWebDriverContainer chromeContainer;
//
//    @BeforeAll
//    public static void setUp() {
//        chromeContainer = new BrowserWebDriverContainer()
//                .withCapabilities(new ChromeOptions());
//        chromeContainer.start();
//    }

//    @Test
//    public void chromeTest() throws IOException {
//        RemoteWebDriver driver = chromeContainer.getWebDriver();
//        driver.get("http://allegro.pl");
//
//        File screenshot = driver.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(screenshot,
//                new File("./build/screenshots/" + screenshot.getName()));
//    }

//    @AfterAll
//    public static void tearDown() {
//        chromeContainer.stop();
//    }
//}
