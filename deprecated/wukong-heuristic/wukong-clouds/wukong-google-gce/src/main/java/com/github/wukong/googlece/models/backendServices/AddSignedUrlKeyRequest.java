package com.github.wukong.googlece.models.backendServices;

public class AddSignedUrlKeyRequest implements com.github.wukong.googlece.models.AbstractGoogleRequest {
	protected java.lang.String project;

	protected java.lang.String backendService;

	protected com.google.api.services.compute.model.SignedUrlKey content;

	public void setProject(java.lang.String project) {
		this.project = project;
}
	public java.lang.String getProject() {
		return this.project;
}
	public void setBackendService(java.lang.String backendService) {
		this.backendService = backendService;
}
	public java.lang.String getBackendService() {
		return this.backendService;
}
	public void setContent(com.google.api.services.compute.model.SignedUrlKey content) {
		this.content = content;
}
	public com.google.api.services.compute.model.SignedUrlKey getContent() {
		return this.content;
}
}