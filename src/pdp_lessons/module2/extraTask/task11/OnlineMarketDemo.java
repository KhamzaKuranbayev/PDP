package pdp_lessons.module2.extraTask.task11;

import java.util.*;

public class OnlineMarketDemo {
    static Scanner scanner = new Scanner(System.in);
    static int choiceInt;
    static String choiceString;
    static User activeUser = null;
    static Category category = null;

    static Set<User> users;
    static List<Category> categories;
    static HashMap<Integer, Product> products;
    static List<Order> orders;
    static List<OrderDetails> orderDetails;
    static List<ShoppingCart> shoppingCarts;
    static LinkedHashMap<Product, Integer> tempMap = new LinkedHashMap<>();

    static int quantityProductWarehouse = 0;
    static int totalPrice = 0;
    static boolean hasOrder = false;

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
        products.put(1, new Product("Redmi Note 8", categories.get(0), 800, 50));
        products.put(2, new Product("Samsung S8", categories.get(0), 900, 50));
        products.put(3, new Product("Iphone 9", categories.get(0), 1000, 50));
        products.put(4, new Product("Nexia 3", categories.get(1), 6500, 200));
        products.put(5, new Product("Lacetti", categories.get(1), 7500, 200));
        products.put(6, new Product("Spark", categories.get(1), 6000, 200));
        products.put(7, new Product("Jacket", categories.get(2), 150, 100));
        products.put(8, new Product("T-Shirt", categories.get(2), 250, 100));
        products.put(9, new Product("Shoes", categories.get(2), 350, 100));

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

