package cl.dojo.sample.samplefirestore.entity;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import cl.dojo.sample.samplefirestore.ConstantsTest;

@RunWith(MockitoJUnitRunner.class)
public class MetadataTest {

  @Test
  public void testMetadata() throws Exception {
    Metadata entity = getEntity();
    Assert.assertNotNull(ConstantsTest.MUST_BE_A_NOTNULL, entity);
    Assert.assertNotNull(ConstantsTest.MUST_BE_A_NOTNULL, entity.getId());
    Assert.assertNotNull(ConstantsTest.MUST_BE_A_NOTNULL, entity.getEpa());
    Assert.assertNotNull(ConstantsTest.MUST_BE_A_NOTNULL, entity.getIdInteraction());
    Assert.assertNotNull(ConstantsTest.MUST_BE_A_NOTNULL, entity.getInteraction());
    Assert.assertNotNull(ConstantsTest.MUST_BE_A_NOTNULL, entity.getTypifications());
    Assert.assertNotNull(ConstantsTest.MUST_BE_A_NOTNULL, entity.toString());
  
  }
  public static Metadata getEntity() {
    Metadata result = new Metadata();
    result.setEpa("epa");
    result.setId(Long.valueOf("1"));
    result.setIdInteraction("asda123123");
    result.setInteraction("interaction");
    result.setTypifications("type");
    return result;
  }
}
