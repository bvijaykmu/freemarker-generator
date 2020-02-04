/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.freemarker.generator.maven;

import java.nio.file.Path;

public interface OutputGeneratorPropertiesProvider {
	/**
	 * Must add three properties to the builder: the <b>templateLocation</b>, <b>outputLocation</b>, and <b>dataModel</b>
	 * The <b>pom updated timestamp</b> and <b>generatorLocation</b> are added elsewhere.
	 * @param path The path to the generator file, to be used to decide on the three properties above.
	 * @param builder The builder to which to add the properties.
	 */
	public void providePropertiesFromFile(Path path, OutputGenerator.OutputGeneratorBuilder builder);
}