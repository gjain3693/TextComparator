package com.utility.comparator.api;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import java.util.List;
import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import com.utility.comparator.api.*;
import com.utility.comparator.model.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-02T12:52:43.892Z")
public abstract class CompareTextApiService {
    public abstract Response compareTextPost(FileData body,SecurityContext securityContext) throws NotFoundException;
}
