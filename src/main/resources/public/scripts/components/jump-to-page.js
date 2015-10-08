var jumpToPageOnIdComponent = flight.component(
    function(){

        this.defaultAttrs({
            list: '.b-search__polygraphies-list',
            name: '.b-results-item__adaptive-name',
            button: '.b-results-item__adaptive-detail-info'
        });

        this.jumpToPage = function(){
            if ($(window).width() <= '700') {
                this.select('list').on('click', this.select('button') || this.select('name'), function (event) {
                    var id = event.target.getAttribute('id');
                    window.location.href = '/polygraphy/' + id;
                });
            }
        };

        this.after('initialize', function(){
            var that = this;
            that.jumpToPage();
        });

    }
);