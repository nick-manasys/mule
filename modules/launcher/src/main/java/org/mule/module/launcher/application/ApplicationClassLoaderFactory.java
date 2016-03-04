/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.module.launcher.application;

import org.mule.module.artifact.classloader.ArtifactClassLoader;
import org.mule.module.launcher.descriptor.ApplicationDescriptor;

/**
 * Creates {@link ClassLoader} instances for Mule applications
 */
public interface ApplicationClassLoaderFactory
{

    ArtifactClassLoader create(ApplicationDescriptor descriptor);

}
