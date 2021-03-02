package com.nibri.binproject;

public class ServiceList {

    /**
     * serviceId : 1
     * serviceName : Ride
     * isServiceAvailable : true
     * serviceIconEN : https://shohozappcontent.blob.core.windows.net/dev/img/verticals/vertical-truck.png
     * serviceIconBN : https://shohozappcontent.blob.core.windows.net/dev/img/verticals/vertical-truck.png
     * serviceUnavailableIconEN : https://www.shohoz.com/service.png
     * serviceUnavailableIconBN : https://www.shohoz.com/service.png
     * serviceType : RIDE
     * serviceUnavailableMsgEN : Blah Blah
     * serviceUnavailableMsgBN : Blah Blah
     * serviceHTTPHeader :
     * isAuthRequired : true
     * serviceScope : Native
     */
    private int serviceId;
    private String serviceName;
    private boolean isServiceAvailable;
    private String serviceIconEN;
    private String serviceIconBN;
    private String serviceUnavailableIconEN;
    private String serviceUnavailableIconBN;
    private String serviceType;
    private String serviceUnavailableMsgEN;
    private String serviceUnavailableMsgBN;
    private String serviceHTTPHeader;
    private boolean isAuthRequired;
    private String serviceScope;
    private String nativeBridgeUrl;
    private String serviceURL;
    private boolean isMoreAvailable = false;



    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public boolean isIsServiceAvailable() {
        return isServiceAvailable;
    }

    public void setIsServiceAvailable(boolean isServiceAvailable) {
        this.isServiceAvailable = isServiceAvailable;
    }

    public String getServiceIconEN() {
        return serviceIconEN;
    }

    public void setServiceIconEN(String serviceIconEN) {
        this.serviceIconEN = serviceIconEN;
    }

    public String getServiceIconBN() {
        return serviceIconBN;
    }

    public void setServiceIconBN(String serviceIconBN) {
        this.serviceIconBN = serviceIconBN;
    }

    public String getServiceUnavailableIconEN() {
        return serviceUnavailableIconEN;
    }

    public void setServiceUnavailableIconEN(String serviceUnavailableIconEN) {
        this.serviceUnavailableIconEN = serviceUnavailableIconEN;
    }

    public String getServiceUnavailableIconBN() {
        return serviceUnavailableIconBN;
    }

    public void setServiceUnavailableIconBN(String serviceUnavailableIconBN) {
        this.serviceUnavailableIconBN = serviceUnavailableIconBN;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getServiceUnavailableMsgEN() {
        return serviceUnavailableMsgEN;
    }

    public void setServiceUnavailableMsgEN(String serviceUnavailableMsgEN) {
        this.serviceUnavailableMsgEN = serviceUnavailableMsgEN;
    }

    public String getServiceUnavailableMsgBN() {
        return serviceUnavailableMsgBN;
    }

    public void setServiceUnavailableMsgBN(String serviceUnavailableMsgBN) {
        this.serviceUnavailableMsgBN = serviceUnavailableMsgBN;
    }

    public String getServiceHTTPHeader() {
        return serviceHTTPHeader;
    }

    public void setServiceHTTPHeader(String serviceHTTPHeader) {
        this.serviceHTTPHeader = serviceHTTPHeader;
    }

    public boolean isIsAuthRequired() {
        return isAuthRequired;
    }

    public void setIsAuthRequired(boolean isAuthRequired) {
        this.isAuthRequired = isAuthRequired;
    }

    public boolean isServiceAvailable() {
        return isServiceAvailable;
    }

    public void setServiceAvailable(boolean serviceAvailable) {
        isServiceAvailable = serviceAvailable;
    }

    public boolean isAuthRequired() {
        return isAuthRequired;
    }

    public void setAuthRequired(boolean authRequired) {
        isAuthRequired = authRequired;
    }

    public String getNativeBridgeUrl() {
        return nativeBridgeUrl;
    }

    public void setNativeBridgeUrl(String nativeBridgeUrl) {
        this.nativeBridgeUrl = nativeBridgeUrl;
    }

    public String getServiceURL() {
        return serviceURL;
    }

    public void setServiceURL(String serviceURL) {
        this.serviceURL = serviceURL;
    }

    public String getServiceScope() {
        return serviceScope;
    }

    public void setServiceScope(String serviceScope) {
        this.serviceScope = serviceScope;
    }

    public boolean isMoreAvailable() {
        return isMoreAvailable;
    }

    public void setMoreAvailable(boolean moreAvailable) {
        isMoreAvailable = moreAvailable;
    }
}
