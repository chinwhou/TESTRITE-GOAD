(function(){
var app = angular.module('store',[]);
app.controller('StoreController',function(){
    this.products = gems;
});
var gems = [
    {
        name: 'Dodecahedron',
        price:2.95,
        description:'Understanding Scop',
        images:[
            {
                full:'../img/hawaii.jpg',
                thumb:'../img/hawaii.jpg'
            },
        ],
        reviews:[
         {   stars:5,
            body:"I love this product!",
            author:"joe@xxx.xxx"
         },
         {   stars:1,
            body:"This product sucks!",
            author:"tim@xxx.xxx"
         }
        ]
        canPurchase:true,
        soldOut:false,
    },
    {
        name: 'Pentagonal Gem',
        price:5.95,
        description:'Multiple Products',
        images:[
            {
                full:'../img/pretylook.jpg',
                thumb:'../img/pretylook.jpg'
            },
        ],
        canPurchase:true,
        soldOut:false,
    }
]
})();