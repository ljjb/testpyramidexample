package rxdemo.endpoints;

import spark.servlet.SparkApplication;

// HUH?
public class RxDemoServerApplication implements SparkApplication {
    @Override
    public void init() {
        RxEndpoints.initalizeEndpoints();
    }
}
