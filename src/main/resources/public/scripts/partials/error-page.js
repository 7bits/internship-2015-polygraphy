'use strict';

$(document).ready(function(){

    function setHeight() {
        $('.error-page').css({
            height: $(window).height() + 'px'
        });
    }

    setHeight();
    $(window).resize( setHeight );

});