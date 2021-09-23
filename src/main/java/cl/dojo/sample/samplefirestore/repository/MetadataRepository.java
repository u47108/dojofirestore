package cl.dojo.sample.samplefirestore.repository;

import com.google.cloud.spring.data.datastore.repository.DatastoreRepository;

import cl.dojo.sample.samplefirestore.entity.Metadata;

public interface MetadataRepository extends DatastoreRepository<Metadata,Long> {

}
