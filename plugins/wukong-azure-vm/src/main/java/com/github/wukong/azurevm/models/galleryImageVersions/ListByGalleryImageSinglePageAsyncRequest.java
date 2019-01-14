package com.github.wukong.azurevm.models.galleryImageVersions;

public class ListByGalleryImageSinglePageAsyncRequest implements com.github.wukong.azurevm.models.AbstractAzureRequest {
	protected java.lang.String resourceGroupName;

	protected java.lang.String galleryName;

	protected java.lang.String galleryImageName;

	public void setResourceGroupName(java.lang.String resourceGroupName) {
		this.resourceGroupName = resourceGroupName;
}
	public java.lang.String getResourceGroupName() {
		return this.resourceGroupName;
}
	public void setGalleryName(java.lang.String galleryName) {
		this.galleryName = galleryName;
}
	public java.lang.String getGalleryName() {
		return this.galleryName;
}
	public void setGalleryImageName(java.lang.String galleryImageName) {
		this.galleryImageName = galleryImageName;
}
	public java.lang.String getGalleryImageName() {
		return this.galleryImageName;
}
}