/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Emerson
 */
@WebService(serviceName = "WSOperaciones")
public class WSOperaciones {

   
    /**
     * Web service operation
     */
    @WebMethod(operationName = "Login")
    public Boolean Login(@WebParam(name = "User") String User, @WebParam(name = "Password") String Password) {
        if(User.equals("mello")&& Password.equals("mellito")){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ProcesarPago")
    public int ProcesarPago(@WebParam(name = "total") int total, @WebParam(name = "pago") int pago) {
        if(pago>=total){
            return pago-total;
        }else{
            return -1;
        }
    }

   
}
