package tn.esprit.medsadokmestiri4ds3.services;

import tn.esprit.medsadokmestiri4ds3.entities.Registration;

public interface IRegistrationService {
    Registration addRegistrationAndAssignToSkier(Registration registration, Long numSkier);
    Registration assignRegistrationToCourse(Long numRegistration, Long numCourse);
    Registration addRegistrationAndAssignToSkierAndCourse(Registration registration, Long numSkier, Long numCourse);
}