$(document).ready(function() {
    var url = window.location.href+"/givedata";
    $.get(url, function(data, status) {
        $("#dump").append(JSON.stringify(data));
        alert("Data: " + JSON.stringify(data) + "\nStatus: " + status);
    });
});