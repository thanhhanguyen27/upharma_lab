package com.example.upharma_app.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class RelativeInfo (
    @SerializedName("RowID")
    var rowID: Int = 0,

    @SerializedName("RelativeID")
    var relativeID: Int = 0,

    @SerializedName("FullName")
    var fullName: String = "",

    @SerializedName("Relationship")
    var relationship: String = "",

    @SerializedName("ShareInfo")
    var shareInfo: Boolean = true,

    @SerializedName("MoreInfo")
    var moreInfo: String = "",

    @SerializedName("PhoneNumber")
    var phoneNumber: String= "",

    @SerializedName("Email")
    var email: String = "",

    @SerializedName("TimeCreate")
    var timeCreate: String = "",

    @SerializedName("Status")
    var status: Int = 0
): Serializable {

}