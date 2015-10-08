var searchComponent = flight.component(
    function(){

        this.defaultAttrs({
            searchForm: '#search-form',
            submitButton: '.b-search-line__submit',
            searchLine: '.b-search-line__input',
            resultsList: '.b-search__polygraphies-list'
        });

        this.search = function(){

            var form = $('#search-form');

            var headers = {'X-CSRF-TOKEN': null};
            $(form).trigger('csrfFunction', [headers]);

            var template = Handlebars.compile($('#results').html());
            var msg = $(form).serialize();
            window.history.pushState('','', 'search?' + msg);
            $('.b-search__loader').css('visibility', 'visible');

            $.ajax({
                type: 'POST',
                url: '/search',
                data: msg,
                headers: headers,
                success: function(data) {
                    console.log(data);
                    var html = template({
                        polygraphies: data.data.polygraphies
                    });
                    $('.b-search__polygraphies-list').html(html);
                    $('.b-search__loader').css('visibility', 'hidden');
                },
                error:  function(xhr, str){
                    console.log(arguments);
                    alert('Возникла ошибка: ' + xhr.responseCode);
                    $('.b-search__loader').css('visibility', 'visible');
                }
            });
        };

        this.searchOnPressEnter = function(e){
            if (e.keyCode === 13) {
                e.preventDefault();
                $('#search-form').trigger('doSearch', this.search);
            }
        };

        this.firstSearchRequest = function(){
            if ($(this.attr.searchForm).find(this.attr.resultsList).length){
                $(this.attr.searchForm).trigger('doSearch', this.search);
            }
        };

        this.delay = (function(){
            var timer = 0;
            return function(callback, ms){
                clearTimeout (timer);
                timer = setTimeout(callback, ms);
            };
        })();

        this.after('initialize',function(){
            var that = this;

            that.on('doSearch', that.search);
            that.firstSearchRequest();
            that.select('submitButton').on('click', that.search);
            that.$node.on('change', that.search);

            that.$node.bind('keypress', function(e){
                that.searchOnPressEnter(e);
            });

            that.select('searchLine').on('keyup', function(){
                that.delay(that.search, 1500);
            });

        })

    }
);