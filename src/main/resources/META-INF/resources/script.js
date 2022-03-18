const clientPath = "http://localhost:8080/";

var entry = new Vue({
    el: '#entry',
    data () {
        return{
            entry_input: ""
        }
    },
    methods: {
        sendEntryData: function () {
            axios.post('http://localhost:8080/entries', {
                entry: this.entry_input
          })
          .then(function (response) {
            console.log(response);

          })
          .catch(function (error) {
            console.log(error);
          });
        }
    },
  })