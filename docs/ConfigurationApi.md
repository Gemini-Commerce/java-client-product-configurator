# ConfigurationApi

All URIs are relative to *https://product-configurator.api.gogemini.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**productConfiguratorGetAvailableConfiguration**](ConfigurationApi.md#productConfiguratorGetAvailableConfiguration) | **GET** /v1/{tenantId}/product/{productId}/configuration | Get Available Configuration |
| [**productConfiguratorGetAvailableConfiguration2**](ConfigurationApi.md#productConfiguratorGetAvailableConfiguration2) | **POST** /v1/{tenantId}/product/{productId}/configuration | Get Available Configuration |
| [**productConfiguratorGetConfigurationFromSelections**](ConfigurationApi.md#productConfiguratorGetConfigurationFromSelections) | **POST** /v1/{tenantId}/product/{productId}/configuration-from-selections | Get Configuration from Selections |


<a id="productConfiguratorGetAvailableConfiguration"></a>
# **productConfiguratorGetAvailableConfiguration**
> ConfigurationGetAvailableConfigurationResponse productConfiguratorGetAvailableConfiguration(tenantId, productId, configuratorId)

Get Available Configuration

Retrieve available configurations for a specific product and tenant. Use a GET request for read-only access or submit additional criteria in the body of a POST request for tailored configuration results. Streamline the retrieval of configurations effortlessly.

### Example
```java
// Import classes:
import GeminiCommerce_ProductConfigurator.ApiClient;
import GeminiCommerce_ProductConfigurator.ApiException;
import GeminiCommerce_ProductConfigurator.Configuration;
import GeminiCommerce_ProductConfigurator.auth.*;
import GeminiCommerce_ProductConfigurator.models.*;
import org.openapitools.client.api.ConfigurationApi;

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

    ConfigurationApi apiInstance = new ConfigurationApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String productId = "productId_example"; // String | 
    String configuratorId = "configuratorId_example"; // String | If not set, the service returns the active configurator
    try {
      ConfigurationGetAvailableConfigurationResponse result = apiInstance.productConfiguratorGetAvailableConfiguration(tenantId, productId, configuratorId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigurationApi#productConfiguratorGetAvailableConfiguration");
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
| **configuratorId** | **String**| If not set, the service returns the active configurator | [optional] |

### Return type

[**ConfigurationGetAvailableConfigurationResponse**](ConfigurationGetAvailableConfigurationResponse.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization), [APIAuthorization](../README.md#APIAuthorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request or Limit Exceeded |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productConfiguratorGetAvailableConfiguration2"></a>
# **productConfiguratorGetAvailableConfiguration2**
> ConfigurationGetAvailableConfigurationResponse productConfiguratorGetAvailableConfiguration2(tenantId, productId, body)

Get Available Configuration

Retrieve available configurations for a specific product and tenant. Use a GET request for read-only access or submit additional criteria in the body of a POST request for tailored configuration results. Streamline the retrieval of configurations effortlessly.

### Example
```java
// Import classes:
import GeminiCommerce_ProductConfigurator.ApiClient;
import GeminiCommerce_ProductConfigurator.ApiException;
import GeminiCommerce_ProductConfigurator.Configuration;
import GeminiCommerce_ProductConfigurator.auth.*;
import GeminiCommerce_ProductConfigurator.models.*;
import org.openapitools.client.api.ConfigurationApi;

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

    ConfigurationApi apiInstance = new ConfigurationApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String productId = "productId_example"; // String | 
    ProductConfiguratorGetAvailableConfiguration2Request body = new ProductConfiguratorGetAvailableConfiguration2Request(); // ProductConfiguratorGetAvailableConfiguration2Request | 
    try {
      ConfigurationGetAvailableConfigurationResponse result = apiInstance.productConfiguratorGetAvailableConfiguration2(tenantId, productId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigurationApi#productConfiguratorGetAvailableConfiguration2");
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
| **body** | [**ProductConfiguratorGetAvailableConfiguration2Request**](ProductConfiguratorGetAvailableConfiguration2Request.md)|  | |

### Return type

[**ConfigurationGetAvailableConfigurationResponse**](ConfigurationGetAvailableConfigurationResponse.md)

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

<a id="productConfiguratorGetConfigurationFromSelections"></a>
# **productConfiguratorGetConfigurationFromSelections**
> ConfigurationGetConfigurationFromSelectionsResponse productConfiguratorGetConfigurationFromSelections(tenantId, productId, body)

Get Configuration from Selections

Retrieve a configuration based on user selections for a specific product and tenant. Submit a POST request with user selections in the body to receive a tailored configuration. Enhance the user experience by dynamically generating configurations based on user input.

### Example
```java
// Import classes:
import GeminiCommerce_ProductConfigurator.ApiClient;
import GeminiCommerce_ProductConfigurator.ApiException;
import GeminiCommerce_ProductConfigurator.Configuration;
import GeminiCommerce_ProductConfigurator.auth.*;
import GeminiCommerce_ProductConfigurator.models.*;
import org.openapitools.client.api.ConfigurationApi;

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

    ConfigurationApi apiInstance = new ConfigurationApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String productId = "productId_example"; // String | 
    ProductConfiguratorGetConfigurationFromSelectionsRequest body = new ProductConfiguratorGetConfigurationFromSelectionsRequest(); // ProductConfiguratorGetConfigurationFromSelectionsRequest | 
    try {
      ConfigurationGetConfigurationFromSelectionsResponse result = apiInstance.productConfiguratorGetConfigurationFromSelections(tenantId, productId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigurationApi#productConfiguratorGetConfigurationFromSelections");
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
| **body** | [**ProductConfiguratorGetConfigurationFromSelectionsRequest**](ProductConfiguratorGetConfigurationFromSelectionsRequest.md)|  | |

### Return type

[**ConfigurationGetConfigurationFromSelectionsResponse**](ConfigurationGetConfigurationFromSelectionsResponse.md)

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

