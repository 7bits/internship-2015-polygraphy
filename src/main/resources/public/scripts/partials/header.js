(function() {
    'use strict';

    $(document).ready(function(){
        $('ul.header__dropdown-menu').hide();
        $('.header__menu-item.header_dropdown').click(function(){
            $('ul.header__dropdown-menu').toggle('fast');
        });
    });
})();