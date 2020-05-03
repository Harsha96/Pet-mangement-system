/*





*/

package com.sudesh.justpet.domain.mock;

import com.sudesh.justpet.model.CenterRepository;
import com.sudesh.justpet.model.entities.Product;
import com.sudesh.justpet.model.entities.ProductCategoryModel;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/*
* This class serve as fake server and provides dummy product and category with real Image Urls taken from flipkart
*/
public class FakeWebServer {

  private static FakeWebServer fakeServer;

  public static FakeWebServer getFakeWebServer() {

    if (null == fakeServer) {
      fakeServer = new FakeWebServer();
    }
    return fakeServer;
  }

  void initiateFakeServer() {

    addCategory();

  }

  public void addCategory() {

    ArrayList<ProductCategoryModel> listOfCategory = new ArrayList<ProductCategoryModel>();

    listOfCategory
    .add(new ProductCategoryModel(
    "Pet",
    "Food and Accessories",
    "10%",
    "https://www.amsetters.net/wp-content/uploads/2019/08/Pet-Products.jpg"));

    listOfCategory
    .add(new ProductCategoryModel(
    "Pet",
    "Sell",
    "15%",
    "https://www.nutripetec.co.za/wp-content/uploads/2019/09/cat-eating-cat-food.jpg"));
    listOfCategory
    .add(new ProductCategoryModel(
    "Pet",
    "care",
    "15%",
    "http://www.petscareadvice.org/wp-content/uploads/2017/10/shutterstock_133079561-768x575.jpg"));
    CenterRepository.getCenterRepository().setListOfCategory(listOfCategory);
  }

