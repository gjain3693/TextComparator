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

    Boolean isFirstFileSizeGreater=false;
    int counterSize=0;
    int counterCondition=0;

    ResponseFileData responseFileData = new ResponseFileData();

    try{
      String latestRecord;
      fileOne=body.getFileOneData();
      fileTwo=body.getFileTwoData();

      List <String> fileOneList=new  ArrayList<String>(Arrays.asList(fileOne.split("\n")));
      List <String> fileTwoList=new ArrayList<String>(Arrays.asList(fileTwo.split("\n")));

      if(fileOneList.size()>=fileTwoList.size()){
	isFirstFileSizeGreater=true;
	counterSize=fileOneList.size();
	counterCondition=fileTwoList.size();
      } else  {
	isFirstFileSizeGreater=false;
	counterSize=fileTwoList.size();
	counterCondition=fileOneList.size();
      }

      for(int counter=0;counter<counterSize;counter++) {
	if (counter <= counterCondition-1) {
	  if(fileTwoList.get(counter).equals(fileOneList.get(counter))) {
	    updatedFile.add(counter,fileTwoList.get(counter));
	  } else {
	    updatedFile.add(counter,fileTwoList.get(counter)+"<---");
	  }
	} else {
	  updatedFile.add((isFirstFileSizeGreater?"":fileTwoList.get(counter))+"<---");
	}
      }


      latestRecord=StringUtils.join(updatedFile,"\n");
      System.out.println(latestRecord);
      responseFileData.setFileOneData(fileOne);
      responseFileData.setFileTwoData(latestRecord);
      responseFileData.setResponseCode(200);
      responseFileData.setResponseMessage("SUCESSFULL DONE");

    } catch(Exception ex) {
      ex.printStackTrace();
    }

    return Response.ok().entity(responseFileData).build();
  }



}