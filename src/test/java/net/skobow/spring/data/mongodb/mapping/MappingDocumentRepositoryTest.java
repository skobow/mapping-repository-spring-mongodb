package net.skobow.spring.data.mongodb.mapping;

import net.skobow.spring.data.mongodb.core.Document;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.data.mongodb.core.MongoTemplate;

import org.junit.Test;

import java.util.Optional;

@RunWith(MockitoJUnitRunner.class)
public class MappingDocumentRepositoryTest {

    @Mock
    private MongoTemplate mongoTemplateMock;

    @Mock
    private DocumentMapper<DocumentClass,DomainClass> documentMapper;

    private MappingDocumentRepository documentRepository;

    @Before
    public void setUp() throws Exception {
        MappingContext mappingContext = new MappingContext<>(DocumentClass.class, DomainClass.class, documentMapper);
        documentRepository = new MappingDocumentRepository<DocumentClass,DomainClass>(mongoTemplateMock, mappingContext) {
        };
    }

    @Test
    public void test() {

    }
    
    class DocumentClass implements Document {

        @Override
        public String getId() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
    
    class DomainClass {
        
    }
}
