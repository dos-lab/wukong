package com.github.wukong.azurevm.models.logAnalytics;

public class BeginExportThrottledRequestsRequest implements com.github.wukong.azurevm.models.AbstractAzureRequest {
	protected java.lang.String location;

	protected com.microsoft.azure.management.compute.ThrottledRequestsInput parameters;

	public void setLocation(java.lang.String location) {
		this.location = location;
}
	public java.lang.String getLocation() {
		return this.location;
}
	public void setParameters(com.microsoft.azure.management.compute.ThrottledRequestsInput parameters) {
		this.parameters = parameters;
}
	public com.microsoft.azure.management.compute.ThrottledRequestsInput getParameters() {
		return this.parameters;
}
}