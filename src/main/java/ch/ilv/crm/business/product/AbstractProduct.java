package ch.ilv.crm.business.product;

import java.util.UUID;

public class AbstractProduct implements IProduct {
	private UUID id;
	private String description = "";
	
	public AbstractProduct(UUID id, String desciption) {
		this.id = id;
		this.description = desciption;
	}
	
	public void setDescription(String desc) {
		this.description = desc;
	}
	public String getDescription() {
		return this.description;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public UUID getId() {
		return this.id;
	}
}
