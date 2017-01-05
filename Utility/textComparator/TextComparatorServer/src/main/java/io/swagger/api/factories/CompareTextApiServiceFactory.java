package io.swagger.api.factories;

import io.swagger.api.CompareTextApiService;
import io.swagger.api.impl.CompareTextApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-02T12:52:43.892Z")
public class CompareTextApiServiceFactory {
    private final static CompareTextApiService service = new CompareTextApiServiceImpl();

    public static CompareTextApiService getCompareTextApi() {
        return service;
    }
}
