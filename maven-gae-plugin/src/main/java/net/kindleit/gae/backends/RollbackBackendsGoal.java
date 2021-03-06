/* Copyright 2011 Kindleit.net Software Development
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.kindleit.gae.backends;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
 * Rolls back a backend update that was interrupted by the user or stopped due to a configuration error.
 * See http://code.google.com/appengine/docs/java/backends/overview.html for more information.
 * 
 * @author rhansen@kindleit.net
 * @goal backends-rollback
 * @requiresOnline
 */
public class RollbackBackendsGoal extends BackendGoalBase {

  @Override
  public void execute() throws MojoExecutionException, MojoFailureException {
    runBackend("rollback");
  }

}
