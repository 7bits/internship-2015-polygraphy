var scrollUpWindowComponent = flight.component(
    function(){
        var buttonUp = $('.b-search__button-up');

        this.scrollUpButton = function(){
            if ($(document).width() > 1024 && $(document).scrollTop() > 0) {
                $(buttonUp).fadeIn('fast');
            }
            else {
                $(buttonUp).fadeOut('fast');
            }
        };

        this.scrollUpButtonMakeNontransparent = function(){
            $(buttonUp).mouseover(function(){
                $(this).animate({opacity: 1}, 100);
            });
        };

        this.scrollUpButtonMakeTransparent = function(){
            $(buttonUp).mouseout(function(){
                $(this).animate({opacity: 0.5}, 100);
            });
        };

        this.scrollUp = function(){
            $('body,html').animate({scrollTop: 0}, 400);
            return false;
        };

        this.after('initialize', function(){
            var that = this;
            $(window).on('scroll', that.scrollUpButton);
            $(buttonUp).on('click', that.scrollUp);
            that.scrollUpButtonMakeNontransparent();
            that.scrollUpButtonMakeTransparent();
        });
    }
);