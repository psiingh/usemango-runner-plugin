package it.infuse.jenkins.usemango.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

public class TestIndexItem extends GenericJson {

	@Key("Id")
	private String id;
	@Key("Name")
	private String name;
	@Key("Status")
	private String status;
	@Key("Folder")
	private String folder;
	@Key("Assignee")
	private String assignee;
	@Key("LastModified")
	private String lastModified; 
	private boolean passed;
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @return the folder
	 */
	public String getFolder() {
		return folder;
	}
	/**
	 * @return the assignee
	 */
	public String getAssignee() {
		return assignee;
	}
	/**
	 * @return the lastModified
	 */
	public String getLastModified() {
		return lastModified;
	}
	/**
	 * @return the passed
	 */
	public boolean isPassed() {
		return passed;
	}
	/**
	 * @param passed the passed to set
	 */
	public void setPassed(boolean passed) {
		this.passed = passed;
	}

}