
$(document).ready(function() {
  $("body").backgroundCycle({
    imageUrls: [
                '../img/image003.jpg',
                '../img/image002.jpg',
                '../img/image020.jpeg'
                ],
                fadeSpeed: 4000, //2000
                duration: 6000,  //5000
                backgroundSize: SCALING_MODE_COVER
  });
});