  public void getAllDogs() {

    ConcurrentHashMap<String, ArrayList<Product>> productMap = new ConcurrentHashMap<String, ArrayList<Product>>();

    ArrayList<Product> productlist = new ArrayList<Product>();

    // Foods
    productlist
    .add(new Product(
    "DROOLS ADULT – CHICKEN & EGG",
    "DROOLS ADULT",
    "Drools Chicken and Egg Adult is specially formulated for growing puppies and adults. It contains real chicken as # 1 ingredient to build and maintain lean muscle mass for top body condition. With only the finest ingredients it contains what your dog needs to stay happy and healthy. A great combination of ingredients, vitamins, minerals and nutrition for everything from strong bones to optimal digestion. Drools Chicken and Egg is developed to help your dog live a long and healthy life. Omega 6 and 3 fatty acids to help your dog have healthy skin and beautiful coat.",
    "400",
    "10",
    "360",
    "0",
    "https://i0.wp.com/www.bestcare.lk/shop/wp-content/uploads/2018/01/04.-Drools-Adult-Chicken-Egg.jpg?fit=1200%2C1120&ssl=1",
    "Food_1"));

    productlist
    .add(new Product(
    "SPECIAL DOG PUPPY JUNIOR ",
    "CHICKEN AND RICE",
    "Puppies are highly exuberant in nature and require food that will not only provide them with the energy to keep up with their playful activities but also will help them grow into healthy adult dogs.Special Dog Chicken & Rice Puppy Food has been specially formulated to provide balanced nutrition and energy and to meet the nutritional needs of the growing puppies. ",
    "15000",
    "10",
    "13500",
    "0",
    "https://i1.wp.com/www.bestcare.lk/shop/wp-content/uploads/2018/01/1387870421190-600x600.jpg?fit=600%2C600&ssl=1",
    "Food_2"));

    productlist
    .add(new Product(
    "DROOLS CAT ADULT – TUNA & SALMON",
    "Drools dry cat food with tuna and salmon is a complete and balanced feed for cat",
    "Drools dry cat food with tuna and salmon is a complete and balanced feed for cats. Cats are fussy and choosy eaters and their nutritional requirements also very peculiar. Drools tuna and salmon cat food delivers optimum protein and energy along with essential nutrients to keep your cat healthy and active.",
    "1000",
    "10",
    "900",
    "0",
    "https://i2.wp.com/www.bestcare.lk/shop/wp-content/uploads/2018/02/06.-Drools-Cat-Adult-%E2%80%93-Tuna-Salmon.jpg?fit=600%2C600&ssl=1",
    "Food_3"));

    productlist
    .add(new Product(
    "ROYAL CANIN STERILISED IN JELLY 85G",
    "Royal Canin believe that a cat’s diet should take into account all parameters of health",
    "Royal Canin believe that a cat’s diet should take into account all parameters of health, such as age, breed, lifestyle, physiology and individual circumstances. A cat’s coat is a mirror of its health. Royal Canin Sterilised in Jelly wet cat food is based on Royal Canin’s commitment to the highest quality and includes the Macro Nutrient Profile instinctively preferred by adult cats (from one year of age).",
    "500",
    "12",
    "420",
    "0",
    "https://i2.wp.com/www.bestcare.lk/shop/wp-content/uploads/2018/11/60583_pla_rc_sterilised_gelee_7.jpg?fit=400%2C400&ssl=1",
    "Food_4"));

    productlist
    .add(new Product(
    "PEDIGREE CHICKEN & LIVER CHUNKS",
    "Perfect fresh meal that’s gently cooked to retain vitamins that are more natural",
    "Suitable for all dog breeds: highly effective for fussy eaters, be it a cute little Pug, a big, bold German Shepherd or a friendly, playful Labrador",
    "5190",
    "10",
    "4290",
    "0",
    "https://i2.wp.com/www.bestcare.lk/shop/wp-content/uploads/2018/02/01.-Pedigree-Chicken-Liver-Chunks-Adult-85-g.jpg?fit=800%2C800&ssl=1",
    "Food_5"));

    productMap.put("Pet Food", productlist);

    ArrayList<Product> ToysList = new ArrayList<Product>();

    // TV
    ToysList.add(new Product(
    "Toys",
    "BITE BONE PLASTIC",
    "Dog Bone Resistant Toy help establish proper chewing habits and relieve the causes of destructive chewing. Offers a variety of chew toys in all sizes and shapes to occupy both puppies and adults, satisfying their need to gnaw on something while diverting them from chewing on inappropriate items",
    "450",
    "12",
    "325",
    "0",
    "https://i0.wp.com/www.bestcare.lk/shop/wp-content/uploads/2018/02/blue-pet-toy-bone-500x500.jpg?fit=500%2C500&ssl=1",
    "Toys_1"));

    ToysList.add(new Product(
    "Toys 1",
    "COLORFUL PET TOY RUBBER BALL WITH BELL INSIDE",
    "COLORFUL PET TOY RUBBER BALL WITH BELL INSIDE",
    "500",
    "12",
    "450",
    "0",
    "https://i0.wp.com/www.bestcare.lk/shop/wp-content/uploads/2019/02/1PCS-Colorful-Pet-Dog-Cat-Toy-Rubber-Round-Ball-with-Small-Bell-Dog-Toys-S-M_1024x1024.jpg?fit=1000%2C1000&ssl=1",
    "Toys_2"));

    ToysList.add(new Product(
    "Toys 2",
    "COTTON ROPE BALL TOY",
    "Cotton rope, natural raw materials, safety and environmental friendly. It can help your pet clean there teeth, help reduce teeth tartar and other diseases. Made From Premium Cotton Fibers,environmental braided cord, safety rubber chew ball strong resistance to teething toy Has a variety of colors ,color sent randomly.",
    "500",
    "12",
    "450",
    "0",
    "https://i0.wp.com/www.bestcare.lk/shop/wp-content/uploads/2018/02/s-l300.jpg?fit=402%2C401&ssl=1",
    "Toys_3"));

    ToysList.add(new Product(
    "Toys 3",
    "FANTASTIC BLACK BONE PATTERN PET DOG FEEDING BALL SOUND TOY",
    "Suitable for small dog to play Food ball toy for pet.100% Brand new.Put some of your pet’s favorite snack inside and the dog will be attracted.",
    "550",
    "12",
    "450",
    "0",
    "https://i2.wp.com/www.bestcare.lk/shop/wp-content/uploads/2018/03/SKU013650-1-1.jpg?fit=600%2C600&ssl=1",
    "Toys_4"));

    ToysList.add(new Product(
    "Toys 4",
    "FERRIBIELLA BONE HARD RUBBER BITE-ME",
    "FERRIBIELLA BONE HARD RUBBER BITE-ME",
    "790",
    "12",
    "682",
    "0",
    "https://i0.wp.com/www.bestcare.lk/shop/wp-content/uploads/2019/10/juguete-goma-dura-bite-me_1_g.jpeg?fit=512%2C512&ssl=1",
    "Toys_5"));

    productMap.put("Toys", ToysList);

    productlist = new ArrayList<Product>();

    // Accessories
    productlist
    .add(new Product(
    "ADJUSTABLE PET CAR SEAT BELT ",
    "KEEP YOUR DOG AND CAT SAFE IN THE CAR!",
    "KEEP YOUR DOG AND CAT SAFE IN THE CAR!",
    "550",
    "10",
    "450",
    "0",
    "https://i2.wp.com/www.bestcare.lk/shop/wp-content/uploads/2019/06/new-adjustable-pet-dog-safety-seat-belt-nylon.jpg?fit=800%2C800&ssl=1",
    "accessories_1"));

    productlist
    .add(new Product(
    "Easy Clean Plus Hand-held ",
    "Eureka Forbes Easy Clean Plus Hand-held Vacuum Cleaner",
    "The Eureka Forbes Easy Clean vacuum cleaner is best for those who are looking for a machine that makes cleaning easier and is convenient to use. It is a compact and powerful machine with high suction and low power consumption.",
    "2699",
    "10",
    "2566",
    "0",
    "http://img6a.flixcart.com/image/vacuum-cleaner/j/e/x/nova-vc-761h-plus-vacuum-cleaner-400x400-imaecmhyadgxzzpg.jpeg",
    "accessories_2"));

    productlist
    .add(new Product(
    "ADJUSTABLE NYLON PET CAT/PUPPY HARNESS ",
    "ADJUSTABLE NYLON PET CAT/PUPPY HARNESS WITH LEAD LEASH STRAP BELT SAFETY ROPE",
    "ADJUSTABLE NYLON PET CAT/PUPPY HARNESS WITH LEAD LEASH STRAP BELT SAFETY ROPE",
    "620",
    "10",
    "350",
    "0",
    "https://i0.wp.com/www.bestcare.lk/shop/wp-content/uploads/2019/08/YY2504801-D-3-5.jpg?fit=990%2C990&ssl=1",
    "accessories_3"));

    productlist
    .add(new Product(
    "DOG MUZZLE ",
    "ADJUSTABLE SOFT SILICONE DOG MUZZLE",
    "ADJUSTABLE SOFT SILICONE DOG MUZZLE",
    "3050",
    "10",
    "2550",
    "0",
    "https://i2.wp.com/www.bestcare.lk/shop/wp-content/uploads/2019/02/HTB1D6_ba2ImBKNjSZFlq6A43FXa4.jpg?fit=800%2C800&ssl=1",
    "accessories_4"));

    productlist
    .add(new Product(
    "HEAVY DUTY DOG PET HARNESS COLLAR ",
    "Product Name: saddle harness belt (Oxford)",
    "Material: Oxford cloth (100% polyester)To apply a gender: General Color: black, red, leopard, camouflage",
    "1890",
    "10",
    "1570",
    "0",
    "https://i2.wp.com/www.bestcare.lk/shop/wp-content/uploads/2019/06/2018-Nylon-Heavy-Duty-Dog-Pet-Harness-Collar-K9-Padded-Extra-Big-Large-Medium-Small-Dog.jpg_640x640.jpg?fit=640%2C640&ssl=1",
    "accessories_5"));

    productMap.put("Pet Accessories", productlist);


    CenterRepository.getCenterRepository().setMapOfProductsInCategory(productMap);

  }

