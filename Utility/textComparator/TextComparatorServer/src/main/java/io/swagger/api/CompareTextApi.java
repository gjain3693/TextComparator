package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.CompareTextApiService;
import io.swagger.api.factories.CompareTextApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.ResponseFileData;
import io.swagger.model.FileData;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/CompareText")


@io.swagger.annotations.Api(description = "the CompareText API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-02T12:52:43.892Z")
public class CompareTextApi  {
   private final CompareTextApiService delegate = CompareTextApiServiceFactory.getCompareTextApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "comparing text of two files", notes = "", response = ResponseFileData.class, tags={ "Comparator", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Status 200", response = ResponseFileData.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Status 400", response = ResponseFileData.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Status 404", response = ResponseFileData.class) })
    public Response compareTextPost(@ApiParam(value = "" ) FileData body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.compareTextPost(body,securityContext);
    }
}
