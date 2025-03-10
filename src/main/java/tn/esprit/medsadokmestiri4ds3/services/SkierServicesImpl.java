package tn.esprit.medsadokmestiri4ds3.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.medsadokmestiri4ds3.entities.Registration;
import tn.esprit.medsadokmestiri4ds3.entities.Skier;
import tn.esprit.medsadokmestiri4ds3.entities.Subscription;
import tn.esprit.medsadokmestiri4ds3.repositories.ISkierRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@Service
public class SkierServicesImpl implements ISkierServices{
    private ISkierRepository skierRepository;

    @Override
    public Skier addSkier(Skier skier) {
        return skierRepository.save(skier);
    }
    @Override
    public Skier updateSkier(Skier skier) {
        return skierRepository.save(skier);
    }

    @Override
    public Skier retrieveSkier(Long numPiste) {
        return skierRepository.findById((numPiste)).orElse(null);
    }

    @Override
    public void removeSkier(Long numPiste) {
        skierRepository.deleteById(numPiste);
    }

    @Override
    public List<Skier> getSkiers() {
        return skierRepository.findAll();
    }

    @Override
    public Skier addSkierAndAssignToCourse(Skier skier, Long numCourse) {
        Subscription subscription = new Subscription();
        Registration registration = new Registration();
        if (skier.getRegistrations() != null) { //TODO get registration from body
            skier.getRegistrations().add(registration);
        }
        else
        {
            Set<Registration> registrations = new HashSet<>();
            registrations.add(registration);
            skier.setRegistrations(registrations);
        }
        Subscription sub = skier.getSubscription();
        skier.setSubscription(sub);
        skierRepository.save(skier);
        return skier;
    }
}
