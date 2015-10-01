var errorPage = flight.component(
    function() {
        this.setHeight = function(){
            $('.error-page').css({
                height: $(window).height() + 'px'
            });
        };

        this.after('initialize', function(){
            $(document).ready(this.setHeight);
            $(window).resize(this.setHeight);
        });
    }
);