package swiggyfood.model;

import java.util.Date;

public class PaymentResponse {
    private String correlationId;
    private String status;
    private Date responseDate;

    public PaymentResponse(String correlationId, String status, Date responseDate) {
        this.correlationId = correlationId;
        this.status = status;
        this.responseDate = responseDate;
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public String getStatus() {
        return status;
    }

    public Date getResponseDate() {
        return responseDate;
    }
}
