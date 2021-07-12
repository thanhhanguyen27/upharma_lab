package com.example.upharma_app.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ProductInfo (
    @SerializedName("ProductID")
    var productID: String="",
    @SerializedName("ProductName")
    var productName:String="",
    @SerializedName("UnitOfMeasure")
    var unitOfMeasure:String="",
    @SerializedName("StorageCondition")
    var storageCondition:String="",
    @SerializedName("ManufacturerName")
    var manufacturerName:String="",
    @SerializedName("Distributor")
    var distributor:String="",
    @SerializedName("Description")
    var description:String="",
    @SerializedName("ProductType")
    var productType:String="",
    @SerializedName("BarCode")
    var barCode:String="",
    @SerializedName("RegistrationNumber")
    var registrationNumber:String="",
    @SerializedName("DosageForm")
    var dosageForm:String="",
    @SerializedName("PharmacologicalType")
    var pharmacologicalType:String="",
    @SerializedName("RegisterType")
    var registerType:String="",
    @SerializedName("BodyOrgan")
    var bodyOrgan:String="",
    @SerializedName("OtherType")
    var otherType:String="",
    @SerializedName("LinkImage")
    var linkImage:String="",
    @SerializedName("VAT")
    var vat:Int=0
): Serializable