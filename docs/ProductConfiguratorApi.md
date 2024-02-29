# ProductConfiguratorApi

All URIs are relative to *https://product-configurator.api.gogemini.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**productConfiguratorGetProperty**](ProductConfiguratorApi.md#productConfiguratorGetProperty) | **GET** /v1/{tenantId}/property/{propertyId} |  |
| [**productConfiguratorListPropertiesByConfiguration**](ProductConfiguratorApi.md#productConfiguratorListPropertiesByConfiguration) | **POST** /v1/{tenantId}/configurator/{configuratorId}/page-size/{pageSize}/properties |  |


<a id="productConfiguratorGetProperty"></a>
# **productConfiguratorGetProperty**
> ProductconfiguratorpropertyEntity productConfiguratorGetProperty(tenantId, propertyId)



### Example
```java
// Import classes:
import GeminiCommerce_ProductConfigurator.ApiClient;
import GeminiCommerce_ProductConfigurator.ApiException;
import GeminiCommerce_ProductConfigurator.Configuration;
import GeminiCommerce_ProductConfigurator.models.*;
import org.openapitools.client.api.ProductConfiguratorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product-configurator.api.gogemini.io");

    ProductConfiguratorApi apiInstance = new ProductConfiguratorApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String propertyId = "propertyId_example"; // String | 
    try {
      ProductconfiguratorpropertyEntity result = apiInstance.productConfiguratorGetProperty(tenantId, propertyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductConfiguratorApi#productConfiguratorGetProperty");
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

### Return type

[**ProductconfiguratorpropertyEntity**](ProductconfiguratorpropertyEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="productConfiguratorListPropertiesByConfiguration"></a>
# **productConfiguratorListPropertiesByConfiguration**
> PropertyListPropertiesByConfigurationResponse productConfiguratorListPropertiesByConfiguration(tenantId, configuratorId, pageSize, body)



### Example
```java
// Import classes:
import GeminiCommerce_ProductConfigurator.ApiClient;
import GeminiCommerce_ProductConfigurator.ApiException;
import GeminiCommerce_ProductConfigurator.Configuration;
import GeminiCommerce_ProductConfigurator.models.*;
import org.openapitools.client.api.ProductConfiguratorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product-configurator.api.gogemini.io");

    ProductConfiguratorApi apiInstance = new ProductConfiguratorApi(defaultClient);
    String tenantId = "tenantId_example"; // String | 
    String configuratorId = "configuratorId_example"; // String | 
    String pageSize = "pageSize_example"; // String | 
    ProductConfiguratorListPropertiesByConfigurationRequest body = new ProductConfiguratorListPropertiesByConfigurationRequest(); // ProductConfiguratorListPropertiesByConfigurationRequest | 
    try {
      PropertyListPropertiesByConfigurationResponse result = apiInstance.productConfiguratorListPropertiesByConfiguration(tenantId, configuratorId, pageSize, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductConfiguratorApi#productConfiguratorListPropertiesByConfiguration");
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
| **body** | [**ProductConfiguratorListPropertiesByConfigurationRequest**](ProductConfiguratorListPropertiesByConfigurationRequest.md)|  | |

### Return type

[**PropertyListPropertiesByConfigurationResponse**](PropertyListPropertiesByConfigurationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

