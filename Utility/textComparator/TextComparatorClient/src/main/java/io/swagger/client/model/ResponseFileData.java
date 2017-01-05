/*
 * TestApi
 * No description
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ResponseFileData
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-02T12:52:52.781Z")
public class ResponseFileData {
  @SerializedName("FileOneData")
  private String fileOneData = null;

  @SerializedName("FileTwoData")
  private String fileTwoData = null;

  @SerializedName("ResponseCode")
  private Integer responseCode = null;

  @SerializedName("ResponseMessage")
  private String responseMessage = null;

  public ResponseFileData fileOneData(String fileOneData) {
    this.fileOneData = fileOneData;
    return this;
  }

   /**
   * Get fileOneData
   * @return fileOneData
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getFileOneData() {
    return fileOneData;
  }

  public void setFileOneData(String fileOneData) {
    this.fileOneData = fileOneData;
  }

  public ResponseFileData fileTwoData(String fileTwoData) {
    this.fileTwoData = fileTwoData;
    return this;
  }

   /**
   * Get fileTwoData
   * @return fileTwoData
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getFileTwoData() {
    return fileTwoData;
  }

  public void setFileTwoData(String fileTwoData) {
    this.fileTwoData = fileTwoData;
  }

  public ResponseFileData responseCode(Integer responseCode) {
    this.responseCode = responseCode;
    return this;
  }

   /**
   * Get responseCode
   * @return responseCode
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(Integer responseCode) {
    this.responseCode = responseCode;
  }

  public ResponseFileData responseMessage(String responseMessage) {
    this.responseMessage = responseMessage;
    return this;
  }

   /**
   * Get responseMessage
   * @return responseMessage
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getResponseMessage() {
    return responseMessage;
  }

  public void setResponseMessage(String responseMessage) {
    this.responseMessage = responseMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseFileData responseFileData = (ResponseFileData) o;
    return Objects.equals(this.fileOneData, responseFileData.fileOneData) &&
        Objects.equals(this.fileTwoData, responseFileData.fileTwoData) &&
        Objects.equals(this.responseCode, responseFileData.responseCode) &&
        Objects.equals(this.responseMessage, responseFileData.responseMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileOneData, fileTwoData, responseCode, responseMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseFileData {\n");
    
    sb.append("    fileOneData: ").append(toIndentedString(fileOneData)).append("\n");
    sb.append("    fileTwoData: ").append(toIndentedString(fileTwoData)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    responseMessage: ").append(toIndentedString(responseMessage)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

