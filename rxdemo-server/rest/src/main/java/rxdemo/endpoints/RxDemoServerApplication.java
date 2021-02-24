package rxdemo.endpoints;

import spark.servlet.SparkApplication;

// COMMENT
public class RxDemoServerApplication implements SparkApplication {
    @Override
    public void init() {
        RxEndpoints.initalizeEndpoints();
    }
}
