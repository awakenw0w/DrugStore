class DrugStore {
    String name_store;
    String name_drug;
    String drug_price;

    public DrugStore(String name_store, String name_drug, String drug_price) {
        this.name_store = name_store;
        this.name_drug = name_drug;
        this.drug_price = drug_price;
    }

    public void store_info() {
        System.out.println("Аптека: " + name_store);
    }
}
}