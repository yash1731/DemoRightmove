package com.RightMove.Utilities;

public class RM_Exceptional_Handling extends Throwable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RM_Exceptional_Handling(final String errorMessage) {
        super(errorMessage);
    }

    public RM_Exceptional_Handling(final String errorMessage, final Throwable error) {
        super(errorMessage, error);
    }

    public RM_Exceptional_Handling(final String errorMessage, final InterruptedException error) {
        super(errorMessage, error);
    }

}
