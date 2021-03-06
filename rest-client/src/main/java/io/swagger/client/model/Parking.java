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
import io.swagger.client.model.GeoPoint;
import io.swagger.client.model.MapAddress;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Parking
 */
@ApiModel(description = "Parking")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-19T22:49:09.515+01:00")
public class Parking {
  @SerializedName("spacesCount")
  private Integer spacesCount = null;

  @SerializedName("location")
  private GeoPoint location = null;

  @SerializedName("address")
  private MapAddress address = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("availableSpacesCount")
  private Integer availableSpacesCount = null;

  @SerializedName("chargers")
  private List<UUID> chargers = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("name")
  private String name = null;

  public Parking spacesCount(Integer spacesCount) {
    this.spacesCount = spacesCount;
    return this;
  }

   /**
   * Liczba miejsc postojowych
   * @return spacesCount
  **/
  @ApiModelProperty(value = "Liczba miejsc postojowych")
  public Integer getSpacesCount() {
    return spacesCount;
  }

  public void setSpacesCount(Integer spacesCount) {
    this.spacesCount = spacesCount;
  }

  public Parking location(GeoPoint location) {
    this.location = location;
    return this;
  }

   /**
   * Współrzędne
   * @return location
  **/
  @ApiModelProperty(value = "Współrzędne")
  public GeoPoint getLocation() {
    return location;
  }

  public void setLocation(GeoPoint location) {
    this.location = location;
  }

  public Parking address(MapAddress address) {
    this.address = address;
    return this;
  }

   /**
   * Adres
   * @return address
  **/
  @ApiModelProperty(value = "Adres")
  public MapAddress getAddress() {
    return address;
  }

  public void setAddress(MapAddress address) {
    this.address = address;
  }

  public Parking id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Identyfikator
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Identyfikator")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Parking availableSpacesCount(Integer availableSpacesCount) {
    this.availableSpacesCount = availableSpacesCount;
    return this;
  }

   /**
   * Liczba wolnych miejsc
   * @return availableSpacesCount
  **/
  @ApiModelProperty(value = "Liczba wolnych miejsc")
  public Integer getAvailableSpacesCount() {
    return availableSpacesCount;
  }

  public void setAvailableSpacesCount(Integer availableSpacesCount) {
    this.availableSpacesCount = availableSpacesCount;
  }

  public Parking chargers(List<UUID> chargers) {
    this.chargers = chargers;
    return this;
  }

  public Parking addChargersItem(UUID chargersItem) {
    if (this.chargers == null) {
      this.chargers = new ArrayList<UUID>();
    }
    this.chargers.add(chargersItem);
    return this;
  }

   /**
   * List identyfikatorów ładowarek na parkingu
   * @return chargers
  **/
  @ApiModelProperty(value = "List identyfikatorów ładowarek na parkingu")
  public List<UUID> getChargers() {
    return chargers;
  }

  public void setChargers(List<UUID> chargers) {
    this.chargers = chargers;
  }

  public Parking description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Opis
   * @return description
  **/
  @ApiModelProperty(value = "Opis")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Parking name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Nazwa
   * @return name
  **/
  @ApiModelProperty(value = "Nazwa")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Parking parking = (Parking) o;
    return Objects.equals(this.spacesCount, parking.spacesCount) &&
        Objects.equals(this.location, parking.location) &&
        Objects.equals(this.address, parking.address) &&
        Objects.equals(this.id, parking.id) &&
        Objects.equals(this.availableSpacesCount, parking.availableSpacesCount) &&
        Objects.equals(this.chargers, parking.chargers) &&
        Objects.equals(this.description, parking.description) &&
        Objects.equals(this.name, parking.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spacesCount, location, address, id, availableSpacesCount, chargers, description, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Parking {\n");
    
    sb.append("    spacesCount: ").append(toIndentedString(spacesCount)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    availableSpacesCount: ").append(toIndentedString(availableSpacesCount)).append("\n");
    sb.append("    chargers: ").append(toIndentedString(chargers)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

