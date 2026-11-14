package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Task;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TaskListResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-14T23:26:46.713961100+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.27.0")
public class TaskListResponse {

  private List<@Valid Task> items = new ArrayList<>();

  private Integer page;

  private Integer pageSize;

  private Integer totalItems;

  public TaskListResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TaskListResponse(List<@Valid Task> items, Integer page, Integer pageSize, Integer totalItems) {
    this.items = items;
    this.page = page;
    this.pageSize = pageSize;
    this.totalItems = totalItems;
  }

  public TaskListResponse items(List<@Valid Task> items) {
    this.items = items;
    return this;
  }

  public TaskListResponse addItemsItem(Task itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
   */
  @NotNull 
  @Schema(name = "items", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<@Valid Task> getItems() {
    return items;
  }

  @JsonProperty("items")
  public void setItems(List<@Valid Task> items) {
    this.items = items;
  }

  public TaskListResponse page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * minimum: 1
   * @return page
   */
  @NotNull @Min(value = 1) 
  @Schema(name = "page", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("page")
  public Integer getPage() {
    return page;
  }

  @JsonProperty("page")
  public void setPage(Integer page) {
    this.page = page;
  }

  public TaskListResponse pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Get pageSize
   * minimum: 1
   * @return pageSize
   */
  @NotNull @Min(value = 1) 
  @Schema(name = "pageSize", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }

  @JsonProperty("pageSize")
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public TaskListResponse totalItems(Integer totalItems) {
    this.totalItems = totalItems;
    return this;
  }

  /**
   * Get totalItems
   * minimum: 0
   * @return totalItems
   */
  @NotNull @Min(value = 0) 
  @Schema(name = "totalItems", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalItems")
  public Integer getTotalItems() {
    return totalItems;
  }

  @JsonProperty("totalItems")
  public void setTotalItems(Integer totalItems) {
    this.totalItems = totalItems;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskListResponse taskListResponse = (TaskListResponse) o;
    return Objects.equals(this.items, taskListResponse.items) &&
        Objects.equals(this.page, taskListResponse.page) &&
        Objects.equals(this.pageSize, taskListResponse.pageSize) &&
        Objects.equals(this.totalItems, taskListResponse.totalItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, page, pageSize, totalItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskListResponse {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalItems: ").append(toIndentedString(totalItems)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

