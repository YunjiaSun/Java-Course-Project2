import Business.Business;
import CustomerManagement.CustomerProfile;
import OrderManagement.MasterOrderList;
import OrderManagement.Order;
import Personnel.Person;
import ProductManagement.Product;
import ProductManagement.ProductCatalog;
import Supplier.Supplier;
import Supplier.SupplierDirectory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kal bugrara
 */
public class PricingExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // creat one business
        Business amazon = new Business("Amazon");

        // pulling Supplierdirectory and creat supplier
        SupplierDirectory sd = amazon.getSupplierDirectory();

        // create 30 objects for Supplier and build the link between SD and Business
        Supplier chanel = amazon.getSupplierDirectory().newSupplier("Chanel");
        Supplier lancome = amazon.getSupplierDirectory().newSupplier("Lancome");
        Supplier dior = amazon.getSupplierDirectory().newSupplier("Dior");
        Supplier origins = amazon.getSupplierDirectory().newSupplier("Origins");
        Supplier fresh = amazon.getSupplierDirectory().newSupplier("Fresh");
        Supplier clinique = amazon.getSupplierDirectory().newSupplier("Clinique");
        Supplier lamer = amazon.getSupplierDirectory().newSupplier("LaMer");
        Supplier giorgioarmani = amazon.getSupplierDirectory().newSupplier("Giorgio Armani");
        Supplier hr = amazon.getSupplierDirectory().newSupplier("HR");
        Supplier biotherm = amazon.getSupplierDirectory().newSupplier("Biotherm");
        Supplier kiehls = amazon.getSupplierDirectory().newSupplier("Kiehls");
        Supplier maybelline = amazon.getSupplierDirectory().newSupplier("Maybelline");
        Supplier vichy = amazon.getSupplierDirectory().newSupplier("Vichy");
        Supplier ysl = amazon.getSupplierDirectory().newSupplier("YSL");
        Supplier lv = amazon.getSupplierDirectory().newSupplier("LV");
        Supplier tomford = amazon.getSupplierDirectory().newSupplier("Tom Ford");
        Supplier ipsa = amazon.getSupplierDirectory().newSupplier("IPSA");
        Supplier givenchy = amazon.getSupplierDirectory().newSupplier("Givenchy");
        Supplier guerlain = amazon.getSupplierDirectory().newSupplier("Guerlain");
        Supplier loewe = amazon.getSupplierDirectory().newSupplier("LOEWE");
        Supplier ck = amazon.getSupplierDirectory().newSupplier("CK");
        Supplier innisfree = amazon.getSupplierDirectory().newSupplier("Innisfree");
        Supplier gucci = amazon.getSupplierDirectory().newSupplier("GUCCI");
        Supplier sisley = amazon.getSupplierDirectory().newSupplier("Sisley");
        Supplier sulwhasoo = amazon.getSupplierDirectory().newSupplier("Sulwhasoo");
        Supplier bobbibrown = amazon.getSupplierDirectory().newSupplier("Bobbi Brown");
        Supplier jomalone = amazon.getSupplierDirectory().newSupplier("Jo Malone");
        Supplier mac = amazon.getSupplierDirectory().newSupplier("MAC");
        Supplier celine = amazon.getSupplierDirectory().newSupplier("Celine");
        Supplier prada = amazon.getSupplierDirectory().newSupplier("Prada");

        // pulling customer directory and creating customer pofile
        Person Anna = new Person("Anna", "001");
        Person Lucky = new Person("Lucky", "002");
        Person Le = new Person("Le", "003");
        Person Leo = new Person("Leo", "004");
        Person Xiaoming = new Person("Xiaoming", "005");
        Person Luo = new Person("Luo", "006");
        Person Summer = new Person("Summer", "007");
        Person Bob = new Person("Bob", "008");
        Person Tina = new Person("Tina", "009");
        Person Jay = new Person("Jay", "010");
        Person Tom = new Person("Tom", "011");
        Person Gu = new Person("Gu", "012");
        Person Ling = new Person("Ling", "013");
        Person Apple = new Person("Apple", "014");
        Person Organe = new Person("Organe", "015");
        Person Ann = new Person("Ann", "016");
        Person Qing = new Person("Qing", "017");
        Person Didi = new Person("Didi", "018");
        Person Nova = new Person("Nova", "019");
        Person Joanne = new Person("Joanne", "020");
        Person Dora = new Person("Dora", "021");
        Person Lucy = new Person("Lucy", "022");
        Person Cici = new Person("Cici", "023");
        Person Eva = new Person("Eva", "024");
        Person Hebe = new Person("Hebe", "025");
        Person Jacy = new Person("Jacy", "026");
        Person Kiki = new Person("Kiki", "027");
        Person Sunny = new Person("Sunny", "028");
        Person Oliva = new Person("Oliva", "029");
        Person Vicky = new Person("Vicky", "030");


        CustomerProfile Customer_Anna = amazon.getCustomerDirector().newCustomerProfile(Anna);
        CustomerProfile Customer_Lucky = amazon.getCustomerDirector().newCustomerProfile(Lucky);
        CustomerProfile Customer_Le = amazon.getCustomerDirector().newCustomerProfile(Le);
        CustomerProfile Customer_Leo = amazon.getCustomerDirector().newCustomerProfile(Leo);
        CustomerProfile Customer_Xiaoming = amazon.getCustomerDirector().newCustomerProfile(Xiaoming);
        CustomerProfile Customer_Luo = amazon.getCustomerDirector().newCustomerProfile(Luo);
        CustomerProfile Customer_Summer = amazon.getCustomerDirector().newCustomerProfile(Summer);
        CustomerProfile Customer_Bob = amazon.getCustomerDirector().newCustomerProfile(Bob);
        CustomerProfile Customer_Tina = amazon.getCustomerDirector().newCustomerProfile(Tina);
        CustomerProfile Customer_Jay = amazon.getCustomerDirector().newCustomerProfile(Jay);
        CustomerProfile Customer_Tom = amazon.getCustomerDirector().newCustomerProfile(Tom);
        CustomerProfile Customer_Gu = amazon.getCustomerDirector().newCustomerProfile(Gu);
        CustomerProfile Customer_Ling = amazon.getCustomerDirector().newCustomerProfile(Ling);
        CustomerProfile Customer_Apple = amazon.getCustomerDirector().newCustomerProfile(Apple);
        CustomerProfile Customer_Organe = amazon.getCustomerDirector().newCustomerProfile(Organe);
        CustomerProfile Customer_Ann = amazon.getCustomerDirector().newCustomerProfile(Ann);
        CustomerProfile Customer_Qing = amazon.getCustomerDirector().newCustomerProfile(Qing);
        CustomerProfile Customer_Didi = amazon.getCustomerDirector().newCustomerProfile(Didi);
        CustomerProfile Customer_Nova = amazon.getCustomerDirector().newCustomerProfile(Nova);
        CustomerProfile Customer_Joanne = amazon.getCustomerDirector().newCustomerProfile(Joanne);
        CustomerProfile Customer_Dora = amazon.getCustomerDirector().newCustomerProfile(Dora);
        CustomerProfile Customer_Lucy = amazon.getCustomerDirector().newCustomerProfile(Lucy);
        CustomerProfile Customer_Cici = amazon.getCustomerDirector().newCustomerProfile(Cici);
        CustomerProfile Customer_Eva = amazon.getCustomerDirector().newCustomerProfile(Eva);
        CustomerProfile Customer_Hebe = amazon.getCustomerDirector().newCustomerProfile(Hebe);
        CustomerProfile Customer_Jacy = amazon.getCustomerDirector().newCustomerProfile(Jacy);
        CustomerProfile Customer_Kiki = amazon.getCustomerDirector().newCustomerProfile(Kiki);
        CustomerProfile Customer_Sunny = amazon.getCustomerDirector().newCustomerProfile(Sunny);
        CustomerProfile Customer_Oliva = amazon.getCustomerDirector().newCustomerProfile(Oliva);
        CustomerProfile Customer_Vicky = amazon.getCustomerDirector().newCustomerProfile(Vicky);

        // create a object for productcatalog
        ProductCatalog chanel_pc = chanel.getProductcatalog();
        // create 20 objects for product (fp cp tp)
        Product perfumer_coco50ml = chanel_pc.newProduct("perfumer_coco50ml",70, 100, 90);
        Product perfumer_coco100ml = chanel_pc.newProduct("perfumer_coco100ml",100, 130, 120);
        Product perfumer_coco150ml = chanel_pc.newProduct("perfumer_coco150ml",130, 160, 150);
        Product perfumer_lily50ml = chanel_pc.newProduct("perfumer_lily50ml",50, 80, 60);
        Product perfumer_lily100ml = chanel_pc.newProduct("perfumer_lily100ml",80, 110, 90);
        Product perfumer_lily150ml = chanel_pc.newProduct("perfumer_lily150ml",110, 140, 120);
        Product perfumer_Gabrielle50ml = chanel_pc.newProduct("perfumer_Gabrielle50ml",60, 100, 80);
        Product perfumer_Gabrielle100ml = chanel_pc.newProduct("perfumer_Gabrielle100ml",90, 130, 110);
        Product perfumer_Gabrielle150ml = chanel_pc.newProduct("perfumer_Gabrielle150ml",120, 160, 140);
        Product perfumer_Chance50ml = chanel_pc.newProduct("perfumer_Chance50ml",70, 100, 90);
        Product perfumer_Chance100ml = chanel_pc.newProduct("perfumer_Chance100ml",100, 130, 120);
        Product perfumer_Chance150ml = chanel_pc.newProduct("perfumer_Chance150ml",130, 160, 150);
        Product perfumer_BleuDe50ml = chanel_pc.newProduct("perfumer_BleuDe50ml",100, 200, 150);
        Product perfumer_BleuD100ml = chanel_pc.newProduct("perfumer_BleuD100ml",130, 230, 180);
        Product perfumer_BleuDe150ml = chanel_pc.newProduct("perfumer_BleuDe150ml",160, 260, 210);
        Product lipstick_coco1 = chanel_pc.newProduct("lipstick_coco1",30, 50, 40);
        Product lipstick_coco2 = chanel_pc.newProduct("lipstick_coco2",20, 40, 30);
        Product lipstick_coco3 = chanel_pc.newProduct("lipstick_coco3",30, 50, 40);
        Product lipstick_coco4 = chanel_pc.newProduct("lipstick_coco4",20, 40, 30);
        Product lipstick_coco5 = chanel_pc.newProduct("lipstick_coco5",20, 40, 30);

        // create a object for productcatalog
        ProductCatalog gucci_pc = gucci.getProductcatalog();

        // create 20 objects for product (fp cp tp)
        Product perfumer_rush50ml = gucci_pc.newProduct("perfumer_rush50ml",80, 100, 90);
        Product perfumer_rush100ml = gucci_pc.newProduct("perfumer_rush100ml",110, 130, 120);
        Product perfumer_rush150ml = gucci_pc.newProduct("perfumer_rush150ml",130, 160, 150);
        Product perfumer_envy50ml = gucci_pc.newProduct("perfumer_envy50ml",50, 90, 60);
        Product perfumer_envy100ml = gucci_pc.newProduct("perfumer_envy100ml",80, 100, 90);
        Product perfumer_envy150ml = gucci_pc.newProduct("perfumer_envy150ml",110, 140, 120);
        Product perfumer_flora50ml = gucci_pc.newProduct("perfumer_flora50ml",70, 100, 80);
        Product perfumer_flora100ml = gucci_pc.newProduct("perfumer_flora100ml",90, 130, 110);
        Product perfumer_flora150ml = gucci_pc.newProduct("perfumer_flora150ml",120, 150, 140);
        Product perfumer_accenti50ml = gucci_pc.newProduct("perfumer_accenti50ml",70, 100, 90);
        Product perfumer_accenti100ml = gucci_pc.newProduct("perfumer_accenti100ml",90, 130, 120);
        Product perfumer_accenti150ml = gucci_pc.newProduct("perfumer_accenti150ml",130, 160, 150);
        Product perfumer_nobile50ml = gucci_pc.newProduct("perfumer_nobile50ml",130, 200, 150);
        Product perfumer_nobile100ml = gucci_pc.newProduct("perfumer_nobile100ml",150, 230, 180);
        Product perfumer_nobile150ml = gucci_pc.newProduct("perfumer_nobile150ml",160, 260, 210);
        Product lipstick_rush1 = gucci_pc.newProduct("lipstick_rush1",25, 50, 40);
        Product lipstick_rush2 = gucci_pc.newProduct("lipstick_rush2",20, 35, 30);
        Product lipstick_rush3 = gucci_pc.newProduct("lipstick_rush3",30, 50, 40);
        Product lipstick_rush4 = gucci_pc.newProduct("lipstick_rush4",20, 35, 30);
        Product lipstick_rush5 = gucci_pc.newProduct("lipstick_rush5",25, 40, 30);

        // create a object for productcatalog
        ProductCatalog ysl_pc = ysl.getProductcatalog();

        // create 20 objects for product (fp cp tp)
        Product lipstick_rv1 = ysl_pc.newProduct("lipstick_rv1",25, 40, 30);
        Product lipstick_rv2 = ysl_pc.newProduct("lipstick_rv2",20, 35, 30);
        Product lipstick_rv3 = ysl_pc.newProduct("lipstick_rv3",20, 35, 30);
        Product lipstick_rv4 = ysl_pc.newProduct("lipstick_rv4",25, 40, 30);
        Product lipstick_rv5 = ysl_pc.newProduct("lipstick_rv5",20, 35, 30);
        Product lipstick_rv6 = ysl_pc.newProduct("lipstick_rv6",25, 40, 30);
        Product lipstick_rv7 = ysl_pc.newProduct("lipstick_rv7",20, 35, 30);
        Product lipstick_rv8 = ysl_pc.newProduct("lipstick_rv8",25, 40, 30);
        Product lipstick_rv9 = ysl_pc.newProduct("lipstick_rv9",20, 35, 30);
        Product lipstick_rv10 = ysl_pc.newProduct("lipstick_rv10",20, 35, 30);
        Product lipstick_rd1 = ysl_pc.newProduct("lipstick_rd1",25, 40, 30);
        Product lipstick_rd2 = ysl_pc.newProduct("lipstick_rd2",25, 40, 30);
        Product lipstick_rd3 = ysl_pc.newProduct("lipstick_rd3",20, 35, 40);
        Product lipstick_rd4 = ysl_pc.newProduct("lipstick_rd4",25, 40, 30);
        Product lipstick_rd5 = ysl_pc.newProduct("lipstick_rd5",20, 35, 30);
        Product lipstick_rd6 = ysl_pc.newProduct("lipstick_rd6",20, 35, 30);
        Product lipstick_rd7 = ysl_pc.newProduct("lipstick_rd7",25, 40, 30);
        Product lipstick_rd8 = ysl_pc.newProduct("lipstick_rd8",30, 50, 40);
        Product lipstick_rd9 = ysl_pc.newProduct("lipstick_rd9",20, 35, 30);
        Product lipstick_rd10 = ysl_pc.newProduct("lipstick_rd10",25, 40, 30);

        // create a object for productcatalog
        ProductCatalog dior_pc = dior.getProductcatalog();

        // create 20 objects for product (fp cp tp)
        Product lipstick_shine1 = dior_pc.newProduct("lipstick_shine1",40, 60, 50);
        Product lipstick_shine2 = dior_pc.newProduct("lipstick_shine2",40, 60, 50);
        Product lipstick_shine3 = dior_pc.newProduct("lipstick_shine3",30, 50, 40);
        Product lipstick_shine4 = dior_pc.newProduct("lipstick_shine4",40, 60, 50);
        Product lipstick_shine5 = dior_pc.newProduct("lipstick_shine5",30, 50, 40);
        Product lipstick_shine6 = dior_pc.newProduct("lipstick_shine6",25, 40, 30);
        Product lipstick_shine7 = dior_pc.newProduct("lipstick_shine7",40, 60, 50);
        Product lipstick_shine8 = dior_pc.newProduct("lipstick_shine8",25, 40, 30);
        Product lipstick_shine9 = dior_pc.newProduct("lipstick_shine9",40, 60, 50);
        Product lipstick_shine10 = dior_pc.newProduct("lipstick_shine10",20, 35, 30);
        Product lipstick_lady1 = dior_pc.newProduct("lipstick_lady1",30, 50, 40);
        Product lipstick_lady2 = dior_pc.newProduct("lipstick_lady2",40, 60, 500);
        Product lipstick_lady3 = dior_pc.newProduct("lipstick_lady3",20, 35, 300);
        Product lipstick_lady4 = dior_pc.newProduct("lipstick_lady4",25, 40, 30);
        Product lipstick_lady5 = dior_pc.newProduct("lipstick_lady5",30, 50, 400);
        Product lipstick_lady6 = dior_pc.newProduct("lipstick_lady6",20, 35, 30);
        Product lipstick_lady7 = dior_pc.newProduct("lipstick_lady7",30, 50, 40);
        Product lipstick_lady8 = dior_pc.newProduct("lipstick_lady8",40, 50, 45);
        Product lipstick_lady9 = dior_pc.newProduct("lipstick_lady9",20, 35, 30);
        Product lipstick_lady10 = dior_pc.newProduct("lipstick_lady10",30, 50, 40);

        // create a object for productcatalog
        ProductCatalog lancome_pc = lancome.getProductcatalog();

        // create 20 objects for product (fp cp tp)
        Product lipstick_colord1 = lancome_pc.newProduct("lipstick_colord1",25, 40, 30);
        Product lipstick_colord2 = lancome_pc.newProduct("lipstick_colord2",20, 35, 30);
        Product lipstick_colord3 = lancome_pc.newProduct("lipstick_colord3",20, 35, 30);
        Product lipstick_colord4 = lancome_pc.newProduct("lipstick_colord4",25, 40, 30);
        Product lipstick_colord5 = lancome_pc.newProduct("lipstick_colord5",20, 35, 30);
        Product lipstick_colord6 = lancome_pc.newProduct("lipstick_colord6",25, 40, 30);
        Product lipstick_colord7 = lancome_pc.newProduct("lipstick_colord7",20, 35, 30);
        Product lipstick_colord8 = lancome_pc.newProduct("lipstick_colord8",25, 40, 30);
        Product lipstick_colord9 = lancome_pc.newProduct("lipstick_colord9",20, 35, 30);
        Product lipstick_colord10 = lancome_pc.newProduct("lipstick_colord10",20, 35, 30);
        Product lipstick_satin1 = lancome_pc.newProduct("lipstick_satin1",25, 40, 30);
        Product lipstick_satin2 = lancome_pc.newProduct("lipstick_satin2",25, 40, 30);
        Product lipstick_satin3 = lancome_pc.newProduct("lipstick_satin3",20, 35, 300);
        Product lipstick_satin4 = lancome_pc.newProduct("lipstick_satin4",25, 40, 30);
        Product lipstick_satin5 = lancome_pc.newProduct("lipstick_satin5",20, 35, 30);
        Product lipstick_satin6 = lancome_pc.newProduct("lipstick_satin6",20, 35, 30);
        Product lipstick_satin7 = lancome_pc.newProduct("lipstick_satin7",25, 40, 30);
        Product lipstick_satin8 = lancome_pc.newProduct("lipstick_satin8",30, 50, 40);
        Product lipstick_satin9 = lancome_pc.newProduct("lipstick_satin9",20, 35, 30);
        Product lipstick_satin10 = lancome_pc.newProduct("lipstick_satin10",25, 40, 30);


        // pull Master Order List and create an order
        // customer 10
        MasterOrderList mol = amazon.getMasterorderlist();
        Order AnnaFirstOrder = mol.newOrder(Customer_Anna);
        Order TinaFirstOrder = mol.newOrder(Customer_Tina);
        Order TinaSecondOrder = mol.newOrder(Customer_Tina);
        Order JacyFirstOrder = mol.newOrder(Customer_Jacy);
        Order KikiFirstOrder = mol.newOrder(Customer_Kiki);
        Order SummerFirstOrder = mol.newOrder(Customer_Summer);
        Order SummerSecondOrder = mol.newOrder(Customer_Summer);
        Order AnnFirstOrder = mol.newOrder(Customer_Ann);
        Order LeoFirstOrder = mol.newOrder(Customer_Leo);
        Order LeoSecondOrder = mol.newOrder(Customer_Leo);
        Order LingFirstOrder = mol.newOrder(Customer_Ling);
        Order NovaFirstOrder = mol.newOrder(Customer_Nova);
        Order NovaSecondOrder = mol.newOrder(Customer_Nova);
        Order VickyFirstOrder = mol.newOrder(Customer_Vicky);


        // add Order item(s) to the order (10 customers)
        AnnaFirstOrder.newOrderItem(lipstick_coco1, 1, 150);
        AnnaFirstOrder.newOrderItem(lipstick_coco1, 1, 150);
        AnnaFirstOrder.newOrderItem(lipstick_rd3, 1, 40);
        TinaFirstOrder.newOrderItem(perfumer_BleuDe50ml, 1,300);
        TinaSecondOrder.newOrderItem(perfumer_Chance150ml, 1,150);
        TinaSecondOrder.newOrderItem(lipstick_colord3, 1,60);
        JacyFirstOrder.newOrderItem(perfumer_BleuDe50ml, 2,250);
        JacyFirstOrder.newOrderItem(lipstick_colord5, 1,100);
        KikiFirstOrder.newOrderItem(lipstick_shine8, 5,100);
        SummerFirstOrder.newOrderItem(perfumer_Gabrielle150ml, 1,120);
        SummerFirstOrder.newOrderItem(perfumer_coco50ml, 1,100);
        SummerFirstOrder.newOrderItem(lipstick_colord6, 1,40);
        SummerSecondOrder.newOrderItem(lipstick_lady6, 1,50);
        SummerSecondOrder.newOrderItem(lipstick_shine10, 1,30);
        AnnFirstOrder.newOrderItem(lipstick_rd10, 1,30);
        LeoFirstOrder.newOrderItem(perfumer_BleuDe150ml, 3,210);
        LeoSecondOrder.newOrderItem(perfumer_BleuDe50ml, 1,150);
        LeoSecondOrder.newOrderItem(perfumer_envy150ml, 1,120);
        LeoSecondOrder.newOrderItem(lipstick_lady1,6,50);
        LingFirstOrder.newOrderItem(lipstick_shine4, 1,50);
        NovaFirstOrder.newOrderItem(perfumer_flora100ml, 1,115);
        NovaSecondOrder.newOrderItem(perfumer_nobile50ml, 2,150);
        NovaSecondOrder.newOrderItem(perfumer_Gabrielle50ml, 1,100);
        VickyFirstOrder.newOrderItem(perfumer_lily150ml, 1,150);



        chanel_pc.printProductList();

        amazon.printAllSales();

        amazon.getCustomers().generateCustomerPerformanceReport().printReport();

        

    }

}
