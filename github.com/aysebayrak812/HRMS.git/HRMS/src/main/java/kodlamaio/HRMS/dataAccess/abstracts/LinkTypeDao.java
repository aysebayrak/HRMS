package kodlamaio.HRMS.dataAccess.abstracts;
import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.concretes.LinkType;
public interface LinkTypeDao    extends JpaRepository<LinkType,Integer>{

}
