package ca.uqam.inf1120.examplesetlabos;




public class MonExcep extends Exception{

    /**
	 * 
	 */
	private static final long serialVersionUID = -9214703793461722094L;

	public MonExcep (String msg) {
        //super d�signe la classe "parent" de MonExcep (Exception, dans ce cas-ci)
        super(msg);
    }
    
} // MonExcep
