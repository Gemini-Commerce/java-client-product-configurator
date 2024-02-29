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
 * ProductconfiguratorstepUpdatePayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T14:09:51.605522921Z[Etc/UTC]")
public class ProductconfiguratorstepUpdatePayload {
  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private LocalisationLocalizedText label;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private LocalisationLocalizedText description;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private String position;

  public static final String SERIALIZED_NAME_IS_REQUIRED = "isRequired";
  @SerializedName(SERIALIZED_NAME_IS_REQUIRED)
  private Boolean isRequired;

  public static final String SERIALIZED_NAME_SUBJECT_TO_STEP_ID = "subjectToStepId";
  @SerializedName(SERIALIZED_NAME_SUBJECT_TO_STEP_ID)
  private String subjectToStepId;

  public static final String SERIALIZED_NAME_HAS_MULTIPLE_SELECTION = "hasMultipleSelection";
  @SerializedName(SERIALIZED_NAME_HAS_MULTIPLE_SELECTION)
  private Boolean hasMultipleSelection;

  public static final String SERIALIZED_NAME_OPTIONS_HAVE_QUANTITY = "optionsHaveQuantity";
  @SerializedName(SERIALIZED_NAME_OPTIONS_HAVE_QUANTITY)
  private Boolean optionsHaveQuantity;

  public ProductconfiguratorstepUpdatePayload() {
  }

  public ProductconfiguratorstepUpdatePayload label(LocalisationLocalizedText label) {
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


  public ProductconfiguratorstepUpdatePayload description(LocalisationLocalizedText description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  public LocalisationLocalizedText getDescription() {
    return description;
  }

  public void setDescription(LocalisationLocalizedText description) {
    this.description = description;
  }


  public ProductconfiguratorstepUpdatePayload position(String position) {
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


  public ProductconfiguratorstepUpdatePayload isRequired(Boolean isRequired) {
    this.isRequired = isRequired;
    return this;
  }

   /**
   * Get isRequired
   * @return isRequired
  **/
  @javax.annotation.Nullable
  public Boolean getIsRequired() {
    return isRequired;
  }

  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }


  public ProductconfiguratorstepUpdatePayload subjectToStepId(String subjectToStepId) {
    this.subjectToStepId = subjectToStepId;
    return this;
  }

   /**
   * Get subjectToStepId
   * @return subjectToStepId
  **/
  @javax.annotation.Nullable
  public String getSubjectToStepId() {
    return subjectToStepId;
  }

  public void setSubjectToStepId(String subjectToStepId) {
    this.subjectToStepId = subjectToStepId;
  }


  public ProductconfiguratorstepUpdatePayload hasMultipleSelection(Boolean hasMultipleSelection) {
    this.hasMultipleSelection = hasMultipleSelection;
    return this;
  }

   /**
   * Get hasMultipleSelection
   * @return hasMultipleSelection
  **/
  @javax.annotation.Nullable
  public Boolean getHasMultipleSelection() {
    return hasMultipleSelection;
  }

  public void setHasMultipleSelection(Boolean hasMultipleSelection) {
    this.hasMultipleSelection = hasMultipleSelection;
  }


  public ProductconfiguratorstepUpdatePayload optionsHaveQuantity(Boolean optionsHaveQuantity) {
    this.optionsHaveQuantity = optionsHaveQuantity;
    return this;
  }

   /**
   * Get optionsHaveQuantity
   * @return optionsHaveQuantity
  **/
  @javax.annotation.Nullable
  public Boolean getOptionsHaveQuantity() {
    return optionsHaveQuantity;
  }

  public void setOptionsHaveQuantity(Boolean optionsHaveQuantity) {
    this.optionsHaveQuantity = optionsHaveQuantity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductconfiguratorstepUpdatePayload productconfiguratorstepUpdatePayload = (ProductconfiguratorstepUpdatePayload) o;
    return Objects.equals(this.label, productconfiguratorstepUpdatePayload.label) &&
        Objects.equals(this.description, productconfiguratorstepUpdatePayload.description) &&
        Objects.equals(this.position, productconfiguratorstepUpdatePayload.position) &&
        Objects.equals(this.isRequired, productconfiguratorstepUpdatePayload.isRequired) &&
        Objects.equals(this.subjectToStepId, productconfiguratorstepUpdatePayload.subjectToStepId) &&
        Objects.equals(this.hasMultipleSelection, productconfiguratorstepUpdatePayload.hasMultipleSelection) &&
        Objects.equals(this.optionsHaveQuantity, productconfiguratorstepUpdatePayload.optionsHaveQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, description, position, isRequired, subjectToStepId, hasMultipleSelection, optionsHaveQuantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductconfiguratorstepUpdatePayload {\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    subjectToStepId: ").append(toIndentedString(subjectToStepId)).append("\n");
    sb.append("    hasMultipleSelection: ").append(toIndentedString(hasMultipleSelection)).append("\n");
    sb.append("    optionsHaveQuantity: ").append(toIndentedString(optionsHaveQuantity)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("position");
    openapiFields.add("isRequired");
    openapiFields.add("subjectToStepId");
    openapiFields.add("hasMultipleSelection");
    openapiFields.add("optionsHaveQuantity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ProductconfiguratorstepUpdatePayload
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductconfiguratorstepUpdatePayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductconfiguratorstepUpdatePayload is not found in the empty JSON string", ProductconfiguratorstepUpdatePayload.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductconfiguratorstepUpdatePayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductconfiguratorstepUpdatePayload` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `label`
      if (jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) {
        LocalisationLocalizedText.validateJsonElement(jsonObj.get("label"));
      }
      // validate the optional field `description`
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) {
        LocalisationLocalizedText.validateJsonElement(jsonObj.get("description"));
      }
      if ((jsonObj.get("position") != null && !jsonObj.get("position").isJsonNull()) && !jsonObj.get("position").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `position` to be a primitive type in the JSON string but got `%s`", jsonObj.get("position").toString()));
      }
      if ((jsonObj.get("subjectToStepId") != null && !jsonObj.get("subjectToStepId").isJsonNull()) && !jsonObj.get("subjectToStepId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subjectToStepId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subjectToStepId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductconfiguratorstepUpdatePayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductconfiguratorstepUpdatePayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductconfiguratorstepUpdatePayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductconfiguratorstepUpdatePayload.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductconfiguratorstepUpdatePayload>() {
           @Override
           public void write(JsonWriter out, ProductconfiguratorstepUpdatePayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductconfiguratorstepUpdatePayload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductconfiguratorstepUpdatePayload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductconfiguratorstepUpdatePayload
  * @throws IOException if the JSON string is invalid with respect to ProductconfiguratorstepUpdatePayload
  */
  public static ProductconfiguratorstepUpdatePayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductconfiguratorstepUpdatePayload.class);
  }

 /**
  * Convert an instance of ProductconfiguratorstepUpdatePayload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

