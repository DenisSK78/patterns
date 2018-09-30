package state.v1;

//Context
public class Radio {

    Station station;

    void setStation(Station st){
        station=st;
    }

    void nextStation(){
        if(station instanceof RadioRox){
            setStation(new RadioUniStar());
        }
        else if(station instanceof RadioUniStar){
            setStation(new RadioVesti());
        }
        else if (station instanceof RadioVesti){
            setStation(new RadioRox());
        }
    }

    void play(){
        station.play();
    }
}
