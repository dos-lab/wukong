package com.github.wukong.azurevm.models.virtualMachineScaleSets;

public class ListByResourceGroupNextRequest implements com.github.wukong.azurevm.models.AbstractAzureRequest {
	protected java.lang.String nextPageLink;

	public void setNextPageLink(java.lang.String nextPageLink) {
		this.nextPageLink = nextPageLink;
}
	public java.lang.String getNextPageLink() {
		return this.nextPageLink;
}
}