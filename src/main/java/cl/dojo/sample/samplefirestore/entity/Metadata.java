package cl.dojo.sample.samplefirestore.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import com.google.cloud.spring.data.datastore.core.mapping.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@Entity(name = "metadataInfo")
public class Metadata implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = -5053483000835498738L;
  @Id
  private Long id;
  private String idInteraction;
  private String interaction;
  private String typifications;
  private String epa;
  
  public Metadata() {
    super();
  }
}
