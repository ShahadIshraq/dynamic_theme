// id or class names of the html elements that have dynamic coloring
var fields = ["#header_container",
    ".column-header-container",
    "#board_container",
    "#page_base_container",
    "#footer_container"] ;

// Maximum allowable age of the cookie to be stored
var maxAgeOfCookie = 2*60;

//Variable used for temporarily storing the selected color
var tempColor = "none";

//This holds the functions which handle loading and changing colors
var handleColors = {

    //This function is called when the color settings is coming from the server
    //The parameter holds the color settings sent by the server
    incoming : function(colors) {
        colors = colors.split("#");
        colors = colors.slice(1, colors.length);
        var i, value;
        for (i = 0; i < colors.length; i++) {
            value = "background-color: #" + colors[i];
            $(fields[i]).attr('style',value);
        }
    },

    //This function is called when the color settings is coming NOT from the server
    // The color settings is thus read from the cookie and then parsed and used accordingly
    cookie : function () {
        var colors = cookieHandler.getCookie("colors");
        if(colors!=''){
            colors = colors.split("#");
            colors = colors.slice(1, colors.length);
            var i, value;
            for (i = 0; i < colors.length; i++) {
                value = "background-color: #" + colors[i];
                $(fields[i]).attr('style',value);
            }
        }
    }
};

var select = {

    // This function is called when the user select a theme template from the options.
    // This changes the element color but do not effect the cookie or the server database
    selectImage: function(colors){
      tempColor = colors;
      colors = colors.split("#");
      colors = colors.slice(1, colors.length);
      var i, value;
      for (i = 0; i < colors.length; i++) {
          value = "background-color: #" + colors[i];
          $(fields[i]).attr('style',value);
      }
  },

    // This function saves the selected scheme in the cookie and sends Ajax request to the server
    // to make the change persist in the database.
    saveTheme: function () {
        var expires = new Date();
        expires.setSeconds(expires.getSeconds() + maxAgeOfCookie);
        var expire = "; expires=" + expires.toUTCString();
        document.cookie = "colors="+tempColor+expires;
        console.log("Got here.");

        var current = window.location.href;
        current = current.split("/");
        $.post("http://"+current[2]+"/changeTheme",
        {
            colors : tempColor
        },
        function(data, status){
        //alert("Data : "+data+" Statut : "+status);
        }
        );

        //click the cancel button
        $("#theme-modal-cancel-button").trigger('click');
    }
};

var auth = {
    // Wipes out the cookie and sends a logout request to the server
    logout: function () {
        console.log("here");
        var expires = new Date();
        expires.setSeconds(expires.getSeconds() - maxAgeOfCookie);
        var expire = "; expires=" + expires.toUTCString();
        document.cookie = "colors="+""+expires;
        //getting the url
        var current = window.location.href;
        current = current.split("/");
        //posting logout request
        $.post(current[2]+"/logout",
            {
                logout: "ok",
            },
            function(data, status){

            });
        //redirecting
        window.location.replace("http://"+current[2]+"/login");
    }
};

var cookieHandler = {
    // Helper function to parse the cookie variable to find a specific field
    getCookie : function (a) {
        var b = document.cookie.match('(^|;)\\s*' + a + '\\s*=\\s*([^;]+)');
        if(b) b = b ? b.pop() : '';
        return b;
    }
};


