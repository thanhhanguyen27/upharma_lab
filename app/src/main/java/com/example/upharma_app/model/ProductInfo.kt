package com.example.upharma_app.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ProductInfo:Serializable {
    @SerializedName("ProductID")
    var ProductID: String=""
    @SerializedName("ProductName")
    var ProductName:String=""
    @SerializedName("UnitOfMeasure")
    var UnitOfMeasure:String=""
    @SerializedName("StorageCondition")
    var StorageCondition:String=""
    @SerializedName("ManufacturerName")
    var ManufacturerName:String=""
    @SerializedName("Distributor")
    var Distributor:String=""
    @SerializedName("Description")
    var Description:String=""

    @SerializedName("ProductType")
    var ProductType:String=""
    @SerializedName("BarCode")
    var BarCode:String=""
    @SerializedName("RegistrationNumber")
    var RegistrationNumber:String=""
    @SerializedName("DosageForm")
    var DosageForm:String=""
    @SerializedName("PharmacologicalType")
    var PharmacologicalType:String=""
    @SerializedName("RegisterType")
    var RegisterType:String=""
    @SerializedName("BodyOrgan")
    var BodyOrgan:String=""
    @SerializedName("OtherType")
    var OtherType:String=""
    @SerializedName("LinkImage")
    var LinkImage:String=""
    @SerializedName("VAT")
    var VAT:Int=0
//    @SerializedName("RegisterType")
//    var RegisterType:String=""
//    @SerializedName("RegisterType")
//    var RegisterType:String=""
//    @SerializedName("RegisterType")
//    var RegisterType:String=""
}