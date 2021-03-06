package logic;

import controller.UserController;

public class Logic_New_updateProfile {

    public void filterEmptyFields(String newFirstName, String newMiddleName, String newLastName, String newContact, String newAddress, String newEmail){

        UserController userController = new UserController();

        String[] allFields = {newFirstName, newMiddleName, newLastName, newContact, newAddress, newEmail};
        String[] fieldsName = {"newFirstName", "newMiddleName", "newLastName", "newContact", "newAddress", "newEmail"};


        // to insert in database which distinguishes which fields are empty or which are need to be updated
        String emptyFields = "";
        String filledFields = "";
        for (int i = 0; i < allFields.length; i++){

            if (allFields[i].isEmpty()){
                emptyFields += i;
                //System.out.println(fieldsName[i] + " : ");
                continue;
            }
            // filter which field is updated , then, retrieves its old data
            userController.updateData(allFields[i], i);
            filledFields += i;
            //System.out.println(fieldsName[i] + " : " + allFields[i]);
        }

//        System.out.println("empty fields index : " + emptyFields);
//        System.out.println("Filled fields index : " + filledFields);

    }
}
