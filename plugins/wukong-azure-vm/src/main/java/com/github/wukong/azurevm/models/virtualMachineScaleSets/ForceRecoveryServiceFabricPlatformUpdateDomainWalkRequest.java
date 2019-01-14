package com.github.wukong.azurevm.models.virtualMachineScaleSets;

public class ForceRecoveryServiceFabricPlatformUpdateDomainWalkRequest implements com.github.wukong.azurevm.models.AbstractAzureRequest {
	protected java.lang.String resourceGroupName;

	protected java.lang.String vmScaleSetName;

	protected int platformUpdateDomain;

	public void setResourceGroupName(java.lang.String resourceGroupName) {
		this.resourceGroupName = resourceGroupName;
}
	public java.lang.String getResourceGroupName() {
		return this.resourceGroupName;
}
	public void setVmScaleSetName(java.lang.String vmScaleSetName) {
		this.vmScaleSetName = vmScaleSetName;
}
	public java.lang.String getVmScaleSetName() {
		return this.vmScaleSetName;
}
	public void setPlatformUpdateDomain(int platformUpdateDomain) {
		this.platformUpdateDomain = platformUpdateDomain;
}
	public int getPlatformUpdateDomain() {
		return this.platformUpdateDomain;
}
}