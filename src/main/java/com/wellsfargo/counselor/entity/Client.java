package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue()
    private long clientId;

    @ManyToOne
    private Advisor advisor;

    @Column(nullable = false)
    private String clientName;

    @Column(nullable = false)
    private String clientAddress;

  

    /**
	 * @return the clientId
	 */
	public long getClientId() {
		return clientId;
	}

	/**
	 * @param clientId the clientId to set
	 */
	public void setClientId(long clientId) {
		this.clientId = clientId;
	}

	/**
	 * @return the advisor
	 */
	public Advisor getAdvisor() {
		return advisor;
	}

	/**
	 * @param advisor the advisor to set
	 */
	public void setAdvisor(Advisor advisor) {
		this.advisor = advisor;
	}

	/**
	 * @return the clientName
	 */
	public String getClientName() {
		return clientName;
	}

	/**
	 * @param clientName the clientName to set
	 */
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	/**
	 * @return the clientAddress
	 */
	public String getClientAddress() {
		return clientAddress;
	}

	/**
	 * @param clientAddress the clientAddress to set
	 */
	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}

	protected Client() {
    }

    public Client(Advisor advisor, String clientName, String clientAddress) {
        this.advisor = advisor;
        this.clientName = clientName;
        this.clientAddress = clientAddress;
    }

    
}
