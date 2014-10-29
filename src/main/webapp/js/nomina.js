$(document).ready(function(){
   $("#actualizar-trabajador").click(function(){
      
       $.ajax({
           url:'actualizar-trabajador',
           method:'put',
           data:{
               id:'1',
               nombre:'Raton',
               paterno:'Vaquero',
               materno:'malo'
           }, 
           sucess:function(respuesta){
               $ ("#reultado-actulizacion").html(respuesta);
           }
       });
       
   });
    
});