package com.kodilla.mockito.homework;

import java.util.*;
import java.util.stream.Collectors;

public class NotificationService {

    public Map<Client, List<Localization>> clientLocalizationMap = new HashMap<>();

    public void addClient(Client client, Localization localization) {
        List<Localization> localizationList = clientLocalizationMap.getOrDefault(client, new ArrayList<>());
        localizationList.add(localization);
        this.clientLocalizationMap.put(client, localizationList);

    }
    public void removeClientFromLocalization (Client client, Localization localization) {
        List<Localization> localizationList = clientLocalizationMap.getOrDefault(client, new ArrayList<>());
        localizationList.remove(localization);
        this.clientLocalizationMap.put(client, localizationList);
    }
    public void removeClient (Client client) {
        this.clientLocalizationMap.remove(client);
    }
    public void removeLocalization(Localization localization) {
        for (Map.Entry<Client, List<Localization>> entry : clientLocalizationMap.entrySet()) {
            removeClientFromLocalization(entry.getKey(), localization);
        }
    }
    public void sendAlertRcbToLocalization (AlertRCB alertRCB, Localization localization) {
        List<Client> client = clientLocalizationMap.entrySet()
                .stream()
                .filter(clientListEntry -> clientListEntry.getValue().contains(localization))
                .map(clientListEntry -> clientListEntry.getKey())
                .collect(Collectors.toList());
        client.forEach(clients -> clients.receive(alertRCB));

    }
    public void sendAlertRcbToEveryone (AlertRCB alertRCB) {
        List<Client> clients = clientLocalizationMap.entrySet()
                .stream()
                .map(clientListEntry -> clientListEntry.getKey()).collect(Collectors.toList());
        clients.forEach(client -> client.receive(alertRCB));
    }






}
