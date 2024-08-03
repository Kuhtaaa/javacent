package org.centrifugo.models.requests.push_notification;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * FcmPushNotification
 */
public class FcmPushNotification {

  
  @JsonProperty("message")
  private Object message = null;
  
  public FcmPushNotification message(Object message) {
    this.message = message;
    return this;
  }

  
  /**
  * Get message
  * @return message
  **/
  public Object getMessage() {
    return message;
  }
  public void setMessage(Object message) {
    this.message = message;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FcmPushNotification fcmPushNotification = (FcmPushNotification) o;
    return Objects.equals(this.message, fcmPushNotification.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FcmPushNotification {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  
}



