
# BaseOrder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | unique identifier of this item | 
**offerId** | **String** | the offer which this order was created from | 
**offerType** | [**OfferTypeEnum**](#OfferTypeEnum) |  | 
**title** | **String** | usually a brand name | 
**description** | **String** |  | 
**amount** | **Integer** | kin amount | 
**blockchainData** | [**BlockchainData**](BlockchainData.md) |  | 



<a name="OfferTypeEnum"></a>
## Enum: OfferTypeEnum
Name | Value
---- | -----
EARN | &quot;earn&quot;
SPEND | &quot;spend&quot;


