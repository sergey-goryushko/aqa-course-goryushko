package com.course.syntax;

/* Requirements ->
 Manager object can be created, like user object, but additionally must have position value in process of creation.
 All additional fields must have getters and setters.
 Also, manager has the same method printUserInfo, like a user, but this method additionally print all additional fields of manager.*/
public class Manager extends User {

    public Manager(String fullName, String email, Roles.UserRoles userRoles, String position) {
        super(fullName, email, userRoles);
        this.position = position;
    }

    private String position;
    private String responsibilityDistrict;
    private String workPhoneNumber;

    public void printInfo() {
        System.out.println(super.toString() + this.toString());
    }

    @Override
    public String toString() {
        return super.toString() + "Manager{" + "position='" + position + '\'' + ", responsibilityDistrict='" + responsibilityDistrict + '\'' + ", workPhoneNumber='" + workPhoneNumber + '\'' + "} ";
    }


    public String getPosition() {
        return position;
    }

    public String getResponsibilityDistrict() {
        return responsibilityDistrict;
    }

    public String getWorkPhoneNumber() {
        return workPhoneNumber;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setResponsibilityDistrict(String responsibilityDistrict) {
        this.responsibilityDistrict = responsibilityDistrict;
    }

    public void setWorkPhoneNumber(String workPhoneNumber) {
        this.workPhoneNumber = workPhoneNumber;
    }
}
