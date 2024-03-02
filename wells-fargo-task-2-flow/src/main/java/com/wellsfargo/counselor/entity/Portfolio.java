package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @ManyToOne
    private Client client;

    // Other fields...

    protected Portfolio() {
    }

    public Portfolio(Client client) {
        this.client = client;
        // Initialize other fields if needed
    }

	/**
	 * @return the portfolioId
	 */
	public long getPortfolioId() {
		return portfolioId;
	}

	/**
	 * @param portfolioId the portfolioId to set
	 */
	public void setPortfolioId(long portfolioId) {
		this.portfolioId = portfolioId;
	}

	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}

   
}
