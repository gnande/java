/*
Copyright 2020 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.joda.time.DateTime;

/** CronJobStatus represents the current state of a cron job. */
@ApiModel(description = "CronJobStatus represents the current state of a cron job.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-06-19T10:47:33.387Z[Etc/UTC]")
public class V2alpha1CronJobStatus {
  public static final String SERIALIZED_NAME_ACTIVE = "active";

  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private List<V1ObjectReference> active = null;

  public static final String SERIALIZED_NAME_LAST_SCHEDULE_TIME = "lastScheduleTime";

  @SerializedName(SERIALIZED_NAME_LAST_SCHEDULE_TIME)
  private DateTime lastScheduleTime;

  public V2alpha1CronJobStatus active(List<V1ObjectReference> active) {

    this.active = active;
    return this;
  }

  public V2alpha1CronJobStatus addActiveItem(V1ObjectReference activeItem) {
    if (this.active == null) {
      this.active = new ArrayList<V1ObjectReference>();
    }
    this.active.add(activeItem);
    return this;
  }

  /**
   * A list of pointers to currently running jobs.
   *
   * @return active
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of pointers to currently running jobs.")
  public List<V1ObjectReference> getActive() {
    return active;
  }

  public void setActive(List<V1ObjectReference> active) {
    this.active = active;
  }

  public V2alpha1CronJobStatus lastScheduleTime(DateTime lastScheduleTime) {

    this.lastScheduleTime = lastScheduleTime;
    return this;
  }

  /**
   * Information when was the last time the job was successfully scheduled.
   *
   * @return lastScheduleTime
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Information when was the last time the job was successfully scheduled.")
  public DateTime getLastScheduleTime() {
    return lastScheduleTime;
  }

  public void setLastScheduleTime(DateTime lastScheduleTime) {
    this.lastScheduleTime = lastScheduleTime;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2alpha1CronJobStatus v2alpha1CronJobStatus = (V2alpha1CronJobStatus) o;
    return Objects.equals(this.active, v2alpha1CronJobStatus.active)
        && Objects.equals(this.lastScheduleTime, v2alpha1CronJobStatus.lastScheduleTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, lastScheduleTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2alpha1CronJobStatus {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    lastScheduleTime: ").append(toIndentedString(lastScheduleTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
