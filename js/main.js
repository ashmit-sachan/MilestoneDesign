$("#nav_control").click(function(){
    if($("#nav_control").is(':checked')){
        $(".sidebar").removeClass('hidden');
        $("#nav_control_icon").removeClass('fa-bars');
        $("#nav_control_icon").addClass('fa-times');
        $(".sidebar").animate({
            opacity: 1,
            flexBasis: "+=20rem"
          }, 500);
        $(".container").animate({
        paddingLeft: "+=1rem"
        }, 500);
    }else{
        $(".sidebar").addClass('hidden');
        $("#nav_control_icon").removeClass('fa-times');
        $("#nav_control_icon").addClass('fa-bars');
        $(".sidebar").animate({
            opacity: 0,
            flexBasis: "-=20rem"
          }, 500);
        $(".container").animate({
        paddingLeft: "-=1rem"
        }, 500);
    }
});