package com.vytrackHM.utilities;

import com.vytrackHM.pages.fleet.VehiclesContractsPage;
import com.vytrackHM.pages.main.MainPage;
import com.vytrackHM.pages.fleet.VehiclesPage;
import com.vytrackHM.pages.login_navigation.LoginPage;


    public class Pages {
//        private LoginPage loginPage;
//        private CalendarEventsPage calendarEventsPage;
//        private DashboardPage dashboardPage;
//        private ManageDashboards manageDashboards;
//
//
//        public LoginPage loginPage() {
//            if (loginPage == null) {
//                loginPage = new LoginPage();
//            }
//            return loginPage;
//        }
//
//        public CalendarEventsPage calendarEventsPage() {
//            if (calendarEventsPage == null) {
//                calendarEventsPage = new CalendarEventsPage();
//            }
//            return calendarEventsPage;
//        }
//
//        public DashboardPage dashboardPage() {
//            if (dashboardPage == null) {
//                dashboardPage = new DashboardPage();
//            }
//            return dashboardPage;
//        }
//
//        public ManageDashboards manageDashboards() {
//            if (manageDashboards == null) {
//                manageDashboards = new ManageDashboards();
//            }
//            return manageDashboards;
//        }
//    }






    private LoginPage loginPage;
    private VehiclesPage vehiclesPage;
    private MainPage mainPage;
    private VehiclesContractsPage vehiclesContractsPage;


    public LoginPage loginPage(){
        if (loginPage == null){
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public VehiclesPage vehiclesPage(){
        if(vehiclesPage==null){
            vehiclesPage = new VehiclesPage();
        }
        return vehiclesPage;
    }

    public MainPage mainPage(){
        if (mainPage == null){
            mainPage = new MainPage();
        }
        return mainPage;
    }

    public VehiclesContractsPage vehiclesContractsPage(){
        if(vehiclesContractsPage == null){
            vehiclesContractsPage = new VehiclesContractsPage();
        }
        return vehiclesContractsPage;
    }


}


