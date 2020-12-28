package com.company;

public class HistoryServiceFacade {
    private AuditService auditService = new AuditService();
    private LogService logService = new LogService();
    private MonitoringService monitoringService = new MonitoringService();
    private HistoryService historyService = new HistoryService();

    private void sendNotifyToService()
    {
        auditService.acceptNotifyFromHistoryService();
        logService.acceptNotifyFromHistoryService();
        monitoringService.acceptNotifyFromHistoryService();
    }

    public void createCreditRequest()
    {
        sendNotifyToService();
        historyService.createCreditRequest();
        sendNotifyToService();
    }

    public void updateCreditRequest()
    {
        sendNotifyToService();
        historyService.updateCreditRequest();
        sendNotifyToService();
    }

    public void acceptCreditRequest()
    {
        sendNotifyToService();
        historyService.acceptCreditRequest();
        sendNotifyToService();
    }


}
