package com.course.syntax;

public class Roles {
    private String admin = "admin";
    private String mainCustomer = "main customer";
    private String customer = "customer";
    private String viewer = "viewer";
    private boolean viewAll;
    private boolean editAll;
    private boolean addAll;
    private boolean deleteAll;

    public boolean isViewAll() {
        return viewAll;
    }

    public boolean isEditAll() {
        return editAll;
    }

    public boolean isAddAll() {
        return addAll;
    }

    public boolean isDeleteAll() {
        return deleteAll;
    }


    public Roles(String roleType) {
        if (roleType.equals(admin)) {
            this.viewAll = true;
            this.editAll = true;
            this.addAll = true;
            this.deleteAll = true;
        } else if (roleType.equals(mainCustomer)) {
            this.viewAll = true;
            this.editAll = true;
            this.addAll = true;
            this.deleteAll = false;
        } else if (roleType.equals(customer)) {
            this.viewAll = true;
            this.editAll = false;
            this.addAll = true;
            this.deleteAll = false;
        } else if (roleType.equals(viewer)) {
            this.viewAll = true;
            this.editAll = false;
            this.addAll = false;
            this.deleteAll = false;
        }
    }

    @Override
    public String toString() {
        return "Roles{" + "viewAll=" + viewAll + ", editAll=" + editAll + ", addAll=" + addAll + ", deleteAll=" + deleteAll + '}';
    }
}








