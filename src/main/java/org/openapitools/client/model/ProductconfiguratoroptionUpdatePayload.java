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
import java.util.Arrays;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import GeminiCommerce.ProductConfigurator.JSON;

/**
 * ProductconfiguratoroptionUpdatePayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-18T16:41:33.712657063Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ProductconfiguratoroptionUpdatePayload {
  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private LocalisationLocalizedText label;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private String position;

  public static final String SERIALIZED_NAME_EXTERNAL_REFERENCE_ID = "externalReferenceId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_REFERENCE_ID)
  private String externalReferenceId;

  public static final String SERIALIZED_NAME_SWATCH = "swatch";
  @SerializedName(SERIALIZED_NAME_SWATCH)
  private OptionSwatch swatch;

  public ProductconfiguratoroptionUpdatePayload() {
  }

  public ProductconfiguratoroptionUpdatePayload label(LocalisationLocalizedText label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
   */
  @javax.annotation.Nullable
  public LocalisationLocalizedText getLabel() {
    return label;
  }

  public void setLabel(LocalisationLocalizedText label) {
    this.label = label;
  }


  public ProductconfiguratoroptionUpdatePayload position(String position) {
    this.position = position;
    return this;
  }

  /**
   * Get position
   * @return position
   */
  @javax.annotation.Nullable
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }


  public ProductconfiguratoroptionUpdatePayload externalReferenceId(String externalReferenceId) {
    this.externalReferenceId = externalReferenceId;
    return this;
  }

  /**
   * Get externalReferenceId
   * @return externalReferenceId
   */
  @javax.annotation.Nullable
  public String getExternalReferenceId() {
    return externalReferenceId;
  }

  public void setExternalReferenceId(String externalReferenceId) {
    this.externalReferenceId = externalReferenceId;
  }


  public ProductconfiguratoroptionUpdatePayload swatch(OptionSwatch swatch) {
    this.swatch = swatch;
    return this;
  }

  /**
   * Get swatch
   * @return swatch
   */
  @javax.annotation.Nullable
  public OptionSwatch getSwatch() {
    return swatch;
  }

  public void setSwatch(OptionSwatch swatch) {
    this.swatch = swatch;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the ProductconfiguratoroptionUpdatePayload instance itself
   */
  public ProductconfiguratoroptionUpdatePayload putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductconfiguratoroptionUpdatePayload productconfiguratoroptionUpdatePayload = (ProductconfiguratoroptionUpdatePayload) o;
    return Objects.equals(this.label, productconfiguratoroptionUpdatePayload.label) &&
        Objects.equals(this.position, productconfiguratoroptionUpdatePayload.position) &&
        Objects.equals(this.externalReferenceId, productconfiguratoroptionUpdatePayload.externalReferenceId) &&
        Objects.equals(this.swatch, productconfiguratoroptionUpdatePayload.swatch)&&
        Objects.equals(this.additionalProperties, productconfiguratoroptionUpdatePayload.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, position, externalReferenceId, swatch, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductconfiguratoroptionUpdatePayload {\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    externalReferenceId: ").append(toIndentedString(externalReferenceId)).append("\n");
    sb.append("    swatch: ").append(toIndentedString(swatch)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("label");
    openapiFields.add("position");
    openapiFields.add("externalReferenceId");
    openapiFields.add("swatch");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProductconfiguratoroptionUpdatePayload
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductconfiguratoroptionUpdatePayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductconfiguratoroptionUpdatePayload is not found in the empty JSON string", ProductconfiguratoroptionUpdatePayload.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `label`
      if (jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) {
        LocalisationLocalizedText.validateJsonElement(jsonObj.get("label"));
      }
      if ((jsonObj.get("position") != null && !jsonObj.get("position").isJsonNull()) && !jsonObj.get("position").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `position` to be a primitive type in the JSON string but got `%s`", jsonObj.get("position").toString()));
      }
      if ((jsonObj.get("externalReferenceId") != null && !jsonObj.get("externalReferenceId").isJsonNull()) && !jsonObj.get("externalReferenceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalReferenceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalReferenceId").toString()));
      }
      // validate the optional field `swatch`
      if (jsonObj.get("swatch") != null && !jsonObj.get("swatch").isJsonNull()) {
        OptionSwatch.validateJsonElement(jsonObj.get("swatch"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductconfiguratoroptionUpdatePayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductconfiguratoroptionUpdatePayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductconfiguratoroptionUpdatePayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductconfiguratoroptionUpdatePayload.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductconfiguratoroptionUpdatePayload>() {
           @Override
           public void write(JsonWriter out, ProductconfiguratoroptionUpdatePayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductconfiguratoroptionUpdatePayload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ProductconfiguratoroptionUpdatePayload instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ProductconfiguratoroptionUpdatePayload given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProductconfiguratoroptionUpdatePayload
   * @throws IOException if the JSON string is invalid with respect to ProductconfiguratoroptionUpdatePayload
   */
  public static ProductconfiguratoroptionUpdatePayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductconfiguratoroptionUpdatePayload.class);
  }

  /**
   * Convert an instance of ProductconfiguratoroptionUpdatePayload to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

