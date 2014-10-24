$(document).ready(function(){
 $("#ver-nomina").click(function (){ 
    $.ajax({
        url:'nomina',
        method:'get',
        data:{
            nombre:$("#texto-nombre").val(),
            edad:$("#texto-edad").val()
        },
        success: function(no_me_olvides){
            $("#Resultado").html(no_me_olvides);
        },
        failure:function(error){
            
        }
    });
    });
});