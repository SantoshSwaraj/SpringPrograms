package main.model;

public class ClientClass {
	private TargetClass targetClass;

	public ClientClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClientClass(TargetClass targetClass) {
		super();
		this.targetClass = targetClass;
	}

	/**
	 * @return the targetClass
	 */
	public TargetClass getTargetClass() {
		return targetClass;
	}

	/**
	 * @param targetClass the targetClass to set
	 */
	public void setTargetClass(TargetClass targetClass) {
		this.targetClass = targetClass;
	}
	
}
