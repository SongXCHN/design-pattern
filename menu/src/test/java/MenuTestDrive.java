import org.github.MenuComponent;
import org.github.MenuItem;
import org.github.menu.Menu;
import org.github.Waitress;

/**
 * Created by SongX on 2019/4/4.
 */
public class MenuTestDrive {

    public static void main(String[] args) {
        // 所有菜单
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU",
                "早餐 Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "午餐 Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "晚餐 Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU",
                " Dessert of course!");
        MenuComponent coffeeMenu = new Menu("COFFEE MENU",
                "Stuff to go with your afternoon coffee");

        // 最顶层菜单
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        // 将每个菜单加入allMenus中
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        // pancakeHouseMenu 加入具体菜单项
        pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast", true, 2.99));
        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage", false, 2.99));
        pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries, and blueberry syrup",
                true, 3.49));
        pancakeHouseMenu.add(new MenuItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true, 3.59));

        //dinerMenu 加入具体菜单项
        dinerMenu.add(new MenuItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat", true,
                2.99));
        // 加入另一个菜单
        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla icecream",
                true, 1.59));


        //cafeMenu 加入具体菜单项
        cafeMenu.add(new MenuItem(
                "Veggie Burger and Air Fries",
                "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                true, 3.99));
        cafeMenu.add(new MenuItem("Soup of the day",
                "A cup of the soup of the day, with a side salad", false, 3.69));

        cafeMenu.add(coffeeMenu);

        coffeeMenu.add(new MenuItem(
                        "Veggie Burger and Air Fries",
                        "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                        true, 3.99));
        coffeeMenu.add(new MenuItem("Bagel",
                "Flavors include sesame, poppyseed, cinnamon raisin, pumpkin",
                false, 0.69));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
        System.out.println("\n\n\n");
        waitress.printVegetarianMenu();
    }

}
