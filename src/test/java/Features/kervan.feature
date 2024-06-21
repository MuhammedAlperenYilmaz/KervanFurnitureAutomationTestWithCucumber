Feature:Search and select a product on Kervan's site and select the selected product   is the automation of adding to the cart.
Scenario: Product searching, selecting, adding to cart and going to cart.
Given Go to homepage
When product is searched
Then product is selected
And product quantity is updated
And add to cart
And go to cart
And the browser is closed