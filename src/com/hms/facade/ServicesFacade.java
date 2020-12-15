package com.hms.facade;

import com.hms.abstractfactory.BPB;
import com.hms.abstractfactory.BasicTransmitterFactory;
import com.hms.abstractfactory.DeluxeTransmitterFactory;
import com.hms.abstractfactory.TransmitterFactory;
import com.hms.abstractfactory.Watch;
import com.hms.adapter.Printer;
import com.hms.command.CalculateDistanceCommand;
import com.hms.command.Command;
import com.hms.command.DistanceRequestHandler;
import com.hms.command.Receiver;
import com.hms.composite.MusicItem;
import com.hms.composite.PlayList;
import com.hms.composite.Track;
import com.hms.main.Runner;
import com.hms.services.BasicService;
import com.hms.services.BasicServiceCreator;
import com.hms.services.DeluxeService;
import com.hms.services.DeluxeServiceCreator;
import com.hms.services.Service;
import com.hms.services.ServiceCreator;
import com.hms.services.ServiceType;

public class ServicesFacade {

    private ServicesFacade(){}

    private static ServicesFacade instance = null;
    private static final MusicItem musicItem = new PlayList("Main List");

    public static ServicesFacade getInstance() {
        if (instance == null) {
           instance = new ServicesFacade();
        }
        return instance;
    }
    
    public void measureDistance(Runner runner) {
    	Receiver distanceReceiver = new DistanceRequestHandler();
		Command distanceCalculation = new CalculateDistanceCommand(distanceReceiver, runner);
		distanceCalculation.execute();
    }
    
    public void printService(Printer p, Service s) {
    	p.print(s);
    }

    public void buildMusicList() {
        // Create an PlayList.
        PlayList rock = new PlayList("Rock");
        PlayList uTwoAlbum = new PlayList("U2Album");

        uTwoAlbum.add(new Track("California"));
        uTwoAlbum.add(new Track("Iris"));
        uTwoAlbum.add(new Track("Cedarwood Road"));

        rock.add(new Track("Indie Rokkers"));
        rock.add(uTwoAlbum);

        musicItem.add(rock);

    }

    public void browseMI() {
        musicItem.browse();
    }

    public static Service createService(ServiceType type) {
        Service s = null;
        TransmitterFactory transmitterFactory = null;
        ServiceCreator serviceCreator = null;
        switch (type) {
            case BASIC:
                transmitterFactory = new BasicTransmitterFactory();
                serviceCreator = new BasicServiceCreator();
                break;
            case DELUXE:
                transmitterFactory = new DeluxeTransmitterFactory();
                serviceCreator = new DeluxeServiceCreator();
                break;
            default:
                System.out.println("No Such Service Type");
                break;
        }
        Watch watch = transmitterFactory.createWatch();
        BPB belt = transmitterFactory.createBPB();

        s = serviceCreator.create();

        s.setWatch(watch);
        s.setBelt(belt);

        return s;
    }
}
