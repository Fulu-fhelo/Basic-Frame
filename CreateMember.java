
package MembershipFormPackage;

/**
 *
 * @author FULUFHELO
 */

public class CreateMember {
    
    private String name;
    private String surname;
    private String id_number;
    private String gender;
    private String contract_type;
    private boolean trainer;

    public CreateMember() {
    }

    public CreateMember(String name, String surname, String id_number, String gender, String contract_type, boolean trainer) {
        this.name = name;
        this.surname = surname;
        this.id_number = id_number;
        this.gender = gender;
        this.contract_type = contract_type;
        this.trainer = trainer;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getId_number() {
        return id_number;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContract_type() {
        return contract_type;
    }

    public void setContract_type(String contract_type) {
        this.contract_type = contract_type;
    }

    public boolean isTrainer() {
        return trainer;
    }

    public void setTrainer(boolean trainer) {
        this.trainer = trainer;
    }
    
    
}
