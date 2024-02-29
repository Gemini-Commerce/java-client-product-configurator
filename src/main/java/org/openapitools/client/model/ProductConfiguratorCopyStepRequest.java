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
 * ProductConfiguratorCopyStepRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T14:09:51.605522921Z[Etc/UTC]")
public class ProductConfiguratorCopyStepRequest {
  public static final String SERIALIZED_NAME_TARGET_CONFIGURATOR_ID = "targetConfiguratorId";
  @SerializedName(SERIALIZED_NAME_TARGET_CONFIGURATOR_ID)
  private String targetConfiguratorId;

  public ProductConfiguratorCopyStepRequest() {
  }

  public ProductConfiguratorCopyStepRequest targetConfiguratorId(String targetConfiguratorId) {
    this.targetConfiguratorId = targetConfiguratorId;
    return this;
  }

   /**
   * Get targetConfiguratorId
   * @return targetConfiguratorId
  **/
  @javax.annotation.Nullable
  public String getTargetConfiguratorId() {
    return targetConfiguratorId;
  }

  public void setTargetConfiguratorId(String targetConfiguratorId) {
    this.targetConfiguratorId = targetConfiguratorId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductConfiguratorCopyStepRequest productConfiguratorCopyStepRequest = (ProductConfiguratorCopyStepRequest) o;
    return Objects.equals(this.targetConfiguratorId, productConfiguratorCopyStepRequest.targetConfiguratorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetConfiguratorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductConfiguratorCopyStepRequest {\n");
    sb.append("    targetConfiguratorId: ").append(toIndentedString(targetConfiguratorId)).append("\n");
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
    openapiFields.add("targetConfiguratorId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ProductConfiguratorCopyStepRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductConfiguratorCopyStepRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductConfiguratorCopyStepRequest is not found in the empty JSON string", ProductConfiguratorCopyStepRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductConfiguratorCopyStepRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductConfiguratorCopyStepRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("targetConfiguratorId") != null && !jsonObj.get("targetConfiguratorId").isJsonNull()) && !jsonObj.get("targetConfiguratorId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetConfiguratorId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetConfiguratorId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductConfiguratorCopyStepRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductConfiguratorCopyStepRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductConfiguratorCopyStepRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductConfiguratorCopyStepRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductConfiguratorCopyStepRequest>() {
           @Override
           public void write(JsonWriter out, ProductConfiguratorCopyStepRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductConfiguratorCopyStepRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductConfiguratorCopyStepRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductConfiguratorCopyStepRequest
  * @throws IOException if the JSON string is invalid with respect to ProductConfiguratorCopyStepRequest
  */
  public static ProductConfiguratorCopyStepRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductConfiguratorCopyStepRequest.class);
  }

 /**
  * Convert an instance of ProductConfiguratorCopyStepRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

