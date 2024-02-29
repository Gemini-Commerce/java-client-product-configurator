# PropertyApi

All URIs are relative to *https://product-configurator.api.gogemini.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**productConfiguratorBulkCreateProperties**](PropertyApi.md#productConfiguratorBulkCreateProperties) | **POST** /v1/{tenantId}/property/create/bulk | Bulk Create Properties |
| [**productConfiguratorBulkUpdateProperties**](PropertyApi.md#productConfiguratorBulkUpdateProperties) | **PUT** /v1/{tenantId}/properties/bulk | Bulk Update Properties |
| [**productConfiguratorCreateProperty**](PropertyApi.md#productConfiguratorCreateProperty) | **POST** /v1/{tenantId}/property/create | Create Property |
| [**productConfiguratorListProperties**](PropertyApi.md#productConfiguratorListProperties) | **POST** /v1/{tenantId}/matrix/{matrixId}/page-size/{pageSize}/properties | List Properties |
| [**productConfiguratorUpdateProperty**](PropertyApi.md#productConfiguratorUpdateProperty) | **PUT** /v1/{tenantId}/property/{propertyId} | Update Property |


<a id="productConfiguratorBulkCreateProperties"></a>
# **productConfiguratorBulkCreateProperties**
> ProductconfiguratorpropertyBulkCreateResponse productConfiguratorBulkCreateProperties(tenantId, body)

Bulk Create Properties

Efficiently add multiple properties to configurations with a bulk create operation. Specify the tenant ID and submit a POST request with the necessary property details in the body for streamlined property management.

### Example
```java
// Import classes:
import GeminiCommerce_ProductConfigurator.ApiClient;
import GeminiCommerce_ProductConfigurator.ApiException;
import GeminiCommerce_ProductConfigurator.Configuration;
import GeminiCommerce_ProductConfigurator.auth.*;
import GeminiCommerce_ProductConfigurator.models.*;
import org.openapitools.client.api.PropertyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product-configurator.api.gogemini.io");
    
    // Configure OAuth2 access token for authorization: standardAuthorization
    OAuth standardAuthorization = (OAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setAccessToken("YOUR ACCESS TOKEN");

    // Configure API key authorization: APIAuthorization
    ApiKeyAuth APIAuthorization = (ApiKeyAuth) defaultClient.getAuthentication("APIAuthorization");
    APIAuthorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIAuthorization.setApiKeyPrefix("Token");

    PropertyApi apiInstance = new PropertyApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    ProductConfiguratorBulkCreatePropertiesRequest body = new ProductConfiguratorBulkCreatePropertiesRequest(); // ProductConfiguratorBulkCreatePropertiesRequest | 
    try {
      ProductconfiguratorpropertyBulkCreateResponse result = apiInstance.productConfiguratorBulkCreateProperties(tenantId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertyApi#productConfiguratorBulkCreateProperties");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantId** | **String**|  | |
| **body** | [**ProductConfiguratorBulkCreatePropertiesRequest**](ProductConfiguratorBulkCreatePropertiesRequest.md)|  | |

### Return type

[**ProductconfiguratorpropertyBulkCreateResponse**](ProductconfiguratorpropertyBulkCreateResponse.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization), [APIAuthorization](../README.md#APIAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request or Limit Exceeded |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productConfiguratorBulkUpdateProperties"></a>
# **productConfiguratorBulkUpdateProperties**
> ProductconfiguratorpropertyBulkUpdateResponse productConfiguratorBulkUpdateProperties(tenantId, body)

Bulk Update Properties

Effortlessly update multiple properties. Specify the tenant ID and submit a PUT request with the updated property details in the body. Streamline the customization of a multitude of properties in one go.

### Example
```java
// Import classes:
import GeminiCommerce_ProductConfigurator.ApiClient;
import GeminiCommerce_ProductConfigurator.ApiException;
import GeminiCommerce_ProductConfigurator.Configuration;
import GeminiCommerce_ProductConfigurator.auth.*;
import GeminiCommerce_ProductConfigurator.models.*;
import org.openapitools.client.api.PropertyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product-configurator.api.gogemini.io");
    
    // Configure OAuth2 access token for authorization: standardAuthorization
    OAuth standardAuthorization = (OAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setAccessToken("YOUR ACCESS TOKEN");

    // Configure API key authorization: APIAuthorization
    ApiKeyAuth APIAuthorization = (ApiKeyAuth) defaultClient.getAuthentication("APIAuthorization");
    APIAuthorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIAuthorization.setApiKeyPrefix("Token");

    PropertyApi apiInstance = new PropertyApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    ProductConfiguratorBulkUpdatePropertiesRequest body = new ProductConfiguratorBulkUpdatePropertiesRequest(); // ProductConfiguratorBulkUpdatePropertiesRequest | 
    try {
      ProductconfiguratorpropertyBulkUpdateResponse result = apiInstance.productConfiguratorBulkUpdateProperties(tenantId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertyApi#productConfiguratorBulkUpdateProperties");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantId** | **String**|  | |
| **body** | [**ProductConfiguratorBulkUpdatePropertiesRequest**](ProductConfiguratorBulkUpdatePropertiesRequest.md)|  | |

### Return type

[**ProductconfiguratorpropertyBulkUpdateResponse**](ProductconfiguratorpropertyBulkUpdateResponse.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization), [APIAuthorization](../README.md#APIAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request or Limit Exceeded |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productConfiguratorCreateProperty"></a>
# **productConfiguratorCreateProperty**
> ProductconfiguratorpropertyEntity productConfiguratorCreateProperty(tenantId, body)

Create Property

Integrate a new property into configurations by specifying the tenant ID. Use a POST request with the required property details in the body for seamless customization and expansion of product configurations.

### Example
```java
// Import classes:
import GeminiCommerce_ProductConfigurator.ApiClient;
import GeminiCommerce_ProductConfigurator.ApiException;
import GeminiCommerce_ProductConfigurator.Configuration;
import GeminiCommerce_ProductConfigurator.auth.*;
import GeminiCommerce_ProductConfigurator.models.*;
import org.openapitools.client.api.PropertyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product-configurator.api.gogemini.io");
    
    // Configure OAuth2 access token for authorization: standardAuthorization
    OAuth standardAuthorization = (OAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setAccessToken("YOUR ACCESS TOKEN");

    // Configure API key authorization: APIAuthorization
    ApiKeyAuth APIAuthorization = (ApiKeyAuth) defaultClient.getAuthentication("APIAuthorization");
    APIAuthorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIAuthorization.setApiKeyPrefix("Token");

    PropertyApi apiInstance = new PropertyApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    ProductConfiguratorCreatePropertyRequest body = new ProductConfiguratorCreatePropertyRequest(); // ProductConfiguratorCreatePropertyRequest | 
    try {
      ProductconfiguratorpropertyEntity result = apiInstance.productConfiguratorCreateProperty(tenantId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertyApi#productConfiguratorCreateProperty");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantId** | **String**|  | |
| **body** | [**ProductConfiguratorCreatePropertyRequest**](ProductConfiguratorCreatePropertyRequest.md)|  | |

### Return type

[**ProductconfiguratorpropertyEntity**](ProductconfiguratorpropertyEntity.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization), [APIAuthorization](../README.md#APIAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request or Limit Exceeded |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productConfiguratorListProperties"></a>
# **productConfiguratorListProperties**
> PropertyListPropertiesResponse productConfiguratorListProperties(tenantId, matrixId, pageSize, body)

List Properties

Retrieve a list of properties for a specific matrix based on tenant and matrix IDs. Customize results by specifying page size for efficient pagination. Submit an empty body to get all properties associated with the matrix.

### Example
```java
// Import classes:
import GeminiCommerce_ProductConfigurator.ApiClient;
import GeminiCommerce_ProductConfigurator.ApiException;
import GeminiCommerce_ProductConfigurator.Configuration;
import GeminiCommerce_ProductConfigurator.auth.*;
import GeminiCommerce_ProductConfigurator.models.*;
import org.openapitools.client.api.PropertyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product-configurator.api.gogemini.io");
    
    // Configure OAuth2 access token for authorization: standardAuthorization
    OAuth standardAuthorization = (OAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setAccessToken("YOUR ACCESS TOKEN");

    // Configure API key authorization: APIAuthorization
    ApiKeyAuth APIAuthorization = (ApiKeyAuth) defaultClient.getAuthentication("APIAuthorization");
    APIAuthorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIAuthorization.setApiKeyPrefix("Token");

    PropertyApi apiInstance = new PropertyApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String matrixId = "matrixId_example"; // String | 
    String pageSize = "pageSize_example"; // String | 
    ProductConfiguratorListPropertiesRequest body = new ProductConfiguratorListPropertiesRequest(); // ProductConfiguratorListPropertiesRequest | 
    try {
      PropertyListPropertiesResponse result = apiInstance.productConfiguratorListProperties(tenantId, matrixId, pageSize, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertyApi#productConfiguratorListProperties");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantId** | **String**|  | |
| **matrixId** | **String**|  | |
| **pageSize** | **String**|  | |
| **body** | [**ProductConfiguratorListPropertiesRequest**](ProductConfiguratorListPropertiesRequest.md)|  | |

### Return type

[**PropertyListPropertiesResponse**](PropertyListPropertiesResponse.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization), [APIAuthorization](../README.md#APIAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request or Limit Exceeded |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productConfiguratorUpdateProperty"></a>
# **productConfiguratorUpdateProperty**
> ProductconfiguratorpropertyEntity productConfiguratorUpdateProperty(tenantId, propertyId, body)

Update Property

Modify an existing property by specifying the tenant and property IDs. Utilize a PUT request with updated property details in the body for seamless customization and fine-tuning of your product configurations.

### Example
```java
// Import classes:
import GeminiCommerce_ProductConfigurator.ApiClient;
import GeminiCommerce_ProductConfigurator.ApiException;
import GeminiCommerce_ProductConfigurator.Configuration;
import GeminiCommerce_ProductConfigurator.auth.*;
import GeminiCommerce_ProductConfigurator.models.*;
import org.openapitools.client.api.PropertyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product-configurator.api.gogemini.io");
    
    // Configure OAuth2 access token for authorization: standardAuthorization
    OAuth standardAuthorization = (OAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setAccessToken("YOUR ACCESS TOKEN");

    // Configure API key authorization: APIAuthorization
    ApiKeyAuth APIAuthorization = (ApiKeyAuth) defaultClient.getAuthentication("APIAuthorization");
    APIAuthorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIAuthorization.setApiKeyPrefix("Token");

    PropertyApi apiInstance = new PropertyApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String propertyId = "propertyId_example"; // String | 
    ProductConfiguratorUpdatePropertyRequest body = new ProductConfiguratorUpdatePropertyRequest(); // ProductConfiguratorUpdatePropertyRequest | 
    try {
      ProductconfiguratorpropertyEntity result = apiInstance.productConfiguratorUpdateProperty(tenantId, propertyId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertyApi#productConfiguratorUpdateProperty");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantId** | **String**|  | |
| **propertyId** | **String**|  | |
| **body** | [**ProductConfiguratorUpdatePropertyRequest**](ProductConfiguratorUpdatePropertyRequest.md)|  | |

### Return type

[**ProductconfiguratorpropertyEntity**](ProductconfiguratorpropertyEntity.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization), [APIAuthorization](../README.md#APIAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request or Limit Exceeded |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

