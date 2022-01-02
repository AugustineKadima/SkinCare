package ke.co.azureeworld.skincare;

import java.util.Objects;

public class Product {
    private String skinComplexion;
    private String skinType;

    public Product(String skinComplexion, String skinType) {
        this.skinComplexion = skinComplexion;
        this.skinType = skinType;
    }

    public String getSkinComplexion() {
        return skinComplexion;
    }

    public void setSkinComplexion(String skinComplexion) {
        this.skinComplexion = skinComplexion;
    }

    public String getSkinType() {
        return skinType;
    }

    public void setSkinType(String skinType) {
        this.skinType = skinType;
    }

    @Override
    public String toString() {
        return "Product{" +
                "skinComplexion='" + skinComplexion + '\'' +
                ", skinType='" + skinType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(skinComplexion, product.skinComplexion) && Objects.equals(skinType, product.skinType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skinComplexion, skinType);
    }

    public String getBeautyProducts(String skinComplexion, String skinType){
        if((skinComplexion.length() == 0 || skinType.length() == 0) || (skinComplexion.length() == 0 && skinType.length() == 0)) return "Please select your skin type and skin complexion to get beauty products that match your skin.";
        if(skinComplexion.equals("dark")){
            if(skinType == "oily"){
                return "We suggest the following beauty products for dark skin complexion and oily skin type\n" +
                        "\n" +
                        "Soothing Serum\n" +
                        "Iunik\n" +
                        "Panoxyl\n" +
                        "Coconut water cream\n" +
                        "\n" +
                        "We suggest the following locations\n" +
                        "\n" +
                        "Beauty Click, Parklands, Nairobi\n" +
                        "Reones Beauty and Cosmetics Supply, Eastleigh, Nairobi\n" +
                        "Skincare, Kileleshwa, Nairobi";
            }else if(skinType == "dry"){
                return "We suggest the following beauty products for dark skin complexion and dry skin type\n" +
                        "\n" +
                        "Pure aloe vera gel\n" +
                        "Coconut oil\n" +
                        "Triple cream\n" +
                        "Eucerin\n" +
                        "Borage\n" +
                        "\n" +
                        "We suggest the following locations\n" +
                        "\n" +
                        "Beauty Blog Kenya, CBD\n" +
                        "Radiant Beauty World, Nairobi\n" +
                        "Suzie Beauty, Nairobi CBD";
            }else if(skinType == "normal"){
                return "We suggest the following beauty products for dark skin complexion and normal skin type\n" +
                        "\n" +
                        "Cetaphil\n" +
                        "Olay\n" +
                        "Cerave\n" +
                        "Purity Cleanser\n" +
                        "Baby Brown Clarins\n" +
                        "\n" +
                        "We suggest the following locations\n" +
                        "\n" +
                        "Le-fremms Beauty Salon, CBD\n" +
                        "Lintons Beauty\n" +
                        "Beautine Enterprises\n" +
                        "Brivys Beauty Products and Accessories";
            }
        }else if(skinComplexion.equals("light")){
            if(skinType == "oily"){
                return "We suggest the following beauty products for light skin complexion and oily skin type\n" +
                        "\n" +
                        "Covergirl Clean Fresh Pressed Powder\n" +
                        "Kate Somerville Oil-Free Moisturizer\n" +
                        "Caudalie Vinopure Natural Salicylic Acid Pore Minimizing Serum\n" +
                        "Dermalogica Oil Free Matte SPF30\n" +
                        "Mary Kay Oil Mattifier\n" +
                        "\n" +
                        "We suggest the following locations\n" +
                        "\n" +
                        "Skincare, Nairobi CBD\n" +
                        "Super Cosmetics, Adams Arcade, Nairobi";
            }else if(skinType == "dry"){
                return "We suggest the following beauty products for light skin complexion and dry skin type\n" +
                        "\n" +
                        "beautyProductsLightOily\n" +
                        "Aquaphor Healing Ointment\n" +
                        "CeraVe Moisturizing Cream\n" +
                        "Vanicream Moisturizing Skin Cream\n" +
                        "CeraVe Facial Moisturizing Lotion PM\n" +
                        "CeraVe SA Cream\n" +
                        "\n" +
                        "We suggest the following locations\n" +
                        "\n" +
                        "Peepy Beauty Products, Nairobi City\n" +
                        "Reones Beauty and Cosmetics Supply, Starehe";
            }else if(skinType == "normal"){
                return "We suggest the following beauty products for light skin complexion and normal skin type\n" +
                        "\n" +
                        "Stone Crop Gel Wash\n" +
                        "Lemon Cleanser\n" +
                        "Stone Crop Cleansing Oil\n" +
                        "\n" +
                        "We suggest the following locations\n" +
                        "\n" +
                        "True Cosmetics, Mombasa\n" +
                        "Markay Products, Nairobi";
            }
        }
        return "An error occurred. Please try again.";
    }
}
