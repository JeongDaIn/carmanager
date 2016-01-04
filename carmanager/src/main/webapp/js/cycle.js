
$(document).ready(function() {
  $("body").backgroundCycle({
    imageUrls: [
                '../img/image003.jpg',
                //   '../img/image013.jpeg',
                //   '../img/image014.jpeg',
                // '../img/image015.jpeg',
                '../img/image002.jpg',
                '../img/image020.jpeg'
                ],
                fadeSpeed: 2000, //2000
                duration: 5000,  //5000
                backgroundSize: SCALING_MODE_COVER
  });
});
