package exerciseCurrentAccount;

import java.time.LocalDate;

public class CurrentAccount {
    Integer number;
    Integer agency;
    String numberClient;
    LocalDate dateOfBirth;
    Double balance;
    boolean active = true;



    Double checkBalance(){

        return balance;

    }

    List viewBalance (LocalDate dataInitial,
                      LocalDate dataFinish){
        //return ???

        return null;
    }


void canceled (String justification ){
    //algoritimo irá manupular o atributo
    //ativo para que se torne false

}
void transfer (CurrentAccount  destinationAccount,
               Double TransferValue){

}

    void withdrawCash (Double valueSolicitation){
        //not solicitation logic
    }


}
