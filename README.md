# Data Conjuror

## About

Data conjuror is a library for generating realistic data.
This is intended for use in BDD or integration test suites, but could also be used for populating apps with dummy data for demonstrations, user testing etc.

## How to use

Include data conjuror as a dependency in your project's POM file:

    
    <dependencies>
        ...
        <dependency>
            <groupId>com.kestreldigital.conjuror</groupId>
            <artifactId>conjuror</artifactId>
            <version>1.0.0</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
    

You can then use data conjuror from your tests to get random but reasonable data.
The conjuror should be constructed first, then used wherever you need sample data.

    
    package com.kestreldigital.sample;
    
    import com.kestreldigital.conjuror.Conjuror;
    import org.junit.Test;
    import static org.junit.Assert.assertNotNull;
    
    public class exampleTest {
        
        @Test
        public void nameCanBeGenerated() {
            Conjuror conjuror = new Conjuror();
            assertNotNull(conjuror.conjureName());
        }
        
    }
    
 

## Copyright

Copyright 2018 Kestrel Digital Ltd

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  [http://www.apache.org/licenses/LICENSE-2.0](http://www.apache.org/licenses/LICENSE-2.0)

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.



