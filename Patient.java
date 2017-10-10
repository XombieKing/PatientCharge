/* Name:        Edwin Maldonado
 * Date:        10/05/2017
 * Chapter:     3
 * Challenge:   11
 * Page:        191 
 * Purpose:     To run the patient and procedure program
 */
package patient;

/**44
 * The Patient class represents a patient
 */
public class Patient {

    private String firstName;
    private String middleName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
    private String emergencyContactName;
    private String emergencyContactPhone;
    
    /**
     * Set the constructor
     * @param args 
     */
    Patient(String firstName, String middleName, String lastName,
            String streetAddress, String city, String state, String zipCode,
            String phoneNumber, String nameOfEmergencyContact,
            String phoneNumberOfEmergencyContact) {
}
    
    /**
     * The setFirstName() method accepts an argument for the patient's first
     * name
     * @param fName 
     */
    public void setFirstName(String fName) {
        firstName = fName;
}
    /**
     * The setMiddleName() method accepts an argument for the patient's
     * middle name
     *  @param mName
     */
    public void setMiddleName(String mName) {
        middleName = mName;
}

    /**
     * The setLastName() method accepts an argument for the patient's last name
     * @param lName
     */
    public void setLastName(String lName) {
        lastName = lName;
}
    
    /**
     * The setStreetAddress() method accepts an argument for the patient's 
     * street address
     * @param aStreetAddress
     */
    public void setAddress(String aStreetAddress) {
        streetAddress = aStreetAddress;
}
    
    /**
     * The setCity() method accepts an argument for the patient's city
     * @param aCity
     */
    public void setCity(String aCity) {
        city = aCity;
}
    
    /**
     * The setState() method accepts an argument for the patient's state
     * @param aState
     */
    public void setState(String aState) {
        state = aState;
}
    
    /**
     * The setZipCode() method accepts an argument for the patient's zip code
     * @param aZipCode 
     */
    public void setZipCode(String aZipCode) {
        zipCode = aZipCode;
}

    /**
     * The setPhoneNumber() method accepts an argument for the patient's phone
     * number
     * @param aPhoneNumber 
     */
    public void setPhoneNumber(String aPhoneNumber) {
        phoneNumber = aPhoneNumber;
}
    
    /**
     * The setEmergencyContactName() method accepts an argument for the
     * patient's emergency contact
     * @param aEmergencyContactName 
     */
    public void setEmergencyContactName(String aEmergencyContactName) {
        emergencyContactName = aEmergencyContactName;
}

    /**
     * The setEmergencyContactPhone() method accepts an argument for the
     * patient's emergency contact phone
     * @param aEmergencyContactPhone 
     */
    public void setEmergencyContactPhone(String aEmergencyContactPhone) {
        emergencyContactPhone = aEmergencyContactPhone;
}

    /**
     * The getFirstName() method returns the patient's first name
     * @return firstName
     */
    public String getFirstName() {
            return firstName;
}
    
    /**
     * The getMiddleName() method returns the patient's middle name
     * @return middleName
     */
    public String getMiddleName() {
        return middleName;
}
    
    /**
     * The getLastName() method returns the patient's last name
     * @return lastName
     */
    public String getLastName() {
        return lastName;
}

    /**
     * The getStreetAddress() method returns the patient's street address
     * @return streetAddress
     */
    public String getStreetAddress() {
        return streetAddress;
}
    
    /**
     * The getCity() method returns the patient's city
     * @return city
     */
    public String getCity() {
        return city;
}
    
    /**
     * The getState() method returns the patient's state
     * @return state
     */
    public String getState() {
        return state;
}
    
    /**
     * The getZipCode() method returns the patient's zip code
     * @return zip code
     */
    public String getZipCode() {
        return zipCode;
}
    
    /**
     * The getPhoneNumber() method returns the patient's phone number
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
}
    
    /**
     * The getEmergencyContactName() method returns the patient's emergency
     * contact name
     * @return emergencyContactName
     */
    public String getEmergencyContactName() {
        return emergencyContactName;
}
    
    /**
     * The getEmergencyContactPhone() method returns the patient's emergency
     * contact phone number
     * @return emergencyContactPhone
     */
    public String getEmergencyContactPhone() {
        return emergencyContactPhone;
}
        
    }
