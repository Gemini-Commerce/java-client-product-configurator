/*
 * Product Configurator Service
 * ## Introduction  This comprehensive guide will equip you with the knowledge to integrate and leverage our Product Configurator Service in your applications.  ## Quick Start  Get up and running in no time! Follow these steps to kickstart your integration:  1. **Authentication:** Obtain your integration JWT to authenticate your requests. 2. **Client Libraries:** Explore our GitHub repositories to grab client libraries in your preferred programming language. 3. **API Overview:** Familiarize yourself with our RESTful API using the OpenAPI specification.  ## Integration  ### API Overview  Our RESTful API is the gateway to unlocking the full potential of Product Configurator. Check out the detailed [API Reference](/docs/category/configurator) for a granular understanding of each endpoint and request/response format.  ### Client Libraries  To expedite your integration process, we provide client libraries for various programming languages. Find the one that suits your stack in our [GitHub repositories](https://github.com/Gemini-Commerce).  ### Authentication  Security is paramount. Learn how to authenticate your requests using JWT. This ensures a secure and reliable connection between your application and Product Configurator.  ## Configuration Management  ### Configurator Lifecycle  Understand the lifecycle of configurators, from draft to active and deleted. This flexibility allows you to manage configurations at your own pace.  ### Steps and Options  Configure product steps with ease and define options effortlessly. Explore the power of dependencies to create dynamic and intuitive configurations.  ### Matrices  Delve into matrices—your secret weapon. Explore price and weight matrices, and learn how configured steps influence properties and pricing.  ### Price Management  Unleash dynamic pricing with our versatile price matrices. From fixed prices to incremental structures, adapt to diverse pricing models effortlessly.  ## Security  Your data is in safe hands. Discover how Product Configurator ensures security through JWT authentication, safeguarding your sensitive information.  ## Backward Compatibility  Stay ahead of the curve. Learn about our versioning strategy, providing backward compatibility while allowing our service to evolve seamlessly.  ## Developer Support  Have questions? Need assistance? Write to us at [info@gemini-commerce.com](mailto:info@gemini-commerce.com) and we will get back to you.
 *
 * The version of the OpenAPI document: v1
 * Contact: info@gemini-commerce.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ConfigurationOptionProperty;
import org.openapitools.client.model.LocalisationLocalizedText;
import org.openapitools.client.model.OptionSwatch;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import GeminiCommerce_ProductConfigurator.JSON;

/**
 * ProductconfiguratorconfigurationOption
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T14:09:51.605522921Z[Etc/UTC]")
public class ProductconfiguratorconfigurationOption {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_GRN = "grn";
  @SerializedName(SERIALIZED_NAME_GRN)
  private String grn;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private LocalisationLocalizedText label;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private String position;

  public static final String SERIALIZED_NAME_SWATCH = "swatch";
  @SerializedName(SERIALIZED_NAME_SWATCH)
  private OptionSwatch swatch;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_OPTION_PROPERTIES = "optionProperties";
  @SerializedName(SERIALIZED_NAME_OPTION_PROPERTIES)
  private List<ConfigurationOptionProperty> optionProperties;

  public static final String SERIALIZED_NAME_HAS_QUANTITY = "hasQuantity";
  @SerializedName(SERIALIZED_NAME_HAS_QUANTITY)
  private Boolean hasQuantity;

  public ProductconfiguratorconfigurationOption() {
  }

  public ProductconfiguratorconfigurationOption id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public ProductconfiguratorconfigurationOption grn(String grn) {
    this.grn = grn;
    return this;
  }

   /**
   * Get grn
   * @return grn
  **/
  @javax.annotation.Nullable
  public String getGrn() {
    return grn;
  }

  public void setGrn(String grn) {
    this.grn = grn;
  }


  public ProductconfiguratorconfigurationOption label(LocalisationLocalizedText label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @javax.annotation.Nullable
  public LocalisationLocalizedText getLabel() {
    return label;
  }

  public void setLabel(LocalisationLocalizedText label) {
    this.label = label;
  }


  public ProductconfiguratorconfigurationOption position(String position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @javax.annotation.Nullable
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }


  public ProductconfiguratorconfigurationOption swatch(OptionSwatch swatch) {
    this.swatch = swatch;
    return this;
  }

   /**
   * Get swatch
   * @return swatch
  **/
  @javax.annotation.Nullable
  public OptionSwatch getSwatch() {
    return swatch;
  }

  public void setSwatch(OptionSwatch swatch) {
    this.swatch = swatch;
  }


  public ProductconfiguratorconfigurationOption enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public ProductconfiguratorconfigurationOption optionProperties(List<ConfigurationOptionProperty> optionProperties) {
    this.optionProperties = optionProperties;
    return this;
  }

  public ProductconfiguratorconfigurationOption addOptionPropertiesItem(ConfigurationOptionProperty optionPropertiesItem) {
    if (this.optionProperties == null) {
      this.optionProperties = new ArrayList<>();
    }
    this.optionProperties.add(optionPropertiesItem);
    return this;
  }

   /**
   * Get optionProperties
   * @return optionProperties
  **/
  @javax.annotation.Nullable
  public List<ConfigurationOptionProperty> getOptionProperties() {
    return optionProperties;
  }

  public void setOptionProperties(List<ConfigurationOptionProperty> optionProperties) {
    this.optionProperties = optionProperties;
  }


  public ProductconfiguratorconfigurationOption hasQuantity(Boolean hasQuantity) {
    this.hasQuantity = hasQuantity;
    return this;
  }

   /**
   * Get hasQuantity
   * @return hasQuantity
  **/
  @javax.annotation.Nullable
  public Boolean getHasQuantity() {
    return hasQuantity;
  }

  public void setHasQuantity(Boolean hasQuantity) {
    this.hasQuantity = hasQuantity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductconfiguratorconfigurationOption productconfiguratorconfigurationOption = (ProductconfiguratorconfigurationOption) o;
    return Objects.equals(this.id, productconfiguratorconfigurationOption.id) &&
        Objects.equals(this.grn, productconfiguratorconfigurationOption.grn) &&
        Objects.equals(this.label, productconfiguratorconfigurationOption.label) &&
        Objects.equals(this.position, productconfiguratorconfigurationOption.position) &&
        Objects.equals(this.swatch, productconfiguratorconfigurationOption.swatch) &&
        Objects.equals(this.enabled, productconfiguratorconfigurationOption.enabled) &&
        Objects.equals(this.optionProperties, productconfiguratorconfigurationOption.optionProperties) &&
        Objects.equals(this.hasQuantity, productconfiguratorconfigurationOption.hasQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, grn, label, position, swatch, enabled, optionProperties, hasQuantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductconfiguratorconfigurationOption {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    grn: ").append(toIndentedString(grn)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    swatch: ").append(toIndentedString(swatch)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    optionProperties: ").append(toIndentedString(optionProperties)).append("\n");
    sb.append("    hasQuantity: ").append(toIndentedString(hasQuantity)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("grn");
    openapiFields.add("label");
    openapiFields.add("position");
    openapiFields.add("swatch");
    openapiFields.add("enabled");
    openapiFields.add("optionProperties");
    openapiFields.add("hasQuantity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ProductconfiguratorconfigurationOption
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductconfiguratorconfigurationOption.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductconfiguratorconfigurationOption is not found in the empty JSON string", ProductconfiguratorconfigurationOption.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductconfiguratorconfigurationOption.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductconfiguratorconfigurationOption` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("grn") != null && !jsonObj.get("grn").isJsonNull()) && !jsonObj.get("grn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `grn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("grn").toString()));
      }
      // validate the optional field `label`
      if (jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) {
        LocalisationLocalizedText.validateJsonElement(jsonObj.get("label"));
      }
      if ((jsonObj.get("position") != null && !jsonObj.get("position").isJsonNull()) && !jsonObj.get("position").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `position` to be a primitive type in the JSON string but got `%s`", jsonObj.get("position").toString()));
      }
      // validate the optional field `swatch`
      if (jsonObj.get("swatch") != null && !jsonObj.get("swatch").isJsonNull()) {
        OptionSwatch.validateJsonElement(jsonObj.get("swatch"));
      }
      if (jsonObj.get("optionProperties") != null && !jsonObj.get("optionProperties").isJsonNull()) {
        JsonArray jsonArrayoptionProperties = jsonObj.getAsJsonArray("optionProperties");
        if (jsonArrayoptionProperties != null) {
          // ensure the json data is an array
          if (!jsonObj.get("optionProperties").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `optionProperties` to be an array in the JSON string but got `%s`", jsonObj.get("optionProperties").toString()));
          }

          // validate the optional field `optionProperties` (array)
          for (int i = 0; i < jsonArrayoptionProperties.size(); i++) {
            ConfigurationOptionProperty.validateJsonElement(jsonArrayoptionProperties.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductconfiguratorconfigurationOption.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductconfiguratorconfigurationOption' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductconfiguratorconfigurationOption> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductconfiguratorconfigurationOption.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductconfiguratorconfigurationOption>() {
           @Override
           public void write(JsonWriter out, ProductconfiguratorconfigurationOption value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductconfiguratorconfigurationOption read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductconfiguratorconfigurationOption given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductconfiguratorconfigurationOption
  * @throws IOException if the JSON string is invalid with respect to ProductconfiguratorconfigurationOption
  */
  public static ProductconfiguratorconfigurationOption fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductconfiguratorconfigurationOption.class);
  }

 /**
  * Convert an instance of ProductconfiguratorconfigurationOption to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

