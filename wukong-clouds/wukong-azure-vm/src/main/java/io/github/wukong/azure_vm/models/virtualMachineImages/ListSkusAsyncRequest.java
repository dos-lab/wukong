package io.github.wukong.azure_vm.models.virtualMachineImages;

public class ListSkusAsyncRequest implements io.github.wukong.azure_vm.models.AbstractAzureRequest {
	protected java.lang.String location;

	protected java.lang.String publisherName;

	protected java.lang.String offer;

	public void setLocation(java.lang.String location) {
		this.location = location;
}
	public java.lang.String getLocation() {
		return this.location;
}
	public void setPublisherName(java.lang.String publisherName) {
		this.publisherName = publisherName;
}
	public java.lang.String getPublisherName() {
		return this.publisherName;
}
	public void setOffer(java.lang.String offer) {
		this.offer = offer;
}
	public java.lang.String getOffer() {
		return this.offer;
}
}