/**
 * Copyright (C) 2016-2019 DSpot Sp. z o.o
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dspot.declex.adapter.plugin;

import java.util.ArrayList;
import java.util.List;

import org.androidannotations.AndroidAnnotationsEnvironment;

import com.helger.jcodemodel.AbstractJClass;
import com.helger.jcodemodel.JCodeModel;
import org.androidannotations.helper.ClassesHolder;

public abstract class BaseClassCreator implements JClassCreator {

	protected AndroidAnnotationsEnvironment environment;
	
	protected List<JClassPlugin> plugins = new ArrayList<JClassPlugin>();
	
	public BaseClassCreator(AndroidAnnotationsEnvironment environment) {
		this.environment = environment;
	}
	
	@Override
	public void addPlugin(JClassPlugin plugin) {
		plugins.add(plugin);
	}
	
	protected AbstractJClass getJClass(String clazz) {
		return environment.getJClass(clazz);
	}
	
	protected ClassesHolder.Classes getClasses() {
		return environment.getClasses();
	}
	
	protected JCodeModel getCodeModel() {
		return environment.getCodeModel();
	}


}
