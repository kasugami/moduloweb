/**
 * Copy right.
 */
package com.jcsc.authenticationapp.beans;

/**
 * Represents a Response for request related with Authentication.
 * @author Kasugami
 *
 */
public class ResponseAuth {

    /**
     * Code of response.
     */
    private int code;
    /**
     * Description of response.
     */
    private String description;

    /**
     * Reason in case occurs a error.
     */
    private String reason;

    /**
     * Gets value of code attribute.
     * @return the code
     */
    public final int getCode() {
        return code;
    }

    /**
     * Constructor.
     */
    public ResponseAuth() {
        super();
    }

    /**
     * Constructor.
     * @param code Code to set.
     * @param description Description to set.
     */
    public ResponseAuth(final int code, final String description) {
        super();
        this.code = code;
        this.description = description;
    }


    /**
     * Sets code as value for code.
     * @param code the code to set
     */
    public final void setCode(final int code) {
        this.code = code;
    }

    /**
     * Gets value of description attribute.
     * @return the description
     */
    public final String getDescription() {
        return description;
    }

    /**
     * Sets description as value for description.
     * @param description the description to set
     */
    public final void setDescription(final String description) {
        this.description = description;
    }

    /**
     * Gets value of reason attribute.
     * @return the reason
     */
    public final String getReason() {
        return reason;
    }

    /**
     * Sets reason as value for reason.
     * @param reason the reason to set
     */
    public final void setReason(final String reason) {
        this.reason = reason;
    }
}
