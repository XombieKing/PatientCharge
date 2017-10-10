/* Name:        Edwin Maldonado
 * Date:        10/05/2017
 * Chapter:     3
 * Challenge:   11
 * Page:        191 
 * Purpose:     To run the patient and procedure program
 */
package patient;

/**
 *
 * @author XombieKing
 */
public class Procedure {
    
    private String procedureName;
    private String date;
    private String practitioner;
    private double charge;
    
    /**
     * Set the constructor
     * @param args
     */
    Procedure(String procedureName, String date, String practitioner,
            String charge) {
        
}
    
    /**
     * The setProcedureName() method accepts an argument for a procedure's name
     * @param pName
     */
    public void setProcedureName(String pName){
        procedureName = pName;
}
    
    /**
     * The setDate() method accepts an argument for a procedure's date
     * @param aDate
     */
    public void setDate(String aDate){
        date = aDate;
}    
    /**
     * The setPractitioner() method accepts an argument for a practitioner
     * performing the procedure
     * @param practitionerName
     */
    public void setPracitionerName(String practitionerName){
        practitioner = practitionerName;
}    
    
    /**
     * The setCharge() method accepts an argument for a charge of a procedure 
     * @param aCharge
     */
    public void setCharge(double aCharge){
        charge = aCharge;
}    
    
    /**
     * The getProcedureName() method returns the procedure's name
     * @return procedureName
     */
    public String getProcedureName() {
        return procedureName;
}    
    
    /**
     * The getDate() method returns the date of the procedure done
     * @return date
     */
    public String getDate() {
        return date;
}    
    
    /**
     * The getPractitioner() method returns the practitioner
     * who preformed the procedure
     * @return practitioner
     */
    public String getPractitioner() {
        return practitioner;
}    
    
    /**
     * The getCharge() method returns the charge of the procedure
     * @return charge
     */
    public double getCharge() {
        return charge;
}
        
    }
