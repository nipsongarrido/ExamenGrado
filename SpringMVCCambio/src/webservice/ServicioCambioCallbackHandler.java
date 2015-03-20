
/**
 * ServicioCambioCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package webservice;

    /**
     *  ServicioCambioCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ServicioCambioCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ServicioCambioCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ServicioCambioCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for logout method
            * override this method for handling normal response from logout operation
            */
           public void receiveResultlogout(
                    webservice.ServicioCambioStub.LogoutResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from logout operation
           */
            public void receiveErrorlogout(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for guardarConsulta method
            * override this method for handling normal response from guardarConsulta operation
            */
           public void receiveResultguardarConsulta(
                    webservice.ServicioCambioStub.GuardarConsultaResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from guardarConsulta operation
           */
            public void receiveErrorguardarConsulta(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for agregarUsuario method
            * override this method for handling normal response from agregarUsuario operation
            */
           public void receiveResultagregarUsuario(
                    webservice.ServicioCambioStub.AgregarUsuarioResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from agregarUsuario operation
           */
            public void receiveErroragregarUsuario(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerConsultas method
            * override this method for handling normal response from obtenerConsultas operation
            */
           public void receiveResultobtenerConsultas(
                    webservice.ServicioCambioStub.ObtenerConsultasResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerConsultas operation
           */
            public void receiveErrorobtenerConsultas(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for enSesion method
            * override this method for handling normal response from enSesion operation
            */
           public void receiveResultenSesion(
                    webservice.ServicioCambioStub.EnSesionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from enSesion operation
           */
            public void receiveErrorenSesion(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for login method
            * override this method for handling normal response from login operation
            */
           public void receiveResultlogin(
                    webservice.ServicioCambioStub.LoginResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from login operation
           */
            public void receiveErrorlogin(java.lang.Exception e) {
            }
                


    }
    