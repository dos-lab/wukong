package com.github.wukong.azurevm.models.availabilitySets;

public class UpdateRequest implements com.github.wukong.azurevm.models.AbstractAzureRequest {
	protected java.lang.String resourceGroupName;

	protected java.lang.String availabilitySetName;

	protected com.microsoft.azure.management.compute.AvailabilitySetUpdate parameters;

	public void setResourceGroupName(java.lang.String resourceGroupName) {
		this.resourceGroupName = resourceGroupName;
}
	public java.lang.String getResourceGroupName() {
		return this.resourceGroupName;
}
	public void setAvailabilitySetName(java.lang.String availabilitySetName) {
		this.availabilitySetName = availabilitySetName;
}
	public java.lang.String getAvailabilitySetName() {
		return this.availabilitySetName;
}
	public void setParameters(com.microsoft.azure.management.compute.AvailabilitySetUpdate parameters) {
		this.parameters = parameters;
}
	public com.microsoft.azure.management.compute.AvailabilitySetUpdate getParameters() {
		return this.parameters;
}
}