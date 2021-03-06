/*
 * API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v0.11.12
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Filtry wyszukiwania obiektów na mapie.
 */
@ApiModel(description = "Filtry wyszukiwania obiektów na mapie.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-19T22:49:09.515+01:00")
public class MapFilters {
  @SerializedName("filters")
  private Map<String, Map<String, String>> filters = null;

  public MapFilters filters(Map<String, Map<String, String>> filters) {
    this.filters = filters;
    return this;
  }

  public MapFilters putFiltersItem(String key, Map<String, String> filtersItem) {
    if (this.filters == null) {
      this.filters = new HashMap<String, Map<String, String>>();
    }
    this.filters.put(key, filtersItem);
    return this;
  }

   /**
   * Mapa filtrów. Dla każdego klucza dostępny słwonik (id, name).
   * @return filters
  **/
  @ApiModelProperty(value = "Mapa filtrów. Dla każdego klucza dostępny słwonik (id, name).")
  public Map<String, Map<String, String>> getFilters() {
    return filters;
  }

  public void setFilters(Map<String, Map<String, String>> filters) {
    this.filters = filters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MapFilters mapFilters = (MapFilters) o;
    return Objects.equals(this.filters, mapFilters.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapFilters {\n");
    
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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

