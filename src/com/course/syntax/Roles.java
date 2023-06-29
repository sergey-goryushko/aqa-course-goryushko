package com.course.syntax;

public class Roles {
    private boolean viewAll;
    private boolean editAll;
    private boolean addAll;
    private boolean deleteAll;

    private String adminRole = "Admin";
    private String mainCustomer = "Main customer";
    private String customer = "Customer";
    private String viewer = "Viewer";
    String roleType;

    public Roles(boolean viewAll, boolean editAll, boolean addAll, boolean deleteAll) {
        this.viewAll = viewAll;
        this.editAll = editAll;
        this.addAll = addAll;
        this.deleteAll = deleteAll;
        if (viewAll && editAll && addAll && deleteAll) {
            this.roleType = adminRole;
        } else if (viewAll && editAll && addAll) {
            this.roleType = mainCustomer;
        } else if (viewAll && addAll) {
            this.roleType = customer;
        } else if (viewAll) {
            this.roleType = viewer;
        }
    }

    @Override
    public String toString() {
        return "Roles{" +
                "viewAll=" + viewAll +
                ", editAll=" + editAll +
                ", addAll=" + addAll +
                ", deleteAll=" + deleteAll +
                '}';
    }
}








