package com.course.syntax;

public class Roles {
    public enum UserRoles {
        ADMIN,
        CUSTOMER,
        MAIN_CUSTOMER,
        VIEWER;

    }
    private UserRoles role;
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


    public Roles(UserRoles userRoles) {
        if (userRoles.equals(UserRoles.ADMIN)) {
            this.viewAll = true;
            this.editAll = true;
            this.addAll = true;
            this.deleteAll = true;
        } else if (userRoles.equals(UserRoles.MAIN_CUSTOMER)) {
            this.viewAll = true;
            this.editAll = true;
            this.addAll = true;
            this.deleteAll = false;
        } else if (userRoles.equals(UserRoles.CUSTOMER)) {
            this.viewAll = true;
            this.editAll = false;
            this.addAll = true;
            this.deleteAll = false;
        } else if (userRoles.equals(UserRoles.VIEWER)) {
            this.viewAll = true;
            this.editAll = false;
            this.addAll = false;
            this.deleteAll = false;
        }
        role = userRoles;
    }

    @Override
    public String toString() {
        return "Roles{" + "viewAll=" + viewAll + ", editAll=" + editAll + ", addAll=" + addAll + ", deleteAll=" + deleteAll + '}';
    }
}








