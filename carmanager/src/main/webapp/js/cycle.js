
$(document).ready(function() {
  $("section").backgroundCycle({
    imageUrls: [
                '../img/car.jpg',
                '../img/car.jpeg'
                ],
                fadeSpeed: 2000,
                duration: 5000,
                backgroundSize: SCALING_MODE_COVER
  });
});
