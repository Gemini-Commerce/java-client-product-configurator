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
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.ProductconfiguratorpropertyGenericProperty;
import org.openapitools.client.model.ProductconfiguratorpropertyPriceProperty;
import org.openapitools.client.model.ProductconfiguratorpropertyWeightProperty;

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
 * ProductconfiguratorpropertyBulkCreateRequestCreateEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T14:09:51.605522921Z[Etc/UTC]")
public class ProductconfiguratorpropertyBulkCreateRequestCreateEntity {
  public static final String SERIALIZED_NAME_STEP_ID_TO_OPTION_ID = "stepIdToOptionId";
  @SerializedName(SERIALIZED_NAME_STEP_ID_TO_OPTION_ID)
  private Map<String, String> stepIdToOptionId = new HashMap<>();

  public static final String SERIALIZED_NAME_GENERIC_PROPERTY = "genericProperty";
  @SerializedName(SERIALIZED_NAME_GENERIC_PROPERTY)
  private ProductconfiguratorpropertyGenericProperty genericProperty;

  public static final String SERIALIZED_NAME_PRICE_PROPERTY = "priceProperty";
  @SerializedName(SERIALIZED_NAME_PRICE_PROPERTY)
  private ProductconfiguratorpropertyPriceProperty priceProperty;

  public static final String SERIALIZED_NAME_WEIGHT_PROPERTY = "weightProperty";
  @SerializedName(SERIALIZED_NAME_WEIGHT_PROPERTY)
  private ProductconfiguratorpropertyWeightProperty weightProperty;

  public ProductconfiguratorpropertyBulkCreateRequestCreateEntity() {
  }

  public ProductconfiguratorpropertyBulkCreateRequestCreateEntity stepIdToOptionId(Map<String, String> stepIdToOptionId) {
    this.stepIdToOptionId = stepIdToOptionId;
    return this;
  }

  public ProductconfiguratorpropertyBulkCreateRequestCreateEntity putStepIdToOptionIdItem(String key, String stepIdToOptionIdItem) {
    if (this.stepIdToOptionId == null) {
      this.stepIdToOptionId = new HashMap<>();
    }
    this.stepIdToOptionId.put(key, stepIdToOptionIdItem);
    return this;
  }

   /**
   * Get stepIdToOptionId
   * @return stepIdToOptionId
  **/
  @javax.annotation.Nullable
  public Map<String, String> getStepIdToOptionId() {
    return stepIdToOptionId;
  }

  public void setStepIdToOptionId(Map<String, String> stepIdToOptionId) {
    this.stepIdToOptionId = stepIdToOptionId;
  }


  public ProductconfiguratorpropertyBulkCreateRequestCreateEntity genericProperty(ProductconfiguratorpropertyGenericProperty genericProperty) {
    this.genericProperty = genericProperty;
    return this;
  }

   /**
   * Get genericProperty
   * @return genericProperty
  **/
  @javax.annotation.Nullable
  public ProductconfiguratorpropertyGenericProperty getGenericProperty() {
    return genericProperty;
  }

  public void setGenericProperty(ProductconfiguratorpropertyGenericProperty genericProperty) {
    this.genericProperty = genericProperty;
  }


  public ProductconfiguratorpropertyBulkCreateRequestCreateEntity priceProperty(ProductconfiguratorpropertyPriceProperty priceProperty) {
    this.priceProperty = priceProperty;
    return this;
  }

   /**
   * Get priceProperty
   * @return priceProperty
  **/
  @javax.annotation.Nullable
  public ProductconfiguratorpropertyPriceProperty getPriceProperty() {
    return priceProperty;
  }

  public void setPriceProperty(ProductconfiguratorpropertyPriceProperty priceProperty) {
    this.priceProperty = priceProperty;
  }


  public ProductconfiguratorpropertyBulkCreateRequestCreateEntity weightProperty(ProductconfiguratorpropertyWeightProperty weightProperty) {
    this.weightProperty = weightProperty;
    return this;
  }

