var dropdownMenu = flight.component(
    function() {
        this.defaultAttrs({
            button: '.header__menu-item.header_dropdown',
            list: 'ul.header__dropdown-menu'
        });
        this.hideDropdownMenu = function(){
            this.select('list').hide();
        };
        this.toggleDropdownMenu = function(){
            this.select('list').toggle('fast');
        };

        this.after('initialize', function(){
            var that = this;
            this.hideDropdownMenu();
            this.select('button').on('click', function(){
                console.log(this);
                that.toggleDropdownMenu();
            });
        });
    }
);