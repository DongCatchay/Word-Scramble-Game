if (window.console) {
  console.log("Welcome to 'Word Scramble Game'!");
}

// keypress event
$(document).keypress(function(e) {
    // if user press key 'Enter'
    if(e.which == 13) {
        // user post action to post the word that user typed to server
        $.post( "check",
            {word:  $('#input').text() },
            function( data , status) {
                // if server return true, the word that user typed is in database
                if(data === "true"){
                    $('.result').css('display', 'block');
                    $('#result').text("CORRECT!");
                // if server return false, the word that user typed is not in database
                }else{
                    $('.result').css('display', 'block');
                    $('#result').text("INCORRECT!");
                }
        });
    // user press any key that is not 'Enter' key
    }else{
        // get character of key press
        var c = String.fromCharCode(e.which).toUpperCase();
        // get all character from screen
        var message = $('#characters').text().toUpperCase();

        // check if the character of key press is in characters
        if (message.indexOf(c) != -1) {
            $('#input').append(c); // append the character key press to div
            $('#characters').text(message.replace(c, '') ); // remove the character key press from screen
        }

        // set block result hidden
        $('.result').css('display', 'none');
    }
});