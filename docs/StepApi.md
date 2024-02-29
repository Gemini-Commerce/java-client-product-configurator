# StepApi

All URIs are relative to *https://product-configurator.api.gogemini.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**productConfiguratorBulkCreateSteps**](StepApi.md#productConfiguratorBulkCreateSteps) | **POST** /v1/{tenantId}/configurator/{configuratorId}/step/create/bulk | Bulk Create Steps |
| [**productConfiguratorBulkDeleteSteps**](StepApi.md#productConfiguratorBulkDeleteSteps) | **POST** /v1/{tenantId}/step/delete/bulk | Bulk Delete Steps |
| [**productConfiguratorCopyStep**](StepApi.md#productConfiguratorCopyStep) | **POST** /v1/{tenantId}/step/{sourceStepId}/copy | Copy Step |
| [**productConfiguratorCreateStep**](StepApi.md#productConfiguratorCreateStep) | **POST** /v1/{tenantId}/configurator/{configuratorId}/step/create | Create Step |
| [**productConfiguratorDeleteStep**](StepApi.md#productConfiguratorDeleteStep) | **DELETE** /v1/{tenantId}/step/{stepId} | Delete Step |
| [**productConfiguratorUpdateStep**](StepApi.md#productConfiguratorUpdateStep) | **PUT** /v1/{tenantId}/step/{stepId} | Update Step |


<a id="productConfiguratorBulkCreateSteps"></a>
# **productConfiguratorBulkCreateSteps**
> ProductconfiguratorstepBulkCreateResponse productConfiguratorBulkCreateSteps(tenantId, configuratorId, body)

Bulk Create Steps

Add multiple steps to an existing product configurator simultaneously. Submit a POST request with the necessary step details in the body to efficiently extend the configuration process in bulk. Simplify large-scale configuration management effortlessly.

### Example
```java
// Import classes:
import GeminiCommerce_ProductConfigurator.ApiClient;
import GeminiCommerce_ProductConfigurator.ApiException;
import GeminiCommerce_ProductConfigurator.Configuration;
import GeminiCommerce_ProductConfigurator.auth.*;
import GeminiCommerce_ProductConfigurator.models.*;
import org.openapitools.client.api.StepApi;

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

    StepApi apiInstance = new StepApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String configuratorId = "configuratorId_example"; // String | 
    ProductConfiguratorBulkCreateStepsRequest body = new ProductConfiguratorBulkCreateStepsRequest(); // ProductConfiguratorBulkCreateStepsRequest | 
    try {
      ProductconfiguratorstepBulkCreateResponse result = apiInstance.productConfiguratorBulkCreateSteps(tenantId, configuratorId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StepApi#productConfiguratorBulkCreateSteps");
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
| **body** | [**ProductConfiguratorBulkCreateStepsRequest**](ProductConfiguratorBulkCreateStepsRequest.md)|  | |

### Return type

[**ProductconfiguratorstepBulkCreateResponse**](ProductconfiguratorstepBulkCreateResponse.md)

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

<a id="productConfiguratorBulkDeleteSteps"></a>
# **productConfiguratorBulkDeleteSteps**
> Object productConfiguratorBulkDeleteSteps(tenantId, body)

Bulk Delete Steps

Efficiently remove multiple steps from a product configurator using a bulk delete operation. Specify the tenant ID and submit a POST request with the list of step IDs in the body for streamlined configuration management.

### Example
```java
// Import classes:
import GeminiCommerce_ProductConfigurator.ApiClient;
import GeminiCommerce_ProductConfigurator.ApiException;
import GeminiCommerce_ProductConfigurator.Configuration;
import GeminiCommerce_ProductConfigurator.auth.*;
import GeminiCommerce_ProductConfigurator.models.*;
import org.openapitools.client.api.StepApi;

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

    StepApi apiInstance = new StepApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    ProductConfiguratorBulkDeleteStepsRequest body = new ProductConfiguratorBulkDeleteStepsRequest(); // ProductConfiguratorBulkDeleteStepsRequest | 
    try {
      Object result = apiInstance.productConfiguratorBulkDeleteSteps(tenantId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StepApi#productConfiguratorBulkDeleteSteps");
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
| **body** | [**ProductConfiguratorBulkDeleteStepsRequest**](ProductConfiguratorBulkDeleteStepsRequest.md)|  | |

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

<a id="productConfiguratorCopyStep"></a>
# **productConfiguratorCopyStep**
> ProductconfiguratorstepEntity productConfiguratorCopyStep(tenantId, sourceStepId, body)

Copy Step

Duplicate an existing step from the source to a specified tenant. Utilize a POST request with an empty body to initiate the copy process, creating a new step based on the source configuration. Streamline step replication effortlessly.

### Example
```java
// Import classes:
import GeminiCommerce_ProductConfigurator.ApiClient;
import GeminiCommerce_ProductConfigurator.ApiException;
import GeminiCommerce_ProductConfigurator.Configuration;
import GeminiCommerce_ProductConfigurator.auth.*;
import GeminiCommerce_ProductConfigurator.models.*;
import org.openapitools.client.api.StepApi;

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

    StepApi apiInstance = new StepApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String sourceStepId = "sourceStepId_example"; // String | 
    ProductConfiguratorCopyStepRequest body = new ProductConfiguratorCopyStepRequest(); // ProductConfiguratorCopyStepRequest | 
    try {
      ProductconfiguratorstepEntity result = apiInstance.productConfiguratorCopyStep(tenantId, sourceStepId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StepApi#productConfiguratorCopyStep");
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
| **sourceStepId** | **String**|  | |
| **body** | [**ProductConfiguratorCopyStepRequest**](ProductConfiguratorCopyStepRequest.md)|  | |

### Return type

[**ProductconfiguratorstepEntity**](ProductconfiguratorstepEntity.md)

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

<a id="productConfiguratorCreateStep"></a>
# **productConfiguratorCreateStep**
> ProductconfiguratorstepEntity productConfiguratorCreateStep(tenantId, configuratorId, body)

Create Step

Add a new step to an existing product configurator by specifying the tenant and configurator IDs. Utilize a POST request with the required step details in the body to seamlessly extend the configuration process.

### Example
```java
// Import classes:
import GeminiCommerce_ProductConfigurator.ApiClient;
import GeminiCommerce_ProductConfigurator.ApiException;
import GeminiCommerce_ProductConfigurator.Configuration;
import GeminiCommerce_ProductConfigurator.auth.*;
import GeminiCommerce_ProductConfigurator.models.*;
import org.openapitools.client.api.StepApi;

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

    StepApi apiInstance = new StepApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String configuratorId = "configuratorId_example"; // String | 
    ProductConfiguratorCreateStepRequest body = new ProductConfiguratorCreateStepRequest(); // ProductConfiguratorCreateStepRequest | 
    try {
      ProductconfiguratorstepEntity result = apiInstance.productConfiguratorCreateStep(tenantId, configuratorId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StepApi#productConfiguratorCreateStep");
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
| **body** | [**ProductConfiguratorCreateStepRequest**](ProductConfiguratorCreateStepRequest.md)|  | |

### Return type

[**ProductconfiguratorstepEntity**](ProductconfiguratorstepEntity.md)

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

<a id="productConfiguratorDeleteStep"></a>
# **productConfiguratorDeleteStep**
> GooglerpcStatus productConfiguratorDeleteStep(tenantId, stepId)

Delete Step

Remove a step from a product configurator by specifying the tenant and step IDs. Ensure precision in configuration management with a straightforward DELETE request, simplifying the elimination of unwanted steps.

### Example
```java
// Import classes:
import GeminiCommerce_ProductConfigurator.ApiClient;
import GeminiCommerce_ProductConfigurator.ApiException;
import GeminiCommerce_ProductConfigurator.Configuration;
import GeminiCommerce_ProductConfigurator.auth.*;
import GeminiCommerce_ProductConfigurator.models.*;
import org.openapitools.client.api.StepApi;

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

    StepApi apiInstance = new StepApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String stepId = "stepId_example"; // String | 
    try {
      GooglerpcStatus result = apiInstance.productConfiguratorDeleteStep(tenantId, stepId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StepApi#productConfiguratorDeleteStep");
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

### Return type

[**GooglerpcStatus**](GooglerpcStatus.md)

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

<a id="productConfiguratorUpdateStep"></a>
# **productConfiguratorUpdateStep**
> ProductconfiguratorstepEntity productConfiguratorUpdateStep(tenantId, stepId, body)

Update Step

Modify an existing step within a product configurator by specifying the tenant and step IDs. Utilize a PUT request with updated step details in the body for seamless customization and fine-tuning of your product configurations.

### Example
```java
// Import classes:
import GeminiCommerce_ProductConfigurator.ApiClient;
import GeminiCommerce_ProductConfigurator.ApiException;
import GeminiCommerce_ProductConfigurator.Configuration;
import GeminiCommerce_ProductConfigurator.auth.*;
import GeminiCommerce_ProductConfigurator.models.*;
import org.openapitools.client.api.StepApi;

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

    StepApi apiInstance = new StepApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String stepId = "stepId_example"; // String | 
    ProductConfiguratorUpdateStepRequest body = new ProductConfiguratorUpdateStepRequest(); // ProductConfiguratorUpdateStepRequest | 
    try {
      ProductconfiguratorstepEntity result = apiInstance.productConfiguratorUpdateStep(tenantId, stepId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StepApi#productConfiguratorUpdateStep");
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
| **body** | [**ProductConfiguratorUpdateStepRequest**](ProductConfiguratorUpdateStepRequest.md)|  | |

### Return type

[**ProductconfiguratorstepEntity**](ProductconfiguratorstepEntity.md)

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

