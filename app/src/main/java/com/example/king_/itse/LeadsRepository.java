package com.example.king_.itse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeadsRepository {
    private static LeadsRepository repository = new LeadsRepository();
    private HashMap<String, leads> leads = new HashMap<>();

    public static LeadsRepository getInstance() {
        return repository;
    }

    private LeadsRepository() {
        saveLead(new leads("Tacos", "Pastor", "$12.00 +IVA", R.drawable.tacos));
        saveLead(new leads("Spaguetii", "Rojo", "$25.00 +IVA", R.drawable.spagueti));
        saveLead(new leads("Panuchos","De pollo","$25.00 +IVA",R.drawable.panuchos));
    }

    private void saveLead(leads lead) {
        leads.put(lead.getId(), lead);
    }

    public List<leads> getLeads() {
        return new ArrayList<>(leads.values());
    }}
