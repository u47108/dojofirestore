package cl.dojo.sample.samplefirestore.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import cl.dojo.sample.samplefirestore.repository.MetadataRepository;

@RunWith(MockitoJUnitRunner.class)
public class SampleControllerTest {
  @Mock
  private MetadataRepository metadataRepository;
  @InjectMocks
  private SampleController sampleController;

  @Test
  public void testSaveMetadata() throws Exception {
    throw new RuntimeException("not yet implemented");
  }

  @Test
  public void testConsultMetadata() throws Exception {
    throw new RuntimeException("not yet implemented");
  }

  @Test
  public void testDelMetadata() throws Exception {
    throw new RuntimeException("not yet implemented");
  }

}