        boolean b = true;
        while (b) {
            System.out.println("\n\n============ SALESMAN FORM ==============");
            System.out.println("1. Add Product");
            System.out.println("2. Set Price");
            System.out.println("3. View All Products");
            System.out.println("4. Remove Product");
            System.out.println("0. Exit");
            System.out.println("=========================================");
            System.out.print("Choose: ");
            choiceInt = scanner.nextInt();
            switch (choiceInt) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    setPrice();
                    break;
                case 3:
                    System.out.println("\n----------- ALL PRODUCTS ------------");
                    getAllProducts();
                    System.out.println("-------------------------------------");
                    break;
                case 4:
                    removeProduct();
                    break;
                case 0:
                    System.out.println("\n");
                    b = false;
                    break;
            }
        }

    }

    private static void removeProduct() {
        System.out.println("\nChoose Product");
        System.out.println("-----------------------------");
        getAllProducts();
        System.out.println("-----------------------------");
        choiceInt = scanner.nextInt();
        String productName = products.get(choiceInt).getName();
        System.out.println("Do you want to remove " + productName + " ? y - YES n - NO");
        choiceString = scanner.next();
        if (choiceString.equals("y")) {
            products.remove(choiceInt);
            System.out.println(productName + " is removed!");
        }
    }

    private static void setPrice() {
        System.out.println("\n----------- ALL PRODUCTS ------------");
        getAllProducts();
        System.out.println("-------------------------------------");
        System.out.print("Choose: ");
        choiceInt = scanner.nextInt();
        Product product = products.get(choiceInt);
        System.out.println("Name: " + product.getName());
        System.out.print("New Price: ");
        product.setPrice(scanner.nextInt());
        System.out.println("New price is set!");
    }

    private static void addProduct() {
        System.out.println("\nChoose Product");
        System.out.println("-----------------------------");
        getAllProducts();
        System.out.println("-----------------------------");
        System.out.println("+ Add New  - Edit 0 - Exit");
        choiceString = scanner.next();

        if (choiceString.equals("+")) {
            chooseCategory();
        } else if (choiceString.equals("-")) {
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
            System.out.print("Category Defination: ");
            String catDefinition = scanner.nextLine();
            categories.add(new Category(categories.size() + 1, catName, catDefinition));
            category = categories.get(categories.size() - 1);
        } else {
            System.out.print("Choose: ");
            choiceInt = scanner.nextInt();
            category = categories.get(choiceInt - 1);
        }
        scanner = new Scanner(System.in);

        System.out.print("Product Name: ");
        String product_name = scanner.nextLine();
        System.out.print("Product Price: ");
        int product_price = scanner.nextInt();
        System.out.print("Product Amount: ");
        int product_amount = scanner.nextInt();


        products.put(products.size() + 1, new Product(product_name, category, product_price, product_amount));
        System.out.println(products.get(products.size()).getName() + " added successfully!\n");
    }

    private static void getAllCategories() {
        categories.forEach(category -> System.out.println(category.getId() + ". " + category.getName()));
    }

    private static void getAllProducts() {
        products.forEach((index, product) -> System.out.println(index + ". "
                + product.getName() + "  |  Price: " + product.getPrice() +
                "  |  Category: " + product.getCategory().getName()));
    }

    private static void implementCustomer() {
        // Zuhra
        // 1. sdlkj
        // 2. sdsd
        // 3. sdsd
        // +  All

        orders.add(new Order(orders.size() + 1, activeUser, false));
        Order order = orders.get(orders.size() - 1);

        boolean b = true;
        while (b) {
            System.out.println("\n\n============ CUSTOMER FORM ==============");
            System.out.println("PlEASE CHOOSE CATEGORY:");
            getAllCategories();
            System.out.println(" + Choose All   - Cancel   v - View Shopping Cart   o - My Orders");
            System.out.println("=========================================");
            System.out.print("Choose: ");
            choiceString = scanner.next();
            if (choiceString.equals("-")) {
                System.out.println("\n\n");
                b = false;
            } else if (choiceString.equals("v")) {

                if (hasOrder) {
                    System.out.println("\n--------------------- Shopping Cart ---------------------");
                    orders.forEach(order1 -> {
                        if (order1.getCustomer().equals(activeUser) && !order1.isOrderStatus()) {
                            orderDetails.forEach(orderDetails1 -> {
                                if (orderDetails1.getOrder().equals(order1)) {
                                    totalPrice += (orderDetails1.getProduct().getPrice() * orderDetails1.getQuantity());
                                    System.out.println("Product: " + orderDetails1.getProduct().getName()
                                            + "  |  Quantity: " + orderDetails1.getQuantity()
                                            + "  |  Price: " + orderDetails1.getProduct().getPrice()
                                            + "  |  Total Price: " + (orderDetails1.getProduct().getPrice() * orderDetails1.getQuantity()));
                                }
                            });
                        }
                    });
                    System.out.println("-----------------Total Price: " + totalPrice + "------------------------");
                    System.out.println(" + Buy  - Cancel");
                    choiceString = scanner.next();
                    if (choiceString.equals("+")) {
                        buy(order);
                        orders.add(new Order(orders.size() + 1, activeUser, false));
                        order = orders.get(orders.size() - 1);

                    } else {
                        clearOrder(order);
                    }
                } else {
                    System.out.println("Shopping Cart is empty!");
                }
            } else if (choiceString.equals("o")) {
                viewMyOrders();
            } else {
                boolean b1 = true;
                while (b1) {
                    System.out.println("\nChoose Product");
                    System.out.println("-----------------------------");
                    if (choiceString.equals("+")) {
                        getAllProducts();
                    } else {
                        category = categories.get(Integer.parseInt(choiceString.trim()) - 1);
                        products.forEach((index, product) -> {
                            if (product.getCategory().equals(category)) {
                                System.out.println(index + ". " + product.getName());
                            }
                        });
                    }
                    System.out.println("-----------------------------");
                    System.out.print("Choose: ");
                    choiceInt = scanner.nextInt();
                    Product product = products.get(choiceInt);

                    int amountProduct = 0;
                    if (checkTempMap(product)) {
                        amountProduct = tempMap.get(product);
                    } else if (tempMap.size() == 0 && !checkTempMap(product)) {
                        tempMap.put(product, product.getAmount());
                        amountProduct = tempMap.get(product);
                    }

                    System.out.println(amountProduct);

                    System.out.println("\n" + product.toString());
                    System.out.println(" + Add To Cart   - Cancel");
                    scanner = new Scanner(System.in);
                    String choiceString2 = scanner.next();
                    if (choiceString2.equals("+")) {
                        boolean b2 = true;
                        while (b2) {
                            System.out.print("Quantity: ");
                            int quantity = scanner.nextInt();
                            if (quantity <= amountProduct) {
                                addToCart(product, order, quantity);
                                tempMap.put(product, tempMap.get(product) - quantity);
                                b1 = false;
                                b2 = false;
                            } else {
                                System.out.println("Not enough! Please retype.");
                            }
                        }
                    }
                }
            }

        }

    }

    private static boolean checkTempMap(Product product) {

        for (Map.Entry<Product, Integer> entry : tempMap.entrySet()) {
            if (entry.getKey().equals(product)) {
                return true;
            }
        }
        return false;
    }

    private static void viewMyOrders() {
        System.out.println("---------- My Orders -------------");
        orders.forEach(order -> {
            if (order.getCustomer().equals(activeUser) && order.isOrderStatus()) {
                System.out.println("Order Number: " + order.getOrderId() + "  |  Total Price: " + order.getTotalPrice());
            }
        });
        System.out.println("-----------------------------");
        System.out.print("Order Number: ");
        choiceInt = scanner.nextInt();
        for (OrderDetails orderDetail : orderDetails) {
            if (orderDetail.getOrder().getOrderId() == choiceInt) {
                System.out.println("Product: " + orderDetail.getProduct().getName()
                        + "  |  Quantity: " + orderDetail.getQuantity()
                        + "  |  Price: " + orderDetail.getProduct().getPrice()
                        + "  |  Total Price: " + (orderDetail.getProduct().getPrice() * orderDetail.getQuantity()));
            }
        }
    }

    private static void clearOrder(Order order) {
        orders.forEach(order1 -> {
            if (order1.getOrderId() == order.getOrderId()) {
                orders.remove(order1);
                System.out.println("Your order is canceled!\n");
                hasOrder = false;
            }
        });
    }

    private static void buy(Order order) {
        orders.forEach(order1 -> {
            if (order1.getOrderId() == order.getOrderId()) {
                if (order1.getCustomer().equals(activeUser) && !order1.isOrderStatus()) {
                    order1.setOrderStatus(true);
                    order1.setTotalPrice(totalPrice);
                    System.out.println("The sale was successful! Your Order Number is " + order1.getOrderId() + "\n");
                    hasOrder = false;
                    totalPrice = 0;
                }
            }
        });
    }

    private static void addToCart(Product product, Order order, int quantity) {
        orderDetails.add(new OrderDetails(order, product, quantity));
        System.out.println(product.getName() + " added to cart! OrderID: " + order.getOrderId());
        hasOrder = true;
    }

    private static void printMainMenu() {
        System.out.println("1. Log In");
        System.out.println("2. Sign Up");
        System.out.println("3. Exit");
    }

}
