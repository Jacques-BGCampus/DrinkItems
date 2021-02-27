package BusinessLogicLayer.DataObjects.Menus.DrinkItems.NonAlcoholicDrinks.ColdDrink330ml;

import BusinessLogicLayer.Abstractions.INonAlcoholicDrinks;

public class FantaGrape330ml implements INonAlcoholicDrinks{
    
    @Override
    public String getItemName() {
        return "6 x 330ml Fanta Grape Can";
    }

    @Override
    public double getPrice() {
        return 33.0d;
    }
}
