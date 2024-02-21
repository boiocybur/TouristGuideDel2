package com.example.touristguidedel2.service;

import com.example.touristguidedel2.model.TouristAttraction;
import com.example.touristguidedel2.repository.TouristRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TouristService {
    private TouristRepository touristRepository;

    public TouristService() {
        touristRepository = new TouristRepository();
    }
    public List<TouristAttraction> getAllAttractions() {
        return touristRepository.getAllAttractions();
    }
    public List<String> getCities() {
        return touristRepository.getCities();
    }
    public List<String> getTags() {
        return touristRepository.getTags();
    }
    public void addAttraction(TouristAttraction touristAttraction) {
        touristRepository.addAttraction(touristAttraction);
    }
    public void updateAttraction(TouristAttraction updatedAttraction) {
        touristRepository.updateAttraction(updatedAttraction);
    }
    public TouristAttraction deleteAttraction(int id) {
        TouristAttraction deletedTouristAttraction = touristRepository.deleteAttraction(id);
        if (deletedTouristAttraction != null) {
            return deletedTouristAttraction;
        } else {
            return new TouristAttraction(99, "ikke fundet", "ikke fundet", "ikke fundet", List.of());
        }
    }
    public TouristAttraction findAttractionById(int id) {
        return touristRepository.findAttractionById(id);
    }
}
