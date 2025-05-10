package be.uantwerp;

import java.util.ArrayList;

public interface CampaignSelectorIf {
    public ArrayList<String> generateCustomerList(String productName, int limit);
}