
$(document).ready(function() {
  $("body").backgroundCycle({
    imageUrls: [
                '../img/image003.jpg',
                '../img/image002.jpg',
                '../img/image020.jpeg'
                ],
                fadeSpeed: 1500, //2000
                duration: 4500,  //5000
                backgroundSize: SCALING_MODE_COVER
  });
});
