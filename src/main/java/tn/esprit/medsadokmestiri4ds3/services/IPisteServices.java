package tn.esprit.medsadokmestiri4ds3.services;

import tn.esprit.medsadokmestiri4ds3.entities.Color;
import tn.esprit.medsadokmestiri4ds3.entities.Piste;

import java.util.List;

public interface IPisteServices {
    Piste addPiste(Piste piste);
    Piste updatePiste(Piste piste);
    Piste retrievePiste(Long numPiste);
    void removePiste(Long numPiste);
    List<Piste> retrieveAll();

    List<Piste> retrieveAllByColor(Color color);
    Piste assignSkierToPiste(Long numPiste,Long numSkier);
}
