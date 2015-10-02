$(function(){
    displayErrors.attachTo('#general-form');
    validateFormForBid.attachTo('#general-form');
    errorPage.attachTo(window);
    $(document).ready(function() {
        dropdownMenu.attachTo('.header__menu');
        csrfComponent.attachTo('#general-form');
    });
    csrfComponent.attachTo('#search-form');
    searchComponent.attachTo('#search-form');
});