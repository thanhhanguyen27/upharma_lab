package com.example.upharma_app.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class RelativeInfo:Serializable {
    @SerializedName("RowID")
    var RowID: Int = 0

    @SerializedName("RelativeID")
    var RelativeID: Int = 0

    @SerializedName("FullName")
    var FullName: String = ""

    @SerializedName("Relationship")
    var Relationship: String = ""

    @SerializedName("ShareInfo")
    var ShareInfo: Boolean = true

    @SerializedName("MoreInfo")
    var MoreInfo: String = ""

    @SerializedName("PhoneNumber")
    var PhoneNumber: String= ""

    @SerializedName("Email")
    var Email: String = ""

    @SerializedName("TimeCreate")
    var TimeCreate: String = ""

    @SerializedName("Status")
    var Status: Int = 0


    constructor(rowID:Int, RelativeID:Int,FullName: String ,Relationship: String,ShareInfo: Boolean,  MoreInfo: String,PhoneNumber: String, Email: String ,TimeCreate: String, Status: Int  ){
        this.RowID= rowID
        this.RelativeID= RelativeID
        this.FullName= FullName
        this.Relationship=Relationship
        this.ShareInfo=ShareInfo
        this.MoreInfo=MoreInfo
        this.PhoneNumber=PhoneNumber
        this.Email=Email
        this.TimeCreate=TimeCreate
        this.Status=Status
    }

}