   /**
   * Get weightProperty
   * @return weightProperty
  **/
  @javax.annotation.Nullable
  public ProductconfiguratorpropertyWeightProperty getWeightProperty() {
    return weightProperty;
  }

  public void setWeightProperty(ProductconfiguratorpropertyWeightProperty weightProperty) {
    this.weightProperty = weightProperty;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductconfiguratorpropertyBulkCreateRequestCreateEntity productconfiguratorpropertyBulkCreateRequestCreateEntity = (ProductconfiguratorpropertyBulkCreateRequestCreateEntity) o;
    return Objects.equals(this.stepIdToOptionId, productconfiguratorpropertyBulkCreateRequestCreateEntity.stepIdToOptionId) &&
        Objects.equals(this.genericProperty, productconfiguratorpropertyBulkCreateRequestCreateEntity.genericProperty) &&
        Objects.equals(this.priceProperty, productconfiguratorpropertyBulkCreateRequestCreateEntity.priceProperty) &&
        Objects.equals(this.weightProperty, productconfiguratorpropertyBulkCreateRequestCreateEntity.weightProperty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stepIdToOptionId, genericProperty, priceProperty, weightProperty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductconfiguratorpropertyBulkCreateRequestCreateEntity {\n");
    sb.append("    stepIdToOptionId: ").append(toIndentedString(stepIdToOptionId)).append("\n");
    sb.append("    genericProperty: ").append(toIndentedString(genericProperty)).append("\n");
    sb.append("    priceProperty: ").append(toIndentedString(priceProperty)).append("\n");
    sb.append("    weightProperty: ").append(toIndentedString(weightProperty)).append("\n");
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
    openapiFields.add("stepIdToOptionId");
    openapiFields.add("genericProperty");
    openapiFields.add("priceProperty");
    openapiFields.add("weightProperty");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ProductconfiguratorpropertyBulkCreateRequestCreateEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductconfiguratorpropertyBulkCreateRequestCreateEntity.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductconfiguratorpropertyBulkCreateRequestCreateEntity is not found in the empty JSON string", ProductconfiguratorpropertyBulkCreateRequestCreateEntity.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductconfiguratorpropertyBulkCreateRequestCreateEntity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductconfiguratorpropertyBulkCreateRequestCreateEntity` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `genericProperty`
      if (jsonObj.get("genericProperty") != null && !jsonObj.get("genericProperty").isJsonNull()) {
        ProductconfiguratorpropertyGenericProperty.validateJsonElement(jsonObj.get("genericProperty"));
      }
      // validate the optional field `priceProperty`
      if (jsonObj.get("priceProperty") != null && !jsonObj.get("priceProperty").isJsonNull()) {
        ProductconfiguratorpropertyPriceProperty.validateJsonElement(jsonObj.get("priceProperty"));
      }
      // validate the optional field `weightProperty`
      if (jsonObj.get("weightProperty") != null && !jsonObj.get("weightProperty").isJsonNull()) {
        ProductconfiguratorpropertyWeightProperty.validateJsonElement(jsonObj.get("weightProperty"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductconfiguratorpropertyBulkCreateRequestCreateEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductconfiguratorpropertyBulkCreateRequestCreateEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductconfiguratorpropertyBulkCreateRequestCreateEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductconfiguratorpropertyBulkCreateRequestCreateEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductconfiguratorpropertyBulkCreateRequestCreateEntity>() {
           @Override
           public void write(JsonWriter out, ProductconfiguratorpropertyBulkCreateRequestCreateEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductconfiguratorpropertyBulkCreateRequestCreateEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductconfiguratorpropertyBulkCreateRequestCreateEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductconfiguratorpropertyBulkCreateRequestCreateEntity
  * @throws IOException if the JSON string is invalid with respect to ProductconfiguratorpropertyBulkCreateRequestCreateEntity
  */
  public static ProductconfiguratorpropertyBulkCreateRequestCreateEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductconfiguratorpropertyBulkCreateRequestCreateEntity.class);
  }

 /**
  * Convert an instance of ProductconfiguratorpropertyBulkCreateRequestCreateEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

