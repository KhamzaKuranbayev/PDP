package pdp_lessons.module2.extraTask.task11;

import pdp_lessons.module2.extraTask.task7.Order;

import java.util.*;

public class OnlineMarketDemo {
    static Scanner scanner = new Scanner(System.in);
    static int choiceInt;
    static String choiceString;
    static User activeUser = null;

    static Set<User> users;
    static List<Category> categories;
    static HashMap<Integer, Product> products;
    static List<Order> orders;
    static List<OrderDetails> orderDetails;
    static List<ShoppingCart> shoppingCarts;

    public static void main(String[] args) {

        users = new HashSet<>();
        users.add(new User("Khamza Kuranbayev", "khamza@mail.ru", "cust123", Role.CUSTOMER));
        users.add(new User("Aziz Ahmedov", "aziz@mail.ru", "sale123", Role.SALESMAN));
        users.add(new User("Savriddin Yuldashev", "savriddin@mail.ru", "man123", Role.MANAGER));
        users.add(new User("Bekzod Raximov", "bek@mail.ru", "dir123", Role.DIRECTOR));

        categories = new ArrayList<>();
        categories.add(new Category(1, "Phone", "Mobile Phones"));
        categories.add(new Category(2, "Auto", "Auto"));
        categories.add(new Category(3, "Clothes", "Baby Clothes"));

        products = new HashMap<>();
        products.put(1, new Product("Redmi Note 8", categories.get(0), 1200, 50));
        products.put(2, new Product("Nexia 3", categories.get(1), 6500, 200));
        products.put(3, new Product("Jacket", categories.get(2), 650, 100));

        orders = new ArrayList<>();
        orderDetails = new ArrayList<>();
        shoppingCarts = new ArrayList<>();

        while (true) {
            printMainMenu();
            choiceInt = scanner.nextInt();

            switch (choiceInt) {
                case 1:
                    login();
                    break;
                case 2:
                    signUp();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }

            // 1. Login bo'sa Role lari bo'yicha quyidagi menu ochiladi
            if (activeUser != null) {
                Role role = activeUser.getRole();
                switch (role) {
                    case CUSTOMER:
                        implementCustomer();
                        break;
                    case SALESMAN:
                        implementSalesman();
                        break;
                    case MANAGER:
                        implementManager();
                        break;
                    case DIRECTOR:
                        implementDirector();
                        break;
                }
            }
        }

    }

    private static void signUp() {

    }

    private static void login() {
        System.out.print("Enter email: ");
        String email = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();
        for (User user : users) {
            if (user != null) {
                if (user.login(email, password)) {
                    activeUser = user;
                    break;
                }
            }
        }
    }

    private static void implementDirector() {

    }

    private static void implementManager() {

    }

    private static void implementSalesman() {

        System.out.println("\n\nWelcome to Salesman Form");
        System.out.println("----------------------------");
        System.out.println("1. Add Product");
        System.out.println("2. Set Price");
        System.out.println("0. Exit");
        System.out.println("----------------------------");

        choiceInt = scanner.nextInt();
        switch (choiceInt) {
            case 1:
                addProduct();
                break;
            case 2:
                setPrice();
                break;
        }

    }

    private static void setPrice() {
        System.out.println("\nChoose Product");
        System.out.println("-----------------------------");
        getAllProducts();
        System.out.println("-----------------------------");
        choiceInt = scanner.nextInt();
        Product product = products.get(choiceInt);
    }

    private static void addProduct() {
        System.out.println("\nChoose Product");
        System.out.println("-----------------------------");
        getAllProducts();
        System.out.println("-----------------------------");
        System.out.println("+ Add New  - Edit");
        choiceString = scanner.next();

        if (choiceString.equals("+")) {
            chooseCategory();
        } else {
            System.out.print("Choose: ");
            choiceInt = scanner.nextInt();
            Product product = products.get(choiceInt);
            System.out.println("Name: " + product.getName() + " Price: " + product.getPrice() + "\n");
        }
    }

    private static void chooseCategory() {
        System.out.println("\nChoose Category");
        System.out.println("-----------------------------");
        getAllCategories();
        System.out.println("-----------------------------");
        System.out.println("+ Add New  - Edit");
        choiceString = scanner.next();

        Category category = null;

        if (choiceString.equals("+")) {
            scanner = new Scanner(System.in);

            System.out.print("\nCategory Name: ");
            String catName = scanner.nextLine();
            System.out.print("\nCategory Defination: ");
            String catDefinition = scanner.nextLine();
            categories.add(new Category(categories.size() + 1, catName, catDefinition));
            category = categories.get(categories.size() - 1);
        } else {
            System.out.print("Choose: ");
            choiceInt = scanner.nextInt();
            category = categories.get(choiceInt);
        }
        scanner = new Scanner(System.in);

        System.out.print("Product Name: ");
        String product_name = scanner.nextLine();
        System.out.print("Product Price: ");
        int product_price = scanner.nextInt();
        System.out.print("Product Amount: ");
        int product_amount = scanner.nextInt();


        products.put(products.size() + 1, new Product(product_name, category, product_price, product_amount));
        System.out.println(products.get(products.size()).getName() + "\n");
    }

    private static void getAllCategories() {
        categories.forEach(category -> System.out.println(category.getId() + ". " + category.getName()));
    }

    private static void getAllProducts() {
        products.forEach((index, product) -> System.out.println(index + ". " + product.getName() + " | Price: " + product.getPrice()));
    }

    private static void implementCustomer() {
        // Zuhra
        // 1. sdlkj
        // 2. sdsd
        // 3. sdsd
        // +  All
    }

    private static void printMainMenu() {
        System.out.println("1. Log In");
        System.out.println("2. Sign Up");
        System.out.println("3. Exit");
    }

}
