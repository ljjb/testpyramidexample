package rxdemo.endpoints;

import spark.servlet.SparkApplication;

// HUH?
// COMMENT
public class RxDemoServerApplication implements SparkApplication {
    @Override
    public void init() {
        RxEndpoints.initalizeEndpoints();
    }
}
