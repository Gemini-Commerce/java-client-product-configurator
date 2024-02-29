# # ProductconfiguratormatrixUpdatePayload


## Properties 


Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**label**| **String** |   | [optional]
**defaultPropertyId**| **String** | default_property_id is the id of the property that will be used as the starting point to calculate the differences between the properties.  | [optional]
**propertiesMode**| [**ProductconfiguratorPropertyMode**](ProductconfiguratorPropertyMode.md) |  for more information please, see Model/ProductconfiguratorPropertyMode.php  | [optional] [default to ProductconfiguratorPropertyMode.UNKNOWN]
**steps**| [**List<ProductconfiguratormatrixStep>**](ProductconfiguratormatrixStep.md) | steps are the same as in the create request. This is a full replacement.  | [optional]


[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)

