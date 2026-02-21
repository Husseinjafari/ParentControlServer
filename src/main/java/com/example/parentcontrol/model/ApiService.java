//package com.example.parentcontrol.model;
//
//
//import java.util.List;
//
//public interface ApiService {
//
//    // ارسال یک موقعیت
//    @POST("api/location/send")
//    Call<ApiModels.ApiResponse> sendLocation(
//            @Header("Authorization") String token,
//            @Body ApiModels.LocationRequest location
//    );
//
//    // ارسال چند موقعیت با هم (برای وقتی که آفلاین بودیم و بعد وصل شدیم)
//    @POST("api/location/send-batch")
//    Call<ApiModels.ApiResponse> sendLocationsBatch(
//            @Header("Authorization") String token,
//            @Body List<ApiModels.LocationRequest> locations
//    );
//
//    // ثبت نام دستگاه (برای گرفتن توکن)
//    @POST("api/device/register")
//    Call<ApiModels.ApiResponse> registerDevice(
//            @Body DeviceRegistrationRequest request
//    );
//
//    // مدل ثبت نام دستگاه
//    class DeviceRegistrationRequest {
//        private String deviceId;
//        private String deviceName;
//        private String androidVersion;
//        private String childName;  // اسم فرزند
//
//        public DeviceRegistrationRequest(String deviceId, String deviceName,
//                                         String androidVersion, String childName) {
//            this.deviceId = deviceId;
//            this.deviceName = deviceName;
//            this.androidVersion = androidVersion;
//            this.childName = childName;
//        }
//    }
//}
//
