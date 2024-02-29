# OptionApi

All URIs are relative to *https://product-configurator.api.gogemini.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**productConfiguratorBulkCreateOptions**](OptionApi.md#productConfiguratorBulkCreateOptions) | **POST** /v1/{tenantId}/step/{stepId}/option/create/bulk | Bulk Create Options |
| [**productConfiguratorBulkDeleteOptions**](OptionApi.md#productConfiguratorBulkDeleteOptions) | **POST** /v1/{tenantId}/option/delete/bulk | Bulk Delete Options |
| [**productConfiguratorBulkUpdateOptions**](OptionApi.md#productConfiguratorBulkUpdateOptions) | **PUT** /v1/{tenantId}/option/bulk | Bulk Update Options |
| [**productConfiguratorCopyOption**](OptionApi.md#productConfiguratorCopyOption) | **POST** /v1/{tenantId}/option/{sourceOptionId}/copy | Copy Option |
| [**productConfiguratorCreateOption**](OptionApi.md#productConfiguratorCreateOption) | **POST** /v1/{tenantId}/step/{stepId}/option/create | Create Option |
| [**productConfiguratorDeleteOption**](OptionApi.md#productConfiguratorDeleteOption) | **DELETE** /v1/{tenantId}/option/{optionId} | Delete Option |
| [**productConfiguratorListOptions**](OptionApi.md#productConfiguratorListOptions) | **POST** /v1/{tenantId}/step/{stepId}/page-size/{pageSize}/options | List Options |
| [**productConfiguratorUpdateOption**](OptionApi.md#productConfiguratorUpdateOption) | **PUT** /v1/{tenantId}/option/{optionId} | Update Option |


<a id="productConfiguratorBulkCreateOptions"></a>
# **productConfiguratorBulkCreateOptions**
> ProductconfiguratoroptionBulkCreateResponse productConfiguratorBulkCreateOptions(tenantId, stepId, body)

Bulk Create Options

Add multiple options to an existing step simultaneously. Submit a POST request with the necessary option details in the body to efficiently expand the configuration possibilities in bulk. Streamline large-scale option management effortlessly.

### Example
```java
// Import classes:
import GeminiCommerce_ProductConfigurator.ApiClient;
import GeminiCommerce_ProductConfigurator.ApiException;
import GeminiCommerce_ProductConfigurator.Configuration;
import GeminiCommerce_ProductConfigurator.auth.*;
import GeminiCommerce_ProductConfigurator.models.*;
import org.openapitools.client.api.OptionApi;

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

    OptionApi apiInstance = new OptionApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String stepId = "stepId_example"; // String | 
    ProductConfiguratorBulkCreateOptionsRequest body = new ProductConfiguratorBulkCreateOptionsRequest(); // ProductConfiguratorBulkCreateOptionsRequest | 
    try {
      ProductconfiguratoroptionBulkCreateResponse result = apiInstance.productConfiguratorBulkCreateOptions(tenantId, stepId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionApi#productConfiguratorBulkCreateOptions");
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
| **body** | [**ProductConfiguratorBulkCreateOptionsRequest**](ProductConfiguratorBulkCreateOptionsRequest.md)|  | |

### Return type

[**ProductconfiguratoroptionBulkCreateResponse**](ProductconfiguratoroptionBulkCreateResponse.md)

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

<a id="productConfiguratorBulkDeleteOptions"></a>
# **productConfiguratorBulkDeleteOptions**
> Object productConfiguratorBulkDeleteOptions(tenantId, body)

Bulk Delete Options

Efficiently remove multiple options from configurations using a bulk delete operation. Specify the tenant ID and submit a POST request with the list of option IDs in the body for streamlined option management.

### Example
```java
// Import classes:
import GeminiCommerce_ProductConfigurator.ApiClient;
import GeminiCommerce_ProductConfigurator.ApiException;
import GeminiCommerce_ProductConfigurator.Configuration;
import GeminiCommerce_ProductConfigurator.auth.*;
import GeminiCommerce_ProductConfigurator.models.*;
import org.openapitools.client.api.OptionApi;

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

    OptionApi apiInstance = new OptionApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    ProductConfiguratorBulkDeleteOptionsRequest body = new ProductConfiguratorBulkDeleteOptionsRequest(); // ProductConfiguratorBulkDeleteOptionsRequest | 
    try {
      Object result = apiInstance.productConfiguratorBulkDeleteOptions(tenantId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionApi#productConfiguratorBulkDeleteOptions");
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
| **body** | [**ProductConfiguratorBulkDeleteOptionsRequest**](ProductConfiguratorBulkDeleteOptionsRequest.md)|  | |

### Return type

**Object**

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

<a id="productConfiguratorBulkUpdateOptions"></a>
# **productConfiguratorBulkUpdateOptions**
> ProductconfiguratoroptionBulkUpdateResponse productConfiguratorBulkUpdateOptions(tenantId, body)

Bulk Update Options

Effortlessly update multiple options. Specify the tenant ID and submit a PUT request with the updated option details in the body. Streamline the customization of a multitude of options in one go.

### Example
```java
// Import classes:
import GeminiCommerce_ProductConfigurator.ApiClient;
import GeminiCommerce_ProductConfigurator.ApiException;
import GeminiCommerce_ProductConfigurator.Configuration;
import GeminiCommerce_ProductConfigurator.auth.*;
import GeminiCommerce_ProductConfigurator.models.*;
import org.openapitools.client.api.OptionApi;

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

    OptionApi apiInstance = new OptionApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    ProductConfiguratorBulkUpdateOptionsRequest body = new ProductConfiguratorBulkUpdateOptionsRequest(); // ProductConfiguratorBulkUpdateOptionsRequest | 
    try {
      ProductconfiguratoroptionBulkUpdateResponse result = apiInstance.productConfiguratorBulkUpdateOptions(tenantId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionApi#productConfiguratorBulkUpdateOptions");
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
| **body** | [**ProductConfiguratorBulkUpdateOptionsRequest**](ProductConfiguratorBulkUpdateOptionsRequest.md)|  | |

### Return type

[**ProductconfiguratoroptionBulkUpdateResponse**](ProductconfiguratoroptionBulkUpdateResponse.md)

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

<a id="productConfiguratorCopyOption"></a>
# **productConfiguratorCopyOption**
> ProductconfiguratoroptionEntity productConfiguratorCopyOption(tenantId, sourceOptionId, body)

Copy Option

Duplicate an existing option from the source to a specified tenant. Utilize a POST request with an empty body to initiate the copy process, creating a new option based on the source configuration. Streamline option replication effortlessly.

### Example
```java
// Import classes:
import GeminiCommerce_ProductConfigurator.ApiClient;
import GeminiCommerce_ProductConfigurator.ApiException;
import GeminiCommerce_ProductConfigurator.Configuration;
import GeminiCommerce_ProductConfigurator.auth.*;
import GeminiCommerce_ProductConfigurator.models.*;
import org.openapitools.client.api.OptionApi;

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

    OptionApi apiInstance = new OptionApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String sourceOptionId = "sourceOptionId_example"; // String | 
    ProductConfiguratorCopyOptionRequest body = new ProductConfiguratorCopyOptionRequest(); // ProductConfiguratorCopyOptionRequest | 
    try {
      ProductconfiguratoroptionEntity result = apiInstance.productConfiguratorCopyOption(tenantId, sourceOptionId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionApi#productConfiguratorCopyOption");
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
| **sourceOptionId** | **String**|  | |
| **body** | [**ProductConfiguratorCopyOptionRequest**](ProductConfiguratorCopyOptionRequest.md)|  | |

### Return type

[**ProductconfiguratoroptionEntity**](ProductconfiguratoroptionEntity.md)

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

<a id="productConfiguratorCreateOption"></a>
# **productConfiguratorCreateOption**
> ProductconfiguratoroptionEntity productConfiguratorCreateOption(tenantId, stepId, body)

Create Option

Integrate a new option into an existing step by specifying the tenant and step IDs. Use a POST request with the required option details in the body for seamless customization and expansion of product configurations.

### Example
```java
// Import classes:
import GeminiCommerce_ProductConfigurator.ApiClient;
import GeminiCommerce_ProductConfigurator.ApiException;
import GeminiCommerce_ProductConfigurator.Configuration;
import GeminiCommerce_ProductConfigurator.auth.*;
import GeminiCommerce_ProductConfigurator.models.*;
import org.openapitools.client.api.OptionApi;

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

    OptionApi apiInstance = new OptionApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String stepId = "stepId_example"; // String | 
    ProductConfiguratorCreateOptionRequest body = new ProductConfiguratorCreateOptionRequest(); // ProductConfiguratorCreateOptionRequest | 
    try {
      ProductconfiguratoroptionEntity result = apiInstance.productConfiguratorCreateOption(tenantId, stepId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionApi#productConfiguratorCreateOption");
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
| **body** | [**ProductConfiguratorCreateOptionRequest**](ProductConfiguratorCreateOptionRequest.md)|  | |

### Return type

[**ProductconfiguratoroptionEntity**](ProductconfiguratoroptionEntity.md)

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

<a id="productConfiguratorDeleteOption"></a>
# **productConfiguratorDeleteOption**
> Object productConfiguratorDeleteOption(tenantId, optionId)

Delete Option

Remove a specific option by specifying the tenant and option IDs. Ensure precision in option management with a straightforward DELETE request, simplifying the elimination of unwanted configuration choices.

### Example
```java
// Import classes:
import GeminiCommerce_ProductConfigurator.ApiClient;
import GeminiCommerce_ProductConfigurator.ApiException;
import GeminiCommerce_ProductConfigurator.Configuration;
import GeminiCommerce_ProductConfigurator.auth.*;
import GeminiCommerce_ProductConfigurator.models.*;
import org.openapitools.client.api.OptionApi;

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

    OptionApi apiInstance = new OptionApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String optionId = "optionId_example"; // String | 
    try {
      Object result = apiInstance.productConfiguratorDeleteOption(tenantId, optionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionApi#productConfiguratorDeleteOption");
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
| **optionId** | **String**|  | |

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

<a id="productConfiguratorListOptions"></a>
# **productConfiguratorListOptions**
> OptionListOptionsResponse productConfiguratorListOptions(tenantId, stepId, pageSize, body)

List Options

Retrieve a list of options for a specific step based on tenant and step IDs. Customize results by specifying page size for efficient pagination. Submit an empty body to get all options associated with the step.

### Example
```java
// Import classes:
import GeminiCommerce_ProductConfigurator.ApiClient;
import GeminiCommerce_ProductConfigurator.ApiException;
import GeminiCommerce_ProductConfigurator.Configuration;
import GeminiCommerce_ProductConfigurator.auth.*;
import GeminiCommerce_ProductConfigurator.models.*;
import org.openapitools.client.api.OptionApi;

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

    OptionApi apiInstance = new OptionApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String stepId = "stepId_example"; // String | 
    Long pageSize = 56L; // Long | 
    ProductConfiguratorListPropertiesRequest body = new ProductConfiguratorListPropertiesRequest(); // ProductConfiguratorListPropertiesRequest | 
    try {
      OptionListOptionsResponse result = apiInstance.productConfiguratorListOptions(tenantId, stepId, pageSize, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionApi#productConfiguratorListOptions");
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
| **pageSize** | **Long**|  | |
| **body** | [**ProductConfiguratorListPropertiesRequest**](ProductConfiguratorListPropertiesRequest.md)|  | |

### Return type

[**OptionListOptionsResponse**](OptionListOptionsResponse.md)

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

<a id="productConfiguratorUpdateOption"></a>
# **productConfiguratorUpdateOption**
> ProductconfiguratoroptionEntity productConfiguratorUpdateOption(tenantId, optionId, body)

Update Option

Modify an existing option by specifying the tenant and option IDs. Utilize a PUT request with updated option details in the body for seamless customization and fine-tuning of your product configurations.

### Example
```java
// Import classes:
import GeminiCommerce_ProductConfigurator.ApiClient;
import GeminiCommerce_ProductConfigurator.ApiException;
import GeminiCommerce_ProductConfigurator.Configuration;
import GeminiCommerce_ProductConfigurator.auth.*;
import GeminiCommerce_ProductConfigurator.models.*;
import org.openapitools.client.api.OptionApi;

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

    OptionApi apiInstance = new OptionApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String optionId = "optionId_example"; // String | 
    ProductConfiguratorUpdateOptionRequest body = new ProductConfiguratorUpdateOptionRequest(); // ProductConfiguratorUpdateOptionRequest | 
    try {
      ProductconfiguratoroptionEntity result = apiInstance.productConfiguratorUpdateOption(tenantId, optionId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OptionApi#productConfiguratorUpdateOption");
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
| **optionId** | **String**|  | |
| **body** | [**ProductConfiguratorUpdateOptionRequest**](ProductConfiguratorUpdateOptionRequest.md)|  | |

### Return type

[**ProductconfiguratoroptionEntity**](ProductconfiguratoroptionEntity.md)

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

