package com.utility.comparator.api.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import com.utility.comparator.api.CompareTextApiService;
import com.utility.comparator.api.NotFoundException;
import com.utility.comparator.model.FileData;
import com.utility.comparator.model.ResponseFileData;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-02T12:52:43.892Z")
public class CompareTextApiServiceImpl extends CompareTextApiService {


  @Override
  public Response compareTextPost(FileData body, SecurityContext securityContext) throws NotFoundException {
    String fileOne;
    String fileTwo;
    List<String> updatedFile = new ArrayList<>();

    Boolean compareResult;
    // do some magic!
    ResponseFileData responseFileData = new ResponseFileData();

    int count=0;
    String latestRecord;
    fileOne=body.getFileOneData();
    fileTwo=body.getFileTwoData();

    List <String> fileOneList=new  ArrayList<String>(Arrays.asList(fileOne.split("\n")));
    List <String> fileTwoList=new ArrayList<String>(Arrays.asList(fileTwo.split("\n")));
    try{
      compareResult=fileOne.equals(fileTwo);

      if(compareResult==false) {
	for(String fileContent:fileOneList) {
	  updatedFile.add(fileTwoList.contains(fileContent)?fileTwoList.get(count):fileTwoList.get(count)+"<--");
	  count++;
	}
	latestRecord=StringUtils.join(updatedFile,"\n");

	responseFileData.setFileOneData(fileOne);
	responseFileData.setFileTwoData(latestRecord);
	responseFileData.setResponseCode(200);
	responseFileData.setResponseMessage("SUCESSFULL DONE");
      }
      else
      {
	System.out.println("FILE HAS NO DIFFERENCE");
      }
    } catch(Exception ex) {
      ex.printStackTrace();
    }

    return Response.ok().entity(responseFileData).build();
  }

}
