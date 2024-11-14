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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.MatrixGenericType;
import org.openapitools.client.model.MatrixPriceType;
import org.openapitools.client.model.MatrixWeightType;
import org.openapitools.client.model.ProductconfiguratorPropertyMode;
import org.openapitools.client.model.ProductconfiguratormatrixStep;

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
 * ProductconfiguratormatrixEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-14T11:48:19.673728597Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ProductconfiguratormatrixEntity {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_GRN = "grn";
  @SerializedName(SERIALIZED_NAME_GRN)
  private String grn;

  public static final String SERIALIZED_NAME_CONFIGURATOR_ID = "configuratorId";
  @SerializedName(SERIALIZED_NAME_CONFIGURATOR_ID)
  private String configuratorId;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_DEFAULT_PROPERTY_ID = "defaultPropertyId";
  @SerializedName(SERIALIZED_NAME_DEFAULT_PROPERTY_ID)
  private String defaultPropertyId;

  public static final String SERIALIZED_NAME_PROPERTIES_MODE = "propertiesMode";
  @SerializedName(SERIALIZED_NAME_PROPERTIES_MODE)
  private ProductconfiguratorPropertyMode propertiesMode = ProductconfiguratorPropertyMode.UNKNOWN;

  public static final String SERIALIZED_NAME_GENERIC_TYPE = "genericType";
  @SerializedName(SERIALIZED_NAME_GENERIC_TYPE)
  private MatrixGenericType genericType;

  public static final String SERIALIZED_NAME_PRICE_TYPE = "priceType";
  @SerializedName(SERIALIZED_NAME_PRICE_TYPE)
  private MatrixPriceType priceType;

  public static final String SERIALIZED_NAME_WEIGHT_TYPE = "weightType";
  @SerializedName(SERIALIZED_NAME_WEIGHT_TYPE)
  private MatrixWeightType weightType;

  public static final String SERIALIZED_NAME_STEPS = "steps";
  @SerializedName(SERIALIZED_NAME_STEPS)
  private List<ProductconfiguratormatrixStep> steps = new ArrayList<>();

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public ProductconfiguratormatrixEntity() {
  }

  public ProductconfiguratormatrixEntity id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public ProductconfiguratormatrixEntity grn(String grn) {
    this.grn = grn;
    return this;
  }

  /**
   * Get grn
   * @return grn
   */
  @javax.annotation.Nullable
  public String getGrn() {
    return grn;
  }

  public void setGrn(String grn) {
    this.grn = grn;
  }


  public ProductconfiguratormatrixEntity configuratorId(String configuratorId) {
    this.configuratorId = configuratorId;
    return this;
  }

  /**
   * Get configuratorId
   * @return configuratorId
   */
  @javax.annotation.Nullable
  public String getConfiguratorId() {
    return configuratorId;
  }

  public void setConfiguratorId(String configuratorId) {
    this.configuratorId = configuratorId;
  }


  public ProductconfiguratormatrixEntity label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
   */
  @javax.annotation.Nullable
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }


  public ProductconfiguratormatrixEntity defaultPropertyId(String defaultPropertyId) {
    this.defaultPropertyId = defaultPropertyId;
    return this;
  }

  /**
   * Get defaultPropertyId
   * @return defaultPropertyId
   */
  @javax.annotation.Nullable
  public String getDefaultPropertyId() {
    return defaultPropertyId;
  }

  public void setDefaultPropertyId(String defaultPropertyId) {
    this.defaultPropertyId = defaultPropertyId;
  }


  public ProductconfiguratormatrixEntity propertiesMode(ProductconfiguratorPropertyMode propertiesMode) {
    this.propertiesMode = propertiesMode;
    return this;
  }

  /**
   * Get propertiesMode
   * @return propertiesMode
   */
  @javax.annotation.Nullable
  public ProductconfiguratorPropertyMode getPropertiesMode() {
    return propertiesMode;
  }

  public void setPropertiesMode(ProductconfiguratorPropertyMode propertiesMode) {
    this.propertiesMode = propertiesMode;
  }


  public ProductconfiguratormatrixEntity genericType(MatrixGenericType genericType) {
    this.genericType = genericType;
    return this;
  }

  /**
   * Get genericType
   * @return genericType
   */
  @javax.annotation.Nullable
  public MatrixGenericType getGenericType() {
    return genericType;
  }

  public void setGenericType(MatrixGenericType genericType) {
    this.genericType = genericType;
  }


  public ProductconfiguratormatrixEntity priceType(MatrixPriceType priceType) {
    this.priceType = priceType;
    return this;
  }

  /**
   * Get priceType
   * @return priceType
   */
  @javax.annotation.Nullable
  public MatrixPriceType getPriceType() {
    return priceType;
  }

  public void setPriceType(MatrixPriceType priceType) {
    this.priceType = priceType;
  }


  public ProductconfiguratormatrixEntity weightType(MatrixWeightType weightType) {
    this.weightType = weightType;
    return this;
  }

  /**
   * Get weightType
   * @return weightType
   */
  @javax.annotation.Nullable
  public MatrixWeightType getWeightType() {
    return weightType;
  }

  public void setWeightType(MatrixWeightType weightType) {
    this.weightType = weightType;
  }


  public ProductconfiguratormatrixEntity steps(List<ProductconfiguratormatrixStep> steps) {
    this.steps = steps;
    return this;
  }

  public ProductconfiguratormatrixEntity addStepsItem(ProductconfiguratormatrixStep stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    return this;
  }

  /**
   * Get steps
   * @return steps
   */
  @javax.annotation.Nullable
  public List<ProductconfiguratormatrixStep> getSteps() {
    return steps;
  }

  public void setSteps(List<ProductconfiguratormatrixStep> steps) {
    this.steps = steps;
  }


  public ProductconfiguratormatrixEntity createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ProductconfiguratormatrixEntity updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
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
   * @return the ProductconfiguratormatrixEntity instance itself
   */
  public ProductconfiguratormatrixEntity putAdditionalProperty(String key, Object value) {
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
    ProductconfiguratormatrixEntity productconfiguratormatrixEntity = (ProductconfiguratormatrixEntity) o;
    return Objects.equals(this.id, productconfiguratormatrixEntity.id) &&
        Objects.equals(this.grn, productconfiguratormatrixEntity.grn) &&
        Objects.equals(this.configuratorId, productconfiguratormatrixEntity.configuratorId) &&
        Objects.equals(this.label, productconfiguratormatrixEntity.label) &&
        Objects.equals(this.defaultPropertyId, productconfiguratormatrixEntity.defaultPropertyId) &&
        Objects.equals(this.propertiesMode, productconfiguratormatrixEntity.propertiesMode) &&
        Objects.equals(this.genericType, productconfiguratormatrixEntity.genericType) &&
        Objects.equals(this.priceType, productconfiguratormatrixEntity.priceType) &&
        Objects.equals(this.weightType, productconfiguratormatrixEntity.weightType) &&
        Objects.equals(this.steps, productconfiguratormatrixEntity.steps) &&
        Objects.equals(this.createdAt, productconfiguratormatrixEntity.createdAt) &&
        Objects.equals(this.updatedAt, productconfiguratormatrixEntity.updatedAt)&&
        Objects.equals(this.additionalProperties, productconfiguratormatrixEntity.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, grn, configuratorId, label, defaultPropertyId, propertiesMode, genericType, priceType, weightType, steps, createdAt, updatedAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductconfiguratormatrixEntity {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    grn: ").append(toIndentedString(grn)).append("\n");
    sb.append("    configuratorId: ").append(toIndentedString(configuratorId)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    defaultPropertyId: ").append(toIndentedString(defaultPropertyId)).append("\n");
    sb.append("    propertiesMode: ").append(toIndentedString(propertiesMode)).append("\n");
    sb.append("    genericType: ").append(toIndentedString(genericType)).append("\n");
    sb.append("    priceType: ").append(toIndentedString(priceType)).append("\n");
    sb.append("    weightType: ").append(toIndentedString(weightType)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("grn");
    openapiFields.add("configuratorId");
    openapiFields.add("label");
    openapiFields.add("defaultPropertyId");
    openapiFields.add("propertiesMode");
    openapiFields.add("genericType");
    openapiFields.add("priceType");
    openapiFields.add("weightType");
    openapiFields.add("steps");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProductconfiguratormatrixEntity
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductconfiguratormatrixEntity.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductconfiguratormatrixEntity is not found in the empty JSON string", ProductconfiguratormatrixEntity.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("grn") != null && !jsonObj.get("grn").isJsonNull()) && !jsonObj.get("grn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `grn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("grn").toString()));
      }
      if ((jsonObj.get("configuratorId") != null && !jsonObj.get("configuratorId").isJsonNull()) && !jsonObj.get("configuratorId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `configuratorId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("configuratorId").toString()));
      }
      if ((jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      if ((jsonObj.get("defaultPropertyId") != null && !jsonObj.get("defaultPropertyId").isJsonNull()) && !jsonObj.get("defaultPropertyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `defaultPropertyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("defaultPropertyId").toString()));
      }
      // validate the optional field `propertiesMode`
      if (jsonObj.get("propertiesMode") != null && !jsonObj.get("propertiesMode").isJsonNull()) {
        ProductconfiguratorPropertyMode.validateJsonElement(jsonObj.get("propertiesMode"));
      }
      // validate the optional field `genericType`
      if (jsonObj.get("genericType") != null && !jsonObj.get("genericType").isJsonNull()) {
        MatrixGenericType.validateJsonElement(jsonObj.get("genericType"));
      }
      // validate the optional field `priceType`
      if (jsonObj.get("priceType") != null && !jsonObj.get("priceType").isJsonNull()) {
        MatrixPriceType.validateJsonElement(jsonObj.get("priceType"));
      }
      // validate the optional field `weightType`
      if (jsonObj.get("weightType") != null && !jsonObj.get("weightType").isJsonNull()) {
        MatrixWeightType.validateJsonElement(jsonObj.get("weightType"));
      }
      if (jsonObj.get("steps") != null && !jsonObj.get("steps").isJsonNull()) {
        JsonArray jsonArraysteps = jsonObj.getAsJsonArray("steps");
        if (jsonArraysteps != null) {
          // ensure the json data is an array
          if (!jsonObj.get("steps").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `steps` to be an array in the JSON string but got `%s`", jsonObj.get("steps").toString()));
          }

          // validate the optional field `steps` (array)
          for (int i = 0; i < jsonArraysteps.size(); i++) {
            ProductconfiguratormatrixStep.validateJsonElement(jsonArraysteps.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductconfiguratormatrixEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductconfiguratormatrixEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductconfiguratormatrixEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductconfiguratormatrixEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductconfiguratormatrixEntity>() {
           @Override
           public void write(JsonWriter out, ProductconfiguratormatrixEntity value) throws IOException {
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
           public ProductconfiguratormatrixEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ProductconfiguratormatrixEntity instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of ProductconfiguratormatrixEntity given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProductconfiguratormatrixEntity
   * @throws IOException if the JSON string is invalid with respect to ProductconfiguratormatrixEntity
   */
  public static ProductconfiguratormatrixEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductconfiguratormatrixEntity.class);
  }

  /**
   * Convert an instance of ProductconfiguratormatrixEntity to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

