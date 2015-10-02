var csrfComponent = flight.component(
    function(){

        this.csrfFunction = function(event, headers){
            var token = this.$node.find('[name=_csrf]').val();
            console.log(token);
            headers['X-CSRF-TOKEN'] = token;
            console.log(headers);
        };

        this.after('initialize', function(){
            this.on('csrfFunction', this.csrfFunction);
        });
    }
);