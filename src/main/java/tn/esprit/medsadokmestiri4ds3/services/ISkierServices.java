package tn.esprit.medsadokmestiri4ds3.services;

import tn.esprit.medsadokmestiri4ds3.entities.Piste;
import tn.esprit.medsadokmestiri4ds3.entities.Skier;
import tn.esprit.medsadokmestiri4ds3.entities.TypeSubscription;

import java.util.List;

public interface ISkierServices {

    Skier addSkier(Skier skier);

    Skier updateSkier(Skier skier);

    Skier retrieveSkier(Long numSkier);

    void removeSkier(Long numSkier);

    List<Skier> getSkiers();
    Skier addSkierAndAssignToCourse(Skier skier, Long numCourse);
    List<Skier> retrieveSkiersBySubscriptionType(TypeSubscription typeSubscription);
}
