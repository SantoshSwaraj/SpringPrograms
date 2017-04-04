package main.model;

import java.util.List;

public class Certificate {
	private List certificates;

	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Certificate(List certificates) {
		super();
		this.certificates = certificates;
	}

	/**
	 * @return the certificates
	 */
	public List getCertificates() {
		return certificates;
	}

	/**
	 * @param certificates the certificates to set
	 */
	public void setCertificates(List certificates) {
		this.certificates = certificates;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Certificate [certificates=" + certificates + "]";
	}
	
}
