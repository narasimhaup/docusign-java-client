package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.NameValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-25T08:48:06.683-08:00")
public class AccountSettingsInformation   {
  
  private java.util.List<NameValue> accountSettings = new java.util.ArrayList<NameValue>();

  
  /**
   * The list of account settings. These determine the features available for the account. Note that some features are determined by the plan used to create the account, and cannot be overridden.
   **/
  
  @ApiModelProperty(value = "The list of account settings. These determine the features available for the account. Note that some features are determined by the plan used to create the account, and cannot be overridden.")
  @JsonProperty("accountSettings")
  public java.util.List<NameValue> getAccountSettings() {
    return accountSettings;
  }
  public void setAccountSettings(java.util.List<NameValue> accountSettings) {
    this.accountSettings = accountSettings;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountSettingsInformation accountSettingsInformation = (AccountSettingsInformation) o;

    return true && Objects.equals(accountSettings, accountSettingsInformation.accountSettings)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSettingsInformation {\n");
    
    sb.append("    accountSettings: ").append(toIndentedString(accountSettings)).append("\n");
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
