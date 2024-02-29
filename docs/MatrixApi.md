# MatrixApi

All URIs are relative to *https://product-configurator.api.gogemini.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**productConfiguratorCreateMatrix**](MatrixApi.md#productConfiguratorCreateMatrix) | **POST** /v1/{tenantId}/matrix/create | Create Matrix |
| [**productConfiguratorDeleteMatrix**](MatrixApi.md#productConfiguratorDeleteMatrix) | **DELETE** /v1/{tenantId}/matrix/{matrixId} | Delete Matrix |
| [**productConfiguratorGetMatrix**](MatrixApi.md#productConfiguratorGetMatrix) | **GET** /v1/{tenantId}/matrix/{matrixId} | Get Matrix |
| [**productConfiguratorListMatrices**](MatrixApi.md#productConfiguratorListMatrices) | **POST** /v1/{tenantId}/configurator/{configuratorId}/page-size/{pageSize}/matrices | List Matrices |
| [**productConfiguratorRemovePricelistFromMatrix**](MatrixApi.md#productConfiguratorRemovePricelistFromMatrix) | **DELETE** /v1/{tenantId}/matrix/{matrixId}/pricelist/{pricelistGrn} | Remove Pricelist from Matrix |
| [**productConfiguratorUpdateMatrix**](MatrixApi.md#productConfiguratorUpdateMatrix) | **PUT** /v1/{tenantId}/matrix/{matrixId} | Update Matrix |


<a id="productConfiguratorCreateMatrix"></a>
# **productConfiguratorCreateMatrix**
> ProductconfiguratormatrixEntity productConfiguratorCreateMatrix(tenantId, body)

Create Matrix

Establish a new matrix by specifying the tenant ID. Utilize a POST request with the required matrix details in the body for seamless customization and expansion of matrix configurations.

### Example
```java
// Import classes:
import GeminiCommerce_ProductConfigurator.ApiClient;
import GeminiCommerce_ProductConfigurator.ApiException;
import GeminiCommerce_ProductConfigurator.Configuration;
import GeminiCommerce_ProductConfigurator.auth.*;
import GeminiCommerce_ProductConfigurator.models.*;
import org.openapitools.client.api.MatrixApi;

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

    MatrixApi apiInstance = new MatrixApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    ProductConfiguratorCreateMatrixRequest body = new ProductConfiguratorCreateMatrixRequest(); // ProductConfiguratorCreateMatrixRequest | 
    try {
      ProductconfiguratormatrixEntity result = apiInstance.productConfiguratorCreateMatrix(tenantId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MatrixApi#productConfiguratorCreateMatrix");
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
| **body** | [**ProductConfiguratorCreateMatrixRequest**](ProductConfiguratorCreateMatrixRequest.md)|  | |

### Return type

[**ProductconfiguratormatrixEntity**](ProductconfiguratormatrixEntity.md)

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

<a id="productConfiguratorDeleteMatrix"></a>
# **productConfiguratorDeleteMatrix**
> Object productConfiguratorDeleteMatrix(tenantId, matrixId)

Delete Matrix

Remove a specific matrix by specifying the tenant and matrix IDs. Ensure precision in matrix management with a straightforward DELETE request, simplifying the elimination of unwanted matrix configurations.

### Example
```java
// Import classes:
import GeminiCommerce_ProductConfigurator.ApiClient;
import GeminiCommerce_ProductConfigurator.ApiException;
import GeminiCommerce_ProductConfigurator.Configuration;
import GeminiCommerce_ProductConfigurator.auth.*;
import GeminiCommerce_ProductConfigurator.models.*;
import org.openapitools.client.api.MatrixApi;

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

    MatrixApi apiInstance = new MatrixApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String matrixId = "matrixId_example"; // String | 
    try {
      Object result = apiInstance.productConfiguratorDeleteMatrix(tenantId, matrixId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MatrixApi#productConfiguratorDeleteMatrix");
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

<a id="productConfiguratorGetMatrix"></a>
# **productConfiguratorGetMatrix**
> ProductconfiguratormatrixEntity productConfiguratorGetMatrix(tenantId, matrixId)

Get Matrix

Retrieve matrix details by specifying the tenant and matrix IDs. Utilize a GET request for a comprehensive view of matrix configurations within your product configurator service.

### Example
```java
// Import classes:
import GeminiCommerce_ProductConfigurator.ApiClient;
import GeminiCommerce_ProductConfigurator.ApiException;
import GeminiCommerce_ProductConfigurator.Configuration;
import GeminiCommerce_ProductConfigurator.auth.*;
import GeminiCommerce_ProductConfigurator.models.*;
import org.openapitools.client.api.MatrixApi;

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

    MatrixApi apiInstance = new MatrixApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String matrixId = "matrixId_example"; // String | 
    try {
      ProductconfiguratormatrixEntity result = apiInstance.productConfiguratorGetMatrix(tenantId, matrixId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MatrixApi#productConfiguratorGetMatrix");
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

### Return type

[**ProductconfiguratormatrixEntity**](ProductconfiguratormatrixEntity.md)

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

<a id="productConfiguratorListMatrices"></a>
# **productConfiguratorListMatrices**
> MatrixListMatricesResponse productConfiguratorListMatrices(tenantId, configuratorId, pageSize, body)

List Matrices

Retrieve a list of matrices for a specific configurator based on tenant and configurator IDs. Customize results by specifying page size for efficient pagination. Submit an empty body to get all matrices associated with the configurator. Streamline matrix management effortlessly.

### Example
```java
// Import classes:
import GeminiCommerce_ProductConfigurator.ApiClient;
import GeminiCommerce_ProductConfigurator.ApiException;
import GeminiCommerce_ProductConfigurator.Configuration;
import GeminiCommerce_ProductConfigurator.auth.*;
import GeminiCommerce_ProductConfigurator.models.*;
import org.openapitools.client.api.MatrixApi;

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

    MatrixApi apiInstance = new MatrixApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String configuratorId = "configuratorId_example"; // String | 
    String pageSize = "pageSize_example"; // String | 
    ProductConfiguratorListMatricesRequest body = new ProductConfiguratorListMatricesRequest(); // ProductConfiguratorListMatricesRequest | 
    try {
      MatrixListMatricesResponse result = apiInstance.productConfiguratorListMatrices(tenantId, configuratorId, pageSize, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MatrixApi#productConfiguratorListMatrices");
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
| **pageSize** | **String**|  | |
| **body** | [**ProductConfiguratorListMatricesRequest**](ProductConfiguratorListMatricesRequest.md)|  | |

### Return type

[**MatrixListMatricesResponse**](MatrixListMatricesResponse.md)

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

<a id="productConfiguratorRemovePricelistFromMatrix"></a>
# **productConfiguratorRemovePricelistFromMatrix**
> ProductconfiguratormatrixEntity productConfiguratorRemovePricelistFromMatrix(tenantId, matrixId, pricelistGrn)

Remove Pricelist from Matrix

Remove a specific pricelist from a matrix by specifying the tenant, matrix, and pricelist IDs. Use a DELETE request for precise management of pricelist configurations within your product configurator service.

### Example
```java
// Import classes:
import GeminiCommerce_ProductConfigurator.ApiClient;
import GeminiCommerce_ProductConfigurator.ApiException;
import GeminiCommerce_ProductConfigurator.Configuration;
import GeminiCommerce_ProductConfigurator.auth.*;
import GeminiCommerce_ProductConfigurator.models.*;
import org.openapitools.client.api.MatrixApi;

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

    MatrixApi apiInstance = new MatrixApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String matrixId = "matrixId_example"; // String | 
    String pricelistGrn = "pricelistGrn_example"; // String | 
    try {
      ProductconfiguratormatrixEntity result = apiInstance.productConfiguratorRemovePricelistFromMatrix(tenantId, matrixId, pricelistGrn);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MatrixApi#productConfiguratorRemovePricelistFromMatrix");
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
| **pricelistGrn** | **String**|  | |

### Return type

[**ProductconfiguratormatrixEntity**](ProductconfiguratormatrixEntity.md)

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

<a id="productConfiguratorUpdateMatrix"></a>
# **productConfiguratorUpdateMatrix**
> ProductconfiguratormatrixEntity productConfiguratorUpdateMatrix(tenantId, matrixId, body)

Update Matrix

Modify an existing matrix by specifying the tenant and matrix IDs. Utilize a PUT request with updated matrix details in the body for seamless customization and fine-tuning of your product configurations. Keep your matrices in sync effortlessly.

### Example
```java
// Import classes:
import GeminiCommerce_ProductConfigurator.ApiClient;
import GeminiCommerce_ProductConfigurator.ApiException;
import GeminiCommerce_ProductConfigurator.Configuration;
import GeminiCommerce_ProductConfigurator.auth.*;
import GeminiCommerce_ProductConfigurator.models.*;
import org.openapitools.client.api.MatrixApi;

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

    MatrixApi apiInstance = new MatrixApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String matrixId = "matrixId_example"; // String | 
    ProductConfiguratorUpdateMatrixRequest body = new ProductConfiguratorUpdateMatrixRequest(); // ProductConfiguratorUpdateMatrixRequest | 
    try {
      ProductconfiguratormatrixEntity result = apiInstance.productConfiguratorUpdateMatrix(tenantId, matrixId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MatrixApi#productConfiguratorUpdateMatrix");
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
| **body** | [**ProductConfiguratorUpdateMatrixRequest**](ProductConfiguratorUpdateMatrixRequest.md)|  | |

### Return type

[**ProductconfiguratormatrixEntity**](ProductconfiguratormatrixEntity.md)

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

