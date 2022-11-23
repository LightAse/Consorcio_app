public class UnidadFuncional {
    

    /*
     * Variables Private
     */
    private String owner_name;
    private String owner_lastname;



    /*
     ! Constructo vacio
     */
    public UnidadFuncional(){}

    /*
     ! Constructo medio lleno
     * name pide el nombre del dueno
     * apellido pide el apellido del dueno
     */
    /* 
    public UnidadFuncional(String name,String lastName){

        setName(name);
        setLastName(lastName);


    }
    */

    /*
     !  Constructo completo   
     *  name pide el nombre del dueno
     * apellido pide el apellido del dueno
     * limp pide el costo de la limpieza
     * mant pide el costo de mantenimiento
     * encar pide el costo del encargado
     */

    public UnidadFuncional(String name, String lastName){

        setName(name);
        setLastName(lastName);

    }


    /*
     ! Setters
     */

    /*
     * Owner Name Set
     */
    public void setName(String a1){

        owner_name = a1;

    }

    /* 
     * Owner Last Name Set
     */
    public void setLastName(String a1){

        owner_lastname = a1;

    }



    /*
     ! Getters
     */

    /*
     * get de Name
     */
    public String getName(){

        return owner_name;

    }
    public String getLastName(){

        return owner_lastname;

    }




}
