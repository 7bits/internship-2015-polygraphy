var popupWindowComponent = flight.component(
    function(){
        this.defaultAttrs({
            list: '.b-search__polygraphies-list',
            listItem: '.b-results-item__detail a',
            overlay: '.b-search__overlay',
            close: '.b-popup-window__close'
        });

        this.showPopupWindow = function(event){
            event.preventDefault();
            console.log(event);

            $('.b-search__overlay').css('overflow', 'auto');
            $('.b-search__overlay').fadeIn('fast');

            var render = Handlebars.compile($('#pop-up-window-detail').html());
            console.log(this);
            var id = $(event.target).attr('id');
            var url = '/polygraphy/'+id;
            console.log(url);
            $.ajax({
                type: 'GET',
                dataType: 'json',
                url: url,
                success: function(data) {
                    $('.b-popup-window').html(render(data.data.polygraphy));
                },
                error:  function(xhr, str){
                    alert('Ошибка: ' + xhr.responseCode);
                }
            });
        };

        this.closePopupWindowOnPressEsc = function(event){
            event.preventDefault();
            if( event.keyCode === 27 ) {
                $('.b-search__overlay').fadeOut('fast');
                return false;
            }
        };

        this.closePopupWindowOnClickPast = function(event){
            if (event.target === this.$node.find('.b-search__overlay')[0]) {
                $('.b-search__overlay').fadeOut('fast');
                $('body').css('overflow', 'auto');
            }
        };

        this.closePopupWindowOnClickX = function(){
            $('.b-search__overlay').fadeOut('fast');
            $('body').css('overflow', 'auto');
        };

        this.after('initialize', function(){
            var that = this;
            that.select('list').on('click', that.select('listItem'), function(event){
                that.showPopupWindow(event);
            });
            that.select('list').on('click', that.select('listItem'), function(event){
                that.showPopupWindow(event);
            });
            $(window).on('keydown', function(event){
                that.closePopupWindowOnPressEsc(event);
            });
            $('body').on('click', '.b-search__overlay', function(event){
                that.closePopupWindowOnClickPast(event);
            });
            $('body').on('click', '.b-popup-window__close', function(){
                that.closePopupWindowOnClickX();
            });
        });

    }

);