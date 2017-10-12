package com_gmail_kr_malyar;

class GroupIsOvercrowdedExeption extends Exception {

    @Override
    public String getMessage() {
        return "The group is overcrowded";
    }
}
