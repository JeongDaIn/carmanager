
$(document).ready(function() {
  $("section").backgroundCycle({
    imageUrls: [
                '../img/car01.jpg',
                '../img/car02.jpeg',
                '../img/car03.jpg'
                ],
                fadeSpeed: 2000, //2000
                duration: 5000,  //5000
                backgroundSize: SCALING_MODE_COVER
  });
});
