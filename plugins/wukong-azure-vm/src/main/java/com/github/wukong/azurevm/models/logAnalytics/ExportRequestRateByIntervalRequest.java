package com.github.wukong.azurevm.models.logAnalytics;

public class ExportRequestRateByIntervalRequest implements com.github.wukong.azurevm.models.AbstractAzureRequest {
	protected java.lang.String location;

	protected com.microsoft.azure.management.compute.RequestRateByIntervalInput parameters;

	public void setLocation(java.lang.String location) {
		this.location = location;
}
	public java.lang.String getLocation() {
		return this.location;
}
	public void setParameters(com.microsoft.azure.management.compute.RequestRateByIntervalInput parameters) {
		this.parameters = parameters;
}
	public com.microsoft.azure.management.compute.RequestRateByIntervalInput getParameters() {
		return this.parameters;
}
}