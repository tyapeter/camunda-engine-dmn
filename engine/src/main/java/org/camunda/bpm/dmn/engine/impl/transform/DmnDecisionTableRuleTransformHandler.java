/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.camunda.bpm.dmn.engine.impl.transform;

import org.camunda.bpm.dmn.engine.impl.DmnDecisionTableRuleImpl;
import org.camunda.bpm.dmn.engine.impl.spi.transform.DmnElementTransformContext;
import org.camunda.bpm.dmn.engine.impl.spi.transform.DmnElementTransformHandler;
import org.camunda.bpm.model.dmn.instance.Rule;

public class DmnDecisionTableRuleTransformHandler implements DmnElementTransformHandler<Rule, DmnDecisionTableRuleImpl> {

  public DmnDecisionTableRuleImpl handleElement(DmnElementTransformContext context, Rule rule) {
    return createFromRule(context, rule);
  }

  protected DmnDecisionTableRuleImpl createFromRule(DmnElementTransformContext context, Rule rule) {
    DmnDecisionTableRuleImpl decisionTableRule = createDmnElement(context, rule);

    decisionTableRule.setId(rule.getId());
    decisionTableRule.setName(rule.getLabel());

    return decisionTableRule;
  }

  protected DmnDecisionTableRuleImpl createDmnElement(DmnElementTransformContext context, Rule rule) {
    return new DmnDecisionTableRuleImpl();
  }

}