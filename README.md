# openapi-java-client

Product Configurator Service
- API version: v1
  - Build date: 2024-11-15T16:31:51.145085516Z[Etc/UTC]
  - Generator version: 7.9.0

## Introduction

This comprehensive guide will equip you with the knowledge to integrate and leverage our Product Configurator Service in your applications.

## Quick Start

Get up and running in no time! Follow these steps to kickstart your integration:

1. **Authentication:** Obtain your integration JWT to authenticate your requests.
2. **Client Libraries:** Explore our GitHub repositories to grab client libraries in your preferred programming language.
3. **API Overview:** Familiarize yourself with our RESTful API using the OpenAPI specification.

## Integration

### API Overview

Our RESTful API is the gateway to unlocking the full potential of Product Configurator. Check out the detailed [API Reference](/docs/category/configurator) for a granular understanding of each endpoint and request/response format.

### Client Libraries

To expedite your integration process, we provide client libraries for various programming languages. Find the one that suits your stack in our [GitHub repositories](https://github.com/Gemini-Commerce).

### Authentication

Security is paramount. Learn how to authenticate your requests using JWT. This ensures a secure and reliable connection between your application and Product Configurator.

## Configuration Management

### Configurator Lifecycle

Understand the lifecycle of configurators, from draft to active and deleted. This flexibility allows you to manage configurations at your own pace.

### Steps and Options

Configure product steps with ease and define options effortlessly. Explore the power of dependencies to create dynamic and intuitive configurations.

### Matrices

Delve into matrices—your secret weapon. Explore price and weight matrices, and learn how configured steps influence properties and pricing.

### Price Management

Unleash dynamic pricing with our versatile price matrices. From fixed prices to incremental structures, adapt to diverse pricing models effortlessly.

## Security

Your data is in safe hands. Discover how Product Configurator ensures security through JWT authentication, safeguarding your sensitive information.

## Backward Compatibility

Stay ahead of the curve. Learn about our versioning strategy, providing backward compatibility while allowing our service to evolve seamlessly.

## Developer Support

Have questions? Need assistance? Write to us at [info@gemini-commerce.com](mailto:info@gemini-commerce.com) and we will get back to you.


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>v1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:v1"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-v1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import GeminiCommerce.ProductConfigurator.ApiClient;
import GeminiCommerce.ProductConfigurator.ApiException;
import GeminiCommerce.ProductConfigurator.Configuration;
import GeminiCommerce.ProductConfigurator.auth.*;
import org.openapitools.client.model.*;
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

## Documentation for API Endpoints

All URIs are relative to *https://product-configurator.api.gogemini.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ConfigurationApi* | [**productConfiguratorGetAvailableConfiguration**](docs/ConfigurationApi.md#productConfiguratorGetAvailableConfiguration) | **GET** /v1/{tenantId}/product/{productId}/configuration | Get Available Configuration
*ConfigurationApi* | [**productConfiguratorGetAvailableConfiguration2**](docs/ConfigurationApi.md#productConfiguratorGetAvailableConfiguration2) | **POST** /v1/{tenantId}/product/{productId}/configuration | Get Available Configuration
*ConfigurationApi* | [**productConfiguratorGetConfigurationFromSelections**](docs/ConfigurationApi.md#productConfiguratorGetConfigurationFromSelections) | **POST** /v1/{tenantId}/product/{productId}/configuration-from-selections | Get Configuration from Selections
*ConfiguratorApi* | [**productConfiguratorCopyConfigurator**](docs/ConfiguratorApi.md#productConfiguratorCopyConfigurator) | **POST** /v1/{tenantId}/product/{sourceConfiguratorId}/copy | Copy Configurator
*ConfiguratorApi* | [**productConfiguratorCreateConfigurator**](docs/ConfiguratorApi.md#productConfiguratorCreateConfigurator) | **POST** /v1/{tenantId}/product/{productId}/create | Create Configurator
*ConfiguratorApi* | [**productConfiguratorDeleteConfigurator**](docs/ConfiguratorApi.md#productConfiguratorDeleteConfigurator) | **DELETE** /v1/{tenantId}/configurator/{configuratorId} | Delete Configurator
*ConfiguratorApi* | [**productConfiguratorGetConfiguratorByProductId**](docs/ConfiguratorApi.md#productConfiguratorGetConfiguratorByProductId) | **GET** /v1/{tenantId}/product/{productId} | Get Configurator by Product ID
*ConfiguratorApi* | [**productConfiguratorGetConfiguratorByProductId2**](docs/ConfiguratorApi.md#productConfiguratorGetConfiguratorByProductId2) | **GET** /v1/{tenantId}/product/{productId}/status/{status} | Get Configurator by Product ID
*ConfiguratorApi* | [**productConfiguratorListConfigurators**](docs/ConfiguratorApi.md#productConfiguratorListConfigurators) | **POST** /v1/{tenantId}/product/{productId}/page-size/{pageSize}/configurators | List Product Configurators
*ConfiguratorApi* | [**productConfiguratorUpdateConfigurator**](docs/ConfiguratorApi.md#productConfiguratorUpdateConfigurator) | **PUT** /v1/{tenantId}/configurator/{configuratorId} | Update Configurator
*DependencyApi* | [**productConfiguratorCreateDependency**](docs/DependencyApi.md#productConfiguratorCreateDependency) | **POST** /v1/{tenantId}/step/{stepId}/dependency/create | Create Dependency
*DependencyApi* | [**productConfiguratorDeleteDependency**](docs/DependencyApi.md#productConfiguratorDeleteDependency) | **DELETE** /v1/{tenantId}/dependency/{dependencyId} | Delete Dependency
*DependencyApi* | [**productConfiguratorListDependencies**](docs/DependencyApi.md#productConfiguratorListDependencies) | **POST** /v1/{tenantId}/page-size/{pageSize}/dependencies | List Dependencies
*DependencyApi* | [**productConfiguratorUpdateDependency**](docs/DependencyApi.md#productConfiguratorUpdateDependency) | **PUT** /v1/{tenantId}/dependency/{dependencyId} | Update Dependency
*MatrixApi* | [**productConfiguratorCreateMatrix**](docs/MatrixApi.md#productConfiguratorCreateMatrix) | **POST** /v1/{tenantId}/matrix/create | Create Matrix
*MatrixApi* | [**productConfiguratorDeleteMatrix**](docs/MatrixApi.md#productConfiguratorDeleteMatrix) | **DELETE** /v1/{tenantId}/matrix/{matrixId} | Delete Matrix
*MatrixApi* | [**productConfiguratorGetMatrix**](docs/MatrixApi.md#productConfiguratorGetMatrix) | **GET** /v1/{tenantId}/matrix/{matrixId} | Get Matrix
*MatrixApi* | [**productConfiguratorListMatrices**](docs/MatrixApi.md#productConfiguratorListMatrices) | **POST** /v1/{tenantId}/configurator/{configuratorId}/page-size/{pageSize}/matrices | List Matrices
*MatrixApi* | [**productConfiguratorRemovePricelistFromMatrix**](docs/MatrixApi.md#productConfiguratorRemovePricelistFromMatrix) | **DELETE** /v1/{tenantId}/matrix/{matrixId}/pricelist/{pricelistGrn} | Remove Pricelist from Matrix
*MatrixApi* | [**productConfiguratorUpdateMatrix**](docs/MatrixApi.md#productConfiguratorUpdateMatrix) | **PUT** /v1/{tenantId}/matrix/{matrixId} | Update Matrix
*OptionApi* | [**productConfiguratorBulkCreateOptions**](docs/OptionApi.md#productConfiguratorBulkCreateOptions) | **POST** /v1/{tenantId}/step/{stepId}/option/create/bulk | Bulk Create Options
*OptionApi* | [**productConfiguratorBulkDeleteOptions**](docs/OptionApi.md#productConfiguratorBulkDeleteOptions) | **POST** /v1/{tenantId}/option/delete/bulk | Bulk Delete Options
*OptionApi* | [**productConfiguratorBulkUpdateOptions**](docs/OptionApi.md#productConfiguratorBulkUpdateOptions) | **PUT** /v1/{tenantId}/option/bulk | Bulk Update Options
*OptionApi* | [**productConfiguratorCopyOption**](docs/OptionApi.md#productConfiguratorCopyOption) | **POST** /v1/{tenantId}/option/{sourceOptionId}/copy | Copy Option
*OptionApi* | [**productConfiguratorCreateOption**](docs/OptionApi.md#productConfiguratorCreateOption) | **POST** /v1/{tenantId}/step/{stepId}/option/create | Create Option
*OptionApi* | [**productConfiguratorDeleteOption**](docs/OptionApi.md#productConfiguratorDeleteOption) | **DELETE** /v1/{tenantId}/option/{optionId} | Delete Option
*OptionApi* | [**productConfiguratorListOptions**](docs/OptionApi.md#productConfiguratorListOptions) | **POST** /v1/{tenantId}/step/{stepId}/page-size/{pageSize}/options | List Options
*OptionApi* | [**productConfiguratorUpdateOption**](docs/OptionApi.md#productConfiguratorUpdateOption) | **PUT** /v1/{tenantId}/option/{optionId} | Update Option
*ProductConfiguratorApi* | [**productConfiguratorGetProperty**](docs/ProductConfiguratorApi.md#productConfiguratorGetProperty) | **GET** /v1/{tenantId}/property/{propertyId} | 
*ProductConfiguratorApi* | [**productConfiguratorListPropertiesByConfiguration**](docs/ProductConfiguratorApi.md#productConfiguratorListPropertiesByConfiguration) | **POST** /v1/{tenantId}/configurator/{configuratorId}/page-size/{pageSize}/properties | 
*PropertyApi* | [**productConfiguratorBulkCreateProperties**](docs/PropertyApi.md#productConfiguratorBulkCreateProperties) | **POST** /v1/{tenantId}/property/create/bulk | Bulk Create Properties
*PropertyApi* | [**productConfiguratorBulkUpdateProperties**](docs/PropertyApi.md#productConfiguratorBulkUpdateProperties) | **PUT** /v1/{tenantId}/properties/bulk | Bulk Update Properties
*PropertyApi* | [**productConfiguratorCreateProperty**](docs/PropertyApi.md#productConfiguratorCreateProperty) | **POST** /v1/{tenantId}/property/create | Create Property
*PropertyApi* | [**productConfiguratorListProperties**](docs/PropertyApi.md#productConfiguratorListProperties) | **POST** /v1/{tenantId}/matrix/{matrixId}/page-size/{pageSize}/properties | List Properties
*PropertyApi* | [**productConfiguratorUpdateProperty**](docs/PropertyApi.md#productConfiguratorUpdateProperty) | **PUT** /v1/{tenantId}/property/{propertyId} | Update Property
*StepApi* | [**productConfiguratorBulkCreateSteps**](docs/StepApi.md#productConfiguratorBulkCreateSteps) | **POST** /v1/{tenantId}/configurator/{configuratorId}/step/create/bulk | Bulk Create Steps
*StepApi* | [**productConfiguratorBulkDeleteSteps**](docs/StepApi.md#productConfiguratorBulkDeleteSteps) | **POST** /v1/{tenantId}/step/delete/bulk | Bulk Delete Steps
*StepApi* | [**productConfiguratorCopyStep**](docs/StepApi.md#productConfiguratorCopyStep) | **POST** /v1/{tenantId}/step/{sourceStepId}/copy | Copy Step
*StepApi* | [**productConfiguratorCreateStep**](docs/StepApi.md#productConfiguratorCreateStep) | **POST** /v1/{tenantId}/configurator/{configuratorId}/step/create | Create Step
*StepApi* | [**productConfiguratorDeleteStep**](docs/StepApi.md#productConfiguratorDeleteStep) | **DELETE** /v1/{tenantId}/step/{stepId} | Delete Step
*StepApi* | [**productConfiguratorUpdateStep**](docs/StepApi.md#productConfiguratorUpdateStep) | **PUT** /v1/{tenantId}/step/{stepId} | Update Step


## Documentation for Models

 - [ConfigurationConfigurationStep](docs/ConfigurationConfigurationStep.md)
 - [ConfigurationConfigurator](docs/ConfigurationConfigurator.md)
 - [ConfigurationGetAvailableConfigurationResponse](docs/ConfigurationGetAvailableConfigurationResponse.md)
 - [ConfigurationGetConfigurationFromSelectionsResponse](docs/ConfigurationGetConfigurationFromSelectionsResponse.md)
 - [ConfigurationOptionProperty](docs/ConfigurationOptionProperty.md)
 - [ConfigurationProperty](docs/ConfigurationProperty.md)
 - [ConfigurationPropertyFilter](docs/ConfigurationPropertyFilter.md)
 - [ConfigurationPropertyFilterGenericProperty](docs/ConfigurationPropertyFilterGenericProperty.md)
 - [ConfigurationStepOption](docs/ConfigurationStepOption.md)
 - [ConfiguratorListResponse](docs/ConfiguratorListResponse.md)
 - [DependencyCondition](docs/DependencyCondition.md)
 - [DependencyListDependenciesResponse](docs/DependencyListDependenciesResponse.md)
 - [GooglerpcStatus](docs/GooglerpcStatus.md)
 - [ListMatricesRequestFilter](docs/ListMatricesRequestFilter.md)
 - [LocalisationLocalizedText](docs/LocalisationLocalizedText.md)
 - [MatrixGenericType](docs/MatrixGenericType.md)
 - [MatrixListMatricesResponse](docs/MatrixListMatricesResponse.md)
 - [MatrixPriceType](docs/MatrixPriceType.md)
 - [MatrixWeightType](docs/MatrixWeightType.md)
 - [OptionListOptionsResponse](docs/OptionListOptionsResponse.md)
 - [OptionSwatch](docs/OptionSwatch.md)
 - [ProductConfiguratorBulkCreateOptionsRequest](docs/ProductConfiguratorBulkCreateOptionsRequest.md)
 - [ProductConfiguratorBulkCreatePropertiesRequest](docs/ProductConfiguratorBulkCreatePropertiesRequest.md)
 - [ProductConfiguratorBulkCreateStepsRequest](docs/ProductConfiguratorBulkCreateStepsRequest.md)
 - [ProductConfiguratorBulkDeleteOptionsRequest](docs/ProductConfiguratorBulkDeleteOptionsRequest.md)
 - [ProductConfiguratorBulkDeleteStepsRequest](docs/ProductConfiguratorBulkDeleteStepsRequest.md)
 - [ProductConfiguratorBulkUpdateOptionsRequest](docs/ProductConfiguratorBulkUpdateOptionsRequest.md)
 - [ProductConfiguratorBulkUpdatePropertiesRequest](docs/ProductConfiguratorBulkUpdatePropertiesRequest.md)
 - [ProductConfiguratorCopyConfiguratorRequest](docs/ProductConfiguratorCopyConfiguratorRequest.md)
 - [ProductConfiguratorCopyOptionRequest](docs/ProductConfiguratorCopyOptionRequest.md)
 - [ProductConfiguratorCopyStepRequest](docs/ProductConfiguratorCopyStepRequest.md)
 - [ProductConfiguratorCreateConfiguratorRequest](docs/ProductConfiguratorCreateConfiguratorRequest.md)
 - [ProductConfiguratorCreateDependencyRequest](docs/ProductConfiguratorCreateDependencyRequest.md)
 - [ProductConfiguratorCreateMatrixRequest](docs/ProductConfiguratorCreateMatrixRequest.md)
 - [ProductConfiguratorCreateOptionRequest](docs/ProductConfiguratorCreateOptionRequest.md)
 - [ProductConfiguratorCreatePropertyRequest](docs/ProductConfiguratorCreatePropertyRequest.md)
 - [ProductConfiguratorCreateStepRequest](docs/ProductConfiguratorCreateStepRequest.md)
 - [ProductConfiguratorGetAvailableConfiguration2Request](docs/ProductConfiguratorGetAvailableConfiguration2Request.md)
 - [ProductConfiguratorGetConfigurationFromSelectionsRequest](docs/ProductConfiguratorGetConfigurationFromSelectionsRequest.md)
 - [ProductConfiguratorListDependenciesRequest](docs/ProductConfiguratorListDependenciesRequest.md)
 - [ProductConfiguratorListMatricesRequest](docs/ProductConfiguratorListMatricesRequest.md)
 - [ProductConfiguratorListPropertiesByConfigurationRequest](docs/ProductConfiguratorListPropertiesByConfigurationRequest.md)
 - [ProductConfiguratorListPropertiesRequest](docs/ProductConfiguratorListPropertiesRequest.md)
 - [ProductConfiguratorUpdateConfiguratorRequest](docs/ProductConfiguratorUpdateConfiguratorRequest.md)
 - [ProductConfiguratorUpdateDependencyRequest](docs/ProductConfiguratorUpdateDependencyRequest.md)
 - [ProductConfiguratorUpdateMatrixRequest](docs/ProductConfiguratorUpdateMatrixRequest.md)
 - [ProductConfiguratorUpdateOptionRequest](docs/ProductConfiguratorUpdateOptionRequest.md)
 - [ProductConfiguratorUpdatePropertyRequest](docs/ProductConfiguratorUpdatePropertyRequest.md)
 - [ProductConfiguratorUpdateStepRequest](docs/ProductConfiguratorUpdateStepRequest.md)
 - [ProductconfiguratorMoney](docs/ProductconfiguratorMoney.md)
 - [ProductconfiguratorPropertyMode](docs/ProductconfiguratorPropertyMode.md)
 - [ProductconfiguratorPropertyType](docs/ProductconfiguratorPropertyType.md)
 - [ProductconfiguratorWeightUnit](docs/ProductconfiguratorWeightUnit.md)
 - [ProductconfiguratorconfigurationOption](docs/ProductconfiguratorconfigurationOption.md)
 - [ProductconfiguratorconfigurationSelection](docs/ProductconfiguratorconfigurationSelection.md)
 - [ProductconfiguratorconfigurationStep](docs/ProductconfiguratorconfigurationStep.md)
 - [ProductconfiguratorconfiguratorEntity](docs/ProductconfiguratorconfiguratorEntity.md)
 - [ProductconfiguratorconfiguratorStatus](docs/ProductconfiguratorconfiguratorStatus.md)
 - [ProductconfiguratorconfiguratorUpdatePayload](docs/ProductconfiguratorconfiguratorUpdatePayload.md)
 - [ProductconfiguratordependencyEntity](docs/ProductconfiguratordependencyEntity.md)
 - [ProductconfiguratordependencyType](docs/ProductconfiguratordependencyType.md)
 - [ProductconfiguratordependencyUpdatePayload](docs/ProductconfiguratordependencyUpdatePayload.md)
 - [ProductconfiguratormatrixEntity](docs/ProductconfiguratormatrixEntity.md)
 - [ProductconfiguratormatrixStep](docs/ProductconfiguratormatrixStep.md)
 - [ProductconfiguratormatrixUpdatePayload](docs/ProductconfiguratormatrixUpdatePayload.md)
 - [ProductconfiguratoroptionBulkCreateRequestCreateEntity](docs/ProductconfiguratoroptionBulkCreateRequestCreateEntity.md)
 - [ProductconfiguratoroptionBulkCreateResponse](docs/ProductconfiguratoroptionBulkCreateResponse.md)
 - [ProductconfiguratoroptionBulkUpdateRequestUpdateEntity](docs/ProductconfiguratoroptionBulkUpdateRequestUpdateEntity.md)
 - [ProductconfiguratoroptionBulkUpdateResponse](docs/ProductconfiguratoroptionBulkUpdateResponse.md)
 - [ProductconfiguratoroptionEntity](docs/ProductconfiguratoroptionEntity.md)
 - [ProductconfiguratoroptionUpdatePayload](docs/ProductconfiguratoroptionUpdatePayload.md)
 - [ProductconfiguratorpropertyBulkCreateRequestCreateEntity](docs/ProductconfiguratorpropertyBulkCreateRequestCreateEntity.md)
 - [ProductconfiguratorpropertyBulkCreateResponse](docs/ProductconfiguratorpropertyBulkCreateResponse.md)
 - [ProductconfiguratorpropertyBulkUpdateRequestUpdateEntity](docs/ProductconfiguratorpropertyBulkUpdateRequestUpdateEntity.md)
 - [ProductconfiguratorpropertyBulkUpdateResponse](docs/ProductconfiguratorpropertyBulkUpdateResponse.md)
 - [ProductconfiguratorpropertyEntity](docs/ProductconfiguratorpropertyEntity.md)
 - [ProductconfiguratorpropertyGenericProperty](docs/ProductconfiguratorpropertyGenericProperty.md)
 - [ProductconfiguratorpropertyPriceProperty](docs/ProductconfiguratorpropertyPriceProperty.md)
 - [ProductconfiguratorpropertyUpdatePayload](docs/ProductconfiguratorpropertyUpdatePayload.md)
 - [ProductconfiguratorpropertyWeightProperty](docs/ProductconfiguratorpropertyWeightProperty.md)
 - [ProductconfiguratorstepBulkCreateRequestCreateEntity](docs/ProductconfiguratorstepBulkCreateRequestCreateEntity.md)
 - [ProductconfiguratorstepBulkCreateResponse](docs/ProductconfiguratorstepBulkCreateResponse.md)
 - [ProductconfiguratorstepEntity](docs/ProductconfiguratorstepEntity.md)
 - [ProductconfiguratorstepUpdatePayload](docs/ProductconfiguratorstepUpdatePayload.md)
 - [PropertyListPropertiesByConfigurationRequestSelection](docs/PropertyListPropertiesByConfigurationRequestSelection.md)
 - [PropertyListPropertiesByConfigurationResponse](docs/PropertyListPropertiesByConfigurationResponse.md)
 - [PropertyListPropertiesResponse](docs/PropertyListPropertiesResponse.md)
 - [PropertyUpdatePayloadGenericProperty](docs/PropertyUpdatePayloadGenericProperty.md)
 - [PropertyUpdatePayloadPriceProperty](docs/PropertyUpdatePayloadPriceProperty.md)
 - [PropertyUpdatePayloadWeightProperty](docs/PropertyUpdatePayloadWeightProperty.md)
 - [ProtobufAny](docs/ProtobufAny.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="APIAuthorization"></a>
### APIAuthorization

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

<a id="standardAuthorization"></a>
### standardAuthorization

- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: https://iambackoffice.gogemini.io/iambackoffice.IamBackoffice/Login
- **Scopes**: N/A


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

info@gemini-commerce.com

