package com.kodilla.mockito.homework;

import com.kodilla.notification.Notification;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class NotificationServiceTestSuite {
    NotificationService notificationService = new NotificationService();
    Client bartek = Mockito.mock(Client.class);
    Client marcin = Mockito.mock(Client.class);
    Client pawel = Mockito.mock(Client.class);
    Localization torun = Mockito.mock(Localization.class);
    Localization poznan = Mockito.mock(Localization.class);
    Localization szczecin = Mockito.mock(Localization.class);
    AlertRCB alertRCB = Mockito.mock(AlertRCB.class);

    @Test
    public void subscribedToLocalizationClientsShouldGetNotification() {
        notificationService.addClient(bartek,torun);

        notificationService.sendAlertRcbToLocalization(alertRCB,torun);

        Mockito.verify(bartek).receive(alertRCB);

    }
    @Test
    public void clientWhoUnsubscribedInLocalizationShouldNotReceiveNotification() {
        notificationService.addClient(bartek,torun);
        notificationService.addClient(bartek,poznan);

        notificationService.removeClientFromLocalization(bartek, torun);

        notificationService.sendAlertRcbToLocalization(alertRCB,torun);
        notificationService.sendAlertRcbToLocalization(alertRCB,poznan);
        Mockito.verify(bartek, Mockito.times(1)).receive(alertRCB);


    }
    @Test
    public void clientWhoUnsubscribedInAllLocalizationsShouldNotReceiveNotification () {
        notificationService.addClient(bartek,torun);
        notificationService.addClient(bartek,poznan);
        notificationService.addClient(bartek,szczecin);

        notificationService.removeClient(bartek);

        Mockito.verify(bartek, Mockito.never()).receive(alertRCB);


    }
    @Test
    public void shouldSendNotificationOnlyToClientsWhoSubscribedInCorrectLocalization() {


    }
    @Test
    public void shouldSendNotificationsToEverybody() {
        notificationService.addClient(marcin, poznan);
        notificationService.addClient(bartek,torun);
        notificationService.addClient(pawel,szczecin);

        notificationService.sendAlertRcbToEveryone(alertRCB);
        Mockito.verify(marcin).receive(alertRCB);
        Mockito.verify(bartek).receive(alertRCB);
        Mockito.verify(pawel).receive(alertRCB);

    }
    @Test
    public void shouldDeleteCurrentLocalization() {
        notificationService.addClient(bartek,torun);
        notificationService.addClient(pawel,torun);
        notificationService.addClient(marcin,torun);

        notificationService.removeLocalization(torun);
        notificationService.sendAlertRcbToLocalization(alertRCB, torun);

        Mockito.verify(bartek, Mockito.never()).receive(alertRCB);
        Mockito.verify(pawel, Mockito.never()).receive(alertRCB);
        Mockito.verify(marcin, Mockito.never()).receive(alertRCB);

    }

}