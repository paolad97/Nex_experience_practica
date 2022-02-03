
 @Hu
   Feature: Validar el correcto ingreso a la tienda new experience
      Yo como usuario quiero ingresar a la tienda new experience para realizar una compra
      Background:
         Given Paola quiere ingresar a new experience
     Scenario: Verificar la vista interna de la tienda
         When ingresa las credenciales en los campos requeridos
         Then verifica que ingreso de manera correcta