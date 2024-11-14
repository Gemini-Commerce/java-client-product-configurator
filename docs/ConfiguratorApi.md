# ConfiguratorApi

All URIs are relative to *https://product-configurator.api.gogemini.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**productConfiguratorCopyConfigurator**](ConfiguratorApi.md#productConfiguratorCopyConfigurator) | **POST** /v1/{tenantId}/product/{sourceConfiguratorId}/copy | Copy Configurator |
| [**productConfiguratorCreateConfigurator**](ConfiguratorApi.md#productConfiguratorCreateConfigurator) | **POST** /v1/{tenantId}/product/{productId}/create | Create Configurator |
| [**productConfiguratorDeleteConfigurator**](ConfiguratorApi.md#productConfiguratorDeleteConfigurator) | **DELETE** /v1/{tenantId}/configurator/{configuratorId} | Delete Configurator |
| [**productConfiguratorGetConfiguratorByProductId**](ConfiguratorApi.md#productConfiguratorGetConfiguratorByProductId) | **GET** /v1/{tenantId}/product/{productId} | Get Configurator by Product ID |
| [**productConfiguratorGetConfiguratorByProductId2**](ConfiguratorApi.md#productConfiguratorGetConfiguratorByProductId2) | **GET** /v1/{tenantId}/product/{productId}/status/{status} | Get Configurator by Product ID |
| [**productConfiguratorListConfigurators**](ConfiguratorApi.md#productConfiguratorListConfigurators) | **POST** /v1/{tenantId}/product/{productId}/page-size/{pageSize}/configurators | List Product Configurators |
| [**productConfiguratorUpdateConfigurator**](ConfiguratorApi.md#productConfiguratorUpdateConfigurator) | **PUT** /v1/{tenantId}/configurator/{configuratorId} | Update Configurator |


<a id="productConfiguratorCopyConfigurator"></a>
# **productConfiguratorCopyConfigurator**
> ProductconfiguratorconfiguratorEntity productConfiguratorCopyConfigurator(tenantId, sourceConfiguratorId, body)

Copy Configurator

Duplicate an existing product configurator from the source to the specified tenant and product. Submit an empty body to initiate the copy process, creating a new configuration based on the source.

### Example
```java
// Import classes:
import GeminiCommerce.ProductConfigurator.ApiClient;
import GeminiCommerce.ProductConfigurator.ApiException;
import GeminiCommerce.ProductConfigurator.Configuration;
import GeminiCommerce.ProductConfigurator.auth.*;
import GeminiCommerce.ProductConfigurator.models.*;
import org.openapitools.client.api.ConfiguratorApi;

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

    ConfiguratorApi apiInstance = new ConfiguratorApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String sourceConfiguratorId = "sourceConfiguratorId_example"; // String | 
    ProductConfiguratorCopyConfiguratorRequest body = new ProductConfiguratorCopyConfiguratorRequest(); // ProductConfiguratorCopyConfiguratorRequest | 
    try {
      ProductconfiguratorconfiguratorEntity result = apiInstance.productConfiguratorCopyConfigurator(tenantId, sourceConfiguratorId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfiguratorApi#productConfiguratorCopyConfigurator");
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
| **sourceConfiguratorId** | **String**|  | |
| **body** | [**ProductConfiguratorCopyConfiguratorRequest**](ProductConfiguratorCopyConfiguratorRequest.md)|  | |

### Return type

[**ProductconfiguratorconfiguratorEntity**](ProductconfiguratorconfiguratorEntity.md)

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

<a id="productConfiguratorCreateConfigurator"></a>
# **productConfiguratorCreateConfigurator**
> ProductconfiguratorconfiguratorEntity productConfiguratorCreateConfigurator(tenantId, productId, body)

Create Configurator

Create a new product configurator for a specified tenant and product. Submit the desired configuration details in the request body to initiate the creation process.

### Example
```java
// Import classes:
import GeminiCommerce.ProductConfigurator.ApiClient;
import GeminiCommerce.ProductConfigurator.ApiException;
import GeminiCommerce.ProductConfigurator.Configuration;
import GeminiCommerce.ProductConfigurator.auth.*;
import GeminiCommerce.ProductConfigurator.models.*;
import org.openapitools.client.api.ConfiguratorApi;

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

    ConfiguratorApi apiInstance = new ConfiguratorApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String productId = "productId_example"; // String | 
    ProductConfiguratorCreateConfiguratorRequest body = new ProductConfiguratorCreateConfiguratorRequest(); // ProductConfiguratorCreateConfiguratorRequest | 
    try {
      ProductconfiguratorconfiguratorEntity result = apiInstance.productConfiguratorCreateConfigurator(tenantId, productId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfiguratorApi#productConfiguratorCreateConfigurator");
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
| **productId** | **String**|  | |
| **body** | [**ProductConfiguratorCreateConfiguratorRequest**](ProductConfiguratorCreateConfiguratorRequest.md)|  | |

### Return type

[**ProductconfiguratorconfiguratorEntity**](ProductconfiguratorconfiguratorEntity.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization), [APIAuthorization](../README.md#APIAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productConfiguratorDeleteConfigurator"></a>
# **productConfiguratorDeleteConfigurator**
> Object productConfiguratorDeleteConfigurator(tenantId, configuratorId)

Delete Configurator

Delete a product configurator by specifying the tenant and configurator IDs. Ensure precise removal of unwanted configurations with a straightforward DELETE request.

### Example
```java
// Import classes:
import GeminiCommerce.ProductConfigurator.ApiClient;
import GeminiCommerce.ProductConfigurator.ApiException;
import GeminiCommerce.ProductConfigurator.Configuration;
import GeminiCommerce.ProductConfigurator.auth.*;
import GeminiCommerce.ProductConfigurator.models.*;
import org.openapitools.client.api.ConfiguratorApi;

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

    ConfiguratorApi apiInstance = new ConfiguratorApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String configuratorId = "configuratorId_example"; // String | 
    try {
      Object result = apiInstance.productConfiguratorDeleteConfigurator(tenantId, configuratorId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfiguratorApi#productConfiguratorDeleteConfigurator");
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
| **configuratorId** | **String**|  | |

### Return type

**Object**

### Authorization

[standardAuthorization](../README.md#standardAuthorization), [APIAuthorization](../README.md#APIAuthorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productConfiguratorGetConfiguratorByProductId"></a>
# **productConfiguratorGetConfiguratorByProductId**
> ProductconfiguratorconfiguratorEntity productConfiguratorGetConfiguratorByProductId(tenantId, productId, status)

Get Configurator by Product ID

Retrieve product configurations with status details, filtered by product and tenant IDs. Flexible options for specifying additional status parameters.

### Example
```java
// Import classes:
import GeminiCommerce.ProductConfigurator.ApiClient;
import GeminiCommerce.ProductConfigurator.ApiException;
import GeminiCommerce.ProductConfigurator.Configuration;
import GeminiCommerce.ProductConfigurator.auth.*;
import GeminiCommerce.ProductConfigurator.models.*;
import org.openapitools.client.api.ConfiguratorApi;

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

    ConfiguratorApi apiInstance = new ConfiguratorApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String productId = "productId_example"; // String | 
    String status = "UNKNOWN"; // String | 
    try {
      ProductconfiguratorconfiguratorEntity result = apiInstance.productConfiguratorGetConfiguratorByProductId(tenantId, productId, status);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfiguratorApi#productConfiguratorGetConfiguratorByProductId");
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
| **productId** | **String**|  | |
| **status** | **String**|  | [optional] [default to UNKNOWN] [enum: UNKNOWN, ACTIVE, DRAFT, DISABLED] |

### Return type

[**ProductconfiguratorconfiguratorEntity**](ProductconfiguratorconfiguratorEntity.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization), [APIAuthorization](../README.md#APIAuthorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productConfiguratorGetConfiguratorByProductId2"></a>
# **productConfiguratorGetConfiguratorByProductId2**
> ProductconfiguratorconfiguratorEntity productConfiguratorGetConfiguratorByProductId2(tenantId, productId, status)

Get Configurator by Product ID

Retrieve product configurations with status details, filtered by product and tenant IDs. Flexible options for specifying additional status parameters.

### Example
```java
// Import classes:
import GeminiCommerce.ProductConfigurator.ApiClient;
import GeminiCommerce.ProductConfigurator.ApiException;
import GeminiCommerce.ProductConfigurator.Configuration;
import GeminiCommerce.ProductConfigurator.auth.*;
import GeminiCommerce.ProductConfigurator.models.*;
import org.openapitools.client.api.ConfiguratorApi;

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

    ConfiguratorApi apiInstance = new ConfiguratorApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String productId = "productId_example"; // String | 
    String status = "UNKNOWN"; // String | 
    try {
      ProductconfiguratorconfiguratorEntity result = apiInstance.productConfiguratorGetConfiguratorByProductId2(tenantId, productId, status);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfiguratorApi#productConfiguratorGetConfiguratorByProductId2");
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
| **productId** | **String**|  | |
| **status** | **String**|  | [enum: UNKNOWN, ACTIVE, DRAFT, DISABLED] |

### Return type

[**ProductconfiguratorconfiguratorEntity**](ProductconfiguratorconfiguratorEntity.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization), [APIAuthorization](../README.md#APIAuthorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productConfiguratorListConfigurators"></a>
# **productConfiguratorListConfigurators**
> ConfiguratorListResponse productConfiguratorListConfigurators(tenantId, productId, pageSize, body)

List Product Configurators

List all product configurators.

### Example
```java
// Import classes:
import GeminiCommerce.ProductConfigurator.ApiClient;
import GeminiCommerce.ProductConfigurator.ApiException;
import GeminiCommerce.ProductConfigurator.Configuration;
import GeminiCommerce.ProductConfigurator.auth.*;
import GeminiCommerce.ProductConfigurator.models.*;
import org.openapitools.client.api.ConfiguratorApi;

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

    ConfiguratorApi apiInstance = new ConfiguratorApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String productId = "productId_example"; // String | 
    Long pageSize = 56L; // Long | 
    ProductConfiguratorListPropertiesRequest body = new ProductConfiguratorListPropertiesRequest(); // ProductConfiguratorListPropertiesRequest | 
    try {
      ConfiguratorListResponse result = apiInstance.productConfiguratorListConfigurators(tenantId, productId, pageSize, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfiguratorApi#productConfiguratorListConfigurators");
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
| **productId** | **String**|  | |
| **pageSize** | **Long**|  | |
| **body** | [**ProductConfiguratorListPropertiesRequest**](ProductConfiguratorListPropertiesRequest.md)|  | |

### Return type

[**ConfiguratorListResponse**](ConfiguratorListResponse.md)

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

<a id="productConfiguratorUpdateConfigurator"></a>
# **productConfiguratorUpdateConfigurator**
> ProductconfiguratorconfiguratorEntity productConfiguratorUpdateConfigurator(tenantId, configuratorId, body)

Update Configurator

Modify an existing product configurator by specifying the tenant and configurator IDs. Use a PUT request with the updated configuration details in the body to seamlessly update and manage product configurations

### Example
```java
// Import classes:
import GeminiCommerce.ProductConfigurator.ApiClient;
import GeminiCommerce.ProductConfigurator.ApiException;
import GeminiCommerce.ProductConfigurator.Configuration;
import GeminiCommerce.ProductConfigurator.auth.*;
import GeminiCommerce.ProductConfigurator.models.*;
import org.openapitools.client.api.ConfiguratorApi;

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

    ConfiguratorApi apiInstance = new ConfiguratorApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String configuratorId = "configuratorId_example"; // String | 
    ProductConfiguratorUpdateConfiguratorRequest body = new ProductConfiguratorUpdateConfiguratorRequest(); // ProductConfiguratorUpdateConfiguratorRequest | 
    try {
      ProductconfiguratorconfiguratorEntity result = apiInstance.productConfiguratorUpdateConfigurator(tenantId, configuratorId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfiguratorApi#productConfiguratorUpdateConfigurator");
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
| **configuratorId** | **String**|  | |
| **body** | [**ProductConfiguratorUpdateConfiguratorRequest**](ProductConfiguratorUpdateConfiguratorRequest.md)|  | |

### Return type

[**ProductconfiguratorconfiguratorEntity**](ProductconfiguratorconfiguratorEntity.md)

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

