# DependencyApi

All URIs are relative to *https://product-configurator.api.gogemini.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**productConfiguratorCreateDependency**](DependencyApi.md#productConfiguratorCreateDependency) | **POST** /v1/{tenantId}/step/{stepId}/dependency/create | Create Dependency |
| [**productConfiguratorDeleteDependency**](DependencyApi.md#productConfiguratorDeleteDependency) | **DELETE** /v1/{tenantId}/dependency/{dependencyId} | Delete Dependency |
| [**productConfiguratorListDependencies**](DependencyApi.md#productConfiguratorListDependencies) | **POST** /v1/{tenantId}/page-size/{pageSize}/dependencies | List Dependencies |
| [**productConfiguratorUpdateDependency**](DependencyApi.md#productConfiguratorUpdateDependency) | **PUT** /v1/{tenantId}/dependency/{dependencyId} | Update Dependency |


<a id="productConfiguratorCreateDependency"></a>
# **productConfiguratorCreateDependency**
> ProductconfiguratordependencyEntity productConfiguratorCreateDependency(tenantId, stepId, body)

Create Dependency

Establish a new dependency for an existing step by specifying the tenant and step IDs. Utilize a POST request with the required dependency details in the body to seamlessly enhance the configuration logic of your product.

### Example
```java
// Import classes:
import GeminiCommerce.ProductConfigurator.ApiClient;
import GeminiCommerce.ProductConfigurator.ApiException;
import GeminiCommerce.ProductConfigurator.Configuration;
import GeminiCommerce.ProductConfigurator.auth.*;
import GeminiCommerce.ProductConfigurator.models.*;
import org.openapitools.client.api.DependencyApi;

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

    DependencyApi apiInstance = new DependencyApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String stepId = "stepId_example"; // String | 
    ProductConfiguratorCreateDependencyRequest body = new ProductConfiguratorCreateDependencyRequest(); // ProductConfiguratorCreateDependencyRequest | 
    try {
      ProductconfiguratordependencyEntity result = apiInstance.productConfiguratorCreateDependency(tenantId, stepId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DependencyApi#productConfiguratorCreateDependency");
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
| **stepId** | **String**|  | |
| **body** | [**ProductConfiguratorCreateDependencyRequest**](ProductConfiguratorCreateDependencyRequest.md)|  | |

### Return type

[**ProductconfiguratordependencyEntity**](ProductconfiguratordependencyEntity.md)

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

<a id="productConfiguratorDeleteDependency"></a>
# **productConfiguratorDeleteDependency**
> Object productConfiguratorDeleteDependency(tenantId, dependencyId)

Delete Dependency

Remove a specific dependency by specifying the tenant and dependency IDs. Ensure precision in dependency management with a straightforward DELETE request, simplifying the elimination of unwanted configuration logic.

### Example
```java
// Import classes:
import GeminiCommerce.ProductConfigurator.ApiClient;
import GeminiCommerce.ProductConfigurator.ApiException;
import GeminiCommerce.ProductConfigurator.Configuration;
import GeminiCommerce.ProductConfigurator.auth.*;
import GeminiCommerce.ProductConfigurator.models.*;
import org.openapitools.client.api.DependencyApi;

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

    DependencyApi apiInstance = new DependencyApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String dependencyId = "dependencyId_example"; // String | 
    try {
      Object result = apiInstance.productConfiguratorDeleteDependency(tenantId, dependencyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DependencyApi#productConfiguratorDeleteDependency");
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
| **dependencyId** | **String**|  | |

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
| **400** | Bad Request or Limit Exceeded |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productConfiguratorListDependencies"></a>
# **productConfiguratorListDependencies**
> DependencyListDependenciesResponse productConfiguratorListDependencies(tenantId, pageSize, body)

List Dependencies

Retrieve a list of dependencies based on the specified tenant ID. Customize results by specifying page size for efficient pagination. Submit an empty body to get all dependencies associated with the configurations.

### Example
```java
// Import classes:
import GeminiCommerce.ProductConfigurator.ApiClient;
import GeminiCommerce.ProductConfigurator.ApiException;
import GeminiCommerce.ProductConfigurator.Configuration;
import GeminiCommerce.ProductConfigurator.auth.*;
import GeminiCommerce.ProductConfigurator.models.*;
import org.openapitools.client.api.DependencyApi;

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

    DependencyApi apiInstance = new DependencyApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    Long pageSize = 56L; // Long | 
    ProductConfiguratorListDependenciesRequest body = new ProductConfiguratorListDependenciesRequest(); // ProductConfiguratorListDependenciesRequest | 
    try {
      DependencyListDependenciesResponse result = apiInstance.productConfiguratorListDependencies(tenantId, pageSize, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DependencyApi#productConfiguratorListDependencies");
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
| **pageSize** | **Long**|  | |
| **body** | [**ProductConfiguratorListDependenciesRequest**](ProductConfiguratorListDependenciesRequest.md)|  | |

### Return type

[**DependencyListDependenciesResponse**](DependencyListDependenciesResponse.md)

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

<a id="productConfiguratorUpdateDependency"></a>
# **productConfiguratorUpdateDependency**
> ProductconfiguratordependencyEntity productConfiguratorUpdateDependency(tenantId, dependencyId, body)

Update Dependency

Modify an existing dependency by specifying the tenant and dependency IDs. Utilize a PUT request with updated dependency details in the body for seamless customization and fine-tuning of your product configurations.

### Example
```java
// Import classes:
import GeminiCommerce.ProductConfigurator.ApiClient;
import GeminiCommerce.ProductConfigurator.ApiException;
import GeminiCommerce.ProductConfigurator.Configuration;
import GeminiCommerce.ProductConfigurator.auth.*;
import GeminiCommerce.ProductConfigurator.models.*;
import org.openapitools.client.api.DependencyApi;

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

    DependencyApi apiInstance = new DependencyApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String dependencyId = "dependencyId_example"; // String | 
    ProductConfiguratorUpdateDependencyRequest body = new ProductConfiguratorUpdateDependencyRequest(); // ProductConfiguratorUpdateDependencyRequest | 
    try {
      ProductconfiguratordependencyEntity result = apiInstance.productConfiguratorUpdateDependency(tenantId, dependencyId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DependencyApi#productConfiguratorUpdateDependency");
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
| **dependencyId** | **String**|  | |
| **body** | [**ProductConfiguratorUpdateDependencyRequest**](ProductConfiguratorUpdateDependencyRequest.md)|  | |

### Return type

[**ProductconfiguratordependencyEntity**](ProductconfiguratordependencyEntity.md)

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

