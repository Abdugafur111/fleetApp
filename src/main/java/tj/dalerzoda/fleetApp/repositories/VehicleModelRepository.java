package tj.dalerzoda.fleetApp.repositories;
import tj.dalerzoda.fleetApp.models.*;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VehicleModelRepository extends JpaRepository<VehicleModel, Integer> {

}