  public void getAllcats() {

    ConcurrentHashMap<String, ArrayList<Product>> productMap = new ConcurrentHashMap<String, ArrayList<Product>>();

    ArrayList<Product> productlist = new ArrayList<Product>();

    // Table
    productlist
    .add(new Product(
    "Rottweiler -Galle",
    "Rottweiler puppies for sale KASL Registration Sire:BEVINAS BURG YURATH - Important",
    "Dame:ROXY - important blood line Grand father- CRAZY DIAMOND URSU - important Male and female puppies Training to food 4 weeks complete",
    "50000",
    "12",
    "45200",
    "0",
    "https://s3.amazonaws.com/cdn-origin-etr.akc.org/wp-content/uploads/2020/11/12224942/Rottweiler-On-White-10.jpg",
    "DOG_1"));

    productlist
    .add(new Product(
    "Purebred Rottweiler Puppies-Kalutara",
    "6 weeks old, purebred  puppies available for sale. CKC Registered puppies. Pedigree Certificates available for Sire & Dam. Wormed & Parvo Vaccinated. Vet Checked, Puppy Booklets available. Well Looked After. More info...Price : Negotiable Vaccination : Parvo Virus Registration : CKC (Ceylon Kennel Club) Age (in weeks) : 6 Contact seller : xxxxxxxxx",
    "6 weeks old, purebred  puppies available for sale. CKC Registered puppies. Pedigree Certificates available for Sire & Dam. Wormed & Parvo Vaccinated.Vet Checked, Puppy Booklets available.Well Looked After. More info...Price : Negotiable Vaccination : Parvo Virus Registration : CKC (Ceylon Kennel Club) Age (in weeks) : 6 Contact seller : xxxxxxxxx",
    "42000",
    "12",
    "3900",
    "0",
    "https://s3.amazonaws.com/cdn-origin-etr.akc.org/wp-content/uploads/2020/11/12224942/Rottweiler-On-White-10.jpg",
    "DOG_2"));

    productlist
    .add(new Product(
    "Golden Retriever-Kalutara",
    "LITTER ANNOUNCEMENT (28 Days puppy's pics attached. Real pics) RESERVATION STARTED First Litter from EDEN FEDROZ KENNEL FAMILY. HIGHLY PEDIGREED GOLDEN RETRIEVER PUPPIES English cream father's puppies More info...Age (in weeks) : 4 Contact seller : xxxxxxxxx",
    "LITTER ANNOUNCEMENT (28 Days puppy's pics attached. Real pics) RESERVATION STARTED First Litter from EDEN FEDROZ KENNEL FAMILY. HIGHLY PEDIGREED GOLDEN RETRIEVER PUPPIES English cream father's puppies More info...Age (in weeks) : 4 Contact seller : xxxxxxxxx",

    "75000",
    "12",
    "70000",
    "0",
    "https://www.marshallspetzone.com/blog/wp-content/uploads/2018/06/featured-image.jpg",
    "DOG_3"));

    productlist
    .add(new Product(
    "Doberman Puppies-Kalutara",
    "how Quality Liver Colour Puppies Available All puppies KASL Registered ,, Father imported blood line ? Sire AMUN'S CANDOMBE TANGO ?- KASL & CKC Show winner (BLUE MOON THE DEXTAR MORGAN x GLANZEN RED LOTUS )Dam SINDY OF KALUTARA KENNEL ",
    "Mother Sindy of Kalutara kennel 6 weeks only Males & Female More info... Registration : KASL (Kennel Association of Sri Lanka) Age (in weeks) : 6 Contact seller : xxxxxxxxx",
    "45000",
    "12",
    "42000",
    "0",
    "https://www.espree.com/sites/default/files/2019-10/DobermanPinscher.png",
    "DOG_4"));

    productlist
    .add(new Product(
    "Rottweiler -Gampaha",
    "Rottweiler puppies for sale KASL Registration Sire:BEVINAS BURG YURATH - Important",
    "Dame:ROXY - important blood line Grand father- CRAZY DIAMOND URSU - important Male and female puppies Training to food 4 weeks complete.",
    "11200",
    "12",
    "9000",
    "0",
    "https://s3.amazonaws.com/cdn-origin-etr.akc.org/wp-content/uploads/2020/11/12224942/Rottweiler-On-White-10.jpg",
    "DOG_5"));

    productlist
    .add(new Product(
    "Golden Retriever-Kalutara",
    "LITTER ANNOUNCEMENT (28 Days puppy's pics attached. Real pics) RESERVATION STARTED First Litter from EDEN FEDROZ KENNEL FAMILY.HIGHLY PEDIGREED GOLDEN RETRIEVER PUPPIES English cream father's puppies More info... Age (in weeks) : 4 Contact seller : xxxxxxxxx",
    "LITTER ANNOUNCEMENT (28 Days puppy's pics attached. Real pics) RESERVATION STARTED First Litter from EDEN FEDROZ KENNEL FAMILY.HIGHLY PEDIGREED GOLDEN RETRIEVER PUPPIES English cream father's puppies More info... Age (in weeks) : 4 Contact seller : xxxxxxxxx",

    "75000",
    "12",
    "70000",
    "0",
    "https://www.marshallspetzone.com/blog/wp-content/uploads/2018/06/featured-image.jpg",
    "DOG_6"));

    productMap.put("DOG", productlist);

    productlist = new ArrayList<Product>();

    // Cat
    productlist
    .add(new Product(
    "Persian cat",
    "ab Homez XXXL Bean Bag Cat Cover (Without Filling)",
    "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
    "36500",
    "20",
    "1200",
    "0",
    "https://cdn3-www.cattime.com/assets/uploads/2011/12/file_2676_persian-460x290-460x290.jpg",
    "Cat_1"));

    productlist
    .add(new Product(
    "Himalayan Kittens-Malabe, Colombo",
    "Himalayan Kittens-Malabe, Colombo",
    "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
    "35000",
    "20",
    "3200",
    "0",
    "https://i2.wp.com/pawesomecats.com/wp-content/uploads/2015/10/Himalayan-Cat-Breed-Profile.jpg?w=740&ssl=1",
    "Cat_2"));

    productlist
    .add(new Product(
    "Persian Kittens-Battaramulla, Colombo",
    "Persian Kittens-Battaramulla, Colombo",
    "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
    "29000",
    "20",
    "27500",
    "0",
    "https://cdn3-www.cattime.com/assets/uploads/2011/12/file_2676_persian-460x290-460x290.jpg",
    "Cat_3"));



    productMap.put("Cat", productlist);

    productlist = new ArrayList<Product>();

    // // Cat
    // productlist
    //         .add(new Product(
    //                 "l Collapsible Wardrobe",
    //                 "Everything Imported Carbon Steel Collapsible Wardrobe",
    //                 "Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
    //                 "2999",
    //                 "20",
    //                 "1999",
    //                 "0",
    //                 "http://img5a.flixcart.com/image/collapsible-wardrobe/h/h/g/best-quality-3-5-feet-foldable-storage-cabinet-almirah-shelf-400x400-imaees5fq7wbndak.jpeg",
    //                 "almirah_1"));
    //
    // productlist
    //         .add(new Product(
    //                 "l Collapsible Wardrobe",
    //                 "Everything Imported Carbon Steel Collapsible Wardrobe",
    //                 "Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
    //                 "2999",
    //                 "20",
    //                 "1999",
    //                 "0",
    //                 "http://img6a.flixcart.com/image/collapsible-wardrobe/d/n/s/cb265-carbon-steel-cbeeso-dark-beige-400x400-imaefn9vha2hm9qk.jpeg",
    //                 "almirah_2"));
    //
    // productlist
    //         .add(new Product(
    //                 "l Collapsible Wardrobe",
    //                 "Everything Imported Carbon Steel Collapsible Wardrobe",
    //                 "Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
    //                 "2999",
    //                 "20",
    //                 "1999",
    //                 "0",
    //                 "http://img6a.flixcart.com/image/wardrobe-closet/b/v/3/srw-146-jute-pindia-blue-400x400-imaeb9g4y6tegzfn.jpeg",
    //                 "almirah_3"));
    //
    // productlist
    //         .add(new Product(
    //                 "l Collapsible Wardrobe",
    //                 "Everything Imported Carbon Steel Collapsible Wardrobe",
    //                 "Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
    //                 "2999",
    //                 "20",
    //                 "1999",
    //                 "0",
    //                 "http://img6a.flixcart.com/image/cupboard-almirah/y/w/q/100009052-particle-board-housefull-mahogany-400x400-imaebazkwhv64p8q.jpeg",
    //                 "almirah_4"));
    //
    // productlist
    //         .add(new Product(
    //                 "l Collapsible Wardrobe",
    //                 "Everything Imported Carbon Steel Collapsible Wardrobe",
    //                 "Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
    //                 "2999",
    //                 "20",
    //                 "1999",
    //                 "0",
    //                 "http://img5a.flixcart.com/image/collapsible-wardrobe/w/c/k/srw-116a-aluminium-pindia-maroon-wardrobe-400x400-imaeb9g4945dqunu.jpeg",
    //                 "almirah_5"));
    //
    // productlist
    //         .add(new Product(
    //                 "Metal Free Standing Wardrobe",
    //                 "Everything Imported Carbon Steel Collapsible Wardrobe",
    //                 "Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
    //                 "2999",
    //                 "20",
    //                 "1999",
    //                 "0",
    //                 "http://img6a.flixcart.com/image/wardrobe-closet/f/b/p/srw-167-jute-pindia-purple-400x400-imaeb9g4d8uvatck.jpeg",
    //                 "almirah_6"));
    //
    //
    //
    // productMap.put("Almirah", productlist);

    CenterRepository.getCenterRepository().setMapOfProductsInCategory(productMap);

  }

  public void getAllProducts(int productCategory) {

    if (productCategory == 0) {

      getAllDogs();
    } else {

      getAllcats();

    }

  }

}
