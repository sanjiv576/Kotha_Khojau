package logic;

public class Logic_New_passwordchange {

    public void filterEmptyFields(String currentPassword, String newPassword, String conformPassword){




        String[] allFields = {currentPassword, newPassword, conformPassword};
        String[] fieldsName = {"currentpassword", "newpassword", "conformpassword"};
//        for (String element: allFields){
//            if (element.isEmpty()){
//                continue;
//            }
//            System.out.println(element);
//        }


        // to insert in database which distinguishes which fields are empty or which are need to be updated
        String emptyFields = "";
        String filledFields = "";
        for (int i = 0; i < allFields.length; i++){
            if (allFields[i].isEmpty()){
                emptyFields += i;
                System.out.println(fieldsName[i] + " : ");
                continue;
            }
            filledFields += i;
            System.out.println(fieldsName[i] + " : " + allFields[i]);
        }

        System.out.println("empty fields index : " + emptyFields);
        System.out.println("Filled fields index : " + filledFields);



    }
}
